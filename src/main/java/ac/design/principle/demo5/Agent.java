package ac.design.principle.demo5;

/**
 * @Author acemma
 * @Date 2021/9/16 22:17
 * @Description 经纪人类
 */
public class Agent {

    private Star star;
    private Fans fans;
    private Company company;

    // 粉丝见面会
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    // 和媒体公司洽谈
    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈业务");
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
