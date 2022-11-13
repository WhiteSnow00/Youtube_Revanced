import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwv
{
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static final atwt e;
    public static final atwt f;
    
    static {
        a = atwi.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L);
        b = atwi.d("kotlinx.coroutines.scheduler.core.pool.size", aryu.e(atwh.a, 2), 1, 0, 8);
        c = atwi.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(atwi.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L));
        e = new atwt(0);
        f = new atwt(1);
    }
}
