package com.develhope.ProgrammingLanguage.controllers;

import com.develhope.ProgrammingLanguage.entities.ProgrammingLanguage;
import com.develhope.ProgrammingLanguage.services.ProgrammingLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProgrammingLanguageController {

    @Autowired
    private ProgrammingLanguageService programmingLanguageService;


    @PostMapping("/create")
    public ResponseEntity<ProgrammingLanguage> createProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLanguage1 = programmingLanguageService.createProgrammingLanguage(programmingLanguage);
        return ResponseEntity.ok().body(programmingLanguage1);
    }

    @GetMapping("/readAll")
    public ResponseEntity<List<ProgrammingLanguage>> readAllProgrammingLanguage() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageService.readAllProgrammingLanguage();
        return ResponseEntity.ok().body(programmingLanguages);
    }

    @GetMapping("/readSingle/{id}")
    public ResponseEntity<Optional<ProgrammingLanguage>> readSingleProgrammingLanguage(@PathVariable Long id) {
        Optional<ProgrammingLanguage> programmingLanguage1 = programmingLanguageService.readByIdProgrammingLanguage(id);
        return ResponseEntity.ok().body(programmingLanguage1);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<ProgrammingLanguage>> updateProgrammingLanguage(@PathVariable Long id, @RequestBody ProgrammingLanguage programmingLanguage) {
        Optional<ProgrammingLanguage> programmingLanguage1 = programmingLanguageService.updateProgrammingLanguage(id, programmingLanguage);
        return ResponseEntity.ok().body(programmingLanguage1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<ProgrammingLanguage>> deleteById(@PathVariable Long id){
        Optional<ProgrammingLanguage> programmingLanguage1 = programmingLanguageService.deleteProgrammingLanguage(id);
        return ResponseEntity.ok().body(programmingLanguage1);

    }
}
