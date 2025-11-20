<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Baba</title>
</head>
<body>

    <h1>Listes couleurs : </h1>
    <%
        String[] colors = (String[]) request.getAttribute("couleur");

        for (String color: colors) {
            out.println("<li>" + color + "</li>");
        }
    %>
</body>
</html>