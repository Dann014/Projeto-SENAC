const express = require('express');
const mysql = require('mysql');
const app = express();


const connection = mysql.createConnection({
  host: 'localhost',  
  user: 'root',   
  password: 'root', 
  database: 'trabalho3semestre' 
});

connection.connect((err) => {
  if (err) {
    console.error('Erro ao conectar ao MySQL: ' + err.stack);
    return;
  }
  console.log('Conexão ao MySQL estabelecida com sucesso.');
});

app.get('/casa/list', (req, res) => {
  connection.query('SELECT nome, quartos, banheiros, garagem, terreno FROM casa', (error, results) => {
    if (error) {
      console.error('Erro ao executar a query: ' + error.stack);
      return res.status(500).send('Erro ao obter os dados do banco de dados.');
    }
    res.json(results);
  });
});

app.listen(3000, () => {
  console.log('Servidor rodando na porta 3000');
});
