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

    <form action="test" method="POST">
        <input type="text" name="nom" value="Babakely">
        <button type="submit">Valider</button>
    </form>

    <form action="maptest" method="POST">
        <div class="form-group">
            <label for="">Nom</label>
            <input type="text" value="Baba" name="nom">
        </div>
        <div class="form-group">
            <label for="">Age</label>
            <input type="number" value="34" name="age">
        </div>
        <div class="form-group">
            <label for="">Est marie</label>
            <input type="checkbox" name="estmarie" checked>
        </div>
        <div class="form-group">
            <label for="">GanaKely</label>
            <input type="radio" name="gana" value="Gana 1"> <span>Gana 1</span>
            <input type="radio" name="gana" value="Gana 2"> <span>Gana 1</span>
        </div>

        <button type="submit">Valider</button>
    </form>
</body>
</html>