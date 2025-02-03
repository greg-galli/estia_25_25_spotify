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
    public MusicDTO createMusic(MusicDTO musicDTO) {
        return musicMapper.toDto(musicRepository.save(musicMapper.toEntity(musicDTO)));
    }

    @Override
    public List<MusicDTO> getMusics() {
        return musicMapper.toDtos(musicRepository.findAll());
    }

    @Override
    public MusicDTO editFullMusic(Long id, MusicDTO musicDTO) {
        Music music = musicRepository.findById(id).orElse(null);
        // TODO : écraser les propriétés de "music" avec les propriétés de "musicDTO" et on sauvegarde
        return musicDTO;
    }

    @Override
    public MusicDTO editMusic(Long id, MusicDTO musicDTO) {
        Music music = musicRepository.findById(id).orElse(null);
        // TODO : écraser les propriétés de "music" avec les propriétés de "musicDTO" et on sauvegarde
        return musicDTO;
    }

    @Override
    public void deleteMusic(Long id) {
        musicRepository.deleteById(id);
    }
}
