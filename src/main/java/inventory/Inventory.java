package inventory;

import plant.Fertilizer;
import plant.Flower;
import plant.Seed;

import java.util.List;

public record Inventory(
        List<Seed> seedList,
        List<Fertilizer> fertilizerList
) { }