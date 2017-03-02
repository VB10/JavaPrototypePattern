
package prototypepattern;

import java.util.Hashtable;

public class ShapeCache {
    //ilk değerimiz key ikinci değeerimiz value
    //bir koleksyion class şeklinde bir eleman olduğundan hashlemeyi tercih etik
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

   
    //getshape metodumuz gelen id'yi alıp hashmap sınıfından cagiriyor
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        //ve buradan gelen değeri clone özelliğiyle objeyi geri döndürüyoruz
        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache(){
        //biz manuel olarak elle değer yüklüyoruz
        //burası veritabanından da doldurabilir
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        
        Square square = new  Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
        
        
    }
    
}
