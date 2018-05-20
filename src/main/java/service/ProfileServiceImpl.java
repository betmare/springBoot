package service;

import dao.ProfileDao;
import model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("profileService")
@Transactional
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileDao profileDao;
    @Override
    public void create(Profile profile) {
        profileDao.create(profile);
    }

    @Override
    public void update(Profile profile) {
        profileDao.create(profile);
    }

    @Override
    public void delete(Long id) {
        profileDao.delete(id);
    }

    @Override
    public List<Profile> getAllProfiles() {
        return profileDao.getAllProfiles();
    }

    @Override
    public Profile getProfileById(Long id) {
        return profileDao.getProfileById(id);
    }
}
