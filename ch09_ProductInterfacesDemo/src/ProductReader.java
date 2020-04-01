
public interface ProductReader {
    Product get(String code);
    String getAll(); //Public and Abstract keywords not required but acceptable
                     //because all interface methods are abstract
}
