from collections import deque
from typing import List

class Solution:
    def shortestPathAllKeys(self, grid: List[str]) -> int:

        board = [list(row) for row in grid]
        rows = len(board)
        cols = len(board[0])

        queue = deque()
        visited = set()

        start_r = start_c = 0
        all_keys_mask = 0

        # Preprocessing
        for r in range(rows):
            for c in range(cols):
                if board[r][c] == '@':
                    start_r = r
                    start_c = c
                if board[r][c].islower():
                    all_keys_mask |= (1 << (ord(board[r][c]) - ord('a')))

        queue.append((start_r, start_c, 0, 0))  # r, c, key_mask, steps
        visited.add((start_r, start_c, 0))

        directions = [(-1,0),(0,-1),(1,0),(0,1)]

        while queue:
            r, c, key_mask, steps = queue.popleft()

            if key_mask == all_keys_mask:
                return steps

            for dr, dc in directions:
                nr = r + dr
                nc = c + dc

                # bounds
                if not (0 <= nr < rows and 0 <= nc < cols):
                    continue

                cell = board[nr][nc]

                # wall
                if cell == '#':
                    continue

                new_mask = key_mask

                # key
                if cell.islower():
                    new_mask |= (1 << (ord(cell) - ord('a')))

                # lock
                if cell.isupper():
                    if not (key_mask & (1 << (ord(cell.lower()) - ord('a')))):
                        continue

                if (nr, nc, new_mask) not in visited:
                    visited.add((nr, nc, new_mask))
                    queue.append((nr, nc, new_mask, steps + 1))

        return -1
