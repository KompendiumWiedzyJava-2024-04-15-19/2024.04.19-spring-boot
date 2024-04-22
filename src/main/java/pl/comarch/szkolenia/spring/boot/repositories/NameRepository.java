package pl.comarch.szkolenia.spring.boot.repositories;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class NameRepository implements INameRepository {

    private final List<String> names = List.of(
            "Wiesiek",
            "Zbyszek",
            "Janusz",
            "Karol",
            "Mateusz"
    );

    @Override
    public String getFirst() {
        return this.names.get(0);
    }

    @Override
    public String getRandomName() {
        return this.names.get(new Random().nextInt(0, this.names.size()));
    }

    @Override
    public List<String> getAllNames() {
        return this.names;
    }
}
