import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvy
{
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static final atvw e;
    public static final atvw f;
    
    static {
        a = atvl.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L);
        b = atvl.d("kotlinx.coroutines.scheduler.core.pool.size", atnp.d(atvk.a, 2), 1, 0, 8);
        c = atvl.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(atvl.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L));
        e = new atvw(0);
        f = new atvw(1);
    }
}
