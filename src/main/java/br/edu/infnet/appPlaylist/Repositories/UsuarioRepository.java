package br.edu.infnet.appPlaylist.Repositories;

import br.edu.infnet.appPlaylist.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
}
