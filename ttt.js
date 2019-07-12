
    const trainerDetails=[];
    function saveTrainerDetails(){
    name=document.getElementById('nname');
    subj1=document.getElementById('subj1');
    subj2=document.getElementById('subj2');
    subj3=document.getElementById('subj3');
    let rows='';
    trainerDetails.forEach((trainer) =>{
        rows +=trainerRow(trainer);
    });
    trainerDetails.push({name:nname.value,subj1:subj1.value,subj2:subj2.value,subj3:subj3.value});
    localStorage.setItem("trainerDetails",JSON.stringify(trainerDetails));
    console.log(rows);
    }
    const trainerRow = (trainer)=>{
        return `<tr>
        <td>${trainer.name}</td>
        <td>${trainer.subj1}</td>
        </tr> `
    }
    const classDetails=[];
    function editTimeTable(){
    classs=document.getElementById('classs');
    slot=document.getElementById('slot');
    subject=document.getElementById('subj');
    trainer=filter(subject);
    alert(classDetails.trainer+ 'is assigned to'+classDetails.classs);
    let rows='';
    classDetails.forEach((clas) =>{
        rows +=classRow(clas);
    });
    classDetails.push({classs:classs.value,slot:solt.value,subj:subj.value,trainer:trainer.value});
    localStorage.setItem("classDetails",JSON.stringify(classDetails));
    console.log(rows);

    }
    function filter(subject1){
       const train=[];
        if(subject1!=null){
         Object.keys(localStroage).forEach((e)=>{
            const _trainer=JSON.parse(localStorage.getItem(e));
            if(_trainer.subj1==subject1 || _trainer.subj2==subject1||_trainer.subj3==subject1){
              train.push(_trainer);  
            }
        });
    }
    return train;
}