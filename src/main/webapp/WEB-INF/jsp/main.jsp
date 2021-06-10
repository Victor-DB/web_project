<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Вы видите эту html страницу</title>
    <script src="../../libraries/js/jquery-1.9.1.min.js"></script>
    <link href="../../css/main.css" rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <style>
        body {margin:0;}

        .icon-bar {
            width: 100%;
            background-color: #555;
            overflow: auto;
        }

        .icon-bar a {
            float: left;
            width: 20%;
            text-align: center;
            padding: 12px 0;
            transition: all 0.3s ease;
            color: white;
            font-size: 36px;
        }

        .icon-bar a:hover {
            background-color: #000;
        }

        .active {
            background-color: #4CAF50 !important;
        }

    </style>
</head>
<body>

    <form>
        <div class="header">
            <h1>Научись играть на гитаре</h1>
            <p>A website created by me.</p>
        </div>

        <div class="navbar">
            <a href="/top">Top</a>
            <a href="/coupon">Coupon</a>
            <a href="/nature">Nature</a>
            <a href="/" class="right">Регистрация</a>
            <a href="/lkEntrance" class="right">Личный кабинет</a>
        </div>

        <div class="row">
            <div class="side">...</div>
            <div class="main">...</div>
        </div>
        <div class="footer">
            <h2>Footer</h2>
        </div>
    </form>

</body>
<script></script>
</html>