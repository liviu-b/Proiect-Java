import java.util.Random;
//pentru a genera un numar random am folosit import java.util.Random

public class Suma {
  
  // am definit un square pentru fiecare bancnota derivat din Square
	Square banc;
	Square1 banc1;
	Square2 banc2;
	
  public Suma(){
    Random random = new Random();
    // am pornit generare automata dela 1-60 a unui numar
    int lim=60, b10 = 10, b5 = 5, b1 = 1;
    // am initializat de la tastatura tipul fiecarei bacnote
    int nr_rand = random.nextInt(lim);
    int ban10, ban5, ban1, i, z, t, y;
    y=40;
    z=40;
    t=40;

    ban10 = nr_rand/b10;
    ban5 = nr_rand%b10/b5;
    ban1 = nr_rand%b10%b5/b1;

        // am afisat numarul generat si am afisat de asemenea cate tipuri de bacnote se folosesc pentru plata sumei generate
    
    System.out.println("Suma random: " + nr_rand);
    System.out.println("Bancnote de 10 lei: " + ban10);
    System.out.println("Bancnote de 5 lei: " + ban5);
    System.out.println("Bancnote de 1 lei: " + ban1);



    // pentru a determina anumite egalitati, am utilizat bucla if si for
    if (ban10>0){
    for(i=1;i<=ban10;i++){
    banc = new Square0(20, 60, 30, 5, "blue");
    banc.makeVisible();
    banc.moveHorizontal(y);
    y+=40;
    }
    }

    if (ban5>0){
    for(i=1;i<=ban5;i++){
    banc1 = new Square1(20, 120, 30, 5, "red");
    banc1.makeVisible(); 
    banc1.moveHorizontal(z);
    z+=40;
    }
    }

    if(ban1>0){
    for(i=1;i<=ban1;i++){
    banc2 = new Square2(20, 180, 30, 5, "green");
    banc2.makeVisible();
    banc2.moveHorizontal(t);
    t+=40;
    }
    }
  
 }
}