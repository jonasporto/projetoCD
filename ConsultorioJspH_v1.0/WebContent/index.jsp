<%@page import="persistence.DentistaDao"%>
<%@page import="entity.Dentista"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BootStrap</title>

<link href="visual/css/bootstrap.css" rel="stylesheet">

</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<a class="brand" href="#">Consultório</a>

		</div>
	</div>

	<div class="span12">

		<ul class="breadcrumb">

			<li><a href="#cadCli" data-toggle="modal">Cadastro de
					Clientes</a><span class="divider">|</span></li>
			<li><a href="#cadDent" data-toggle="modal">Cadastro de
					Dentista</a><span class="divider">|</span></li>
			<li><a href="movimentacao.jsp">Movimentações</a><span
				class="divider">|</span></li>
			<li><a href="#">Consultas de Clientes</a><span class="divider">|</span></li>
			<li><a href="#">Consultas de Dentistas</a><span class="divider">|</span></li>
			<li><a href="#">Relatórios</a><span class="divider">|</span></li>


		</ul>


		<div class="modal hide" id="cadCli">

			<div class="modal-header">
				<h3>Cadastro de Clientes</h3>
			</div>
			<div class="modal-body">
				<form action="Controle?flag=cadCli" method="post"
					class="form-horizontal">
					<div class="control-group">
						<label class="control-label" for="pront">Prontuário</label>
						<div class="controls">
							<input type="text" name="prontuario"
								placeholder="Informe o Prontuario">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="nome">Nome</label>
						<div class="controls">
							<input type="text" name="nome" placeholder="Informe o Nome">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="nome">Data Cadastro</label>
						<div class="controls">
							<input type="date" name="dtCad" placeholder="Informe a Data">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="nome">Indicação</label>
						<div class="controls">
							<select name="indicacao">
								<option value="dentista">Dentista</option>
								<option value="panfletagem">Panfletagem</option>
								<option value="terceiros">Terceiros</option>
								<option value="sem indicacao">Sem Indicação</option>
							</select>
						</div>
						<br />
						<div class="control-group">
							<label class="control-label" for="nome">Dentista</label>
							<div class="controls">
								<select name="dentista">
									<%
										for (Dentista c : new DentistaDao().findByAll()) {
											out.print("<option value='" + c.getNome());
											out.print("'>" + c.getNome() + "</option>");
										}
									%>
								</select> <br />
							</div>
						</div>


					</div>
					<a href="#" class="btn" data-dismiss="modal">Fechar</a> <input
						type="submit" class="btn btn-primary" value="Cadastrar">
				</form>
			</div>

		</div>

		<div class="modal hide" id="cadDent">

			<div class="modal-header">
				<h3>Cadastro de Dentista</h3>
			</div>
			<div class="modal-body">
				<form action="Controle?flag=cadDent" method="post"
					class="form-horizontal">

					<div class="control-group">
						<label class="control-label" for="cpf">Cpf</label>
						<div class="controls">
							<input type="text" name="cpf" placeholder="cpf">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="nome">Nome</label>
						<div class="controls">
							<input type="text" name="nome" placeholder="Informe o Nome">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Especialidade</label>
						<div class="controls">
							<select name="especialidade">
								<option value="dentista">Dentista</option>
								<option value="cirurgiao">Cirurgiao</option>
								<option value="protetico">Protetico</option>
							</select>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="status">Condição</label>
						<div class="controls">
							<select name="status">
								<option value="0">0 - Ativo</option>
								<option value="1">1 - Desligado</option>
							</select>
						</div>
					</div>

					<a href="#" class="btn" data-dismiss="modal">Fechar</a> <input
						type="submit" class="btn btn-primary" value="Cadastrar">
				</form>
			</div>

		</div>



		${msg}
</body>
<script src="visual/js/jquery.js" type="text/javascript"></script>
<script src="visual/js/bootstrap.js"></script>
</html>