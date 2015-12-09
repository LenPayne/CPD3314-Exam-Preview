/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.exam.preview;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CargoShipTest {
    
    public CargoShipTest() {
    }

    /**
     * Test of getMaxTonnage method, of class CargoShip.
     */
    @Test
    public void testMaxTonnage() {
        System.out.println("maxTonnage");
        CargoShip instance = new CargoShip();
        int expResult = 25400;
        instance.setMaxTonnage(expResult);
        int result = instance.getMaxTonnage();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getName method, of class CargoShip.
     */
    @Test
    public void testName() {
        System.out.println("name");
        CargoShip instance = new CargoShip();
        String expResult = "SS Edmund Fitzgerald";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getId method, of class CargoShip.
     */
    @Test
    public void testId() {
        try {
            System.out.println("id");
            CargoShip instance = new CargoShip();
            String expResult = "IMO 8074722";
            instance.setId(expResult);
            String result = instance.getId();
            assertEquals(expResult, result);            
        } catch (Exception ex) {
            fail("Exception thrown when setting valid ID");
        }
    }    

    /**
     * Test of getYear method, of class CargoShip.
     */
    @Test
    public void testYear() {
        System.out.println("year");
        CargoShip instance = new CargoShip();
        String expResult = "1958";
        instance.setYear(expResult);
        String result = instance.getYear();
        assertEquals(expResult, result);        
    }    

    /**
     * Test of toString method, of class CargoShip.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            CargoShip instance = new CargoShip();
            instance.setName("SS Edmund Fitzgerald");
            instance.setId("IMO 8074722");
            instance.setYear("1958");
            instance.setMaxTonnage(25400);
            String expResult = "SS Edmund Fitzgerald, IMO 8074722, 1958, 25400 tons";
            String result = instance.toString();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Exception thrown when setting valid ID");
        }
    }
}
