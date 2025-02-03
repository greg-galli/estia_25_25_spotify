package fr.mbds.estia.spotify.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;

import java.util.List;


@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString @Builder
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private Integer trackLength;

    private String genre;

    @ManyToMany
    private List<Artist> artists;

    @ManyToMany
    private List<Album> albums;

    @Lob
    private byte[] cover;

    private String coverUrl;
}
