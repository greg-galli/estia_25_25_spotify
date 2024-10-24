package fr.mbds.estia.spotify.services;

import fr.mbds.estia.spotify.dtos.MusicDTO;
import fr.mbds.estia.spotify.entities.Music;
import fr.mbds.estia.spotify.mappers.MusicMapper;
import fr.mbds.estia.spotify.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {

    private final MusicRepository musicRepository;
    private final MusicMapper musicMapper;

    @Autowired
    public MusicServiceImpl(MusicRepository musicRepository, MusicMapper musicMapper) {
        this.musicRepository = musicRepository;
        this.musicMapper = musicMapper;
    }

    @Override
    public MusicDTO getMusic(Long id) {
        Music music = musicRepository.findById(id).orElse(null);
        return musicMapper.toDto(music);
    }

    @Override
    public MusicDTO createMusic(Music music) {
        return musicMapper.toDto(musicRepository.save(music));
    }
}
