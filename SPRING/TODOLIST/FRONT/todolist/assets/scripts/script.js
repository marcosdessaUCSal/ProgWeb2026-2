// =================================================
//      DEFINIÇÕES DE CLASSES E VARIÁVEIS GLOBAIS
// =================================================

class Tarefa {
    constructor(id, txt, sel) {
        this.id = id;
        this.texto = txt;
        this.marcado = sel;
    }
}

const URL_BASE = 'http://localhost:8080/todo';
var arrayTarefas = [];



// =================================================
//      EXIBIÇÃO DOS DADOS
// =================================================

function exibeTarefas() {
    fetch(`${URL_BASE}/tarefas`, {
        method: 'GET'
    })
        .then(response => response.json())
        .then(data => {
            arrayTarefas.length = 0;
            data.forEach(item => {
                arrayTarefas.push(new Tarefa(item.id, item.txt, item.marcado));
            });
            mostraNaTela();
        })
        .catch(
            e => {
                // TODO: fazer um tratamento de exceções
            }
        );
}




// =================================================
//      CONSTRUÇÃO DE ELEMENTOS GRÁFICOS
// =================================================

function mostraNaTela() {
    let area = document.getElementById('tarefas');
    let conteudo = '';
    let registroAtual = '';
    let txt = '';
    let selecionado = false;
    let id = 0;
    for (let t of arrayTarefas) {
        id = t.id;
        txt = t.texto;
        selecionado = t.marcado;
        registroAtual = `<div class="registro">`;
        if (!selecionado) {
            registroAtual += `<input type="checkbox" onchange="mude(${id})">`;
            registroAtual += `<div class="texto">${txt}</div>`;
        } else {
            registroAtual += `<input type="checkbox" checked onchange="mude(${id})">`;
            registroAtual += `<div class="texto-riscado">${txt}</div>`;
        }
        registroAtual += `<div><img class="icone" src="/assets/img/delete-icon.svg" onclick="remova(${id})"></div>`;
        registroAtual += `</div>`;
        conteudo += registroAtual;
    }
    area.innerHTML = conteudo;
}


// =================================================
//      ALTERAÇÕES NOS DADOS
// =================================================


function mude(id) {
    fetch(`${URL_BASE}/inverteMarcado/${id}`, {
        method: 'PUT'
    })
        .then(() => {
            exibeTarefas();
        })
        .catch(
            e => {
                console.log(e);
            }
        );
}

function remova(id) {
    fetch(`${URL_BASE}/delete/${id}`, {
        method: 'DELETE'
    })
        .then(() => {
            exibeTarefas();
        })
        .catch(
            e => {
                console.log(e);
            }
        );
}

function adicionarTarefa() {
    let txt = document.getElementById('entrada').value;
    document.getElementById('entrada').value = '';
    if (!validaTarefa(txt)) return;
    fetch(`${URL_BASE}/add`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            id: null,
            txt: txt,
            marcado: false
        })
    })
        .then(() => {
            exibeTarefas();
        })
        .catch(
            e => {
                // TODO: fazer um tratamento de exceções
            }
        );
}

function marcarTudo() {
    fetch(`${URL_BASE}/marcaTudo`, {
        method: 'PUT'
    })
        .then(() => exibeTarefas())
        .catch(
            e => {
                console.log(e);
            }
        );
}

function desmarcarTudo() {
    fetch(`${URL_BASE}/desmarcaTudo`, {
        method: 'PUT'
    })
        .then(
            () => exibeTarefas()
        )
        .catch(
            e => {
                console.log(e);
            }
        );
}

function removerMarcados() {
    fetch(`${URL_BASE}/removeMarcados`, {
        method: 'DELETE'
    })
        .then(
            () => exibeTarefas()
        )
        .catch(
            e => {
                console.log(e);
            }
        );
}

function reset() {
    fetch(`${URL_BASE}/reset`, {
        method: 'PUT'
    })
        .then(
            () => exibeTarefas()
        )
        .catch(
            e => {
                console.log(e);
            }
        );
}


// Verifica se a tarefa não é vazia
function validaTarefa(txt) {
    if (txt.trim() == '') {
        return false;
    }
    return true;
}











// =================================================
//      INICIANDO TUDO
// =================================================

exibeTarefas();

