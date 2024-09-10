import java.util.Map;


private static final Currency EUR = Currency.getInstance("EUR");
private static final Currency PLN = Currency.getInstance("PLN");

public void main() {
    
	var snack = Arrays.asList(
		new Snack("うまい棒", BigDecimal.valueOf(10)),
		null,
		new Snack("ブタメン", BigDecimal.valueOf(70)),
		new Snack("やまとの味カレー", BigDecimal.valueOf(20)),
		null,
		null,
		null
	);
	
	var withTax = new BigDecimal("1.1");
	snack.stream()
            .gather(MyGatherers.mapNotNull(s -> s.multiply(withTax)))
            .forEach(System.out::println);
	
    // Snack[name=うまい棒, amount=11.0]
    // Snack[name=ブタメン, amount=77.0]
    // Snack[name=やまとの味カレー, amount=22.0]

}