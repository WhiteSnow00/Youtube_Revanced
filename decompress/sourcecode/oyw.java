import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyw
{
    private static final AtomicInteger a;
    private static final long b;
    private static final afpe c;
    
    static {
        a = new AtomicInteger();
        final long c2 = b = System.currentTimeMillis() * 1000L;
        SystemClock.elapsedRealtime();
        final agza builder = ((agzi)afpe.a).createBuilder();
        builder.copyOnWrite();
        final afpe afpe = (afpe)builder.instance;
        afpe.b |= 0x2;
        afpe.d = 0;
        builder.copyOnWrite();
        final afpe afpe2 = (afpe)builder.instance;
        afpe2.b |= 0x4;
        afpe2.e = 0;
        builder.copyOnWrite();
        final afpe afpe3 = (afpe)builder.instance;
        afpe3.b |= 0x1;
        afpe3.c = c2;
        c = (afpe)builder.build();
    }
    
    public static afpd a() {
        final agza builder = ((agzi)afpd.a).createBuilder();
        final int andIncrement = oyw.a.getAndIncrement();
        builder.copyOnWrite();
        final afpd afpd = (afpd)builder.instance;
        afpd.b |= 0x2;
        afpd.d = andIncrement;
        final afpe c = oyw.c;
        builder.copyOnWrite();
        final afpd afpd2 = (afpd)builder.instance;
        c.getClass();
        afpd2.c = c;
        afpd2.b |= 0x1;
        return (afpd)builder.build();
    }
}
