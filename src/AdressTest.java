import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdressTest {
    @Test
    public void contructortest(){

    Adress s= new Adress("Asta e stra",37,"2628","Delft");
        System.out.println(s.toString());
    assertEquals(37,s.getNumber());

        ///System.out.println(s.getZipCode());
        Torch l= new Torch("Ce pizda masii");
        ///System.out.println(l.getS());
        Torch l2= new Torch("Ce pizda masi");
        ///System.out.println(l.equals(l2));
       ArrayList<Equipment> ce=new ArrayList<Equipment>();
        ///System.out.println(ce[1]);
        ce.add(new JackHammer("jhjoj"));
        JackHammer x= new JackHammer("sadada");
        ///System.out.println(x.get());
        ///System.out.println(ce.get(0));
        ce.add(x);
        Date d =new Date(12,9,2002);
        Job create=new Job( s,"You have to get there ",ce, d);
        Job muie=new Job(s,"MA pis pe mine ",ce,d);
        //System.out.println(d.toString());
        ///System.out.println(muie.getPlannedDate().getDay());
        ///System.out.println(muie.getJobTotal());
        List<Job> prog= new ArrayList<Job>();
        Equipment c= new JackHammer("I ghave ");
        System.out.println(c.requirment);
        prog.add(create);
        prog.add(muie);

        for(int i = 0; i < ce.size(); i++) {

            System.out.println(ce.get(i).toString());

        }
       ///Job Acoperis= new Job("","","","");
        for(int i = 0; i < prog.size(); i++) {

            System.out.println(prog.get(i).toString());

        }
        //Adress k=new Adress("prof","37","2627KX");
        String k1= new String("Deci te duci pe copac ");






    }


}