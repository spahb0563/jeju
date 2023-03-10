package com.thejoen.jeju.controller.api;

import com.thejoen.jeju.model.network.dto.response.RoadCloseResponseDTO;
import com.thejoen.jeju.service.RoadCloseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class RoadCloseApiController {

    private final RoadCloseService roadCloseService;

    @GetMapping("/roadClose")
    public ResponseEntity<List<RoadCloseResponseDTO>> findAllMostRecentClose() {
        return roadCloseService.findAllMostRecentClose();
    }

}
