package com.academy.academicprojects1sem;

public class AcademicProjects1SEM {
    public static void main(String[] args) {
        
        //Instanciando objeto
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();
        Students student4 = new Students();
        
        //Alocando valores nos objetos, para as variáveis da classe
        student1.name = "Iann";
        student1.lastName = "Schmith";
        student1.age = 18;
        student1.adress = "Rua Orlando Maia";
        student1.ra = 824111983;
        
        student2.name = "Pedro";
        student2.lastName = "Baffa";
        student2.age = 19;
        student2.adress = "Avenida Imirim";
        student2.ra = 222222222;
        
        student3.name = "Mateus";
        student3.lastName = "Simões";
        student3.age = 18;
        student3.adress = "Bela Cintra";
        student3.ra = 333333333;
        
        student4.name = "Leonardo";
        student4.lastName = "Albuquerque";
        student4.age = 18;
        student4.adress = "Jardim Brasil";
        student4.ra = 444444444;
        
        //Retorno dos dados inseridos
        System.out.println("Infos aluno1:\n\nnome: "+student1.name+"\nSobrenome: "+student1.lastName+"\nIdade: "+student1.age+"\nEndereco: "+student1.adress+"\nra: "+student1.ra);
        System.out.println("\nInfos aluno2:\n\nnome: "+student2.name+"\nSobrenome: "+student2.lastName+"\nIdade: "+student2.age+"\nEndereco: "+student2.adress+"\nra: "+student2.ra);
        System.out.println("\nInfos aluno3:\n\nnome: "+student3.name+"\nSobrenome: "+student3.lastName+"\nIdade: "+student3.age+"\nEndereco: "+student3.adress+"\nra: "+student3.ra);
        System.out.println("\nInfos aluno4:\n\nnome: "+student4.name+"\nSobrenome: "+student4.lastName+"\nIdade: "+student4.age+"\nEndereco: "+student4.adress+"\nra: "+student4.ra);
    }
}
