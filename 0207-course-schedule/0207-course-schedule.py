class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:

        adj = [[] for _ in range(numCourses)]
    
        # Build indegree array
        indegree = [0] * numCourses
        
        for course, prereq in prerequisites:
            adj[prereq].append(course)
            indegree[course] += 1

        #queue
        queue = deque()
        order = []

        for i in range(numCourses):
            if indegree[i] == 0:
                queue.append(i)
        
        processed = 0

        while queue:
            node = queue.popleft()
            processed += 1
            order.append(node)
            for neighbors in adj[node]:
                indegree[neighbors] -= 1
                if indegree[neighbors] == 0:
                    queue.append(neighbors)
        
        print(order)
        return processed == numCourses
            


        