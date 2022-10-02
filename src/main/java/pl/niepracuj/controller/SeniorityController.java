package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.model.dto.CompanyDto;
import pl.niepracuj.model.dto.SeniorityDto;
import pl.niepracuj.service.company.CompanyService;
import pl.niepracuj.service.seniority.SeniorityService;

import java.util.List;

@RestController
@RequestMapping("/seniority")
@RequiredArgsConstructor
public class SeniorityController {

    private final SeniorityService SeniorityService;

    @GetMapping("/all")
    public List<SeniorityDto> getSeniorities() {
        return SeniorityService.getAllSeniorities();
    }

    @PostMapping("/create")
    public SeniorityDto createSeniority(@RequestBody SeniorityDto SeniorityDto) {
        return SeniorityService.createSeniority(SeniorityDto);
    }
}
