import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nco implements ThreadFactory
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public nco(final int a) {
        this.a = a;
        this.b = Executors.defaultThreadFactory();
    }
    
    public nco(final int a, final byte[] array) {
        this.a = a;
        this.b = new AtomicInteger(0);
    }
    
    public nco(final int a, final char[] array) {
        this.a = a;
        this.b = new AtomicInteger(1);
    }
    
    public nco(final int a, final short[] array) {
        this.a = a;
        this.b = new AtomicInteger(1);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final int a = this.a;
        if (a == 0) {
            final Thread thread = ((ThreadFactory)this.b).newThread(runnable);
            thread.setName("ScionFrontendApi");
            return thread;
        }
        if (a == 1) {
            final Thread thread2 = new Thread(runnable);
            final StringBuilder sb = new StringBuilder("arch_disk_io_");
            sb.append(((AtomicInteger)this.b).getAndIncrement());
            thread2.setName(sb.toString());
            return thread2;
        }
        if (a != 2) {
            final ascx ascx = new ascx(runnable, 15);
            final int andIncrement = ((AtomicInteger)this.b).getAndIncrement();
            final StringBuilder sb2 = new StringBuilder("CrAsyncTask #");
            sb2.append(andIncrement);
            return new Thread((Runnable)ascx, sb2.toString());
        }
        return new Thread(runnable, String.format("firebase-installations-executor-%d", ((AtomicInteger)this.b).getAndIncrement()));
    }
}
