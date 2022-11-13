import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.PrefetchWatchCommandOuterClass$PrefetchWatchCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjz extends abjm
{
    public final ahaq a() {
        return (ahaq)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.prefetchWatchCommand;
    }
    
    @Override
    public final String c(final Object o) {
        return ((PrefetchWatchCommandOuterClass$PrefetchWatchCommand)o).e;
    }
    
    @Override
    public final String d(final Object o) {
        return ((PrefetchWatchCommandOuterClass$PrefetchWatchCommand)o).d;
    }
    
    @Override
    public final boolean e(final Object o, final Object o2) {
        return adkp.ae((Object)o, (Object)o2);
    }
    
    @Override
    public final /* bridge */ lrf q(final Object o) {
        final PrefetchWatchCommandOuterClass$PrefetchWatchCommand prefetchWatchCommandOuterClass$PrefetchWatchCommand = (PrefetchWatchCommandOuterClass$PrefetchWatchCommand)o;
        final ahaz builder = ((ahbh)lrf.a).createBuilder();
        final String d = prefetchWatchCommandOuterClass$PrefetchWatchCommand.d;
        builder.copyOnWrite();
        final lrf lrf = (lrf)builder.instance;
        d.getClass();
        lrf.b |= 0x1;
        lrf.d = d;
        final String e = prefetchWatchCommandOuterClass$PrefetchWatchCommand.e;
        builder.copyOnWrite();
        final lrf lrf2 = (lrf)builder.instance;
        e.getClass();
        lrf2.b |= 0x2;
        lrf2.f = e;
        final int f = prefetchWatchCommandOuterClass$PrefetchWatchCommand.f;
        builder.copyOnWrite();
        final lrf lrf3 = (lrf)builder.instance;
        lrf3.b |= 0x4;
        lrf3.g = f;
        final String g = prefetchWatchCommandOuterClass$PrefetchWatchCommand.g;
        builder.copyOnWrite();
        final lrf lrf4 = (lrf)builder.instance;
        g.getClass();
        lrf4.b |= 0x400;
        lrf4.o = g;
        builder.copyOnWrite();
        final lrf lrf5 = (lrf)builder.instance;
        lrf5.b |= 0x40;
        lrf5.k = false;
        final long millis = TimeUnit.SECONDS.toMillis((long)prefetchWatchCommandOuterClass$PrefetchWatchCommand.l);
        builder.copyOnWrite();
        final lrf lrf6 = (lrf)builder.instance;
        lrf6.b |= 0x200;
        lrf6.n = millis;
        builder.copyOnWrite();
        final lrf lrf7 = (lrf)builder.instance;
        lrf7.b |= 0x1000;
        lrf7.q = true;
        if ((prefetchWatchCommandOuterClass$PrefetchWatchCommand.b & 0x40) != 0x0) {
            amxr amxr;
            if ((amxr = prefetchWatchCommandOuterClass$PrefetchWatchCommand.h) == null) {
                amxr = amxr.a;
            }
            if ((amxr.b & 0x2) != 0x0) {
                amxr amxr2;
                if ((amxr2 = prefetchWatchCommandOuterClass$PrefetchWatchCommand.h) == null) {
                    amxr2 = amxr.a;
                }
                amxp u;
                if ((u = amxr2.d) == null) {
                    u = amxp.a;
                }
                builder.copyOnWrite();
                final lrf lrf8 = (lrf)builder.instance;
                u.getClass();
                lrf8.u = u;
                lrf8.b |= 0x80000;
            }
            final amxr h = prefetchWatchCommandOuterClass$PrefetchWatchCommand.h;
            amxr a;
            if (h == null) {
                a = amxr.a;
            }
            else {
                a = h;
            }
            if ((a.b & 0x1) != 0x0) {
                amxr a2;
                if ((a2 = h) == null) {
                    a2 = amxr.a;
                }
                amxo t;
                if ((t = a2.c) == null) {
                    t = amxo.a;
                }
                builder.copyOnWrite();
                final lrf lrf9 = (lrf)builder.instance;
                t.getClass();
                lrf9.t = t;
                lrf9.b |= 0x20000;
            }
        }
        if ((prefetchWatchCommandOuterClass$PrefetchWatchCommand.b & 0x80) != 0x0) {
            apse c;
            if ((c = prefetchWatchCommandOuterClass$PrefetchWatchCommand.i) == null) {
                c = apse.a;
            }
            builder.copyOnWrite();
            final lrf lrf10 = (lrf)builder.instance;
            c.getClass();
            lrf10.C = c;
            lrf10.b |= 0x20000000;
        }
        if ((prefetchWatchCommandOuterClass$PrefetchWatchCommand.b & 0x100) != 0x0) {
            final ahab j = prefetchWatchCommandOuterClass$PrefetchWatchCommand.j;
            builder.copyOnWrite();
            final lrf lrf11 = (lrf)builder.instance;
            j.getClass();
            lrf11.b |= 0x40000000;
            lrf11.D = j;
        }
        return (lrf)builder.build();
    }
}
