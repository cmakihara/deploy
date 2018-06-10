package br.casa.agendaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.casa.agendaapi.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long>{

	@Query("Select p FROM Pedido p where p.id_pedido = :id_pedido")
	public List<ItemPedido> findAllByPedido(@Param("id_pedido") Long id_pedido);
}
