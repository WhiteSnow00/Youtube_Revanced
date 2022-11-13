import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkf extends abjm
{
    public static final aiqj g(final String s, final String s2, final int n, final float n2) {
        return (aiqj)((ahaz)n(s, s2, n, n2, null, null)).build();
    }
    
    public static final int m(final apsk apsk) {
        return aakv.h(apsk.f, apsk.e);
    }
    
    public static final ahbb n(final String d, final String e, final int f, final float k, final String m, final String h) {
        final ahaz builder = apsk.a.createBuilder();
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final apsk apsk = (apsk)builder.instance;
            d.getClass();
            apsk.b |= 0x1;
            apsk.d = d;
        }
        if (!TextUtils.isEmpty((CharSequence)e)) {
            builder.copyOnWrite();
            final apsk apsk2 = (apsk)builder.instance;
            e.getClass();
            apsk2.b |= 0x2;
            apsk2.e = e;
        }
        if (!TextUtils.isEmpty((CharSequence)m)) {
            builder.copyOnWrite();
            final apsk apsk3 = (apsk)builder.instance;
            m.getClass();
            apsk3.b |= 0x800;
            apsk3.m = m;
        }
        if (!TextUtils.isEmpty((CharSequence)h)) {
            builder.copyOnWrite();
            final apsk apsk4 = (apsk)builder.instance;
            h.getClass();
            apsk4.b |= 0x20;
            apsk4.h = h;
        }
        builder.copyOnWrite();
        final apsk apsk5 = (apsk)builder.instance;
        apsk5.b |= 0x4;
        apsk5.f = f;
        builder.copyOnWrite();
        final apsk apsk6 = (apsk)builder.instance;
        apsk6.b |= 0x100;
        apsk6.k = k;
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)WatchEndpointOuterClass.watchEndpoint, (Object)builder.build());
        return ahbb;
    }
    
    public final ahaq a() {
        return (ahaq)WatchEndpointOuterClass.watchEndpoint;
    }
    
    @Override
    public final String c(final Object o) {
        return ((apsk)o).e;
    }
    
    @Override
    public final String d(final Object o) {
        return ((apsk)o).d;
    }
    
    @Override
    public final /* bridge */ boolean e(final Object o, final Object o2) {
        final apsk apsk = (apsk)o;
        final apsk apsk2 = (apsk)o2;
        final boolean ae = adkp.ae((Object)apsk, (Object)apsk2);
        boolean b = true;
        if (!ae) {
            final String e = apsk.e;
            final int m = m(apsk);
            final String e2 = apsk2.e;
            final int i = m(apsk2);
            if (TextUtils.equals((CharSequence)e, (CharSequence)e2) && (TextUtils.equals((CharSequence)"", (CharSequence)e) || Math.abs(m - i) <= 1)) {
                return TextUtils.equals((CharSequence)apsk.d, (CharSequence)apsk2.d);
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final /* bridge */ lrf q(final Object o) {
        final apsk apsk = (apsk)o;
        final ahaz builder = ((ahbh)lrf.a).createBuilder();
        final String d = apsk.d;
        builder.copyOnWrite();
        final lrf lrf = (lrf)builder.instance;
        d.getClass();
        final int b = lrf.b;
        int n = 1;
        lrf.b = (b | 0x1);
        lrf.d = d;
        final String e = apsk.e;
        builder.copyOnWrite();
        final lrf lrf2 = (lrf)builder.instance;
        e.getClass();
        lrf2.b |= 0x2;
        lrf2.f = e;
        final int m = m(apsk);
        builder.copyOnWrite();
        final lrf lrf3 = (lrf)builder.instance;
        lrf3.b |= 0x4;
        lrf3.g = m;
        final String g = apsk.g;
        builder.copyOnWrite();
        final lrf lrf4 = (lrf)builder.instance;
        g.getClass();
        lrf4.b |= 0x8;
        lrf4.h = g;
        final String h = apsk.h;
        builder.copyOnWrite();
        final lrf lrf5 = (lrf)builder.instance;
        h.getClass();
        lrf5.b |= 0x10;
        lrf5.i = h;
        final String i = apsk.m;
        builder.copyOnWrite();
        final lrf lrf6 = (lrf)builder.instance;
        i.getClass();
        lrf6.b |= 0x400;
        lrf6.o = i;
        final boolean j = apsk.i;
        builder.copyOnWrite();
        final lrf lrf7 = (lrf)builder.instance;
        lrf7.b |= 0x80;
        lrf7.l = j;
        final boolean k = apsk.j;
        builder.copyOnWrite();
        final lrf lrf8 = (lrf)builder.instance;
        lrf8.b |= 0x100;
        lrf8.m = k;
        builder.copyOnWrite();
        final lrf lrf9 = (lrf)builder.instance;
        lrf9.b |= 0x40;
        lrf9.k = false;
        final long millis = TimeUnit.SECONDS.toMillis((long)apsk.k);
        builder.copyOnWrite();
        final lrf lrf10 = (lrf)builder.instance;
        lrf10.b |= 0x200;
        lrf10.n = millis;
        if ((apsk.b & 0x80000) != 0x0) {
            amxr amxr;
            if ((amxr = apsk.q) == null) {
                amxr = amxr.a;
            }
            if ((amxr.b & 0x2) != 0x0) {
                amxr amxr2;
                if ((amxr2 = apsk.q) == null) {
                    amxr2 = amxr.a;
                }
                amxp u;
                if ((u = amxr2.d) == null) {
                    u = amxp.a;
                }
                builder.copyOnWrite();
                final lrf lrf11 = (lrf)builder.instance;
                u.getClass();
                lrf11.u = u;
                lrf11.b |= 0x80000;
            }
            final amxr q = apsk.q;
            amxr a;
            if (q == null) {
                a = amxr.a;
            }
            else {
                a = q;
            }
            if ((a.b & 0x1) != 0x0) {
                amxr a2;
                if ((a2 = q) == null) {
                    a2 = amxr.a;
                }
                amxo t;
                if ((t = a2.c) == null) {
                    t = amxo.a;
                }
                builder.copyOnWrite();
                final lrf lrf12 = (lrf)builder.instance;
                t.getClass();
                lrf12.t = t;
                lrf12.b |= 0x20000;
            }
        }
        for (final Map.Entry<String, V> entry : Collections.unmodifiableMap((Map<?, ?>)apsk.t).entrySet()) {
            final String s = entry.getKey();
            final String s2 = (String)entry.getValue();
            s.getClass();
            s2.getClass();
            builder.copyOnWrite();
            final lrf lrf13 = (lrf)builder.instance;
            final ahcr z = lrf13.z;
            if (!z.b) {
                lrf13.z = z.a();
            }
            ((Map<String, String>)lrf13.z).put(s, s2);
        }
        final int b2 = apsk.b;
        if ((Integer.MIN_VALUE & b2) != 0x0) {
            final int cs = aqsx.cS(apsk.w);
            if (cs != 0) {
                n = cs;
            }
            builder.copyOnWrite();
            final lrf lrf14 = (lrf)builder.instance;
            lrf14.A = n - 1;
            lrf14.b |= 0x8000000;
        }
        else if ((b2 & 0x20000000) != 0x0 && apsk.u) {
            builder.copyOnWrite();
            final lrf lrf15 = (lrf)builder.instance;
            lrf15.A = 2;
            lrf15.b |= 0x8000000;
        }
        if ((apsk.c & 0x4) != 0x0) {
            apse c;
            if ((c = apsk.y) == null) {
                c = apse.a;
            }
            builder.copyOnWrite();
            final lrf lrf16 = (lrf)builder.instance;
            c.getClass();
            lrf16.C = c;
            lrf16.b |= 0x20000000;
        }
        if ((apsk.c & 0x10) != 0x0) {
            final ahab z2 = apsk.z;
            builder.copyOnWrite();
            final lrf lrf17 = (lrf)builder.instance;
            z2.getClass();
            lrf17.b |= 0x40000000;
            lrf17.D = z2;
        }
        if ((apsk.c & 0x80) != 0x0) {
            final String b3 = apsk.B;
            builder.copyOnWrite();
            final lrf lrf18 = (lrf)builder.instance;
            b3.getClass();
            lrf18.c |= 0x2;
            lrf18.G = b3;
        }
        return (lrf)builder.build();
    }
}
