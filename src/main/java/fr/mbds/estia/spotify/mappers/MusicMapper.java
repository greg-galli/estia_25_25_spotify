package fr.mbds.estia.spotify.mappers;

import fr.mbds.estia.spotify.dtos.MusicDTO;
import fr.mbds.estia.spotify.entities.Music;
import org.springframework.stereotype.Component;

@Component
public class MusicMapper {
    public MusicDTO toDto(Music entity) {
        if (entity == null) {
            return null;
        }

        MusicDTO musicDTO = MusicDTO
                .builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .trackLength(entity.getTrackLength())
                .genre(entity.getGenre())
                .build();

        return musicDTO;
    }

    public Music toEntity(MusicDTO dto) {
        if (dto == null) {
            return null;
        }

        Music music = Music
                .builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .trackLength(dto.getTrackLength())
                .genre(dto.getGenre())
                .build();

        return music;
    }


}
