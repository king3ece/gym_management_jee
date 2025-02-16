package com.king3ece.back_gym_management.services;

import com.king3ece.back_gym_management.models.Pack;
import com.king3ece.back_gym_management.repositories.PackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackService {

    @Autowired
    private PackRepository packRepository;

    public Pack addPack(Pack pack) {
        return packRepository.save(pack);
    }

    public List<Pack> getPacks() {
        return packRepository.findAll();
    }

    public Optional<Pack> getPack(Long id) {
        return packRepository.findById(id);
    }

    public Pack updatePack(Long id, Pack pack) {
        return packRepository.findById(id)
                .map( existingPack -> {
                    existingPack.setOfferName(pack.getOfferName());
                    existingPack.setDescription(pack.getDescription());
                    existingPack.setDurationMonths(pack.getDurationMonths());
                    existingPack.setMonthlyPrice(pack.getMonthlyPrice());
                    return packRepository.save(existingPack);
                }).orElseThrow(()-> new RuntimeException("Pack not find! "));

    }

    public String deletePack(Long id) {
        packRepository.deleteById(id);
        return "Pack deleted";
    }

    public List<Pack> getPack() {
    return packRepository.findAll();
    }
}
