package fr.is2a4.music;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MusicRepository extends CrudRepository<Music,Integer> {

	public List<Music> findAllMusicByTrack(String track);
}
