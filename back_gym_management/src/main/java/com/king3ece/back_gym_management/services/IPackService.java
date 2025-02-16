package com.king3ece.back_gym_management.services;
import com.king3ece.back_gym_management.models.Pack;

import java.util.List;
import java.util.Optional;

public interface IPackService {
    Pack addPack(Pack pack);

    List<Pack> getPacks();

    Optional<Pack> getPack(Long id);

    Pack updatepack(Long id, Pack pack);

    String deletePack(Long id);
}
