package fr.mbds.estia.spotify.services;

import fr.mbds.estia.spotify.dtos.MusicDTO;
import fr.mbds.estia.spotify.entities.Music;

import java.util.List;

public interface IMusicService {
    MusicDTO getMusic(Long id);
    MusicDTO createMusic(MusicDTO musicDTO);
    List<MusicDTO> getMusics();
    MusicDTO editFullMusic(Long id, MusicDTO musicDTO);
    MusicDTO editMusic(Long id, MusicDTO musicDTO);
    void deleteMusic(Long id);
}
