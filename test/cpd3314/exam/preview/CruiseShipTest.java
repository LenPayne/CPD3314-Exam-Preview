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
public class CruiseShipTest {
    
    public CruiseShipTest() {
    }

    /**
     * Test of getMaxPassengers method, of class CruiseShip.
     */
    @Test
    public void testMaxPassengers() {
        System.out.println("maxPassengers");
        CruiseShip instance = new CruiseShip();
        int expResult = 2435;
        instance.setMaxPassengers(expResult);
        int result = instance.getMaxPassengers();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getName method, of class CruiseShip.
     */
    @Test
    public void testName() {
        System.out.println("name");
        CruiseShip instance = new CruiseShip();
        String expResult = "RMS Titanic";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getId method, of class CruiseShip.
     */
    @Test
    public void testId() {
        try {
            System.out.println("id");
            CruiseShip instance = new CruiseShip();
            String expResult = "IMO 9074729";
            instance.setId(expResult);
            String result = instance.getId();
            assertEquals(expResult, result);            
        } catch (Exception ex) {
            fail("Exception thrown when setting valid ID");
        }
    }    

    /**
     * Test of getYear method, of class CruiseShip.
     */
    @Test
    public void testYear() {
        System.out.println("year");
        CruiseShip instance = new CruiseShip();
        String expResult = "1912";
        instance.setYear(expResult);
        String result = instance.getYear();
        assertEquals(expResult, result);        
    }    

    /**
     * Test of toString method, of class CruiseShip.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            CruiseShip instance = new CruiseShip();
            instance.setName("RMS Titanic");
            instance.setId("IMO 9074729");
            instance.setYear("1912");
            instance.setMaxPassengers(2435);
            String expResult = "RMS Titanic, IMO 9074729, 1912, 2435 passengers";
            String result = instance.toString();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Exception thrown when setting valid ID");
        }
    }
}
