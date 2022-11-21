import java.io.IOException;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesz implements Callable
{
    public final long a;
    public final Object b;
    private final int c;
    
    public aesz(final aeta b, final long a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aesz(final ahei b, final long a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object call() {
        if (this.c != 0) {
            return ((oco)((ahei)this.b).c).d() - this.a;
        }
        final Object b = this.b;
        final long a = this.a;
        final aetl a2 = aetl.a;
        Object o = b;
        ((aeta)o).b.writeLock().lock();
        try {
            try {
                final aetl a3 = ((aeta)b).a();
                final ahcr builder = a3.toBuilder();
                builder.copyOnWrite();
                final aetl aetl = (aetl)builder.instance;
                aetl.b |= 0x2;
                aetl.e = a;
                try {
                    ((aeta)b).e((aetl)builder.build());
                }
                catch (final IOException ex) {
                    c.i(((aflw)aeta.a).h(), "Error writing sync data file. Cannot update last wakeup.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$getLastWakeupAndSetNewWakeup$7", '\u01c3', "SyncManagerDataStore.java", ex);
                }
                ((aeta)o).b.writeLock().unlock();
                final int b2 = a3.b;
                if ((b2 & 0x2) != 0x0) {
                    o = a3.e;
                }
                else if ((b2 & 0x1) != 0x0) {
                    o = a3.c;
                }
                else {
                    o = -1L;
                }
                return o;
            }
            finally {}
        }
        catch (final IOException ex2) {
            afcm.e(ex2);
            throw new RuntimeException(ex2);
        }
        ((aeta)o).b.writeLock().unlock();
    }
}
