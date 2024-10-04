package dao;
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double data = 43;
        return data;
    }
}
