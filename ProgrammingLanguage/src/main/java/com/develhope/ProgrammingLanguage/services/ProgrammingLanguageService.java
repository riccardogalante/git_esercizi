package com.develhope.ProgrammingLanguage.services;

import com.develhope.ProgrammingLanguage.entities.ProgrammingLanguage;
import com.develhope.ProgrammingLanguage.repositories.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammingLanguageService {

    @Autowired
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguage createProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        return programmingLanguageRepository.save(programmingLanguage);
    }

    public List<ProgrammingLanguage> readAllProgrammingLanguage() {
        return programmingLanguageRepository.findAll();
    }

    public Optional<ProgrammingLanguage> readByIdProgrammingLanguage(Long id) {
        return programmingLanguageRepository.findById(id);
    }

    public Optional<ProgrammingLanguage> updateProgrammingLanguage(Long id, ProgrammingLanguage updateProgrammingLanguage) {
        Optional<ProgrammingLanguage> programmingLanguage = programmingLanguageRepository.findById(id);
        if (programmingLanguage.isPresent()) {
            ProgrammingLanguage programmingLanguage1 = programmingLanguage.get();
            programmingLanguage1.setName(updateProgrammingLanguage.getName());
            programmingLanguage1.setFirstAppearance(updateProgrammingLanguage.getFirstAppearance());
            programmingLanguage1.setInventor(updateProgrammingLanguage.getInventor());

            return Optional.of(programmingLanguageRepository.save(programmingLanguage1));
        } else {
            return Optional.empty();
        }
    }
//    public boolean deleteProgrammingLanguage(Long id){
//        if(programmingLanguageRepository.existsById(id)){
//            programmingLanguageRepository.deleteById(id);
//            return true;
//        } else {
//            return false;
//        }
//    }

    public Optional<ProgrammingLanguage> deleteProgrammingLanguage(Long id) {
        Optional<ProgrammingLanguage> programmingLanguageToDelete = programmingLanguageRepository.findById(id);
        programmingLanguageRepository.delete(programmingLanguageToDelete.get());
        return programmingLanguageToDelete;
    }
}
