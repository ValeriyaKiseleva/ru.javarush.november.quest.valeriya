<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <title>Quest Start</title>
</head>

<body>

<jsp:include page="header.jsp"></jsp:include>

<section>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <h3 class="text-center text-primary-emphasis">ПРОЛОГ</h3>
                <div class="line bg-info"></div>
            </div>

            <div class="col-2"></div>
            <div class="col-8">
                <p class="fs-6">
                    Ты стоишь в космическом порту и готов подняться на борт своего корабля. Разве ты не об этом
                    мечтал? Стать капитаном галактического судна с экипажем, который будет совершать подвиги
                    под твоим командованием.
                    <br/>
                    Так что вперед!
                </p>
            </div>
            <div class="col-2"></div>
        </div>

        <div class="row">
            <div class="col-12">
                <h3 class="text-center text-primary-emphasis">Знакомство с командой</h3>
                <div class="line bg-info"></div>
            </div>

            <div class="col-2"></div>
            <div class="col-8">
                <p class="fs-6">
                    Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках:
                    <br>
                    - Здравствуйте, командир! Я Зинаида - ваша помощница. Видите? Там в углу пьет кофе наш
                    штурман - сержант Перегарный шлейф, под штурвалом спит наш бортпроводник - Черный Богдан,
                    а фотографирует его Сергей Стальная Пятка - наш навигатор.
                    <br>
                    А как обращаться к вам?
                </p>
            </div>
            <div class="col-2"></div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <form action="start" method="post" class="row">
            <div class="col-4"></div>
            <div class="col-4">
                <input type="text" name="firstName" class="form-control" placeholder="Your name">
            </div>
            <div class="col-4"></div>

            <div class="col-4"></div>
            <div class="col-4 d-grid gap-2 mx-auto">
                <button class="btn btn-info btl-lg " type="submit">Начать игру</button>
            </div>
            <div class="col-4"></div>

        </form>
    </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>
</html>