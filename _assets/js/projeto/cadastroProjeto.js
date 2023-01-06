const form01 = document.querySelector("#form01");
const form02 = document.querySelector("#form02");
const form03 = document.querySelector("#form03");
const btn01 = document.querySelector("#btn_continuar01");
const btn02 = document.querySelector("#btn_continuar02");
const btn03 = document.querySelector("#btn_finalizar");
const btn04 = document.querySelector("#btn_voltar01");
const btn05 = document.querySelector("#btn_voltar02");
const etapa01 = document.querySelector("#etapa01");
const etapa02 = document.querySelector("#etapa02");
const etapa03 = document.querySelector("#etapa03");

btn01.addEventListener("click",()=>handleForm(form02, form01, etapa02, etapa01));
btn02.addEventListener("click",()=>handleForm(form03, form02, etapa03, etapa02));
btn04.addEventListener("click",()=>handleForm(form01, form02, etapa01, etapa02));
btn05.addEventListener("click",()=>handleForm(form02, form03, etapa02, etapa03));


function handleForm(form_ativo, form_desativo, etapa_atual, etapa_anterior){
    form_ativo.classList.add("form_ativo");
    form_desativo.classList.remove("form_ativo");
    etapa_atual.classList.add("nivel_atual");
    etapa_anterior.classList.remove("nivel_atual");
}

