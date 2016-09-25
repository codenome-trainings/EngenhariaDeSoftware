<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="ISO-8859-1" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8" />
	<link rel="stylesheet" href="css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,900" rel="stylesheet">
    <title>Estimativas de Custos</title>
<title>Insert title here</title>
</head>
<body>
<header>
    <div class="navbar navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <img src="logo-webspcl-01.png" alt="Logo para pessoas especiais" title="Logo para pessoas especiais"
                     role="img">
            </div>
            <div class="navbar">
                <ul class="nav navbar-nav navbar-right" role="menubar">
                    <li role="menuitem"><a href="adicionaProjeto.html">Novo projeto</a></li>
                    <li role="menuitem"><a href="relatorios.html">Relatórios</a></li>
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
                    <li role="menuitem"><a href="#projeto">Projeto</a></li>
                    <li role="menuitem"><a href="#adicionaDados">Adiciona dados</a></li>
                    <li role="menuitem"><a href="#adicionaESC">Adiciona EE|SE|CE</a></li>
                    <li role="menuitem"><a href="#pontoDeFuncaoBruta">Ponto de Função Bruta</a></li>
                    <li role="menuitem"><a href="#nit">NIT</a></li>
                    <li role="menuitem"><a href="#cocomo">Cocomo</a></li>
                    <li role="menuitem"><a href="#custos">Custos</a></li>

                </ul>
                <ul>

                </ul>
            </div>
        </nav>
        <main role="main">
            <div class="col-md-9">
                <article role="article">

                    <section id="projeto">
                        <h1>Projeto</h1>
                        <form action="#" method="get">
                            <table class="table table-hover espaco-superior" role="presentation">
                                <tbody role="row">
                                    <th role="columnheader">Nome do projeto</th>
                                    <th role="columnheader">Linguagem</th>
                                </tbody>
                                <tbody role="gridcell">
                                    <td><input type="text" class="form-control" placeholder="Digite o nome do projeto"></td>
                                    <td>
                                        <select class="form-control" name="linguagem" id="linguagem">
                                            <option value="sap">ABAP(SAP)</option>
                                            <option value="asp">ASP</option>
                                            <option value="assembler">Assembler</option>
                                            <option value="brio">Brio</option>
                                            <option value="c">Linguagem C</option>
                                            <option value="cpp">C++</option>
                                            <option value="csharp">C#</option>
                                            <option value="cobol">COBOL</option>
                                            <!--Adicionar mais linguagem aqui!!!-->

                                        </select>
                                    </td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell" colspan="5"><input type="submit" value="Adicionar" class="form-control btn btn-primary"></td>
                                </tbody>

                            </table>
                        </form>
                    </section>

                    <section id="adicionaDados">
                        <h1>Adiciona dados</h1>
                        <form action="#" method="get">
                            <table class="table table-hover espaco-superior" role="presentation">
                                <thead role="row">
                                    <th role="columnheader">Nome da Classe</th>
                                    <th role="columnheader">Registros</th>
                                    <th role="columnheader">Itens</th>
                                    <th role="columnheader">ALI</th>
                                    <th role="columnheader">AIE</th>
                                </thead>
                                <tbody role="row">
                                    <td role="gridcell"><input type="text" class="form-control" placeholder="Digite o nome da Classes"></td>
                                    <td role="gridcell"><input type="text" class="form-control" placeholder="Número de registros"></td>
                                    <td role="gridcell"><input type="text" class="form-control" placeholder="Número de ítens"></td>
                                    <td role="gridcell"><input type="radio" name="tipoArquivo" value="ALI" class="radio radio-inline"></td>
                                    <td role="gridcell"><input type="radio" name="tipoArquivo" value="AIE" class="radio radio-inline"></td>
                                </tbody>
                                <tbody role="row">
                                <td role="gridcell" colspan="5"><input type="submit" value="Adicionar" class="form-control btn btn-primary"></td>
                                </tbody>

                            </table>
                        </form>
                    </section>

                    <div class="espaco-superior"></div>

                    <section id="adicionaESC">
                        <h1>Adiciona E/S/C</h1>
                        <form action="#" method="get">
                            <table class="table table-hover espaco-superior" role="presentation">
                                <thead role="row">
                                    <th role="columnheader">Casos</th>
                                    <th role="columnheader">Qtd de classes</th>
                                    <th role="columnheader">Itens</th>
                                    <th role="columnheader">EE</th>
                                    <th role="columnheader">SE</th>
                                    <th role="columnheader">CE</th>
                                </thead>
                                <tbody role="row">
                                    <td role="gridcell"><input type="text" class="form-control" placeholder="Digite o nome da Classes"></td>
                                    <td role="gridcell"><input type="text" class="form-control" placeholder="Número de registros"></td>
                                    <td role="gridcell"><input type="text" class="form-control" placeholder="Número de ítens"></td>
                                    <td role="gridcell"><input type="radio" name="tipoDados" value="EE" class="radio radio-inline"></td>
                                    <td role="gridcell"><input type="radio" name="tipoDados" value="SE" class="radio radio-inline"></td>
                                    <td role="gridcell"><input type="radio" name="tipoDados" value="CE" class="radio radio-inline"></td>
                                </tbody>
                                <tbody role="row">
                                    <td role="gridcell" colspan="6"><input type="submit" value="Adicionar" class="form-control btn btn-primary"></td>
                                </tbody>
                            </table>
                        </form>
                    </section>

                    <section id="pontoDeFuncaoBruta">
                        <h1>Ponto de Função Bruta</h1>

                        <h2>Relatório da Tabela 1</h2>
                        <table class="table table-hover espaco-superior" role="presentation">
                            <thead role="row">
                            <th role="columnheader">Nome</th>
                            <th role="columnheader">ALI/AIE</th>
                            <th role="columnheader">Classificação</th>
                            <th role="columnheader">Ponto de função</th>
                            </thead>
                            <tbody role="row">
                            <td role="gridcell">Aluno</td>
                            <td role="gridcell">ALI</td>
                            <td role="gridcell">Médio</td>
                            <td role="gridcell">10</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell">Professor</td>
                            <td role="gridcell">AIE</td>
                            <td role="gridcell">Complexo</td>
                            <td role="gridcell">15</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell">Gerente</td>
                            <td role="gridcell">ALI</td>
                            <td role="gridcell">Complexo</td>
                            <td role="gridcell">15</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell"></td>
                            <td role="gridcell"></td>
                            <th role="gridcell">Total</th>
                            <th role="gridcell">40</th>
                            </tbody>

                        </table>

                        <h2>Relatório da Tabela 2</h2>

                        <table class="table table-hover espaco-superior" role="presentation">
                            <thead role="row">
                            <th role="columnheader">Nome</th>
                            <th role="columnheader">EE / SE / CE</th>
                            <th role="columnheader">Classificação</th>
                            <th role="columnheader">Ponto de função</th>
                            </thead>
                            <tbody role="row">
                            <td role="gridcell">Aluno</td>
                            <td role="gridcell">EE</td>
                            <td role="gridcell">Médio</td>
                            <td role="gridcell">10</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell">Professor</td>
                            <td role="gridcell">EE</td>
                            <td role="gridcell">Complexo</td>
                            <td role="gridcell">15</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell">Gerente</td>
                            <td role="gridcell">SE</td>
                            <td role="gridcell">Complexo</td>
                            <td role="gridcell">15</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell">Gerente</td>
                            <td role="gridcell">CE</td>
                            <td role="gridcell">Complexo</td>
                            <td role="gridcell">15</td>
                            </tbody>
                            <tbody role="row">
                            <td role="gridcell"></td>
                            <td role="gridcell"></td>
                            <th role="gridcell">Total</th>
                            <th role="gridcell">45</th>
                            </tbody>

                        </table>

                        <h4>Total dos pontos de funções</h4>
                        <form action="#" method="get">
                            <table class="table table-hover espaco-superior" role="presentation">
                                <thead role="row">
                                    <th role="columnheader">1ª Tabela(PF1)</th>
                                    <th role="columnheader">2ª Tabela(PF2)</th>
                                    <th role="columnheader">Total (PFB = PF1 + PF2)</th>
                                </thead>
                                <tbody role="row">
                                    <td role="gridcell">15</td>
                                    <td role="gridcell">20</td>
                                    <td role="gridcell">35</td>
                                </tbody>
                            </table>
                        </form>
                    </section>

                    <section id="nit">
                        <h1>NIT</h1>
                        <form action="#" method="get">
                            <table class="table table-hover espaco-superior" role="presentation">
                                <thead role="row">
                                <th role="columnheader">Características</th>
                                <th role="columnheader">Pontuação de 1 - 5</th>
                                </thead>

                                <tbody role="row">
                                <td role="gridcell">Comunicação de dados</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="comunicaoDeDados" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Processamento de Dados Distribuído</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="processamentoDeDadosDistribuidos" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Desempenho</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="desempenho" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Ultilização do equipamento</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="utilizacaoDoEquipamento" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Volume das Transações</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="volumeDasTransacoes" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Entrada de dados Online</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="entradaDosDadosOnline" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Eficiencia do usuário final</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="eficienciaDoUsuarioFinal" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Atualização online</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="atualizacaoOnline" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Processamento Complexo</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="Reusabilidade" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Facilidade de implantação</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="facilidadeDeImplantacao" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Facilidade Operacional</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="facilidadeOperacional" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Múltiplos locais e eficiencia do usuário</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="multiplosLocaisEficienciaDoUsuario" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Facilidade de mudanças</td>
                                <td role="gridcell"><input type="number" class="form-control" value="0" name="FacilidadeDeMudancas" min="0" max="5"></td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell" colspan="6"><input type="submit" value="Adicionar" class="form-control btn btn-primary"></td>
                                </tbody>
                            </table>
                        </form>
                    </section>


                    <section id="cocomo">
                        <h1>Cocomo</h1>
                            <table class="table table-hover espaco-superior" role="presentation">

                                <thead role="row">
                                <th role="columnheader">Função</th>
                                <th role="columnheader">Resultado</th>
                                </thead>

                                <tbody role="row">
                                <td role="gridcell">KLOC(Número de Linhas)</td>
                                <td role="gridcell">6.9723</td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Esforço</td>
                                <td role="gridcell">18.4412</td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Tempo</td>
                                <td role="gridcell">18.4412</td>
                                </tbody>

                                <tbody role="row">
                                <td role="gridcell">Pessoas</td>
                                <td role="gridcell">18.4412</td>
                                </tbody>
                            </table>
                    </section>


                    <section id="custos">
                        <h1>Custos</h1>
                        <table class="table table-hover espaco-superior" role="presentation">


                            <tbody role="row">
                            <th role="gridcell">Valor Hora Homem (HH)</th>
                            <td role="gridcell"><input type="text" class="form-control" name="horaHomem"></td>
                            </tbody>

                            <tbody role="row">
                            <th role="gridcell">Imposto</th>
                            <td role="gridcell"><input type="text" class="form-control" name="imposto"></td>
                            </tbody>

                            <tbody role="row">
                            <th role="gridcell">Segurança em %</th>
                            <td role="gridcell"><input type="text" class="form-control" name="seguranca"></td>
                            </tbody>

                            <tbody role="row">
                            <td role="gridcell" colspan="2"><input type="submit" class="btn btn-primary form-control" value="Adicionar"></td>
                            </tbody>


                        </table>
                    </section>



                </article>
            </div>
        </main>
    </div>
</div>


<footer>
    <div class="container">
        <div class="line-bottom"></div>
        <div>
            <p>
                Calculadora de estimativas de curso. Todos os direitos reservados. Thiago Cunha e Yuri!
            </p>
        </div>
    </div>
</footer>
<script src="js/bootstrap.js" type="text/javascript"></script>
<script
        src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="js/font-size.js"></script>

<script>
    $('#myModal').on('shown.bs.modal', function () {
        $('#myInput').focus()
    })

    $('.collapse').collapse();
</script>
</body>
</html>
</jsp:root>