<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <title>Quest</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<section>
    <div class="container">

        <form action="game" method="post" class="row">

            <div class="col-2"></div>
            <div class="col-8">
                <label name="question" class="form-label text-primary-emphasis">
                    <p class="fs-5"><c:out value="${questionText}"/></p>
                </label>
            </div>
            <div class="col-2"></div>


            <div class="form-check" method="post">
                <c:forEach var="answer" items="${answersTextMap}">
                    <div class="row border border-info ans-row">
                        <div class="col-2"></div>
                        <div class="col-8 align-middle">
                            <input type="radio" class="form-check-input border-info align-middle" value="${answer.key}"
                                   name="answerOptions"
                                   required>
                            <label class="form-check-label text-primary-emphasis align-middle">
                                <p class="fs-5 "><c:out value="${answer.value}"/></p>
                            </label>
                        </div>
                        <div class="col-2"></div>
                    </div>
                </c:forEach>
                <div class="invalid-feedback">Choose one answer</div>
            </div>

            <div class="row">
                <div class="col-4"></div>
                <div class="col-4 d-grid gap-2 mx-auto">
                    <button class="btn btn-info btl-lg " type="submit">Ответить</button>
                </div>
                <div class="col-4"></div>
            </div>
        </form>
    </div>
</section>

<jsp:include page="footer.jsp"></jsp:include>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>
</html>