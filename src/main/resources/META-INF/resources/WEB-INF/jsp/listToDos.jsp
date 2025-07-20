<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>ToDo List</title>
    <style>
        table {
            width: 70%;
            border-collapse: collapse;
            margin: 20px auto;
        }

        th, td {
            border: 1px solid #333;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #f0f0f0;
        }

        h2 {
            text-align: center;
        }
    </style>
</head>
<body>

    <h2>Welcome, ${param.name}!</h2>

    <h2>Your To-Do List</h2>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Completed</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="todo" items="${toDos}">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.userName}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>
                        <c:choose>
                            <c:when test="${todo.done}">
                                ✅
                            </c:when>
                            <c:otherwise>
                                ❌
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
