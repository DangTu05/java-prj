/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package Employes;
package Employees;

/**
 *
 * @author hungnd
 */
 abstract class Mydate extends Human{
    int ngay;
    int thang;
    int nam;

    public Mydate(int ngay, int hang, int nam) {
        this.ngay = ngay;
        this.thang = hang;
        this.nam = nam;
    }
 
    public int getHang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setHang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
   
    public void show(){
        System.out.print("ngay"+ngay+"thang"+thang+"nam"+nam);
        
    }
}
