package pl.comarch.szkolenia.spring.boot.repositories;

import java.util.List;

public interface INameRepository {
    String getFirst();
    String getRandomName();
    List<String> getAllNames();
}
