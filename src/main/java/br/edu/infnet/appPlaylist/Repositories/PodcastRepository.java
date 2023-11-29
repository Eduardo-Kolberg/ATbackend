package br.edu.infnet.appPlaylist.Repositories;

import br.edu.infnet.appPlaylist.model.domain.Playlist;
import br.edu.infnet.appPlaylist.model.domain.Podcast;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends CrudRepository<Podcast,Integer> {
}
