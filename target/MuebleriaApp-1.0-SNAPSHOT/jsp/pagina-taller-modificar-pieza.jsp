<%-- 
    Document   : pagina-taller-modificar-pieza
    Created on : 30/08/2021, 22:44:29
    Author     : Gerson Reynoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="extras/header.jsp"></jsp:include>
            <main>
                <div class="main container">
                    <h2>modificar registro de piezas</h2>
                    <br /><br />

                    <form role="form" action="" method="post" autocomplete="off">
                        <input type="hidden" class="form-control" id="descripcion">

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
