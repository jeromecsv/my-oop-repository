package Week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DataProcessorTest {

    @Mock
    private SFTAcademyFileReader csvFileReader;

    @InjectMocks
    SFTAcademyDataProcessor sFtAcademyProcessor = new SFTAcademyDataProcessorClass(csvFileReader);

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("GIVEN fileReader that returns valid data from dataStore.csv, SFTAcademyDataProcessor.execute() " + "should return List<SftEmployees> employees")
    public void name() throws IOException {
        //arrange
        when(csvFileReader.read()).thenReturn(List.of("1,jerome,34,100000", "2,restan,27,90000", "3,jay,27,95000", "4,wayne,29,75000"));
        //act
        List<SFTEmployees> sftEmployees = sFtAcademyProcessor.processSorter();
        //assert
        long employeesFound = sftEmployees.stream().count();
        int expecteNumberOfEmployeesReturned = 4;
        assertEquals(expecteNumberOfEmployeesReturned, employeesFound);
    }
    @Test
    @DisplayName("GIVEN fileReader that returns valid data from dataStore.csv, SFTAcademyDataProcessor.execute() " + "should return List<SftEmployees> employees with id, name, age, and salary")
    public void testBehaviorToReturnTransformedObjects() throws IOException {
        //arrange
        when(csvFileReader.read()).thenReturn(List.of("1,jerome,34,100000", "2,restan,27,90000", "3,jay,27,195000", "4,wayne,29,75000"));
        //act
        List<SFTEmployees> sftEmployees = sFtAcademyProcessor.processSorter();
        //assert
        SFTEmployees employee = sftEmployees.get(0);
        Assertions.assertNotNull(employee.getId());
        Assertions.assertNotNull(employee.getName());
        Assertions.assertNotNull(employee.getAge());
        Assertions.assertNotNull(employee.getSalary());
    }
    @Test
    @DisplayName("GIVEN fileReader that returns valid data from dataStore.csv, SFTAcademyDataProcessor.execute() " + "should return List<SftEmployees> employees sorted by salary")
    public void testSorting() throws IOException {
        //arrange
        when(csvFileReader.read()).thenReturn(List.of("1,jerome,34,100000", "2,restan,27,90000", "3,jay,27,195000", "4,wayne,29,75000"));
        //act
        List<SFTEmployees> sftEmployees = sFtAcademyProcessor.processSorter();
        //assert
        List<SFTEmployees> employees = sftEmployees;

        assertThat(employees).extracting("id", "name", "age", "salary").containsExactly(
                tuple(3L, "jay", 27L, 195000d),
                tuple(1L, "jerome", 34L, 100000d),
                tuple(2L, "restan", 27L, 90000d),
                tuple(4L, "wayne", 29L, 75000d));
    }
    @Test
    @DisplayName("GIVEN fileReader that returns valid data from dataStore.csv, SFTAcademyDataProcessor.execute()" + "should return List<SftEmployees> employees with Net Salary")
    public void netSalaryCounter() throws IOException {
        //arrange
        when(csvFileReader.read()).thenReturn(List.of("1,jerome,34,100000", "2,restan,27,90000", "3,jay,27,195000", "4,wayne,29,75000"));
        //act
        List<SFTEmployees> sftEmployees = sFtAcademyProcessor.processNetSalary();
        //assert
        List<SFTEmployees> employees = sftEmployees;
        assertThat(employees).extracting("id", "name", "age", "salary").containsExactly(
                tuple(1L, "jerome", 34L, 88000d),
                tuple(2L, "restan", 27L, 79200d),
                tuple(3L, "jay", 27L, 171600d),
                tuple(4L, "wayne", 29L, 66000d));
    }
    @Test
    @DisplayName("IVEN fileReader that returns valid data from dataStore.csv, SFTAcademyDataProcessor.execute()\" + \"should return Name of Employee named Jerome")
    public void filterByName() throws IOException {
        //ARRANGE
        when(csvFileReader.read()).thenReturn(List.of("1,jerome,34,100000", "2,restan,27,90000", "3,jay,27,195000", "4,wayne,29,75000"));
        //ACT
        //ASSERT
        List<SFTEmployees> employees = sFtAcademyProcessor.processNameFilter();
        assertThat(employees).extracting("id", "name", "age", "salary").containsExactly(
                  tuple(1L, "jerome", 34L, 100000d));
    }
}
