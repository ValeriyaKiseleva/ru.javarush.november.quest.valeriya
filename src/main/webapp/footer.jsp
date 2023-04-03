<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <title></title>
</head>

<footer class="bg-info">
    <div class="container ">
        <div class="row align-middle">
            <div class="col-12 align-middle">
                <%--                <a href="" class="text-white" data-bs-toggle="modal" data-bs-target="#statistic">Статистика</a>--%>

                <button action="statistic" type="button" class="btn btn-info" data-bs-toggle="modal"
                        data-bs-target="#statistic">
                    <p class="fs-4 text-white">Статистика</p>
                </button>

            </div>
        </div>
    </div>


    <!-- Button trigger modal -->
    <%--    <button action="statistic" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#statistic">--%>
    <%--        Launch demo modal--%>
    <%--    </button>--%>
    <!-- Modal -->
    <div class="modal fade" id="statistic" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h2 class="modal-title fs-5" id="exampleModalLabel">Статистика</h2>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p class="fs-6">
                        Имя : ${sessionScope.name}
                    </p>
                    <p class="fs-6">
                        Выиграно квестов :
                        <c:choose>
                            <c:when test="${sessionScope.wonGames != null }">
                                ${sessionScope.wonGames}
                            </c:when>
                            <c:otherwise>
                                0
                            </c:otherwise>
                        </c:choose>
                    </p>
                    <p class="fs-6">
                        Проиграно квестов :
                        <c:choose>
                            <c:when test="${sessionScope.lostGames != null }">
                                ${sessionScope.lostGames}
                            </c:when>
                            <c:otherwise>
                                0
                            </c:otherwise>
                        </c:choose>
                    </p>
<%--                    <p class="fs-6">--%>
<%--                        Проиграно квестов : ${sessionScope.lostGames}--%>
<%--                    </p>--%>
                </div>
            </div>
        </div>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>
</html>