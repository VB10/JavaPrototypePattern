
package prototypepattern;

//abstract class kullanıyoruz çünkü
//bu bir base class olacak ve buradan nesne üretmeyeceğiz
public abstract class Shape implements Cloneable{
    //burada her nesnenin özeliklerini tanımlıyoruz
   private String id;
   protected String type;

   //draw adında bu sınıfı base alanlar kullanması gereken boş metod
    abstract  void draw();
    
    //get set işlemleri
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    
    //ve buda bizim kopyalama işlemini yapıp 
    //yeni nesneleri tanımladığımız alan
    public Object clone(){
        Object clone = null;
        try {
            clone =super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
   
    
    
}
