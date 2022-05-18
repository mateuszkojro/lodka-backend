package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.VolunteerInfo;
import com.lodkawolontariatu.api.repository.VolunteerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;

    public VolunteerInfo add(VolunteerInfo volunteer) {
        return volunteerRepository.save(volunteer);
    }

    public List<VolunteerInfo> findAll(){return volunteerRepository.findAll();}

    public Optional<VolunteerInfo> delete(Long id) {
        var volunteer = volunteerRepository.findById(id);
        if (volunteer.isPresent()) {
            volunteerRepository.delete(volunteerRepository.getById(id));
        }
        return volunteer;
    }

    public VolunteerInfo get(Long id) {
        return volunteerRepository.findById(id).orElseThrow();
    }
}
