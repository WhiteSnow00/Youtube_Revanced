import java.util.List;
import java.util.Set;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnj implements boc
{
    private bbk b;
    private long c;
    private long d;
    private long e;
    private float f;
    private float g;
    private final uak h;
    
    public bnj(final Context context) {
        this((bbk)new bbq(context), (btn)new btg());
    }
    
    public bnj(final Context context, final btn btn) {
        this((bbk)new bbq(context), btn);
    }
    
    public bnj(final bbk bbk, final btn btn) {
        this.b = bbk;
        final uak h = new uak(btn);
        this.h = h;
        if (bbk != h.e) {
            h.e = bbk;
            ((Map)h.a).clear();
            ((Map)h.d).clear();
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }
    
    public static bnw b(final Class clazz, final bbk bbk) {
        try {
            return clazz.getConstructor(bbk.class).newInstance(bbk);
        }
        catch (final Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public final bny a(final ayu ayu) {
        dk.d((Object)ayu.b);
        final String scheme = ayu.b.a.getScheme();
        final bnw bnw = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        final ayq b = ayu.b;
        final int o = bax.o(b.a, b.b);
        final uak h = this.h;
        final Object d = h.d;
        final Integer value = o;
        bnw bnw2 = ((Map<K, bnw>)d).get(value);
        if (bnw2 == null) {
            afaq afaq;
            if (((Map)h.a).containsKey(value)) {
                afaq = ((Map<K, afaq>)h.a).get(value);
            }
            else {
                final Object e = h.e;
                dk.d(e);
                Object o2 = null;
                Label_0267: {
                    if (o == 0) {
                        break Label_0267;
                    }
                    Label_0242: {
                        if (o == 1) {
                            break Label_0242;
                        }
                        Label_0217: {
                            if (o == 2) {
                                break Label_0217;
                            }
                            Label_0193: {
                                if (o == 3) {
                                    break Label_0193;
                                }
                                try {
                                    o2 = new bni(h, (bbk)e, 3, null, null, null, null);
                                    while (true) {
                                        break Label_0267;
                                        o2 = new beh((Class)Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(bnw.class), 16);
                                        continue;
                                        o2 = new bni(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(bnw.class), (bbk)e, 0);
                                        continue;
                                    }
                                    o2 = new bni(Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(bnw.class), (bbk)e, 2);
                                    break Label_0267;
                                    o2 = new bni(Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(bnw.class), (bbk)e, 1);
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
                ((Map<Integer, afaq>)a).put(value2, (afaq)o2);
                afaq = (afaq)o2;
                if (o2 != null) {
                    ((Set<Integer>)h.b).add(value2);
                    afaq = (afaq)o2;
                }
            }
            if (afaq == null) {
                bnw2 = bnw;
            }
            else {
                bnw2 = (bnw)afaq.a();
                ((Map<Integer, bnw>)h.d).put(Integer.valueOf(o), bnw2);
            }
        }
        final StringBuilder sb = new StringBuilder("No suitable media source factory found for content type: ");
        sb.append(o);
        dk.k((Object)bnw2, (Object)sb.toString());
        final ayp c = ayu.c;
        final ayo a2 = c.a();
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
        final ayp a3 = a2.a();
        ayu a4 = ayu;
        if (!a3.equals((Object)c)) {
            final ayj a5 = ayu.a();
            a5.d = a3.a();
            a4 = a5.a();
        }
        final bny a6 = bnw2.a(a4);
        final afeq g = a4.b.g;
        Object o3 = a6;
        if (!((List)g).isEmpty()) {
            final afih afih = (afih)g;
            final bny[] array = new bny[afih.c + 1];
            array[0] = a6;
            int n;
            for (int i = 0; i < afih.c; i = n) {
                dk.d((Object)this.b);
                n = i + 1;
                array[n] = (bny)new bpd(((List<ayt>)g).get(i));
            }
            o3 = new boi(false, array);
        }
        final Object o4 = o3;
        final ayl e2 = a4.e;
        Object o5 = null;
        Label_0764: {
            long a7;
            if ((a7 = e2.a) == 0L) {
                o5 = o4;
                if (e2.b == Long.MIN_VALUE) {
                    break Label_0764;
                }
                a7 = 0L;
            }
            o5 = new bmz((bny)o4, bax.w(a7), bax.w(e2.b), true);
        }
        dk.d((Object)a4.b);
        final ayi d2 = a4.b.d;
        return (bny)o5;
    }
}
