<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/cabecera.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap.min.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap-theme.min.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap-teme.css'>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width-device-width, user-scalable=no, initial-scale=1.0, maximun-scale-1.0, minimun-scale=1.9">
        <title>ensamblajes</title>
    </head>
    <body>
    <c:set var="pgTitle" value="Welcome" scope="request" />
    <jsp:include page="extras/header.jsp"></jsp:include>

        <<main>
            <div class="container main">

                <h1>Estado en materia prima</h1>
                <table class="table table-bordered table-hover">
                    <thead>
                        <tr class="active">
                            <th>Id</th>
                            <th>Descripcion</th>
                            <th>Cantidad</th>
                            <th>Precio</th>
                            <th></th>
                            <th></th>

                        </tr>
                    </thead>
                    <tbody>
                        
                        
                    </tbody>


                </table>
            </div>
        </main>

    <jsp:include page="extras/footer.jsp"></jsp:include>

</body>
</html>