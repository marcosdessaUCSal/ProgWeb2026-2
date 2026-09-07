<%@page import="model.ListaLivros"%>
<%@page import="model.Livro"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Um Livro!</title>
<link rel="stylesheet" href="assets/style.css">
</head>
<body>
	<div class="container">
		<h2>Registro de Livro</h2>
		<div class="formulario">
			<fieldset class="moldura">
				<div class="linha">
					<label class="lbl">Título</label><input id="titulo"
						class="campo-entrada" type="text">
				</div>
				<div class="linha">
					<label class="lbl">Subtítulo</label><input id="subtitulo"
						class="campo-entrada" type="text">
				</div>
				<div class="linha">
					<label class="lbl">Autor</label><input id="autor"
						class="campo-entrada" type="text">
				</div>
				<div class="linha-btn">
					<button id="btn-efetuar" onclick="efetuar()" type="button"
						class="btn">EFETUAR</button>
					<button id="btn-confirmar" onclick="confirmar()" type="button"
						class="btn">CONFIRMAR</button>
					<button id="btn-cancelar" onclick="cancelar()" type="button"
						class="btn">CANCELAR</button>
				</div>
			</fieldset>
		</div>
		<div id="mensagem" class="mensagem"></div>
	</div>
	<div class="container">
		<%
			List<Livro> lista = ListaLivros.getInstance().getListaLivros();
			for (Livro livro : lista) {
				%>
					<div class="moldura extraconf">
						<p><span class='destaque'>TÍTULO: </span> <%= livro.getTitulo() %> </p>
		           		<p><span class='destaque'>SUBTÍTULO: </span> <%= livro.getSubtitulo() %> </p>
		           		<p><span class='destaque'>AUTOR: </span> <%= livro.getAutor() %> </p>
					</div>
				<%
			}
		%>
	</div>

	<script src="assets/script.js"></script>
</body>
</html>