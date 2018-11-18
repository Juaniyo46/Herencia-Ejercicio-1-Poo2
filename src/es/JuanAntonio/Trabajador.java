package es.JuanAntonio;

public class Trabajador {

    private String name;
    private int age;
    private int category;
    private int antiquity;

   static public final int CAT_EMPLEADO = 0;
   static public final int CAT_ENCARGADO = 1;
   static public final int CAT_DIRECTIVO = 2;
   static public final int ANT_NOVATO = 0;
   static public final int ANT_MADURO= 1;
   static public final int ANT_EXPERTO = 2;
   static public final int SUELDO_BASE = 607;

    public Trabajador(String name, int age, int category, int antiquity) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.antiquity = antiquity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }


    @Override
    public String toString() {
        return "Trabajador{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", category=" + category +
                ", antiquity=" + antiquity +
                '}';
    }

    public double calcularSueldo () {

        double sueldo = SUELDO_BASE;

        switch (this.category) {
            case CAT_EMPLEADO:
                sueldo += sueldo * 0.15;
                break;
            case CAT_ENCARGADO:
                sueldo += sueldo * 0.35;
                break;
            case CAT_DIRECTIVO:
                sueldo += sueldo * 0.60;
                break;
        }

        switch (this.antiquity) {
            case ANT_NOVATO:
                sueldo += sueldo + 150;
                break;
            case ANT_MADURO:
                sueldo += sueldo +300;
                break;
            case ANT_EXPERTO:
                sueldo += sueldo + 600;
                break;
        }

        return sueldo;
    }
}
