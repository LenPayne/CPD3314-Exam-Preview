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

/* The following exercises are adapted from: 
 * Gaddis, T. (2015). Starting Out with Java: From Control Structures through  
 * Objects. (6th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-395705-1 
 *
 * Information about IMO Numbers can be found at https://en.wikipedia.org/wiki/IMO_number
 */

/*
 * Design a Ship class that has the following members:
 * - A field for the name of the ship (String)
 * - A field for the id of the ship (String)
 * - A field for the year tat the ship was built (String)
 * - A no-arg constructor and appropriate accessors and mutators
 * - The setId(String) method should verify that the ship's ID is a valid IMO
 *   number, where an IMO number is displayed as the letters "IMO" and a space,
 *   followed by seven digits. The seventh digit is a "check" digit, used to
 *   verify the preceding six. This is done by multiplying each of the first six 
 *   digits by a factor of 2 to 7 corresponding to their position from right to 
 *   left. The rightmost digit of this sum is the check digit. For example, for 
 *   "IMO 9074729": (9×7) + (0×6) + (7×5) + (4×4) + (7×3) + (2×2) = 139. If the
 *   check fails, the setId() method should throw an Exception.
 * - A toString method that displays the ship's name, id and the year it was 
 *   built.
 *
 * Design a CruiseShip class that extends the Ship class. Teh CruiseShip class 
 * should have the following additional members:
 * - A field for the maximum number of passengers (int)
 * - A no-arg constructor and appropriate accessors and mutators
 * - A toString method that overrides the toString method in the base class. The 
 *   CruiseShip class's toString method should display only the ship's name, id,
 *   and  the maximum number of passengers.
 *
 * Design a CargoShip class that extends the Ship class. The CargoShip class 
 * should have the following members:
 * - A field for the cargo capacity in tonnage (int)
 * - A no-arg constructor and appropriate accessors and mutators
 * - A toString method that overrides the toString method in the base class. The 
 *   CargoShip class's toString method should dispaly only the ship's name, id,
 *   and the ship's cargo capacity.
 *
 * Demonstrate the classes in the main method with an array of Ship objects and
 * iterate over them, calling their toString method.
 */

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314ExamPreview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
