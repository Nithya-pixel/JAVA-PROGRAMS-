<html>
<body>

<h2>My First JSP Program</h2>

<%
    String name = "Anu";
    int a = 10;
    int b = 20;
    int sum = a + b;
%>

<p>Hello, <%= name %></p>
<p>Sum = <%= sum %></p>

</body>
</html>