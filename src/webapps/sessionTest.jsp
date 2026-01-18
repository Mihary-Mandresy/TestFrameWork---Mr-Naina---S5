<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Session Test</title>
</head>
<body>

<%
    String sessionValue = (String) session.getAttribute("sess");
%>

    <p>La valeur de session est : <b><%= sessionValue %></b></p>

</body>
</html>