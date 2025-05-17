package Week_08;

import java.util.concurrent.locks.ReentrantLock;

public class SafeLock {
    static class Friend {
        private final String name;
        private final Lock lock = new ReentrantLock();

        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public boolean impendingBow(Friend bower) {
            Boolean myLock = false;
            Boolean yourLock = false;
            try {
                myLock =
            }
        }
    }
}
