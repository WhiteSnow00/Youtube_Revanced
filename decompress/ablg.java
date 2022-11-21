import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.PrefetchWatchCommandOuterClass$PrefetchWatchCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ablg extends abkt
{
    public final ahci a() {
        return PrefetchWatchCommandOuterClass$PrefetchWatchCommand.prefetchWatchCommand;
    }
    
    public final String c(final Object o) {
        return ((PrefetchWatchCommandOuterClass$PrefetchWatchCommand)o).e;
    }
    
    public final String d(final Object o) {
        return ((PrefetchWatchCommandOuterClass$PrefetchWatchCommand)o).d;
    }
    
    public final boolean e(final Object o, final Object o2) {
        return aexq.c(o, o2);
    }
    
    public final /* bridge */ lrt q(final Object o) {
        final PrefetchWatchCommandOuterClass$PrefetchWatchCommand prefetchWatchCommandOuterClass$PrefetchWatchCommand = (PrefetchWatchCommandOuterClass$PrefetchWatchCommand)o;
        final ahcr builder = ((ahcz)lrt.a).createBuilder();
        final String d = prefetchWatchCommandOuterClass$PrefetchWatchCommand.d;
        builder.copyOnWrite();
        final lrt lrt = (lrt)builder.instance;
        d.getClass();
        lrt.b |= 0x1;
        lrt.d = d;
        final String e = prefetchWatchCommandOuterClass$PrefetchWatchCommand.e;
        builder.copyOnWrite();
        final lrt lrt2 = (lrt)builder.instance;
        e.getClass();
        lrt2.b |= 0x2;
        lrt2.f = e;
        final int f = prefetchWatchCommandOuterClass$PrefetchWatchCommand.f;
        builder.copyOnWrite();
        final lrt lrt3 = (lrt)builder.instance;
        lrt3.b |= 0x4;
        lrt3.g = f;
        final String g = prefetchWatchCommandOuterClass$PrefetchWatchCommand.g;
        builder.copyOnWrite();
        final lrt lrt4 = (lrt)builder.instance;
        g.getClass();
        lrt4.b |= 0x400;
        lrt4.o = g;
        builder.copyOnWrite();
        final lrt lrt5 = (lrt)builder.instance;
        lrt5.b |= 0x40;
        lrt5.k = false;
        final long millis = TimeUnit.SECONDS.toMillis((long)prefetchWatchCommandOuterClass$PrefetchWatchCommand.l);
        builder.copyOnWrite();
        final lrt lrt6 = (lrt)builder.instance;
        lrt6.b |= 0x200;
        lrt6.n = millis;
        builder.copyOnWrite();
        final lrt lrt7 = (lrt)builder.instance;
        lrt7.b |= 0x1000;
        lrt7.q = true;
        if ((prefetchWatchCommandOuterClass$PrefetchWatchCommand.b & 0x40) != 0x0) {
            amzw amzw;
            if ((amzw = prefetchWatchCommandOuterClass$PrefetchWatchCommand.h) == null) {
                amzw = amzw.a;
            }
            if ((amzw.b & 0x2) != 0x0) {
                amzw amzw2;
                if ((amzw2 = prefetchWatchCommandOuterClass$PrefetchWatchCommand.h) == null) {
                    amzw2 = amzw.a;
                }
                amzu u;
                if ((u = amzw2.d) == null) {
                    u = amzu.a;
                }
                builder.copyOnWrite();
                final lrt lrt8 = (lrt)builder.instance;
                u.getClass();
                lrt8.u = u;
                lrt8.b |= 0x80000;
            }
            final amzw h = prefetchWatchCommandOuterClass$PrefetchWatchCommand.h;
            amzw a;
            if (h == null) {
                a = amzw.a;
            }
            else {
                a = h;
            }
            if ((a.b & 0x1) != 0x0) {
                amzw a2;
                if ((a2 = h) == null) {
                    a2 = amzw.a;
                }
                amzt t;
                if ((t = a2.c) == null) {
                    t = amzt.a;
                }
                builder.copyOnWrite();
                final lrt lrt9 = (lrt)builder.instance;
                t.getClass();
                lrt9.t = t;
                lrt9.b |= 0x20000;
            }
        }
        if ((prefetchWatchCommandOuterClass$PrefetchWatchCommand.b & 0x80) != 0x0) {
            apuq c;
            if ((c = prefetchWatchCommandOuterClass$PrefetchWatchCommand.i) == null) {
                c = apuq.a;
            }
            builder.copyOnWrite();
            final lrt lrt10 = (lrt)builder.instance;
            c.getClass();
            lrt10.C = c;
            lrt10.b |= 0x20000000;
        }
        if ((prefetchWatchCommandOuterClass$PrefetchWatchCommand.b & 0x100) != 0x0) {
            final ahbt j = prefetchWatchCommandOuterClass$PrefetchWatchCommand.j;
            builder.copyOnWrite();
            final lrt lrt11 = (lrt)builder.instance;
            j.getClass();
            lrt11.b |= 0x40000000;
            lrt11.D = j;
        }
        return (lrt)builder.build();
    }
}
