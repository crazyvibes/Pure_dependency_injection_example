package in.crazyvibes.pure_dependency_injection_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Battery battery = new Battery();
        MemoryCard memoryCard = new MemoryCard();

        ServiceProvider serviceProvider = new ServiceProvider();
        SIMCard simCard = new SIMCard(serviceProvider);         // Constructor Injection

        SmartPhone smartPhone = new SmartPhone(battery,memoryCard,simCard); // Constructor Injection


        smartPhone.setBattery(battery); // Method Injection


        smartPhone.makeACall();

        smartPhone.battery=battery; //Field Injection
    }
}

//There are three Injection types:

  //1. Constructor Injection
  //2. Method Injection
  //3. Field Injection

// It recommended use constructor injection as much as possible.

// In real world large projects, It will be very hard to maintain and also we can not do unit testing, If we construct dependency within activities like this.
 //  That is why we use Dagger