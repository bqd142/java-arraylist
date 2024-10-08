/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitable;
public class SV {
    private String MSV,Hoten;
    private float GPA;

      public SV(String MSV, String Hoten, float GPA) {
        this.MSV = MSV;
        this.Hoten = Hoten;
        this.GPA = GPA;
    }

    public SV() {
    }
    
    public String getMSV() {
        return MSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public float getGPA() {
        return GPA;
    }

  
}
