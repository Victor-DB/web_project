<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/first.css">
    <!-- jquery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- для модальных окон -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/multi-select/0.9.12/js/jquery.multi-select.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js" integrity="sha256-0YPKAwZP7Mp3ALMRVB2i8GXeEndvCq3eSl/WsAl1Ryk=" crossorigin="anonymous"></script>
    <!---->
</head>
<body>
<div class="container">
    <div class="header">
        <div class="header_section">
            <div class="header_item headerlogo"><a href="/main">Главная</a></div>
            <div class="header_item headerButton"><a href="/coupon">Акции</a></div>
            <div class="header_item headerButton"><a href="#">Оплата</a></div>
            <div class="header_item headerButton"><a href="#">Доставка</a></div>
            <div class="header_item headerButton"><a href="#">Контакты</a></div>
        </div>
        <div class="header_section">
            <div class="header_item headerButton"><a href="/lkEntrance">Войти</a></div>
            <div class="header_item headerButton"><a href="/registration">Регистрация</a></div>
        </div>
    </div>
    <div class="sidebar">Sidebar
        <input id="articulByNum" title="Найти товар по артикулу<" style="background-color: goldenrod" >
        <a href="#" onclick="findItemByNum()" style="color: seagreen">Найти</a>
        <div id="findItem">

        </div>
    </div>
    <div class="contain">
        <div class="item">Item1</div>
        <div class="item">Item2</div>
        <div class="item">Item3</div>
        <div class="item">Item4</div>
        <div class="item">Item5</div>
        <div class="item">Item6</div>
        <div class="item">Item7</div>
        <div class="item">Item8</div>
        <div class="item">Item9</div>
    </div>

    <footer class="footer">Footer</footer>
</div>

<script>

    function findItemByNum() {
        let id = $('#articulByNum').val();

        if (id == null || id === undefined){
            alert("Введите артикул товара в форму");
            return;
        }

        $('#findItem').html('');

        $.ajax({
            url: "../findItemByNumber",
            method: "POST",
            contentType: "application/json; charset=utf-8",
            data: id,
            success: function (item) {
                console.log(item);
                $.each(item, function (key, value) {


                        $('#findItem').append(

                        '<br/>' +
                        '<div style="border: 1px solid black">' +
                            '<p>' + "Название товара: " + value.name + '</p>'+
                            '<p>' + "Дата изготовления: " + value.editionDate + '</p>'+ '<br>' +
                            '<p>' + "Цена: " + value.price + '</p>'+ '<br>' +
                            '<p>' + "Масса: " + value.amount + '</p>'+
                        '</div>'
                    );
                })
            },
            error: function (error) {
                console.log(error);
            }


        });
    }

</script>

</body>
</html>