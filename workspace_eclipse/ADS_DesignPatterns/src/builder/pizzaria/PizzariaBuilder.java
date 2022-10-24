package builder.pizzaria;

public class PizzariaBuilder {
	private Pizza pizza;

    public PizzariaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzariaBuilder setTamanho(Integer tamanho){
        pizza.setTamanho(tamanho);
        return this;
    }

    public PizzariaBuilder addPepperoni(Boolean pepperoni){
        pizza.setPepperoni(pepperoni);
        return this;
    }

    public PizzariaBuilder addQueijo(Boolean queijo){
        pizza.setQueijo(queijo);
        return this;
    }

    public Pizza getPizza(){
        validarIngredientes();
        validarTamanho();
        return this.pizza;
    }

    public void validarTamanho(){
        if(pizza.getTamanho() != 1 && pizza.getTamanho() != 2 && pizza.getTamanho() != 3){
            throw new IllegalStateException("Tamanho inválido");
        }
    }

    public void validarIngredientes(){
        if(!pizza.getPepperoni() && !pizza.getQueijo()){
            throw new IllegalStateException("A pizza deve ter pelo menos um ingrediente");
        }
    }
}
