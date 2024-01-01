import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int row;
    private int col;
    private List<Entity> entities;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.entities = new ArrayList<>();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public List<Entity> getEntities() {
        return entities;
    }
}

