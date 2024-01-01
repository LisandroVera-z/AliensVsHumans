import java.util.ArrayList;
import java.util.List;

public class Environment {
    public Cell[][] cells;

    public Environment(int rows, int cols) {
        cells = new Cell[rows][cols];
        initializeCells();
    }

    public void initializeCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                // Provide row and col values when creating a Cell instance
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public void addEntityToCell(Entity entity, int row, int col) {
        entity.setRow(row);
        entity.setCol(col);
        cells[row][col].addEntity(entity);
    }

    public List<Entity> getEntitiesInCell(int row, int col) {
        return cells[row][col].getEntities();
    }

    public void humanUseAttackOn(Entity attacker, int attack, int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(attacker, target);
            int adjustedAttack = adjustDamageBasedOnDistance(attack, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Alien) {
                attacker.useAttackOn(attacker, adjustedAttack, target);
            } else if (target instanceof Human) {
                System.out.println("Error: can't attack ally!");
                break;
            }
        }
    }

    public void alienUseAttackOn(Entity attacker, int attack, int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(attacker, target);
            int adjustedAttack = adjustDamageBasedOnDistance(attack, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Human) {
                attacker.useAttackOn(attacker, adjustedAttack, target);
            } else if (target instanceof Alien) {
                System.out.println("Error: can't attack ally!");
                break;
            }
        }
    }

    public void alienUseHealOn(Entity healer, int heal, int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(healer, target);
            int adjustedAttack = adjustDamageBasedOnDistance(heal, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Alien) {
                ((Alien) healer).useHealOn(healer, adjustedAttack, target);
            } else if (target instanceof Human) {
                System.out.println("Error: can't heal humans!");
                break;
            }
        }
    }

    public void humanUseWeaponOn(Entity attacker, String weapon, int weaponDMG,  int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(attacker, target);
            int adjustedAttack = adjustDamageBasedOnDistance(weaponDMG, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Alien) {
                attacker.useWeaponOn(attacker, weapon, adjustedAttack, target);
            } else if (target instanceof Human) {
                System.out.println("Error can't attack ally!");
                break;
            }
        }
    }

    public void alienUseWeaponOn(Entity attacker, String weapon, int weaponDMG,  int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(attacker, target);
            int adjustedAttack = adjustDamageBasedOnDistance(weaponDMG, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Human) {
                attacker.useWeaponOn(attacker, weapon, adjustedAttack, target);
            } else if (target instanceof Alien) {
                System.out.println("Error can't attack ally!");
                break;
            }
        }
    }

    public void humanUseAbilityOn(Entity attacker, String ability, int abilityDMG,  int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(attacker, target);
            int adjustedAttack = adjustDamageBasedOnDistance(abilityDMG, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Alien) {
                attacker.useWeaponOn(attacker, ability, adjustedAttack, target);
            } else if (target instanceof Human) {
                System.out.println("Error can't attack ally!");
                break;
            }
        }
    }

    public void alienUseAbilityOn(Entity attacker, String ability, int abilityDMG,  int targetRow, int targetCol) {
        List<Entity> targets = getEntitiesInCell(targetRow, targetCol);

        for (Entity target : targets) {
            int distance = calculateDistance(attacker, target);
            int adjustedAttack = adjustDamageBasedOnDistance(abilityDMG, distance);

            // Perform interaction based on the attacker's type
            if (target instanceof Human) {
                attacker.useWeaponOn(attacker, ability, adjustedAttack, target);
            } else if (target instanceof Alien) {
                System.out.println("Error can't attack ally!");
                break;
            }
        }
    }

    public int calculateDistance(Entity entity1, Entity entity2) {
        // Implement a distance calculation method based on your needs
        // For simplicity, let's assume a basic Euclidean distance for this example
        int rowDiff = Math.abs(entity1.getRow() - entity2.getRow());
        int colDiff = Math.abs(entity1.getCol() - entity2.getCol());
        return (int) Math.sqrt(rowDiff * rowDiff + colDiff * colDiff);
    }

    public int adjustDamageBasedOnDistance(int originalDamage, int distance) {
        // Implement your own logic for adjusting damage based on distance
        // For simplicity, let's assume a linear decrease in damage with distance
        int adjustedDamage = originalDamage - distance;
        return Math.max(adjustedDamage, 0); // Ensure damage is non-negative
    }
}


