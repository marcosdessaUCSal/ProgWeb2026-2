function efetuar() {
	if (titulo.value == '' || autor.value == '') {
		mostrarMsg('Os campos "Título" e "Autor" são obrigatórios.');
	} else {
		mostrarMsg('Título: ' + titulo.value + '<br>' + 'Subtítulo: ' + subtitulo.value + '<br>' + 'Autor: ' + autor.value);
		btnEfetuar.disabled = true;
		btnConfirmar.disabled = false;
	}
}

function cancelar() {
	mostrarMsg('');
	btnEfetuar.disabled = false;
	btnConfirmar.disabled = true;
	titulo.value = '';
	subtitulo.value = '';
	autor.value = '';
}

function confirmar() {
	// Criando um objeto com valores dos campos
	const dados = {
		ok: 'ok',
		titulo: titulo.value,
		subtitulo: subtitulo.value,
		autor: autor.value
	}

	fetch(`${URL_BASE}/livros/LivroServlet`, {
		method: "POST",
		headers: {
			"Content-Type": "application/x-www-form-urlencoded"
		},
		body:
			`titulo=${(dados.titulo)}` +
			`&subtitulo=${(dados.subtitulo)}` +
			`&autor=${(dados.autor)}`

	})
		.then(
			response => {
				btnConfirmar.disabled = true;
				window.location.reload(true);
			}
		)
		.catch(
			erro => {
				// DECIDIR O QUE FAZER
			}
		);

}


function mostrarMsg(msg) {
	document.getElementById('mensagem').innerHTML = msg;
}







// URL do projeto
const URL_BASE = 'http://localhost:8080';

// Referencia os obotões
const btnConfirmar = document.getElementById('btn-confirmar');
const btnEfetuar = document.getElementById('btn-efetuar');

// Referencia os campos do formulário
const titulo = document.getElementById('titulo');
const subtitulo = document.getElementById('subtitulo');
const autor = document.getElementById('autor');

// Inicializa os botões
btnEfetuar.disabled = false;
btnConfirmar.disabled = true;


















