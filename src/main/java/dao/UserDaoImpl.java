package dao;

import model.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl extends AbstractSession implements UserDao {

    @Override
    public void create(User user) {
        getSession().persist(user);
    }

    @Override
    public void update(User user) {
        getSession().update(user);
    }

    @Override
    public void delete(Long id) {
        User user = getUserById(id);
        if(user!=null) {
            getSession().delete(user);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return getSession().createQuery("from User").list();
    }

    @Override
    public User getUserById(Long id) {
        return getSession().get(User.class, id);
    }

    @Override
    public User getUserByName(String name) {
        return (User) getSession().createQuery("from User where name = :name").
                setParameter("name", name).uniqueResult();
    }
}
