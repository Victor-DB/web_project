
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: Arial;
            background-color: #f5c6cb;
        }

        .coupon {
            display: none;
            border: 5px dotted #bbb;
            width: 80%;
            border-radius: 15px;
            margin: 0 auto;
            max-width: 600px;
        }

        .container {
            padding: 2px 16px;
            background-color: palegreen;
        }

        .promo {
            background: #ccc;
            padding: 3px;
        }

        .expire {
            color: red;
        }

        .prev, .next {
            cursor: pointer;
            position: absolute;
            top: 50%;
            width: auto;
            margin-top: -22px;
            padding: 16px;
            color: white;
            font-weight: bold;
            font-size: 18px;
            transition: 0.6s ease;
            border-radius: 0 3px 3px 0;
        }

        .next {
            right: 0;
            border-radius: 3px 0 0 3px;
        }

        /* On hover, add a black background color with a little bit see-through */
        .prev:hover, .next:hover {
            background-color: rgba(0,0,0,0.8);
        }

        /* Number text (1/3 etc) */
        .numbertext {
            color: #f2f2f2;
            font-size: 12px;
            padding: 8px 12px;
            position: absolute;
            top: 10%;
        }

        /* The dots/bullets/indicators */
        .dot {
            cursor: pointer;
            height: 15px;
            width: 15px;
            margin: 0 2px;
            background-color: #bbb;
            border-radius: 50%;
            display: inline-block;
            transition: background-color 0.6s ease;
        }

        .active, .dot:hover {
            background-color: #717171;
        }

        /* Fading animation */
        .fade {
            -webkit-animation-name: fade;
            -webkit-animation-duration: 1.5s;
            animation-name: fade;
            animation-duration: 1.5s;
        }

        @-webkit-keyframes fade {
            from {opacity: .4}
            to {opacity: 1}
        }

        @keyframes fade {
            from {opacity: .4}
            to {opacity: 1}
        }

    </style>
</head>
<body>

<div class="slideshow-container">
    <div class="coupon">
        <div class="container">
            <h3>Company Logo</h3>
        </div>
        <div class="numbertext">1 / 3</div>
        <img src="../../icons/tort_berries.jpg" alt="Avatar" style="width:100%;">
        <div class="container" style="background-color:white">
            <h2><b>20% OFF YOUR PURCHASE</b></h2>
            <p>Lorem ipsum dolor sit amet, et nam pertinax gloriatur. Sea te minim soleat senserit, ex quo luptatum tacimates voluptatum, salutandi delicatissimi eam ea. In sed nullam laboramus appellantur, mei ei omnis dolorem mnesarchum.</p>
        </div>
        <div class="container">
            <p>Use Promo Code: <span class="promo">BOH232</span></p>
            <p class="expire">Expires: Oct 19, 2020</p>
        </div>
    </div>

    <div class="coupon" style="display: none">
        <div class="container">
            <h3>Company Logo</h3>
        </div>
        <div class="numbertext">2 / 3</div>
        <img src="../../icons/sklon.png" alt="Avatar" style="width:100%;">
        <div class="container" style="background-color:white">
            <h2><b>20% OFF YOUR PURCHASE</b></h2>
            <p>Lorem ipsum dolor sit amet, et nam pertinax gloriatur. Sea te minim soleat senserit, ex quo luptatum tacimates voluptatum, salutandi delicatissimi eam ea. In sed nullam laboramus appellantur, mei ei omnis dolorem mnesarchum.</p>
        </div>
        <div class="container">
            <p>Use Promo Code: <span class="promo">BOH232</span></p>
            <p class="expire">Expires: Oct 19, 2020</p>
        </div>
    </div>

    <div class="coupon" style="display: none">
        <div class="container">
            <h3>Company Logo</h3>
        </div>
        <div class="numbertext">3 / 3</div>
        <img src="../../icons/trees_water.jpg" alt="Avatar" style="width:100%;">
        <div class="container" style="background-color:white">
            <h2><b>20% OFF YOUR PURCHASE</b></h2>
            <p>Lorem ipsum dolor sit amet, et nam pertinax gloriatur. Sea te minim soleat senserit, ex quo luptatum tacimates voluptatum, salutandi delicatissimi eam ea. In sed nullam laboramus appellantur, mei ei omnis dolorem mnesarchum.</p>
        </div>
        <div class="container">
            <p>Use Promo Code: <span class="promo">BOH232</span></p>
            <p class="expire">Expires: Oct 19, 2020</p>
        </div>
    </div>
    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
    <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div><br>

<div style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span>
    <span class="dot" onclick="currentSlide(2)"></span>
    <span class="dot" onclick="currentSlide(3)"></span>
</div>


<script>
    var slideIndex = 1;
    showSlides(slideIndex);

    // Next/previous controls
    function plusSlides(n) {
        showSlides(slideIndex += n);
    }

    // Thumbnail image controls
    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function showSlides(n) {
        var i;
        var slides = document.getElementsByClassName("coupon");
        var dots = document.getElementsByClassName("dot");
        if (n > slides.length) {slideIndex = 1}
        if (n < 1) {slideIndex = slides.length}
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
        }
        slides[slideIndex-1].style.display = "block";
        dots[slideIndex-1].className += " active";
    }
</script>

</body>
</html>



