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

public final class acyj implements acyk
{
    public xan a;
    private final byte[] b;
    private agrr c;
    private final String d;
    private adia e;
    
    public acyj(final byte[] b, final String d) {
        this.b = b;
        new HashMap();
        this.d = d;
    }
    
    public acyj(final byte[] b, final String d, final byte[] array) {
        this.b = b;
        this.d = d;
    }
    
    public final void a(final adia e) {
        this.e = e;
    }
    
    public final xan b() {
        return this.a;
    }
    
    public final void c(final xan a) {
        this.a = a;
    }
    
    public final int d() {
        return 2;
    }
    
    public final acyh e() {
        final byte[] b = this.b;
        if (b != null && b.length != 0) {
            try {
                final agrr c = (agrr)ahbh.parseFrom((ahbh)agrr.a, b);
                this.c = c;
                if (c == null) {
                    acvg.o(this.e, "SuggestResponseNull", "ProtoResponse");
                    acvg.m("error while parsing suggest response, protoResponse is null");
                    return null;
                }
                final ArrayList list = new ArrayList(10);
                final agrr c2 = this.c;
                boolean c3;
                Map<Object, Object> unmodifiableMap;
                if ((c2.b & 0x2) != 0x0) {
                    agrs agrs;
                    if ((agrs = c2.d) == null) {
                        agrs = agrs.a;
                    }
                    c3 = agrs.c;
                    if ((agrs.b & 0x80000) != 0x0) {
                        agrp agrp;
                        if ((agrp = agrs.d) == null) {
                            agrp = agrp.a;
                        }
                        unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)agrp.b);
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
                    for (final agrq agrq : this.c.c) {
                        if ((agrq.c & 0x2000000) != 0x0) {
                            agru agru;
                            if ((agru = agrq.i) == null) {
                                agru = agru.a;
                            }
                            int a;
                            if ((a = agqs.a(agru.d)) == 0) {
                                a = 1;
                            }
                            int n = --a;
                            if (a != 2) {
                                if (a != 3) {
                                    continue;
                                }
                                n = a;
                            }
                            Iterator<Object> iterator2 = ((List<Object>)this.c.c).iterator();
                            boolean b2 = false;
                            while (iterator2.hasNext()) {
                                final agrq agrq2 = iterator2.next();
                                final Spanned fromHtml = Html.fromHtml(agrq2.d, 63);
                                final String string = fromHtml.toString();
                                int ak;
                                if ((ak = adyf.ak(agrq2.e)) == 0) {
                                    ak = 1;
                                }
                                int[] array;
                                if (agrq2.f.size() > 0) {
                                    final int size = agrq2.f.size();
                                    array = new int[size];
                                    for (int i = 0; i < size; ++i) {
                                        array[i] = ((ahhq)((List<Object>)new ahbr((List)agrq2.f, agrq.a)).get(i)).kO;
                                    }
                                }
                                else {
                                    array = null;
                                }
                                int c4 = 0;
                                int d = 0;
                                String s2 = null;
                                String s3 = null;
                                Label_0572: {
                                    String s4;
                                    String s5;
                                    if ((agrq2.c & 0x4) != 0x0) {
                                        agrk agrk;
                                        if ((agrk = agrq2.g) == null) {
                                            agrk = agrk.a;
                                        }
                                        final String e = agrk.e;
                                        String s;
                                        if (unmodifiableMap != null) {
                                            c4 = agrk.c;
                                            s = unmodifiableMap.get(c4);
                                        }
                                        else {
                                            c4 = 0;
                                            s = null;
                                        }
                                        if ((agrk.b & 0x40) != 0x0) {
                                            d = agrk.d;
                                            b2 = true;
                                            s2 = e;
                                            s3 = s;
                                            break Label_0572;
                                        }
                                        s4 = s;
                                        s5 = e;
                                    }
                                    else {
                                        s5 = null;
                                        c4 = 0;
                                        s4 = null;
                                    }
                                    d = -1;
                                    s3 = s4;
                                    s2 = s5;
                                }
                                String b3;
                                if ((agrq2.c & 0x80) != 0x0) {
                                    agri agri;
                                    if ((agri = agrq2.h) == null) {
                                        agri = agri.a;
                                    }
                                    b3 = agri.b;
                                }
                                else {
                                    b3 = null;
                                }
                                Object o = afeq.q();
                                Object o2 = aeyo.a;
                                Map<Object, Object> map = null;
                                Iterator<Object> iterator4 = null;
                                Label_1163: {
                                    Object k;
                                    boolean j;
                                    if ((agrq2.c & 0x2000000) != 0x0) {
                                        agru agru2;
                                        if ((agru2 = agrq2.i) == null) {
                                            agru2 = agru.a;
                                        }
                                        final ahbx c5 = agru2.c;
                                        if (c5 != null && !((List)c5).isEmpty()) {
                                            final ArrayList<audb> list2 = new ArrayList<audb>();
                                            for (final agrv agrv : c5) {
                                                list2.add(new audb(agrv.b, agrv.c, agrv.d, (byte[])null));
                                            }
                                            o = Collections.unmodifiableList((List<?>)list2);
                                        }
                                        else {
                                            o = afeq.q();
                                        }
                                        k = o2;
                                        if ((agru2.b & 0x10) != 0x0) {
                                            k = aezp.k((Object)agru2.h);
                                        }
                                        j = agru2.i;
                                        final int b4 = agru2.b;
                                        final int n2 = b4 & 0x2;
                                        if (n2 != 0) {
                                            map = unmodifiableMap;
                                            iterator4 = iterator2;
                                            if ((b4 & 0x4) == 0x0) {
                                                break Label_1163;
                                            }
                                        }
                                        if (n2 == 0) {
                                            if ((b4 & 0x4) != 0x0) {
                                                map = unmodifiableMap;
                                                iterator4 = iterator2;
                                                break Label_1163;
                                            }
                                        }
                                        final aeyo aeyo = (aeyo)(o2 = aeyo.a);
                                        if (n2 != 0) {
                                            o2 = aeyo;
                                            if ((b4 & 0x4) != 0x0) {
                                                if ((b4 & 0x8) != 0x0) {
                                                    agrw agrw;
                                                    if ((agrw = agru2.f) == null) {
                                                        agrw = agrw.a;
                                                    }
                                                    agrx agrx;
                                                    if ((agrx = agru2.g) == null) {
                                                        agrx = agrx.a;
                                                    }
                                                    o2 = aezp.k((Object)new acym(aezp.k((Object)agru2.e), aezp.k((Object)agrw.b), aezp.k((Object)agrw.c), agrw.d, aezp.k((Object)agrx.b), aezp.k((Object)agrx.c), aezp.k((Object)agrx.d)));
                                                }
                                                else {
                                                    agrw agrw2;
                                                    if ((agrw2 = agru2.f) == null) {
                                                        agrw2 = agrw.a;
                                                    }
                                                    final aezp l = aezp.k((Object)agru2.e);
                                                    final aezp m = aezp.k((Object)agrw2.b);
                                                    final aezp k2 = aezp.k((Object)agrw2.c);
                                                    final float d2 = agrw2.d;
                                                    final aeyo a2 = aeyo.a;
                                                    o2 = aezp.k((Object)new acym(l, m, k2, d2, (aezp)a2, (aezp)a2, (aezp)a2));
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        k = o2;
                                        j = false;
                                    }
                                    final int o3 = acyn.o;
                                    afeq.q();
                                    list.add(new acyn(string, ak - 1, array, s2, c4, s3, d, b3, fromHtml, (List)o, n, (aezp)o2, (aezp)k, j));
                                    iterator4 = iterator2;
                                    map = unmodifiableMap;
                                }
                                unmodifiableMap = map;
                                iterator2 = iterator4;
                            }
                            if (b2) {
                                Collections.sort((List<Comparable>)list);
                            }
                            return new acyh((List)list, c3, this.d);
                        }
                    }
                    int n = 1;
                    continue;
                }
            }
            catch (final ahca ahca) {
                acvg.o(this.e, "InvalidProtocolBufferException", "ProtoResponse");
                acvg.n("error while parsing suggest response", (Throwable)ahca);
                return null;
            }
        }
        acvg.o(this.e, "SuggestResponseNull", "ProtoResponse");
        acvg.m("error while parsing suggest response,responseBytes is null");
        return null;
    }
    
    public final String f() {
        return this.d;
    }
    
    public final byte[] g() {
        final byte[] b = this.b;
        if (b != null) {
            return b;
        }
        final agrr c = this.c;
        if (c != null) {
            return ((agzk)c).toByteArray();
        }
        return null;
    }
}
