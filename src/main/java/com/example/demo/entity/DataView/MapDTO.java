package com.example.demo.entity.DataView;
import java.util.List;

import com.example.demo.entity.StationLocation;
import lombok.Data;

@Data
public class MapDTO {
    private List<Station_Location> station_locations;

    private StationLocation centre;
}
