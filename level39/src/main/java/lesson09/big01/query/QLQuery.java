package lesson09.big01.query;

import java.util.Set;

public interface QLQuery {
    Set<Object> execute(String query);
}
