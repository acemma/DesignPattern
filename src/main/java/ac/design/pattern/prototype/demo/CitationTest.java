package ac.design.pattern.prototype.demo;

/**
 * @Author acemma
 * @Date 2021/9/23 14:39
 * @Description
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = citation.clone();
        citation.setName("李四");
        citation1.setName("张三");

        citation.show();
        citation1.show();
    }


}
