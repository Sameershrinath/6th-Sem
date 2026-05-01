# Distance Vector Routing using Bellman-Ford

def distance_vector(cost, n):
    dist = cost.copy()

    for k in range(n):
        for i in range(n):
            for j in range(n):
                if dist[i][j] > cost[i][k] + dist[k][j]:
                    dist[i][j] = cost[i][k] + dist[k][j]

    return dist


# Input
n = int(input("Enter number of nodes: "))

print("Enter cost matrix:")
cost = []
for i in range(n):
    row = list(map(int, input().split()))
    cost.append(row)

# Replace 0 (except diagonal) with large value (infinity)
INF = 999
for i in range(n):
    for j in range(n):
        if i != j and cost[i][j] == 0:
            cost[i][j] = INF

# Run algorithm
result = distance_vector(cost, n)

# Output
print("\nShortest Distance Matrix:")
for row in result:
    print(row)