def dijkstra(cost, n, source):
    visited = [False] * n
    dist = [float('inf')] * n

    dist[source] = 0

    for _ in range(n):
        # Find minimum distance node
        min_dist = float('inf')
        u = -1

        for i in range(n):
            if not visited[i] and dist[i] < min_dist:
                min_dist = dist[i]
                u = i

        visited[u] = True

        # Update neighbors
        for v in range(n):
            if cost[u][v] != 0 and not visited[v]:
                if dist[u] + cost[u][v] < dist[v]:
                    dist[v] = dist[u] + cost[u][v]

    return dist
