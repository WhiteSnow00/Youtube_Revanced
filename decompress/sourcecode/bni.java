import java.util.List;
import java.util.Set;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bni implements bob
{
    private bbj b;
    private long c;
    private long d;
    private long e;
    private float f;
    private float g;
    private final tyh h;
    
    public bni(final Context context) {
        this((bbj)new bbp(context), (btm)new btf());
    }
    
    public bni(final Context context, final btm btm) {
        this((bbj)new bbp(context), btm);
    }
    
    public bni(final bbj bbj, final btm btm) {
        this.b = bbj;
        final tyh h = new tyh(btm);
        this.h = h;
        if (bbj != h.e) {
            h.e = bbj;
            ((Map)h.a).clear();
            ((Map)h.d).clear();
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }
    
    public static bnv b(final Class clazz, final bbj bbj) {
        try {
            return clazz.getConstructor(bbj.class).newInstance(bbj);
        }
        catch (final Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public final bnx a(final ayt ayt) {
        dk.d((Object)ayt.b);
        final String scheme = ayt.b.a.getScheme();
        final bnv bnv = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        final ayp b = ayt.b;
        final int o = baw.o(b.a, b.b);
        final tyh h = this.h;
        final Object d = h.d;
        final Integer value = o;
        bnv bnv2 = ((Map<K, bnv>)d).get(value);
        if (bnv2 == null) {
            aeyr aeyr;
            if (((Map)h.a).containsKey(value)) {
                aeyr = ((Map<K, aeyr>)h.a).get(value);
            }
            else {
                final Object e = h.e;
                dk.d(e);
                Object o2 = null;
                Label_0254: {
                    if (o == 0) {
                        break Label_0254;
                    }
                    Label_0230: {
                        if (o == 1) {
                            break Label_0230;
                        }
                        Label_0206: {
                            if (o == 2) {
                                break Label_0206;
                            }
                            Label_0183: {
                                if (o == 3) {
                                    break Label_0183;
                                }
                                try {
                                    o2 = new bnh(h, (bbj)e, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                                    while (true) {
                                        break Label_0254;
                                        o2 = new beg((Class)Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(bnv.class), 16);
                                        continue;
                                        o2 = new bnh((Class)Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(bnv.class), (bbj)e, 2);
                                        break Label_0254;
                                        o2 = new bnh((Class)Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(bnv.class), (bbj)e, 1);
                                        continue;
                                    }
                                    o2 = new bnh((Class)Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(bnv.class), (bbj)e, 0);
                                }
                                catch (final ClassNotFoundException ex) {
                                    o2 = null;
                                }
                            }
                        }
                    }
                }
                final Object a = h.a;
                final Integer value2 = o;
                ((Map<Integer, aeyr>)a).put(value2, (aeyr)o2);
                aeyr = (aeyr)o2;
                if (o2 != null) {
                    ((Set<Integer>)h.b).add(value2);
                    aeyr = (aeyr)o2;
                }
            }
            if (aeyr == null) {
                bnv2 = bnv;
            }
            else {
                bnv2 = (bnv)aeyr.a();
                ((Map<Integer, bnv>)h.d).put(Integer.valueOf(o), bnv2);
            }
        }
        final StringBuilder sb = new StringBuilder("No suitable media source factory found for content type: ");
        sb.append(o);
        dk.k((Object)bnv2, (Object)sb.toString());
        final ayo c = ayt.c;
        final ayn a2 = c.a();
        if (c.a == -9223372036854775807L) {
            a2.a = this.c;
        }
        if (c.d == -3.4028235E38f) {
            a2.d = this.f;
        }
        if (c.e == -3.4028235E38f) {
            a2.e = this.g;
        }
        if (c.b == -9223372036854775807L) {
            a2.b = this.d;
        }
        if (c.c == -9223372036854775807L) {
            a2.c = this.e;
        }
        final ayo a3 = a2.a();
        ayt a4 = ayt;
        if (!a3.equals((Object)c)) {
            final ayi a5 = ayt.a();
            a5.d = a3.a();
            a4 = a5.a();
        }
        final bnx a6 = bnv2.a(a4);
        final afcr g = a4.b.g;
        Object o3 = a6;
        if (!((List)g).isEmpty()) {
            final afgh afgh = (afgh)g;
            final bnx[] array = new bnx[afgh.c + 1];
            array[0] = a6;
            int n;
            for (int i = 0; i < afgh.c; i = n) {
                dk.d((Object)this.b);
                n = i + 1;
                array[n] = (bnx)new bpc(((List<ays>)g).get(i));
            }
            o3 = new boh(false, array);
        }
        final Object o4 = o3;
        final ayk e2 = a4.e;
        Object o5 = null;
        Label_0730: {
            long a7;
            if ((a7 = e2.a) == 0L) {
                o5 = o4;
                if (e2.b == Long.MIN_VALUE) {
                    break Label_0730;
                }
                a7 = 0L;
            }
            o5 = new bmy((bnx)o4, baw.w(a7), baw.w(e2.b), true);
        }
        dk.d((Object)a4.b);
        final ayh d2 = a4.b.d;
        return (bnx)o5;
    }
}
