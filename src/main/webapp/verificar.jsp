<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Computadores</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }
        h3 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: #555;
        }
        input, select, button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        input::placeholder {
            color: #aaa;
        }
        button {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #45a049;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .error {
            color: red;
            font-size: 12px;
            margin-top: -10px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3>Cadastro de Computadores</h3>
        <form action="CadastroComputador" method="post">
            <div class="form-group">
                <label for="colaborador">Nome do Colaborador</label>
                <select name="colaborador" id="colaborador">
                    <c:forEach var="c" items="${listaColaborador}">
                        <option value="${c.nome}">${c.nome}</option>
                    </c:forEach>
                </select>
            </div>
            
            <h3>Dados do Computador</h3>
            
            <div class="form-group">
                <label for="marca">Marca</label>
                <input type="text" name="marca" id="marca" placeholder="Insira a marca do computador" required>
            </div>
            
            <div class="form-group">
                <label for="modelo">Modelo</label>
                <input type="text" name="modelo" id="modelo" placeholder="Insira o modelo do computador" required>
            </div>
            
            <div class="form-group">
                <label for="processador">Processador</label>
                <input type="text" name="processador" id="processador" placeholder="Insira o processador do computador" required>
            </div>
            
            <div class="form-group">
                <label for="armazenamento">Armazenamento (em GB)</label>
                <input type="number" name="armazenamento" id="armazenamento" placeholder="Insira o armazenamento do computador" required>
            </div>
            
            <div class="form-group">
                <label for="ram">RAM (em GB)</label>
                <input type="number" name="ram" id="ram" placeholder="Insira a RAM do computador" required>
            </div>
            
            <button type="submit">Enviar</button>
        </form>
    </div>
</body>
</html>
