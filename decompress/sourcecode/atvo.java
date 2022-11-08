import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

final class atvo extends atuo
{
    public static final atvo a;
    private static final ReentrantReadWriteLock b;
    private static final WeakHashMap c;
    
    static {
        a = new atvo();
        b = new ReentrantReadWriteLock();
        c = new WeakHashMap();
    }
    
    private atvo() {
    }
    
    @Override
    public final atml a(final Class clazz) {
        clazz.getClass();
        final ReentrantReadWriteLock b = atvo.b;
        ReentrantReadWriteLock.ReadLock readLock = b.readLock();
        readLock.lock();
        try {
            final atml atml = atvo.c.get(clazz);
            readLock.unlock();
            if (atml == null) {
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
                    final WeakHashMap c = atvo.c;
                    final atml atml2 = c.get(clazz);
                    if (atml2 != null) {
                        return atml2;
                    }
                    final atml b2 = atur.b(clazz);
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
            return atml;
        }
        finally {
            readLock.unlock();
            while (true) {}
        }
    }
}
