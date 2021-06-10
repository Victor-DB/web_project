<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/item.css">

    <link href="../../libraries/js/jquery-1.9.1.min.js">
    <!-- jquery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- для модальных окон -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/multi-select/0.9.12/js/jquery.multi-select.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js" integrity="sha256-0YPKAwZP7Mp3ALMRVB2i8GXeEndvCq3eSl/WsAl1Ryk=" crossorigin="anonymous"></script>
    <!---->

</head>
<body>
<div class="container">

    <div id="cartModal">
        <div class="miniItem"></div>
    </div>

    <div class="header">
        <div class="header_section">
            <div class="header_item headerlogo"><a href="index.html">Главная</a></div>
            <div class="header_item headerButton"><a href="#">Акции</a></div>
            <div class="header_item headerButton"><a href="#">Оплата</a></div>
            <div class="header_item headerButton"><a href="#">Доставка</a></div>
            <div class="header_item headerButton"><a href="#">Контакты</a></div>
        </div>
        <div class="header_section">
            <!-- " -->


            <div onclick="cartOpen()" class="header_item headerButton cart">
                <div id="count" class="count" ></div>
                <div class="dropdown">
                    <div class="dropdown-content">
                        <p>Hello World!</p>
                    </div>
                </div>
            </div>

            <div class="header_item headerButton"><a href="#">Войти</a></div>
            <div class="header_item headerButton"><a href="/registration">Регистрация</a></div>
        </div>
    </div>

    <div class="sidebar">Sidebar</div>

    <div class="contain">
        <%-- generation items dynamically--%>
    </div>

    <footer class="footer">Footer</footer>
</div>

<script>

    let items = [];

    $.ajax({
        method: "GET",
        url: "../getAllItems",
        success: function (data) {
            console.log("Успешно");

            let allItems;
            $.each(data, function (key, value) {
                console.log("key " + key + " value " + value.picture);

                allItems = '<div class="item" style="display: flex; flex-direction: column; background-color: #fbfcfc  "   >' +

                                '<div style="width:130px; height:130px;" >' +
                                    '<img src="'+ value.picture + '">'+
                                '</div>' +
                                '<p class="name" style="color: white;" >' + value.name + '</p>' +
                                '<p class="price" style="color: white;" > ' +  value.price + " руб." + '</p>' +
                                '<p class="amount" style="color: white;" > ' +  value.amount + '</p>' +
                                '<p class="amount" style="color: white;" > ' + "артикул " + value.num + '</p>' +
                                '<button type="button" class="buy" onclick="addBuy()" style="">Заказать</button>' +
                           '</div>';

               $('.contain').append(allItems);

            });
        }, error: function () { alert("something wrong"); }
    });

    // $('.item').click(function () {
    //     let num = $(this).find('input.itemNumber').val();
    //     console.log("1: " + num);
    //     let name = $(this).find('p.itemName').val();
    //     console.log("2: " + name);
    //     let price = $(this).find('p.itemPrice').val();
    //     console.log("3: " + price);
    //     let quantity;
    // });

    function addBuy () {
        let count = $('#count').html();
        let el = $('div ')
        console.log('count ' + count);
        count++;
        $('#count').html(count);
    }

</script>
</body>
</html>