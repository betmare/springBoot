package dao;

import model.Profile;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProfileDaoImpl extends AbstractSession implements ProfileDao{
    @Override
    public void create(Profile profile) {
        getSession().persist(profile);
    }

    @Override
    public void update(Profile profile) {
        getSession().persist(profile);
    }

    @Override
    public void delete(Long id) {
        Profile profile = getProfileById(id);
        if(profile!=null) {
            getSession().delete(profile);
        }
    }

    @Override
    public List<Profile> getAllProfiles() {
        return getSession().createQuery("from Profile").list();
    }

    @Override
    public Profile getProfileById(Long id) {
        return getSession().get(Profile.class, id);
    }
}
