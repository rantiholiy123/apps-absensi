package id.kawahedukasi.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDGenerator;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "factorial")
public class Factorial extends PanacheEntityBase {


    @Id
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", nullable = false, length = 36)
    private String id; //uuid

    @Column(name = "n")
    public Integer n;

    @Column(name = "factorial")
    public Integer factorial;

    public void setN(Integer n){
        this.n = n;
    }

    public void setFactorial(Integer factorial){
        this.factorial = factorial;
    }

//    public Factorial(){
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public Integer getN() {
//        return n;
//    }
//
//    public void setN(Integer n) {
//        this.n = n;
//    }
//
//    public Integer getFactorial() {
//        return factorial;
//    }
//
//    public void setFactorial(Integer factorial) {
//        this.factorial = factorial;
//    }
//
//    public void factorial(Integer factorial) {
//    }
}
