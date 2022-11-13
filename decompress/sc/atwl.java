import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

final class atwl extends atvl
{
    public static final atwl a;
    private static final ReentrantReadWriteLock b;
    private static final WeakHashMap c;
    
    static {
        a = new atwl();
        b = new ReentrantReadWriteLock();
        c = new WeakHashMap();
    }
    
    private atwl() {
    }
    
    public final atng a(final Class clazz) {
        clazz.getClass();
        final ReentrantReadWriteLock b = atwl.b;
        ReentrantReadWriteLock.ReadLock readLock = b.readLock();
        readLock.lock();
        try {
            final atng atng = atwl.c.get(clazz);
            readLock.unlock();
            if (atng == null) {
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
                    final WeakHashMap c = atwl.c;
                    final atng atng2 = c.get(clazz);
                    if (atng2 != null) {
                        return atng2;
                    }
                    final atng b2 = atvo.b(clazz);
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
            return atng;
        }
        finally {
            readLock.unlock();
            while (true) {}
        }
    }
}
