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

    <form action="hello">
        <input type="text" name="langue" id="" value="Fr"><br>
        <input type="text" name="nom" id="" value="Deraman"><br>
        <input type="number" name="age" value="13" id=""><br>
        <button type="submit">Valider</button>
    </form>
</body>
</html>