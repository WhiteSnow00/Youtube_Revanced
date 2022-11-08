import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebd
{
    public static final AtomicLong a;
    public static final AtomicLong b;
    public static final AtomicLong c;
    public static final AtomicLong d;
    public static final AtomicLong e;
    public static final AtomicLong f;
    public static final AtomicLong g;
    public static final AtomicLong h;
    public static final AtomicLong i;
    private static final AtomicLong j;
    private static final AtomicLong k;
    
    static {
        a = new AtomicLong(0L);
        b = new AtomicLong(0L);
        c = new AtomicLong(0L);
        d = new AtomicLong(0L);
        e = new AtomicLong(0L);
        f = new AtomicLong(0L);
        g = new AtomicLong(0L);
        h = new AtomicLong(0L);
        i = new AtomicLong(0L);
        j = new AtomicLong(0L);
        k = new AtomicLong(0L);
    }
    
    public static void a() {
        ebd.j.addAndGet(1L);
    }
    
    public static void b() {
        ebd.k.addAndGet(1L);
    }
}
