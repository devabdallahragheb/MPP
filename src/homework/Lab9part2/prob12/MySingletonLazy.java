package homework.Lab9part2.prob12;

import java.util.Optional;

public class MySingletonLazy {

    private static MySingletonLazy instance=null;

    public synchronized static  MySingletonLazy getInstance(){
        return Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);
    }
}
