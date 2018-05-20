package service;

import model.Profile;

import java.util.List;

public interface ProfileService {

    void create(Profile profile);
    void update(Profile profile);
    void delete(Long id);
    List<Profile> getAllProfiles();
    Profile getProfileById(Long id);
}
