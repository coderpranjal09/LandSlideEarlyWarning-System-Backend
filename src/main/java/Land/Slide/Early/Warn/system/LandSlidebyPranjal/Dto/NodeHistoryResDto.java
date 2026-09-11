package Land.Slide.Early.Warn.system.LandSlidebyPranjal.Dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NodeHistoryResDto {
    private long nodeId;
    private double soilMoisture;
    private double tiltAngle;
    private int rainDrops;
    private double sound;
    private double vibrations;
    private double temp;
    private double humidity;
    private LocalDateTime localDateTime;
}
