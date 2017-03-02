
package prototypepattern;
public class PrototypePattern {

    public static void main(String[] args) {
        
        //değerleri kayıt ediyoruz
        ShapeCache.loadCache();
        
        //burada diğer ekledikleriniz
        //ve sizin kendi eklenitlerinizi istediğiniz şekilde çağırabilirsiniz
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape :"+clonedShape.getType());
        
    }
    
}
