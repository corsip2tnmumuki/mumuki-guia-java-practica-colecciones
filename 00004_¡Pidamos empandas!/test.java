Pedido pedido;
Empanada pollo = new Empanada("Pollo");
Empanada atun = new Empanada("Atun");
Empanada jamon = new Empanada("Jamon");

@Before
public void before() {
  pedido = new Pedido();
}
@Test
public void cuando_hay_4_de_pollo_2_de_atun() {
  pedido.setEmpanadas(Arrays.asList(pollo, pollo, atun, pollo, atun, pollo));
  Assert.assertEquals(new Integer(4), pedido.realizarPedido().get("Pollo"));
  Assert.assertEquals(new Integer(2), pedido.realizarPedido().get("Atun"));
}
@Test
public void cuando_hay_2_de_jamon_1_de_pollo() {
  pedido.setEmpanadas(Arrays.asList(pollo, jamon, jamon));
  Assert.assertEquals(new Integer(2), pedido.realizarPedido().get("Jamon"));
  Assert.assertEquals(new Integer(1), pedido.realizarPedido().get("Pollo"));
}