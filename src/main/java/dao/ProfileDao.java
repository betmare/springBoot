package dao;

import model.Profile;

import java.util.List;

public interface ProfileDao {
    void create(Profile profile);
    void update(Profile profile);
    void delete(Long id);
    List<Profile> getAllProfiles();
    Profile getProfileById(Long id);
}
