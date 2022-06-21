import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = getPeople();

      //IMPERATIVE APPROACH

//    List<Person> females = new ArrayList<>();
//    for (Person person : people) {
//        if (person.getGender().equals(Gender.FEMALE)) {
//          females.add(person);
//        }
//    }
//    females.forEach(System.out::println);
//-----------------------------------------------------------------------------------------------------------------------
      //DECLARATIVE APPROACH

    //**************************FILTER**************************
    List<Person> females = people.stream()
            .filter(person -> person.getGender().equals(Gender.FEMALE))
            .collect(Collectors.toList());
    females.forEach(System.out::println);

    //***************************SORT****************************
     List<Person> sortedAge = people.stream()
              .sorted(Comparator.comparing(Person :: getAge))
              .collect(Collectors.toList());
     sortedAge.forEach(System.out ::println);

    //***************************ALL MATCH****************************
     boolean allMatch = people.stream()
            .allMatch(person -> person.getAge() > 5);
     System.out.println(allMatch);

    //***************************ANY MATCH****************************
     boolean anyMatch = people.stream()
              .anyMatch(person -> person.getAge() == 3);
     System.out.println(anyMatch);

    //***************************NONE MATCH****************************
     boolean nonMatch = people.stream()
              .noneMatch(person -> person.getName().equals("Antonio"));
     System.out.println(nonMatch);

    //***************************MAX***********************************
      people.stream()
              .max(Comparator.comparing(Person::getAge))
              .ifPresent(System.out ::println);

    //***************************MIN***********************************
      people.stream()
              .min(Comparator.comparing(Person::getAge))
              .ifPresent(System.out::println);

    //***************************GROUP***********************************
        Map<Gender, List<Person>> groupGender = people.stream()
                .collect(Collectors.groupingBy(Person ::getGender));
        groupGender.forEach((gender, people1) -> {
          System.out.println(gender);
          people1.forEach(System.out::println);
          System.out.println();
        });

    //*******FIND FEMALE-GRAB THE OLDEST-RETURN THE FIRSTNAME*************
          Optional<String> oldestFemale = people.stream()
                  .filter(person -> person.getGender().equals(Gender.FEMALE))
                  .max(Comparator.comparing(Person::getAge))
                  .map(Person::getName);
          oldestFemale.ifPresent(name -> System.out.println(name));
  }
  private static List<Person> getPeople() {
    return List.of(
        new Person("Antonio", 20, Gender.MALE),
        new Person("Alina Smith", 33, Gender.FEMALE),
        new Person("Helen White", 57, Gender.FEMALE),
        new Person("Alex Boz", 14, Gender.MALE),
        new Person("Jamie Goa", 99, Gender.MALE),
        new Person("Anna Cook", 7, Gender.FEMALE),
        new Person("Zelda Brown", 120, Gender.FEMALE)
    );
  }

}
