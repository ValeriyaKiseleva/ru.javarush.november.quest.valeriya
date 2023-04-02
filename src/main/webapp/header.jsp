<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
  <link rel="stylesheet" href="css/style.css">
  <title></title>
</head>
<body>

<header class="bg-info">
  <div class="container ">
    <div class="row align-middle">
      <div class="col-6">
        <h1 class="text-white">QUEST 1</h1>
      </div>
      <div class="col-6 align-middle">
        <a href="" data-bs-toggle="modal" data-bs-target="#statistic">Статистика</a>
      </div>
    </div>
  </div>
</header>

<!-- Modal -->
<div class="modal fade" id="statistic" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h2 class="modal-title fs-5" id="exampleModalLabel">Статистика</h2>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <c:out value="${firstName}" />
      </div>
    </div>
  </div>
</div>

</body>
</html>
