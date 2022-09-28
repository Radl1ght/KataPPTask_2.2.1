package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")

public class Car implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private long id;
//   @OneToOne()
//   @JoinColumn(name = "id", referencedColumnName = "id")
//   private User user_id;

   @Column(name = "model")
   private String model;


   @Column(name = "series")
   private int series;

   public Car() {
   }

   public Car(String model, int series) {
      this.model = model;
      this.series = series;
   }


   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getSeries() {
      return series;
   }

   public void setSeries(int series) {
      this.series = series;
   }

   @Override
   public String toString() {
      return "Car{" +
              "id=" + id +
              ", model='" + model + '\'' +
              ", series=" + series +
              '}';
   }
}


