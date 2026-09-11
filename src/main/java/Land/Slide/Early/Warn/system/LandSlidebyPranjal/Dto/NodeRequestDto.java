package Land.Slide.Early.Warn.system.LandSlidebyPranjal.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NodeRequestDto {
    private String nodeName;
    private double latitude;
    private double longitude;
}
