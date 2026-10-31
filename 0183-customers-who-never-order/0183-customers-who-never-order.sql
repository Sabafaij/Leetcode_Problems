# Write your MySQL query statement below
Select c.name as Customers
FROM Customers c
LEFT JOIN Orders o
ON o.customerId = c.id
WHERE o.customerId is NULL;