package quest;

import java.util.ArrayList;
import java.util.List;

public class QuestService {
    List<Quest> quests = List.of(
            new Quest(
                    "Water a yellow flower",
                    "find a yellow flower and water it",
                    "/imgs/water-yellow-flower.png"
            ),
            new Quest(
                    "Collect 5 Dandelion seeds",
                    "Description for card 1",
                    "/imgs/wild-dandelion.jpg"
            ),
            new Quest(
                    "Water your plant 3 times",
                    "Description for card 2",
                    "/imgs/watering-flowers.jpg"
            )
    );

    List<Quest> completedQuests = List.of(
            new Quest("Plant a seed",
                    "plant your first seed",
                    "/imgs/seed-planting.jpeg")
    );
    List<Quest> getAvailableQuests() {
        return quests;
    }

    List<Quest> getActiveQuests(){return quests;}

    List<Quest> getCompleteQuests(){return completedQuests;}
}
