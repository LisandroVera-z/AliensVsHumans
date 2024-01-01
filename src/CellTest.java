import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class CellTest {

    private Cell cell;
    private Entity entity1;
    private Entity entity2;

    @Before
    public void setUp() {
        cell = new Cell(1, 2);
        entity1 = new Human(100, 20, "Gun", 15, "Healing", 25, 10, 5);
        entity2 = new Alien(120, 25, "Ray Gun", 20, "Healing Ray", 30, "Martian", 15);
    }

    @After
    public void tearDown() {
        // Clean up after each test if needed
    }

    @Test
    public void testAddEntity() {
        // Add entities to the cell
        cell.addEntity(entity1);
        cell.addEntity(entity2);

        // Retrieve entities in the cell
        List<Entity> entities = cell.getEntities();

        // Check if the entities were added to the cell
        assertTrue(entities.contains(entity1));
        assertTrue(entities.contains(entity2));
    }

    @Test
    public void testGetRow() {
        // Check if the row value is correct
        assertEquals(1, cell.getRow());
    }

    @Test
    public void testGetCol() {
        // Check if the col value is correct
        assertEquals(2, cell.getCol());
    }
}

