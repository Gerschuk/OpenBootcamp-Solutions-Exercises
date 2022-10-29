public class Main {
    public static void main(String[] args) {

        //Print if numeroif is +, - or 0
        int numeroif = 0;
        if (numeroif > 0){
            System.out.println("Number es positivo");
        } else if (numeroif < 0) {
            System.out.println("Number es negativo");
        }else {
            System.out.println("Number es igual a 0");
        }

        System.out.println("---------- While ---------");
        //While condition numeroWhile < 3
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("--------- Do While----------");
        //Do while only executes one time
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("--------- For ----------");
        //For repeats 3 times
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("--------- Switch ----------");
        String estacion = "invierno";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}