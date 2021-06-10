
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="../../libraries/js/jquery-1.9.1.min.js"></script>
    <link href="../../css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="../../libraries/css/bootstrap.css">
    <link href="../../libraries/js/bootstrap.min.js">
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Arial;
        }

        /* The grid: Four equal columns that floats next to each other */
        .column {
            float: left;
            width: 25%;
            padding: 10px;
        }

        /* Style the images inside the grid */
        .column img {
            opacity: 0.8;
            cursor: pointer;
        }

        .column img:hover {
            opacity: 1;
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }

        /* The expanding image container */
        .container {
            position: relative;
            display: none;
        }

        /* Expanding image text */
        #imgtext {
            position: absolute;
            bottom: 15px;
            left: 15px;
            color: white;
            font-size: 20px;
        }

        /* Closable button inside the expanded image */
        .closebtn {
            position: absolute;
            top: 10px;
            right: 15px;
            color: white;
            font-size: 35px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<div style="text-align:center">
    <h2>Tabbed Image Gallery</h2>
    <p>Click on the images below:</p>
</div>

<!-- The four columns -->
<div class="row">
    <div class="column">
        <img src="../../icons/melnica.svg" alt="Melnica" style="width:100%" onclick="myFunction(this);">
    </div>
    <div class="column">
        <img src="../../icons/priroda.svg" alt="Priroda" style="width:100%" onclick="myFunction(this);">
    </div>
    <div class="column">
        <img src="../../icons/sklon.svg" alt="Sklon" style="width:100%" onclick="myFunction(this);">
    </div>
    <div class="column">
        <img src="../../icons/trees_water.jpg" alt="Trees with water" style="width:100%" onclick="myFunction(this);">
    </div>
</div>

<div class="container">
    <span onclick="this.parentElement.style.display='none'" class="closebtn">×</span>
    <img id="expandedImg" style="width:100%">
    <div id="imgtext"></div>
</div>

<script>
    function myFunction(imgs) {
        var expandImg = document.getElementById("expandedImg");
        var imgText = document.getElementById("imgtext");
        expandImg.src = imgs.src;
        imgText.innerHTML = imgs.alt;
        expandImg.parentElement.style.display = "block";
    }
</script>

</body>
</html>



