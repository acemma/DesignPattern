package ac.design.pattern.mediator;

/**
 * @Author acemma
 * @Date 2021/9/27 21:45
 * @Description 具体中介者
 */
public class MediatorStructure extends Mediator{

    private HouseOwner houseOwner;

    private Tenant tenant;


    @Override
    public void contact(String message, Person person) {
        if (person instanceof HouseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
