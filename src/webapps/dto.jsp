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

            <input type="text" name="v.marque" value="GTR">

            <input type="text" name="v.prs[0].nom" value="Jhon"><br>
            <input type="number" name="v.prs[0].age" value="12"><br>
                <input type="checkbox" name="v.prs[0].note" value="4">
                <input type="checkbox" name="v.prs[0].note" value="6">
                <input type="checkbox" name="v.prs[0].note" value="9">
                <input type="checkbox" name="v.prs[0].note" value="3">

            <input type="text" name="v.prs[1].nom" value="BabaKely"><br>
            <input type="number" name="v.prs[1].age" value="23"><br>
                <input type="checkbox" name="v.prs[1].note" value="2">
                <input type="checkbox" name="v.prs[1].note" value="8">
                <input type="checkbox" name="v.prs[1].note" value="4">
                <input type="checkbox" name="v.prs[1].note" value="2">

            <button type="submit">Valider</button>
        </form>
    </div>
    
</body>
</html>