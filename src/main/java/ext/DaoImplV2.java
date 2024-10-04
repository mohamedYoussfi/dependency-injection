package ext;

import dao.IDao;

// Six mois après j'ai besoin d'une autre implémentation
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double d = 66;
        return d;
    }
}
