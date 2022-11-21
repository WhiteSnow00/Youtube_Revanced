import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

final class atzi extends atyi
{
    public static final atzi a;
    private static final ReentrantReadWriteLock b;
    private static final WeakHashMap c;
    
    static {
        a = new atzi();
        b = new ReentrantReadWriteLock();
        c = new WeakHashMap();
    }
    
    private atzi() {
    }
    
    public final atqd a(final Class clazz) {
        clazz.getClass();
        final ReentrantReadWriteLock b = atzi.b;
        ReentrantReadWriteLock.ReadLock readLock = b.readLock();
        readLock.lock();
        try {
            final atqd atqd = atzi.c.get(clazz);
            readLock.unlock();
            if (atqd == null) {
                readLock = b.readLock();
                final int writeHoldCount = b.getWriteHoldCount();
                final int n = 0;
                int readHoldCount;
                if (writeHoldCount == 0) {
                    readHoldCount = b.getReadHoldCount();
                }
                else {
                    readHoldCount = 0;
                }
                for (int i = 0; i < readHoldCount; ++i) {
                    readLock.unlock();
                }
                final ReentrantReadWriteLock.WriteLock writeLock = b.writeLock();
                writeLock.lock();
                try {
                    final WeakHashMap c = atzi.c;
                    final atqd atqd2 = c.get(clazz);
                    if (atqd2 != null) {
                        return atqd2;
                    }
                    final atqd b2 = atyl.b(clazz);
                    c.put(clazz, b2);
                    return b2;
                }
                finally {
                    for (int j = n; j < readHoldCount; ++j) {
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            return atqd;
        }
        finally {
            readLock.unlock();
            while (true) {}
        }
    }
}
