package es.JuanAntonio;

public class Main {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Fernando", 50,Trabajador.CAT_EMPLEADO, Trabajador.ANT_EXPERTO);

        if (Validate.validator(t1.getAntiquity()) && Validate.validator(t1.getCategory())) {
            System.out.println(t1.calcularSueldo());
        } else System.out.println("La categoría o la antiguedad introducida no son correctos.");



    }

}
