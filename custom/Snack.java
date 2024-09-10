import java.math.BigDecimal;

public record Snack(String name, BigDecimal amount) {
    // public Snack add(Snack snack) {
    //    return new Snack(snack.amount.add(this.amount), name);
    // }

    public Snack multiply(BigDecimal multiplier) {
         return new Snack(name, amount.multiply(multiplier));
    }
}