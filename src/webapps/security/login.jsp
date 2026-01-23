<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <div class="form-group">
            <input type="text" value="mihary" clas="form-controle" name="name">
        </div>
         <div class="form-group">
            <input type="text" value="mandresy" clas="form-controle" name="mdp">
        </div>

        <button>Valider</button>
    </form>

    <a href="home">Home</a>

    <%
        String role = (String) session.getAttribute("role");
    %>
    <span>Session : Role = <%= role %></span>
</body>
</html>