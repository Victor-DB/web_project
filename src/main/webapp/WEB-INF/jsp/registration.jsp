<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/registration.css">
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
            <div class="header_item headerlogo"><a href="index.html">Главная</a></div>
            <div class="header_item headerButton"><a href="#">Акции</a></div>
            <div class="header_item headerButton"><a href="#">Оплата</a></div>
            <div class="header_item headerButton"><a href="#">Доставка</a></div>
            <div class="header_item headerButton"><a href="#">Контакты</a></div>
        </div>
        <div class="header_section">
            <div class="header_item headerButton"><a href="#">Войти</a></div>
        </div>
    </div>

    <div class="sidebar"></div>

    <div class="registration">
        <form action="/registrate" method="post" class="">
            Введите имя:<br>
            <input type="text" class="item" name="name" required placeholder="Имя"><br>
            Введите фамилию:<br>
            <input type="text" class="item" name="surname" required placeholder="Фамилия"><br>

            <div>
                Придумайте логин:<br>
                <a href="#" onclick="generateLogin()">(Сгенерировать)</a>
                <input type="text" class="item login" name="login" required placeholder="Логин"><br>
            </div>

            <div>
                Придумайте пароль:<br>
                <a href="#" onclick="generatePassword()">(Сгенерировать)</a>
                <input type="password" class="item password" name="password" required placeholder="Пароль"><br>
            </div>

            <input type="submit" class="item service" name="send" value="Отправить">
            <input type="reset" class="item service" name="clean" value="Очистить"><br>
            <button type="button" class="item service"><a href="index.html">Вернуться на главную</a></button>
        </form>
    </div>
</div>

<footer class="footer"></footer>
</div>

<script>

    function generateLogin () {
        $.ajax({
            method: "GET",
            url: "../generateLogin",
            success: function (data) {
                console.log(data.login);
                $('.item.login').val(data.login);
            },
            error: function () { alert("something wrong"); }
        });
    }

    function generatePassword() {
        $.ajax({
            method: "GET",
            url: "../generatePassword",
            success: function (data) {
                console.log(data.password);
                $('.item.password').val(data.password);
                $('.item.password').attr('title' , 'Пароль появиться в окне после регистрации');

            },
            error: function () { alert("something wrong"); }
        });
    }

</script>
</body>
</html>



