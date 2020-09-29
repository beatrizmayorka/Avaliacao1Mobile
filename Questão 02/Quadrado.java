/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public class Quadrado implements Geometria {  // Irá implementar a interface 'Geometria'
    // Atributo protegido 
    protected double lado;
    
    // Construtor que preenche o atributo 'lado'
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Retorna o perimetro do quadrado (L + L + L + L)
    public double getPerimetro() {
        return this.lado * 4;
    }

    // Retorna a area do quadrado (A = Lˆ2 )
    public double getArea() {
        return this.lado * this.lado;
    }
    
}
