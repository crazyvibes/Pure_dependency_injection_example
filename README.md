# Pure_dependency_injection_example
In this reopsitory, let's try to understand how to implement pure dependency injection without using any framworks like Dagger.


There are three Injection types:

  1. Constructor Injection
  2. Method Injection
  3. Field Injection

It recommended use constructor injection as much as possible.

In real world large projects, It will be very hard to maintain and also we can not do unit testing, If we construct dependency within activities like this.
That is why we use Dagger.
