<%@page import="hello.utils.Utils"%>
<%@page import="hello.model.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Índice</title>
    <link rel="stylesheet" href="assets/style.css">
</head>

<body>

	<% ArrayList<Aluno> lista = Utils.getAlunos(); %>

    <!-- HEADER -->
    <header class="container-cabecalho">
        <h3>Lista de Alunos CDFs</h3>
    </header>

    <section class="container-registro">

        <!-- LISTA DOS ALUNOS -->
        <article class="professor">
            <p class="professor-texto">
                Minha Turma
            </p>
            <div class="professor-texto3">
                <p>
                    Esta aqui é a lista dos melhores alunos.
                    <b><span class="professor-texto">Só tem CDF</span></b>
                </p>
            </div>
        </article>
        
        <%
        for (int i = 0; i < lista.size(); i++) {
        	%>
		        <!-- REGISTRO -->
		        <article class="unidade">
		            <ul>
		                <li>
		                    Aluno: <b><%= lista.get(i).getNome() %></b>
		                </li>
		                <li>
		                    Matrícula: <b><%= lista.get(i).getMatricula() %></b>
		                </li>
		                <li>
		                    Nota: <b><%= lista.get(i).getNota() %></b>
		                </li>
		            </ul>
		        </article>
        	
        	<%
        }
        %>



    </section>


    <script src="assets/script/script.js"></script>

</body>

</html>