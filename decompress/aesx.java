import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Iterator;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesx implements Runnable
{
    public final aeta a;
    public final aetc b;
    public final long c;
    public final boolean d;
    
    public aesx(final aeta a, final aetc b, final long c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final aeta a = this.a;
        final aetc b = this.b;
        final long c = this.c;
        final boolean d = this.d;
        a.b.writeLock().lock();
        try {
            final aetl a2 = aetl.a;
            aetl a3;
            try {
                a3 = a.a();
            }
            catch (final IOException ex) {
                a3 = a2;
                if (!a.f(ex)) {
                    c.i(((aflw)aeta.a).g(), "Unable to read or clear store, will not update sync time. Sync may run too frequently.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateLastSyncTime$4", '\u0119', "SyncManagerDataStore.java", ex);
                    a3 = a2;
                }
            }
            final ahcr builder = aetl.a.createBuilder();
            builder.mergeFrom((ahcz)a3);
            builder.copyOnWrite();
            ((aetl)builder.instance).d = ahcz.emptyProtobufList();
            final Iterator<Object> iterator = ((List<Object>)a3.d).iterator();
            aetk aetk = null;
            while (iterator.hasNext()) {
                final aetk aetk2 = iterator.next();
                aetn aetn;
                if ((aetn = aetk2.c) == null) {
                    aetn = aetn.a;
                }
                if (b.equals(aetc.c(aetn))) {
                    aetk = aetk2;
                }
                else {
                    builder.ai(aetk2);
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock;
            if (aetk != null) {
                if (a3.c < 0L) {
                    long n;
                    if ((n = a.f) < 0L) {
                        n = a.d.c();
                        a.f = n;
                    }
                    builder.copyOnWrite();
                    final aetl aetl = (aetl)builder.instance;
                    aetl.b |= 0x1;
                    aetl.c = n;
                }
                final ahcr builder2 = aetk.a.createBuilder();
                final aetn a4 = b.a;
                builder2.copyOnWrite();
                final aetk aetk3 = (aetk)builder2.instance;
                a4.getClass();
                aetk3.c = a4;
                aetk3.b |= 0x1;
                builder2.copyOnWrite();
                final aetk aetk4 = (aetk)builder2.instance;
                aetk4.b |= 0x4;
                aetk4.e = c;
                if (d) {
                    builder2.copyOnWrite();
                    final aetk aetk5 = (aetk)builder2.instance;
                    aetk5.b |= 0x2;
                    aetk5.d = c;
                    builder2.copyOnWrite();
                    final aetk aetk6 = (aetk)builder2.instance;
                    aetk6.b |= 0x8;
                    aetk6.f = 0;
                }
                else {
                    final long d2 = aetk.d;
                    builder2.copyOnWrite();
                    final aetk aetk7 = (aetk)builder2.instance;
                    aetk7.b |= 0x2;
                    aetk7.d = d2;
                    final int f = aetk.f;
                    builder2.copyOnWrite();
                    final aetk aetk8 = (aetk)builder2.instance;
                    aetk8.b |= 0x8;
                    aetk8.f = f + 1;
                }
                builder.ai((aetk)builder2.build());
                try {
                    a.e((aetl)builder.build());
                }
                catch (final IOException ex2) {
                    c.i(((aflw)aeta.a).g(), "Error writing sync data file after sync. Sync may run too frequently.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateLastSyncTime$4", '\u0155', "SyncManagerDataStore.java", ex2);
                }
                reentrantReadWriteLock = a.b;
            }
            else {
                reentrantReadWriteLock = a.b;
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        finally {
            a.b.writeLock().unlock();
            while (true) {}
        }
    }
}
