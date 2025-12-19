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

            <input type="text" name="voiture.nom" value="Taxi"><br>
            <input type="text" name="voiture.marque" value="4L"><br>

            <div class="nickname">
                <p>Nickname</p>
                <input type="checkbox" name="nickName" value="Baba"> <label>Baba</label>
                <input type="checkbox" name="nickName" value="Bobo"> <label>Bobo</label>
                <input type="checkbox" name="nickName" value="Bebe"> <label>Bebe</label>
                <input type="checkbox" name="nickName" value="Bubu"> <label>Bubu</label>
            </div>

            <div class="Tab">
                <p>Voiture Tab</p>
                <input type="checkbox" name="voiture.tab" value="1"> <label>1</label>
                <input type="checkbox" name="voiture.tab" value="4"> <label>4</label>
                <input type="checkbox" name="voiture.tab" value="7"> <label>7</label>
                <input type="checkbox" name="voiture.tab" value="9"> <label>9</label>
            </div>

            <button type="submit">Valider</button>
        </form>
    </div>
    
</body>
</html>