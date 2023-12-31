package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(String roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery("FROM Role r WHERE r.roleName =: roleName", Role.class)
                    .setParameter("roleName", Enum.valueOf(Role.RoleName.class, roleName))
                    .getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get role " + roleName, e);
        }
    }
}
