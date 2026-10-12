<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Student Management</h2>

<form method="post" action="../StudentCRUD">
ID: <input type="number" name="id" required><br><br>
Name: <input type="text" name="name" required><br><br>
Marks: <input type="number" name="marks" min="0" max="100" step="0.1" required><br><br>
<input type="hidden" name="action" value="add">
<input type="submit" value="Add Student">
</form>

<br>

<table border="1">
<tr><th>ID</th><th>Name</th><th>Marks</th><th>Update</th><th>Delete</th></tr>

<c:forEach var="s" items="${students}">
<tr>
<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.marks}</td>
<td>
<form method="post" action="../StudentCRUD">
<input type="hidden" name="action" value="update">
<input type="hidden" name="id" value="${s.id}">
<input type="text" name="name" value="${s.name}" required>
<input type="number" name="marks" value="${s.marks}" min="0" max="100" step="0.1" required>
<input type="submit" value="Update">
</form>
</td>
<td><a href="../StudentCRUD?action=delete&amp;id=${s.id}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>