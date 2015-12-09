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

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class ShipTest {

    public ShipTest() {
    }

    /**
     * Test of getName method, of class Ship.
     */
    @Test
    public void testName() {
        System.out.println("name");
        Ship instance = new Ship();
        String expResult = "SS Minnow";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Ship.
     */
    @Test
    public void testId() {
        try {
            System.out.println("id");
            Ship instance = new Ship();
            String expResult = "IMO 9174725";
            instance.setId(expResult);
            String result = instance.getId();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Exception thrown when setting valid ID");
        }
    }

    /**
     * Test of getId method, of class Ship.
     */
    @Test
    public void testBadId() {
        try {
            System.out.println("id");
            Ship instance = new Ship();
            String expResult = "IMO 9174721";
            instance.setId(expResult);
            String result = instance.getId();
            fail("Exception not thrown when setting invalid ID");
        } catch (Exception ex) {
            System.out.println("Exception thrown when setting invalid ID");
        }
    }

    /**
     * Test of getYear method, of class Ship.
     */
    @Test
    public void testYear() {
        System.out.println("year");
        Ship instance = new Ship();
        String expResult = "1964";
        instance.setYear(expResult);
        String result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Ship.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            Ship instance = new Ship();
            instance.setName("SS Minnow");
            instance.setId("IMO 9174725");
            instance.setYear("1964");
            String expResult = "SS Minnow, IMO 9174725, 1964";
            String result = instance.toString();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Exception thrown when setting valid ID");
        }
    }

}
