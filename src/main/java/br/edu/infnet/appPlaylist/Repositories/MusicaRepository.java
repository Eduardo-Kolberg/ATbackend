package br.edu.infnet.appPlaylist.Repositories;

import br.edu.infnet.appPlaylist.model.domain.Musica;
import br.edu.infnet.appPlaylist.model.domain.Playlist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends CrudRepository<Musica,Integer> {
}
