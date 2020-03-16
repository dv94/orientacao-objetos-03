package exercicios;

public class Retangulo {
        private Double base;
        private Double altura;

        public Retangulo(Double base, Double altura){
            setBase(base);
            setAltura(altura);
        }
        public Double getBase() {
            return base;
        }
        public void setBase(Double base) {
            if(base <= 0){
                throw new IllegalArgumentException("O valor precisa ser maior que zero");
            }
            this.base = base;
        }

        public Double getAltura() {
            return altura;
        }

        public void setAltura(Double altura) {
            if(altura <= 0){
                throw new IllegalArgumentException("O valor precisa ser maior que zero");
            }
            this.altura = altura;
        }
        public double calcularArea(){
            return  base * altura;
        }
        public double calcularPerimentro(){
            return  2 * (base + altura);
        }

    }
