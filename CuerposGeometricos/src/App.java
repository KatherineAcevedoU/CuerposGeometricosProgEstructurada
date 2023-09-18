import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
       
       double altura, radio; 
       double perimetroBase, areaBase;
       double areaLateral, areaTotal, volumen;
       double generatriz;
       double arista, area;
       double areaEsfera, volumenEsfera;
       double diagonal;
       double grado;
       double husoAreaEsferico, cuñaVolumenEsferica; 
       int cantidadLados;
       double longitudLados, apotemaBase, apotemaPiramide;
       double apotema, alfa;
       double radioMenor, radioMayor;
       double alturaCaraLateral, longitudBaseMayor, longitudBaseMenor;
       double areaBaseMayor, areaBaseMenor;
       double altitud;
       double areaZonaEsferica, volumenZonaEsferica, areaCasqueteEsferico, volumenCasqueteEsferico;
       double radioBaseMayor, radioBaseMenor;
       
        int repeticiones = 1;
        
        System.out.println("...............................");
        System.out.println(".Cuerpos Geometricos          .");
        System.out.println("...............................");
        System.out.println("");
        System.out.println("................................");
        System.out.println(".Menu de opciones:             .");
        System.out.println("................................");
        System.out.println(".      1) Cilindro             .");
        System.out.println(".      2) Cono                 .");
        System.out.println(".      3) Dodecaedro           .");
        System.out.println(".      4) Esfera               .");
        System.out.println(".      5) Hexaedro             .");
        System.out.println(".    6) Huso Cuña Esferica     .");
        System.out.println(".      7) Icosaedro            .");
        System.out.println(".      8) Octaedro             .");
        System.out.println(".      9) Piramide             .");
        System.out.println(".      10) Prisma              .");
        System.out.println(".11) Segmento Esferico Truncado.");
        System.out.println(".      12) Tetraedro           .");
        System.out.println(".      13) Tronco Cono         .");
        System.out.println(".      14) Tronco Piramide     .");
        System.out.println("................................");
        System.out.println("");
        System.out.println("¿Que opcion elije?");
        byte Opcion = entrada.nextByte();

        do{
            if(Opcion >= 1){

               switch(Opcion){

                      case 1: System.out.println("Usted eligio el Cilindro.");
                              System.out.println("");

                                System.out.println("Ingrese la altura: ");
                                altura = entrada.nextDouble();
                                System.out.println("Ingrese el radio: ");
                                radio = entrada.nextDouble();
                            do{

                                if(altura >= 1 && radio >= 1){
               
                                 perimetroBase = 2 * Math.PI * (radio * radio);
                                 areaLateral = perimetroBase * altura;
               
                                 areaBase = Math.PI * (radio * radio);
                                 areaTotal = areaLateral + 2 * areaBase;
               
                                 volumen = areaBase * altura;
               
                                 System.out.println("El area lateral del cilindro es: " + areaLateral);
                                 System.out.println("El area total del cilindro es: " + areaTotal);
                                 System.out.println("El volumen del cilindro es: " + volumen);
                              
                                 repeticiones = 3;

                                }else{
                                    System.out.println("No se puede ingresar numeros negativos.");
                                    System.out.println("");
                                    System.out.println("Ingrese la altura: ");
                                    altura = entrada.nextDouble();
                                    System.out.println("Ingrese el radio: ");
                                    radio = entrada.nextDouble();

                                   
               
                                   repeticiones++;

                                   if(repeticiones == 3){
                                      System.out.println("Error! se intento varias veces.");
                                   }

                                }

                            }while(repeticiones < 3);
                              
                        
                        break;

                      case 2: System.out.println("Usted eligio el Cono.");
                              System.out.println("");

                                System.out.println("Ingrese el radio del cono: ");
                                radio = entrada.nextDouble();
                                System.out.println("Ingrese la altura del cono: ");
                                altura = entrada.nextDouble();
                              
                            do{

                            
                                if(radio >= 1 && altura >= 1){ 
             
                                  perimetroBase = (Math.PI * radio * altura + Math.PI * radio * radio);
                                  generatriz = (Math.sqrt (altura * altura) + (radio * radio));
                                  areaLateral = (perimetroBase * generatriz) / 2;
             
                                  areaBase = (Math.PI * radio * radio);
                                  areaTotal =  areaLateral + areaBase;
             
                                  volumen = (areaBase * altura) / 3;
             
                                  System.out.println("El area lateral del cono es: " + areaLateral);
                                  System.out.println("El area total del cono es: " + areaTotal);
                                  System.out.println("El volumen del cono es: " + volumen);
             
                                  repeticiones = 3;

                                }else{
                                   System.out.println("No se puede ingresar numeros negativos.");
                                   System.out.println("");
                                   System.out.println("Ingrese el radio del cono: ");
                                   radio = entrada.nextDouble();
                                   System.out.println("Ingrese la altura del cono: ");
                                   altura = entrada.nextDouble();
                            
                                   
                                   repeticiones++;

                                   if(repeticiones == 3){
                                       System.out.println("Error! se intento varias veces.");
                                   }
                                } 

                            }while(repeticiones < 3);
                     
                        break;

                      case 3: System.out.println("Usted eligio el Dodecaedro.");
                              System.out.println("");

                               System.out.println("Ingrese la arista:");
                               arista = entrada.nextDouble();
                            
                                do{

                                    if(arista >= 1){
              
                                     area = 3 * arista * arista * Math.sqrt(25 + 10 * Math.sqrt(5));
              
                                     volumen = (Math.pow(arista, 3)) / 4 * (15 + 7 * Math.sqrt(5));
              
                                     System.out.println("El area de el dodecaedro es: " + area + "centimetros cuadrados.");
                                     System.out.println("El volumen de el dodecaedro es: " + volumen + "centimetros cubicos.");
                                    
                                     repeticiones = 3;
                                  
                                    }else{
                                      System.out.println("No se puede ingresar numeros negativos.");
                                      System.out.println("");
                                      System.out.println("Ingrese la arista:");
                                      arista = entrada.nextDouble();

                                      repeticiones++;

                                     if(repeticiones == 3){
                                       System.out.println("Error! se intento varias veces.");
                                     }
                                    
                                    }
                                 
                                }while(repeticiones < 3);

                            break;

                      case 4: System.out.println("Usted eligio la Esfera.");
                              System.out.println("");

                                 System.out.println("Ingrese el radio de la esfera");
                                 radio = entrada.nextDouble();
                              
                                do{

                                    if(radio >= 1){
              
                                     areaEsfera = 4 * (Math.PI * radio * radio);
                      
                                     volumenEsfera = 4 * (Math.PI * radio * radio * radio) / 3;
              
                                     System.out.println("El area de la esfera es: " + areaEsfera);
                                     System.out.println("El volumen de la esfera es: " + volumenEsfera);

                                    }else{

                                     System.out.println("No se puede ingresar numeros negativos.");
                                     System.out.println("");
                                     System.out.println("Ingrese el radio de la esfera");
                                     radio = entrada.nextDouble();
                                    
                                     repeticiones++;

                                      if(repeticiones == 3){
                                         System.out.println("Error! se intento varias veces.");
                                      }
                                    }

                                }while(repeticiones < 3);
                        break;


                      case 5: System.out.println("Usted eligio el Hexaedro.");
                              System.out.println("");

                                System.out.println("Ingrese la arista: ");
                                arista = entrada.nextDouble();
             
                                do{
                                  
                                    if(arista >= 1){
             
                                      area = 6 * Math.pow(arista, 2);
             
                                      diagonal = Math.sqrt(arista * arista + arista * arista + arista * arista);
             
                                      volumen = Math.pow(arista, 3);
                 
                                      System.out.println("El area del exaedro es: " + area);
                                      System.out.println("La diagonal del exaedro es: " + diagonal);
                                      System.out.println("El volumen del exaedro es: " + volumen);

                                      repeticiones = 3;

                                    }else{
                                        System.out.println("No se puede ingresar numeros negativos.");
                                        System.out.println("");
                                        System.out.println("Ingrese la arista: ");
                                        arista = entrada.nextDouble();
             

                                        repeticiones++;

                                        if(repeticiones == 3){
                                          System.out.println("Error! se intento varias veces.");
                                        }
                                    }

                                }while(repeticiones < 3);

                        break;


                      case 6: System.out.println("Usted eligio el Huso/Cuña Esferica.");
                              System.out.println("");

                                  System.out.println("Ingrese el radio:");
                                  radio = entrada.nextDouble();
                                  System.out.println("Ingrese el angulo:");
                                  grado = entrada.nextDouble();
              
                                do{

                                    if(radio >= 1 && grado >= 1){
              
                                     husoAreaEsferico = (4 * Math.PI * radio * radio * grado) / 360;
              
                                     cuñaVolumenEsferica = ((4 * Math.PI * radio * radio * radio * grado)) / (3 * 360);
              
                                     System.out.println("El huso esferico es: " + husoAreaEsferico + "Centimetros cubicos");
                                     System.out.println("La cuña esferica es: " + cuñaVolumenEsferica + "centimetros cubicos");

                                     repeticiones = 3;

                                    }else{
                                        System.out.println("No se puede ingresar numeros negativos.");
                                        System.out.println("");
                                        System.out.println("Ingrese el radio:");
                                        radio = entrada.nextDouble();
                                        System.out.println("Ingrese el angulo:");
                                        grado = entrada.nextDouble();
              
                                        
                                        repeticiones++;

                                        if(repeticiones == 3){
                                          System.out.println("Error! se intento varias veces.");
                                        }

                                    }
              
                                }while(repeticiones < 3);
                        break;


                      case 7: System.out.println("Usted eligio el Icosaedro.");
                              System.out.println("");

                                 System.out.println("Ingrese la arista:");
                                 arista = entrada.nextDouble();
                        
                                do{
                                    
                                    if(arista >= 1){
              
                                     area = 5 * Math.sqrt(3) * Math.pow(arista, 2);
              
                                     volumen = (5 * Math.pow(arista, 3)) / 12 * (3 + Math.sqrt(5));
              
                                     System.out.println("El area del icosaedro es: " + area + "centimetros cuadrados.");
                                     System.out.println("El volumen del icosaedro es: " + volumen + "centimetros cubicos.");
                      
                                     repeticiones = 3;

                                    }else{
                                        System.out.println("No se puede ingresar numeros negativos.");
                                        System.out.println("");
                                        System.out.println("Ingrese la arista:");
                                        arista = entrada.nextDouble();


                                        repeticiones++;

                                        if(repeticiones == 3){
                                           System.out.println("Error! se intento varias veces.");
                                        }

                                    }

                                }while(repeticiones < 3);

                        break;


                      case 8: System.out.println("Usted eligio el Octaedro.");
                              System.out.println("");

                                 System.out.println("Ingrese el arista:");
                                 arista = entrada.nextDouble();

                                do{
                                 
                                    if(arista >= 1){
              
                                     area = 2 * arista * arista * Math.sqrt(3);
              
                                     volumen = (Math.pow(arista, 3) * Math.sqrt(2)) / 3;
              
                                      System.out.println("El area del octaedro es: " + area + "centimetros cuadrados.");
                                      System.out.println("El volumen del octaedro es: " + volumen + "centimetros cubicos.");

                                     repeticiones = 3;

                                    }else{
                                      System.out.println("No se puede ingresar numeros negativos.");
                                      System.out.println("");
                                      
                                      repeticiones++;

                                      if(repeticiones == 3){
                                         System.out.println("Error! se intento varias veces.");
                                      }

                                    }

                                }while(repeticiones < 3);
                        break;

                    
                      case 9: System.out.println("Usted eligio la Piramide.");
                              System.out.println("");

                                     System.out.println("Ingrese la cantidad de lados: ");
                                     cantidadLados = entrada.nextInt();
                                     System.out.println("Ingrese la medida de los lados: ");
                                     longitudLados = entrada.nextDouble();
                                     System.out.println("Ingrese la altura: ");
                                     altura = entrada.nextDouble();
                                     System.out.println("Ingrese el apotema de la base: ");
                                     apotemaBase = entrada.nextDouble();
 
                                do{
                                        if(cantidadLados >= 1 && longitudLados >= 1 && altura >= 1 && apotemaBase >= 1){
              
                                         perimetroBase = cantidadLados * longitudLados;
                                         apotemaPiramide = (Math.sqrt(altura * altura) + (apotemaBase * apotemaBase));
                                         areaLateral = (perimetroBase * apotemaPiramide) / 2;
              
                                          areaBase = perimetroBase * 2 * (apotemaBase + apotemaPiramide);
                                          areaTotal = areaLateral + areaBase;
              
                                           volumen = (areaBase * altura) / 3;
                 
                                          System.out.println("El area lateral de la piramide es: "+ areaLateral);
                                          System.out.println("El area total de la piramide es: "+ areaTotal);
                                          System.out.println("El volumen de la piramide es: "+ volumen);

                                          repeticiones = 3;

                                        }else{
                                          System.out.println("No se puede ingresar numeros negativos.");
                                          System.out.println("");
                                          System.out.println("Ingrese la cantidad de lados: ");
                                          cantidadLados = entrada.nextInt();
                                          System.out.println("Ingrese la medida de los lados: ");
                                          longitudLados = entrada.nextDouble();
                                          System.out.println("Ingrese la altura: ");
                                          altura = entrada.nextDouble();
                                          System.out.println("Ingrese el apotema de la base: ");
                                          apotemaBase = entrada.nextDouble();
                                    
                                          repeticiones++;

                                          if(repeticiones == 3){
                                            System.out.println("Error! se intento varias veces.");
                                          }

                                        }

                                }while(repeticiones < 3);

                            break;


                      case 10: System.out.println("Usted eligio el Prisma.");
                               System.out.println("");

                                    System.out.println("Cantidad de lados: ");
                                    cantidadLados = entrada.nextInt();
                                    System.out.println("Longitud de lados: ");
                                    longitudLados = entrada.nextDouble();
                                    System.out.println("Altura: ");
                                    altura = entrada.nextInt();

                                do{
              
                                    if(cantidadLados >= 1 && longitudLados >= 1 && altura >= 1){

                                      perimetroBase = cantidadLados * longitudLados;
                                      areaLateral = perimetroBase * altura;
              
                                      alfa = (Math.PI/180) * (360/cantidadLados);
                                      apotema = longitudLados / (2 * Math.tan((alfa)/ 2));
                                      areaBase = (perimetroBase * apotema)/ 2;
                                      areaTotal = areaLateral + 2 * areaBase; 
              
                                      volumen = areaBase * altura;
              
                                      System.out.println("El area lateral del prisma es de : " + areaLateral + "unidades cuadradas.");
                                      System.out.println("El area total del prisma es de : " + areaTotal + "unidades cuadradas.");
                                      System.out.println("El volumne del prisma es de : " + volumen + "unidades cubicas");
              
                                      repeticiones = 3;

                                    }else{
                                        System.out.println("No se puede ingresar numeros negativos.");
                                        System.out.println("");
                                        System.out.println("Cantidad de lados: ");
                                        cantidadLados = entrada.nextInt();
                                        System.out.println("Longitud de lados: ");
                                        longitudLados = entrada.nextDouble();
                                        System.out.println("Altura: ");
                                        altura = entrada.nextInt();

                                        repeticiones++;

                                        if(repeticiones == 3){
                                           System.out.println("Error! se intento varias veces.");
                                        }

                                    }

                                }while(repeticiones < 3);

                        break;


                      case 11: System.out.println("Usted eligio el Segmento Esferico Truncado.");
                               System.out.println("");

                                 System.out.println("Ingrese el radio");
                                 radio = entrada.nextDouble();
                                 System.out.println("Ingrese la altitud");
                                 altitud = entrada.nextDouble();
                                 System.out.println("Ingrese el radio mayor");
                                 radioBaseMayor = entrada.nextDouble();
                                 System.out.println("Ingrese el radio menor");
                                 radioBaseMenor = entrada.nextDouble();
 
                                do{
  
                                    if(radio >= 1 && altitud >= 1 && radioBaseMayor >= 1 && radioBaseMenor >= 1){
              
                                     areaZonaEsferica  =  2 * Math.PI * radio * altitud;
                                     volumenZonaEsferica = (Math.PI * altitud * (altitud * altitud + (3 * radioBaseMayor * radioBaseMayor) + (3 * radioBaseMenor * radioBaseMenor))) / 6;
              
                                     areaCasqueteEsferico = 2 * Math.PI * radio * altitud;
                                     volumenCasqueteEsferico = (Math.PI * altitud * altitud * (3 * radio - altitud)) / 3;
              
                                     System.out.println("El area de la zona esferica es: " + areaZonaEsferica);
                                     System.out.println("El volumen de la zona esferica es: " + volumenZonaEsferica);
                                     System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                     System.out.println("El area del casquete esferico es: " + areaCasqueteEsferico);
                                     System.out.println("El volumen del casquete esferico es: " + volumenCasqueteEsferico);
                    
                                      repeticiones = 3;

                                    }else{
                                        System.out.println("No se puede ingresar numeros negativos.");
                                        System.out.println("");
                                        System.out.println("Ingrese el radio");
                                        radio = entrada.nextDouble();
                                        System.out.println("Ingrese la altitud");
                                        altitud = entrada.nextDouble();
                                        System.out.println("Ingrese el radio mayor");
                                        radioBaseMayor = entrada.nextDouble();
                                        System.out.println("Ingrese el radio menor");
                                        radioBaseMenor = entrada.nextDouble();
                                        
                                        repeticiones++;

                                        if(repeticiones == 3){
                                           System.out.println("Error! se intento varias veces.");
                                        }

                                    }

                                }while(repeticiones < 3);

                        break;


                      case 12: System.out.println("Usted eligio el Tetraedro.");
                               System.out.println("");

                               System.out.println("Ingrese el arista:");
                               arista = entrada.nextDouble();
                       
                            do{

                                if(arista >= 1){
              
                                  area = Math.sqrt(3) * Math.pow(arista, 2);
              
                                 volumen = (Math.pow(arista, 3) * Math.sqrt(2)) / 12;
              
                                 altura = (arista * Math.sqrt(6)) / 3;
              
                                 System.out.println("El area del tetraedro es: " + area + "centimetros cuadrados");
                                 System.out.println("La altura del tetraedro es: " + altura + "centimetros");
                                 System.out.println("El volumen del tetraedro es: " + volumen + "centimetros cubicos");
              
                                 repeticiones = 3;

                                }else{
                                    System.out.println("No se puede ingresar numeros negativos.");
                                    System.out.println("");
                                    System.out.println("Ingrese el arista:");
                                    arista = entrada.nextDouble();

                                    
                                    repeticiones++;

                                    if(repeticiones == 3){
                                       System.out.println("Error! se intento varias veces.");
                                    }

                                }

                          }while(repeticiones < 3);

                        break;


                      case 13: System.out.println("Usted eligio el Tronco Truncado.");
                               System.out.println("");

                              System.out.println("Ingrese la altura");
                              altura = entrada.nextDouble();
                              System.out.println("Ingrese el radio menor");
                              radioMenor = entrada.nextDouble();
                              System.out.println("Ingrese el radio mayor");
                              radioMayor = entrada.nextDouble();

                            do{

                                if(altura >= 1 && radioMenor >= 1 && radioMayor >= 1){
              
                                  double elevacion = radioMayor - radioMenor;
                                  generatriz = Math.sqrt ((altura * altura) + (Math.pow(elevacion, 2)));
                                  areaLateral =Math.PI * (generatriz) * ((radioMayor + radioMenor));
              
                                  areaTotal = areaLateral + (Math.PI *(radioMayor * radioMayor)) + (Math.PI *(radioMenor * radioMenor));
              
                                  volumen = Math.PI * altura * ((radioMayor * radioMayor) + (radioMenor * radioMenor) + Math.sqrt((radioMayor * radioMayor) * (radioMenor * radioMenor))) / 3;
              
                                  System.out.println("El area lateral del tronco de cono es: " + areaLateral);
                                  System.out.println("El area total del tronco de cono es: " + areaTotal);
                                  System.out.println("El volumen del tronco de cono es: " + volumen);
              
                                  repeticiones = 3;

                                }else{
                                    System.out.println("No se puede ingresar numeros negativos.");
                                    System.out.println("");
                                    System.out.println("Ingrese la altura");
                                    altura = entrada.nextDouble();
                                    System.out.println("Ingrese el radio menor");
                                    radioMenor = entrada.nextDouble();
                                    System.out.println("Ingrese el radio mayor");
                                    radioMayor = entrada.nextDouble();
                                    
                                    repeticiones++;

                                    if(repeticiones == 3){
                                      System.out.println("Error! se intento varias veces.");
                                    }

                                }

                            }while(repeticiones < 3);

                        break;


                      case 14: System.out.println("Usted eligio el Tronco Piramide.");
                               System.out.println("");

                             System.out.println("Ingrese el altura");
                             altura = entrada.nextDouble();
                             System.out.println("Ingrese la altura de la cara lateral:");
                             alturaCaraLateral = entrada.nextDouble();
                             System.out.println("Ingrese la medidad de la base mayor");
                             longitudBaseMayor = entrada.nextDouble();
                             System.out.println("Ingrese la medida la base menor");
                             longitudBaseMenor = entrada.nextDouble();

                          do{
                                if(altura >= 1 && alturaCaraLateral >= 1 && longitudBaseMayor >= 1 && longitudBaseMenor >= 1){

                                  areaLateral = (4 *(longitudBaseMayor + longitudBaseMenor) * alturaCaraLateral) / 2;
              
                                  areaBaseMayor = longitudBaseMayor * longitudBaseMayor;
                                  areaBaseMenor = longitudBaseMenor * longitudBaseMenor;
                                  areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
              
                                  volumen = (altura / 3 ) * (areaBaseMayor + areaBaseMenor + (Math.sqrt(areaBaseMayor * areaBaseMenor)));
              
                                  System.out.println("El area lateral del tronco de piramide es: " + areaLateral + "centimetro cubicos.");
                                  System.out.println("El area total del tronco de piramide es: " + areaTotal + "centimetros cubicos.");
                                  System.out.println("El volumen del tronco de piramide es: " + volumen + "centimetros cubicos.");
                              
                                  repeticiones = 3;

                                }else{
                                    System.out.println("No se puede ingresar numeros negativos.");
                                    System.out.println("");
                                    System.out.println("Ingrese el altura");
                                    altura = entrada.nextDouble();
                                    System.out.println("Ingrese la altura de la cara lateral:");
                                    alturaCaraLateral = entrada.nextDouble();
                                    System.out.println("Ingrese la medidad de la base mayor");
                                    longitudBaseMayor = entrada.nextDouble();
                                    System.out.println("Ingrese la medida la base menor");
                                    longitudBaseMenor = entrada.nextDouble();
                                    
                                    repeticiones++;

                                    if(repeticiones == 3){
                                       System.out.println("Error! se intento varias veces.");
                                    }

                                }

                            }while(repeticiones < 3);
                           
                        break;

                        default:
                         System.out.println("Opcion incorrecta");
                         System.out.println("Saliendo de la App.");
                }    

                    repeticiones = 3;

            }else{
                System.out.println("No se puede ingresar numeros negativos.");
                System.out.println("");
                System.out.println("¿Que opcion elije?");
                Opcion = entrada.nextByte();

                repeticiones++;

                if(repeticiones == 3){
                   System.out.println("Error! se intento varias veces.");
                }
            }
           
        }while(repeticiones < 3);


        entrada.close();

    }
}
