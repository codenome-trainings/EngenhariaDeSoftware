<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,900"
	rel="stylesheet">
<title>Estimativas de Custo</title>
</head>
<body>
	<header>
	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="index.php"> <img
					src="img/logo-webspcl-01.png" alt="Logo para pessoas especiais"
					title="Logo para pessoas especiais" role="img">
				</a>
			</div>
			<div class="navbar">
				<ul class="nav navbar-nav navbar-right" role="menubar">
					<li role="menuitem"><a href="modal-credits.php">Créditos</a></li>
					<li role="menuitem" role="menuitem"><a href="#"><i
							class="icon-user"></i>Bibliografia</a></li>
					<li role="menuitem"><a href="#" data-prevent="">Contato</a></li>
				</ul>
			</div>
			<div class="line-bottom"></div>
		</div>
	</div>
	</header>

	<div class="container">
		<div class="space-light"></div>
		<div class="row">
			<nav role="navigation">
			<div class="col-md-3">
				<ul class="nav nav-pills nav-stacked fixo" role="menubar">
					<li role="menuitem"><a href="#">Adiciona Dados</a></li>
					<li role="menuitem"><a href="#">Complexidade de entradas Externas</a></li>
					<li role="menuitem"><a href="#">Ponto de função Bruta</a></li>
					<li role="menuitem"><a href="#IntegracoesComSoftwares">Total NIT</a></li>
					<li role="menuitem"><a href="#PublicoEspecial">Valor do Fator de Ajuste</a></li>
					<li role="menuitem"><a href="#PublicoEspecial">Ponto de Função</a></li>
					<li role="menuitem"><a href="#PublicoEspecial">Seleciona Linguagem</a></li>
					<li role="menuitem"><a href="#PublicoEspecial">Mostra KLOC</a></li>
					<li role="menuitem"><a href="#PublicoEspecial">Mostra Esforço</a></li>
					
				</ul>
				<ul>

				</ul>
			</div>
			</nav>
			<main role="main">
			<div class="col-md-9">
				<article role="article">
					<h1>Olá mundo!</h1>
				</article>
			</div>
			</main>
		</div>
	</div>




	<footer>
	<div class="container">
		<div class="line-bottom"></div>
		<div>
			<img src="img/logo-webspcl-01.png"
				alt="Uma logo para pessoas especiais">
		</div>
		<div>
			<p>
				Desenvolvido com <em>amor</em> por Thiago Cunha
			</p>
		</div>
	</div>
	</footer>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="js/font-size.js"></script>

	<script>
		$('#myModal').on('shown.bs.modal', function() {
			$('#myInput').focus()
		})

		$('.collapse').collapse();
	</script>

</body>
</html>