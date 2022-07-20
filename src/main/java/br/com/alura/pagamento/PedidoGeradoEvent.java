package br.com.alura.pagamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoGeradoEvent {

    private BigDecimal valorTotal;

    private Long idCliente;

    private String cpfCliente;

    private String nomeCliente;

    private Long pedidoId;

    private String endereco;

    private List<ItemDePedidoEvent> itemDePedidoEvents;

}
