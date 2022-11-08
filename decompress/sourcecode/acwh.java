import android.text.Spanned;
import java.util.Iterator;
import java.util.List;
import android.text.Html;
import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwh implements acwi
{
    public wyn a;
    private final byte[] b;
    private agps c;
    private final String d;
    private adfy e;
    
    public acwh(final byte[] b, final String d) {
        this.b = b;
        new HashMap();
        this.d = d;
    }
    
    public acwh(final byte[] b, final String d, final byte[] array) {
        this.b = b;
        this.d = d;
    }
    
    public final void a(final adfy e) {
        this.e = e;
    }
    
    public final wyn b() {
        return this.a;
    }
    
    public final void c(final wyn a) {
        this.a = a;
    }
    
    @Override
    public final int d() {
        return 2;
    }
    
    @Override
    public final acwf e() {
        final byte[] b = this.b;
        if (b != null && b.length != 0) {
            try {
                final agps c = (agps)agzi.parseFrom(agps.a, b);
                this.c = c;
                if (c == null) {
                    adbp.l(this.e, "SuggestResponseNull", "ProtoResponse");
                    adbp.j("error while parsing suggest response, protoResponse is null");
                    return null;
                }
                final ArrayList list = new ArrayList(10);
                final agps c2 = this.c;
                boolean c3;
                Map<Object, Object> unmodifiableMap;
                if ((c2.b & 0x2) != 0x0) {
                    agpt agpt;
                    if ((agpt = c2.d) == null) {
                        agpt = agpt.a;
                    }
                    c3 = agpt.c;
                    if ((agpt.b & 0x80000) != 0x0) {
                        agpq agpq;
                        if ((agpq = agpt.d) == null) {
                            agpq = agpq.a;
                        }
                        unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)agpq.b);
                    }
                    else {
                        unmodifiableMap = null;
                    }
                }
                else {
                    unmodifiableMap = null;
                    c3 = false;
                }
                while (true) {
                    for (final agpr agpr : this.c.c) {
                        if ((agpr.c & 0x2000000) != 0x0) {
                            agpv agpv;
                            if ((agpv = agpr.i) == null) {
                                agpv = agpv.a;
                            }
                            int c4;
                            if ((c4 = agot.c(agpv.d)) == 0) {
                                c4 = 1;
                            }
                            int n = --c4;
                            if (c4 != 2) {
                                if (c4 != 3) {
                                    continue;
                                }
                                n = c4;
                            }
                            Iterator<Object> iterator2 = ((List<Object>)this.c.c).iterator();
                            boolean b2 = false;
                            while (iterator2.hasNext()) {
                                final agpr agpr2 = iterator2.next();
                                final Spanned fromHtml = Html.fromHtml(agpr2.d, 63);
                                final String string = fromHtml.toString();
                                int af;
                                if ((af = aeda.af(agpr2.e)) == 0) {
                                    af = 1;
                                }
                                int[] array;
                                if (agpr2.f.size() > 0) {
                                    final int size = agpr2.f.size();
                                    array = new int[size];
                                    for (int i = 0; i < size; ++i) {
                                        array[i] = ((ahfs)((List<Object>)new agzs((List)agpr2.f, agpr.a)).get(i)).kO;
                                    }
                                }
                                else {
                                    array = null;
                                }
                                int c5 = 0;
                                int d = 0;
                                String s2 = null;
                                String s3 = null;
                                Label_0556: {
                                    String s4;
                                    String s5;
                                    if ((agpr2.c & 0x4) != 0x0) {
                                        agpl agpl;
                                        if ((agpl = agpr2.g) == null) {
                                            agpl = agpl.a;
                                        }
                                        final String e = agpl.e;
                                        String s;
                                        if (unmodifiableMap != null) {
                                            c5 = agpl.c;
                                            s = unmodifiableMap.get(c5);
                                        }
                                        else {
                                            c5 = 0;
                                            s = null;
                                        }
                                        if ((agpl.b & 0x40) != 0x0) {
                                            d = agpl.d;
                                            b2 = true;
                                            s2 = e;
                                            s3 = s;
                                            break Label_0556;
                                        }
                                        s4 = s;
                                        s5 = e;
                                    }
                                    else {
                                        s5 = null;
                                        c5 = 0;
                                        s4 = null;
                                    }
                                    d = -1;
                                    s3 = s4;
                                    s2 = s5;
                                }
                                String b3;
                                if ((agpr2.c & 0x80) != 0x0) {
                                    agpj agpj;
                                    if ((agpj = agpr2.h) == null) {
                                        agpj = agpj.a;
                                    }
                                    b3 = agpj.b;
                                }
                                else {
                                    b3 = null;
                                }
                                Object o = afcr.q();
                                aexq aexq = aewp.a;
                                Map<Object, Object> map = null;
                                Iterator<Object> iterator4 = null;
                                Label_1144: {
                                    aexq k;
                                    boolean j;
                                    if ((agpr2.c & 0x2000000) != 0x0) {
                                        agpv agpv2;
                                        if ((agpv2 = agpr2.i) == null) {
                                            agpv2 = agpv.a;
                                        }
                                        final agzy c6 = agpv2.c;
                                        if (c6 != null && !((List)c6).isEmpty()) {
                                            final ArrayList<auck> list2 = new ArrayList<auck>();
                                            for (final agpw agpw : c6) {
                                                list2.add(new auck(agpw.b, agpw.c, agpw.d, (byte[])null));
                                            }
                                            o = Collections.unmodifiableList((List<?>)list2);
                                        }
                                        else {
                                            o = afcr.q();
                                        }
                                        k = aexq;
                                        if ((agpv2.b & 0x10) != 0x0) {
                                            k = aexq.k((Object)agpv2.h);
                                        }
                                        j = agpv2.i;
                                        final int b4 = agpv2.b;
                                        final int n2 = b4 & 0x2;
                                        if (n2 != 0) {
                                            map = unmodifiableMap;
                                            iterator4 = iterator2;
                                            if ((b4 & 0x4) == 0x0) {
                                                break Label_1144;
                                            }
                                        }
                                        if (n2 == 0) {
                                            if ((b4 & 0x4) != 0x0) {
                                                map = unmodifiableMap;
                                                iterator4 = iterator2;
                                                break Label_1144;
                                            }
                                        }
                                        final aewp aewp = (aewp)(aexq = aewp.a);
                                        if (n2 != 0) {
                                            aexq = aewp;
                                            if ((b4 & 0x4) != 0x0) {
                                                if ((b4 & 0x8) != 0x0) {
                                                    agpx agpx;
                                                    if ((agpx = agpv2.f) == null) {
                                                        agpx = agpx.a;
                                                    }
                                                    agpy agpy;
                                                    if ((agpy = agpv2.g) == null) {
                                                        agpy = agpy.a;
                                                    }
                                                    aexq = aexq.k((Object)new acwk(aexq.k((Object)agpv2.e), aexq.k((Object)agpx.b), aexq.k((Object)agpx.c), agpx.d, aexq.k((Object)agpy.b), aexq.k((Object)agpy.c), aexq.k((Object)agpy.d)));
                                                }
                                                else {
                                                    agpx agpx2;
                                                    if ((agpx2 = agpv2.f) == null) {
                                                        agpx2 = agpx.a;
                                                    }
                                                    final aexq l = aexq.k((Object)agpv2.e);
                                                    final aexq m = aexq.k((Object)agpx2.b);
                                                    final aexq k2 = aexq.k((Object)agpx2.c);
                                                    final float d2 = agpx2.d;
                                                    final aewp a = aewp.a;
                                                    aexq = aexq.k((Object)new acwk(l, m, k2, d2, (aexq)a, (aexq)a, (aexq)a));
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        k = aexq;
                                        j = false;
                                    }
                                    final int o2 = acwl.o;
                                    afcr.q();
                                    list.add(new acwl(string, af - 1, array, s2, c5, s3, d, b3, fromHtml, (List)o, n, aexq, k, j));
                                    iterator4 = iterator2;
                                    map = unmodifiableMap;
                                }
                                unmodifiableMap = map;
                                iterator2 = iterator4;
                            }
                            if (b2) {
                                Collections.sort((List<Comparable>)list);
                            }
                            return new acwf(list, c3, this.d);
                        }
                    }
                    int n = 1;
                    continue;
                }
            }
            catch (final ahab ahab) {
                adbp.l(this.e, "InvalidProtocolBufferException", "ProtoResponse");
                adbp.k("error while parsing suggest response", (Throwable)ahab);
                return null;
            }
        }
        adbp.l(this.e, "SuggestResponseNull", "ProtoResponse");
        adbp.j("error while parsing suggest response,responseBytes is null");
        return null;
    }
    
    @Override
    public final String f() {
        return this.d;
    }
    
    @Override
    public final byte[] g() {
        final byte[] b = this.b;
        if (b != null) {
            return b;
        }
        final agps c = this.c;
        if (c != null) {
            return c.toByteArray();
        }
        return null;
    }
}
