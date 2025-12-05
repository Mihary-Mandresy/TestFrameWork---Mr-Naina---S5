<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DTO</title>
</head>
<body>

    <div class="form">
        <div class="form-title">
            <h1>Test DTO</h1>
        </div>
        <form action="" method="POST">
            <input type="text" name="nom" value="Jhon"><br>
            <input type="number" name="age" value="12"><br>

            <input type="text" name="voiture.nom" value="Taxi">
            <input type="text" name="voiture.marque" value="4L">

            <button type="submit">Valider</button>
        </form>
    </div>
    
</body>
</html>