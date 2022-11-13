import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsm extends abjm
{
    public static final String f(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        String f;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x10) != 0x0) {
            f = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
        }
        else {
            f = "";
        }
        return f;
    }
    
    public static final String g(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        String e;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x4) != 0x0) {
            e = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
        }
        else {
            e = "";
        }
        return e;
    }
    
    public final ahaq a() {
        return (ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
    }
    
    @Override
    public final /* bridge */ String c(final Object o) {
        return f((ReelWatchEndpointOuterClass$ReelWatchEndpoint)o);
    }
    
    @Override
    public final /* bridge */ String d(final Object o) {
        return g((ReelWatchEndpointOuterClass$ReelWatchEndpoint)o);
    }
    
    @Override
    public final boolean e(final Object o, final Object o2) {
        return adkp.ae((Object)o, (Object)o2);
    }
    
    @Override
    public final /* bridge */ lrf q(final Object o) {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)o;
        final ahaz builder = ((ahbh)lrf.a).createBuilder();
        final String g = g(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        builder.copyOnWrite();
        final lrf lrf = (lrf)builder.instance;
        g.getClass();
        lrf.b |= 0x1;
        lrf.d = g;
        final String f = f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        builder.copyOnWrite();
        final lrf lrf2 = (lrf)builder.instance;
        f.getClass();
        lrf2.b |= 0x2;
        lrf2.f = f;
        final int g2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.g;
        builder.copyOnWrite();
        final lrf lrf3 = (lrf)builder.instance;
        lrf3.b |= 0x4;
        lrf3.g = g2;
        builder.copyOnWrite();
        final lrf lrf4 = (lrf)builder.instance;
        lrf4.b |= 0x10;
        lrf4.i = "";
        final String h = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
        builder.copyOnWrite();
        final lrf lrf5 = (lrf)builder.instance;
        h.getClass();
        lrf5.b |= 0x400;
        lrf5.o = h;
        builder.copyOnWrite();
        final lrf lrf6 = (lrf)builder.instance;
        lrf6.b |= 0x200;
        lrf6.n = 0L;
        builder.copyOnWrite();
        final lrf lrf7 = (lrf)builder.instance;
        lrf7.b |= 0x1000;
        lrf7.q = true;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x800) != 0x0) {
            amxr amxr;
            if ((amxr = reelWatchEndpointOuterClass$ReelWatchEndpoint.m) == null) {
                amxr = amxr.a;
            }
            if ((amxr.b & 0x2) != 0x0) {
                amxr amxr2;
                if ((amxr2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.m) == null) {
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
            final amxr m = reelWatchEndpointOuterClass$ReelWatchEndpoint.m;
            amxr a;
            if (m == null) {
                a = amxr.a;
            }
            else {
                a = m;
            }
            if ((a.b & 0x1) != 0x0) {
                amxr a2;
                if ((a2 = m) == null) {
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
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x800000) != 0x0) {
            final ahab w = reelWatchEndpointOuterClass$ReelWatchEndpoint.w;
            builder.copyOnWrite();
            final lrf lrf10 = (lrf)builder.instance;
            w.getClass();
            lrf10.b |= 0x40000000;
            lrf10.D = w;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x400000) != 0x0) {
            apse c;
            if ((c = reelWatchEndpointOuterClass$ReelWatchEndpoint.v) == null) {
                c = apse.a;
            }
            builder.copyOnWrite();
            final lrf lrf11 = (lrf)builder.instance;
            c.getClass();
            lrf11.C = c;
            lrf11.b |= 0x20000000;
        }
        return (lrf)builder.build();
    }
}
