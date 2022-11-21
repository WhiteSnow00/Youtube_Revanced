import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.HashSet;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesy implements Callable
{
    public final aeta a;
    public final Collection b;
    
    public aesy(final aeta a, final Collection b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object call() {
        final aeta a = this.a;
        final Collection b = this.b;
        a.b.writeLock().lock();
        try {
            aetl aetl = aetl.a;
            Label_0103: {
                ReentrantReadWriteLock b2;
                try {
                    aetl = a.a();
                    break Label_0103;
                }
                catch (final IOException ex) {
                    if (a.f(ex)) {
                        break Label_0103;
                    }
                    c.i(((aflw)aeta.a).g(), "Error, could not read or clear store. Aborting sync attempt.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$prepareForSync$3", '\u00c4', "SyncManagerDataStore.java", ex);
                    false;
                    b2 = a.b;
                }
                b2.writeLock().unlock();
                goto Label_0678;
            }
            final ahcr builder = aetl.a.createBuilder();
            builder.mergeFrom((ahcz)aetl);
            builder.copyOnWrite();
            ((aetl)builder.instance).d = ahcz.emptyProtobufList();
            final long c = a.d.c();
            final HashSet<aetc> set = new HashSet<aetc>();
            for (final aetk aetk : aetl.d) {
                aetn aetn;
                if ((aetn = aetk.c) == null) {
                    aetn = aetn.a;
                }
                if (b.contains(aetc.c(aetn))) {
                    aetn aetn2;
                    if ((aetn2 = aetk.c) == null) {
                        aetn2 = aetn.a;
                    }
                    set.add(aetc.c(aetn2));
                    final ahcr builder2 = aetk.toBuilder();
                    builder2.copyOnWrite();
                    final aetk aetk2 = (aetk)builder2.instance;
                    aetk2.b |= 0x4;
                    aetk2.e = c;
                    builder.ai((aetk)builder2.build());
                }
                else {
                    builder.ai(aetk);
                }
            }
            for (final aetc aetc : b) {
                if (!set.contains(aetc)) {
                    final ahcr builder3 = aetk.a.createBuilder();
                    final aetn a2 = aetc.a;
                    builder3.copyOnWrite();
                    final aetk aetk3 = (aetk)builder3.instance;
                    a2.getClass();
                    aetk3.c = a2;
                    aetk3.b |= 0x1;
                    final long f = a.f;
                    builder3.copyOnWrite();
                    final aetk aetk4 = (aetk)builder3.instance;
                    aetk4.b |= 0x2;
                    aetk4.d = f;
                    builder3.copyOnWrite();
                    final aetk aetk5 = (aetk)builder3.instance;
                    aetk5.b |= 0x4;
                    aetk5.e = c;
                    builder3.copyOnWrite();
                    final aetk aetk6 = (aetk)builder3.instance;
                    aetk6.b |= 0x8;
                    aetk6.f = 0;
                    builder.ai((aetk)builder3.build());
                }
            }
            if (aetl.c < 0L) {
                long n;
                if ((n = a.f) < 0L) {
                    n = a.d.c();
                    a.f = n;
                }
                builder.copyOnWrite();
                final aetl aetl2 = (aetl)builder.instance;
                aetl2.b |= 0x1;
                aetl2.c = n;
            }
            try {
                a.e((aetl)builder.build());
                a.e.set(true);
            }
            catch (final IOException ex2) {}
            finally {
                a.e.set(true);
            }
        }
        finally {}
    }
}
