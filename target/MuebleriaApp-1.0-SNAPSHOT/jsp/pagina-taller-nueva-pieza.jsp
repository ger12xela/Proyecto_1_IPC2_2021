<%-- 
    Document   : pagina-taller-nueva-pieza
    Created on : 30/08/2021, 22:03:26
    Author     : Gerson Reynoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/cabecera.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap-teme.css'>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width-device-width, user-scalable=no, initial-scale=1.0, maximun-scale-1.0, minimun-scale=1.9">

        <title>Nueva pieza</title>
    </head>
    <body>
        <jsp:include page="extras/header.jsp"></jsp:include>
            <main>
                <div class="main container">
                    <h2>Nuevo registro de piezas</h2>
                    <br /><br />

                    <form role="form" action="" method="post" autocomplete="off">
                        <div class="form-group-lg">
                            <label for="codigo">codigo</label>
                            <input type="text" class="form-control" id="codigo">
                        </div>
                        
                        <div class="form-group-lg">
                            <label for="descripcion">Descripcion:</label>
                            <input type="text" class="form-control" id="descripcion">
                        </div>
                        <br />

                        <div class="form-group-lg">
                            <label for="cantidad">Cantidad:</label>
                            <input type="number" class="form-control" id="cantidad">
                        </div>
                        <br />

                        <div class="form-group-lg">
                            <label for="Precio">Precio:</label>
                            <input type="number" step="0.01" class="form-control" id="precio">
                        </div>
                        <br />
                        <p>

                            <button class="btn btn-default"id="guardar" name="guardar" type="submit">Guardar</button>
                        </p>
                        
                    </form>
                </div>
            </div>
        </main>
    <jsp:include page="extras/footer.jsp"></jsp:include>

</body>
</html>
