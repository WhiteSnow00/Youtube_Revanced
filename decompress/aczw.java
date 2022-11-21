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

public final class aczw implements aczx
{
    public xbt a;
    private final byte[] b;
    private agtj c;
    private final String d;
    private adjq e;
    
    public aczw(final byte[] b, final String d) {
        this.b = b;
        new HashMap();
        this.d = d;
    }
    
    public aczw(final byte[] b, final String d, final byte[] array) {
        this.b = b;
        this.d = d;
    }
    
    @Override
    public final void a(final adjq e) {
        this.e = e;
    }
    
    @Override
    public final xbt b() {
        return this.a;
    }
    
    @Override
    public final void c(final xbt a) {
        this.a = a;
    }
    
    @Override
    public final int d() {
        return 2;
    }
    
    @Override
    public final aczu e() {
        final byte[] b = this.b;
        if (b != null && b.length != 0) {
            try {
                final agtj c = (agtj)ahcz.parseFrom(agtj.a, b);
                this.c = c;
                if (c == null) {
                    acws.i(this.e, "SuggestResponseNull", "ProtoResponse");
                    acws.g("error while parsing suggest response, protoResponse is null");
                    return null;
                }
                final ArrayList list = new ArrayList(10);
                final agtj c2 = this.c;
                boolean c3;
                Map<Object, Object> unmodifiableMap;
                if ((c2.b & 0x2) != 0x0) {
                    agtk agtk;
                    if ((agtk = c2.d) == null) {
                        agtk = agtk.a;
                    }
                    c3 = agtk.c;
                    if ((agtk.b & 0x80000) != 0x0) {
                        agth agth;
                        if ((agth = agtk.d) == null) {
                            agth = agth.a;
                        }
                        unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)agth.b);
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
                    for (final agti agti : this.c.c) {
                        if ((agti.c & 0x2000000) != 0x0) {
                            agtm agtm;
                            if ((agtm = agti.i) == null) {
                                agtm = agtm.a;
                            }
                            int a;
                            if ((a = agsk.a(agtm.d)) == 0) {
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
                                final agti agti2 = iterator2.next();
                                final Spanned fromHtml = Html.fromHtml(agti2.d, 63);
                                final String string = fromHtml.toString();
                                int ao;
                                if ((ao = adzw.ao(agti2.e)) == 0) {
                                    ao = 1;
                                }
                                int[] array;
                                if (agti2.f.size() > 0) {
                                    final int size = agti2.f.size();
                                    array = new int[size];
                                    for (int i = 0; i < size; ++i) {
                                        array[i] = ((ahjh)((List<Object>)new ahdj((List)agti2.f, agti.a)).get(i)).kO;
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
                                    if ((agti2.c & 0x4) != 0x0) {
                                        agtc agtc;
                                        if ((agtc = agti2.g) == null) {
                                            agtc = agtc.a;
                                        }
                                        final String e = agtc.e;
                                        String s;
                                        if (unmodifiableMap != null) {
                                            c4 = agtc.c;
                                            s = unmodifiableMap.get(c4);
                                        }
                                        else {
                                            c4 = 0;
                                            s = null;
                                        }
                                        if ((agtc.b & 0x40) != 0x0) {
                                            d = agtc.d;
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
                                if ((agti2.c & 0x80) != 0x0) {
                                    agta agta;
                                    if ((agta = agti2.h) == null) {
                                        agta = agta.a;
                                    }
                                    b3 = agta.b;
                                }
                                else {
                                    b3 = null;
                                }
                                List<Object> list2 = afgh.q();
                                afbh afbh = afag.a;
                                Map<Object, Object> map = null;
                                Iterator<Object> iterator4 = null;
                                Label_1163: {
                                    afbh k;
                                    boolean j;
                                    if ((agti2.c & 0x2000000) != 0x0) {
                                        agtm agtm2;
                                        if ((agtm2 = agti2.i) == null) {
                                            agtm2 = agtm.a;
                                        }
                                        final ahdp c5 = agtm2.c;
                                        if (c5 != null && !((List)c5).isEmpty()) {
                                            final ArrayList<aufx> list3 = new ArrayList<aufx>();
                                            for (final agtn agtn : c5) {
                                                list3.add(new aufx(agtn.b, agtn.c, agtn.d, null));
                                            }
                                            list2 = Collections.unmodifiableList((List<?>)list3);
                                        }
                                        else {
                                            list2 = afgh.q();
                                        }
                                        k = afbh;
                                        if ((agtm2.b & 0x10) != 0x0) {
                                            k = afbh.k(agtm2.h);
                                        }
                                        j = agtm2.i;
                                        final int b4 = agtm2.b;
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
                                        final afag afag = (afag)(afbh = afag.a);
                                        if (n2 != 0) {
                                            afbh = afag;
                                            if ((b4 & 0x4) != 0x0) {
                                                if ((b4 & 0x8) != 0x0) {
                                                    agto agto;
                                                    if ((agto = agtm2.f) == null) {
                                                        agto = agto.a;
                                                    }
                                                    agtp agtp;
                                                    if ((agtp = agtm2.g) == null) {
                                                        agtp = agtp.a;
                                                    }
                                                    afbh = afbh.k(new aczz(afbh.k(agtm2.e), afbh.k(agto.b), afbh.k(agto.c), agto.d, afbh.k(agtp.b), afbh.k(agtp.c), afbh.k(agtp.d)));
                                                }
                                                else {
                                                    agto agto2;
                                                    if ((agto2 = agtm2.f) == null) {
                                                        agto2 = agto.a;
                                                    }
                                                    final afbh l = afbh.k(agtm2.e);
                                                    final afbh m = afbh.k(agto2.b);
                                                    final afbh k2 = afbh.k(agto2.c);
                                                    final float d2 = agto2.d;
                                                    final afag a2 = afag.a;
                                                    afbh = afbh.k(new aczz(l, m, k2, d2, a2, a2, a2));
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        k = afbh;
                                        j = false;
                                    }
                                    final int o = adaa.o;
                                    afgh.q();
                                    list.add(new adaa(string, ao - 1, array, s2, c4, s3, d, b3, fromHtml, list2, n, afbh, k, j));
                                    iterator4 = iterator2;
                                    map = unmodifiableMap;
                                }
                                unmodifiableMap = map;
                                iterator2 = iterator4;
                            }
                            if (b2) {
                                Collections.sort((List<Comparable>)list);
                            }
                            return new aczu(list, c3, this.d);
                        }
                    }
                    int n = 1;
                    continue;
                }
            }
            catch (final ahds ahds) {
                acws.i(this.e, "InvalidProtocolBufferException", "ProtoResponse");
                acws.h("error while parsing suggest response", (Throwable)ahds);
                return null;
            }
        }
        acws.i(this.e, "SuggestResponseNull", "ProtoResponse");
        acws.g("error while parsing suggest response,responseBytes is null");
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
        final agtj c = this.c;
        if (c != null) {
            return c.toByteArray();
        }
        return null;
    }
}
