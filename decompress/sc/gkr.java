import com.google.protobuf.ExtensionRegistryLite;
import android.content.Context;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ReelPlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkr implements asjr
{
    public static final gkr a;
    public static final gkr b;
    public static final gkr c;
    public static final gkr d;
    public static final gkr e;
    public static final gkr f;
    public static final gkr g;
    public static final gkr h;
    public static final gkr i;
    public static final gkr j;
    public static final gkr k;
    public static final gkr l;
    public static final gkr m;
    public static final gkr n;
    public static final gkr o;
    public static final gkr p;
    public static final gkr q;
    public static final gkr r;
    public static final gkr s;
    private final int t;
    
    static {
        s = new gkr(20);
        r = new gkr(19);
        q = new gkr(18);
        p = new gkr(17);
        o = new gkr(16);
        n = new gkr(13);
        m = new gkr(12);
        l = new gkr(11);
        k = new gkr(10);
        j = new gkr(9);
        i = new gkr(8);
        h = new gkr(7);
        g = new gkr(6);
        f = new gkr(5);
        e = new gkr(4);
        d = new gkr(3);
        c = new gkr(2);
        b = new gkr(1);
        a = new gkr(0);
    }
    
    public gkr(final int t) {
        this.t = t;
    }
    
    public final Object a(final Object o) {
        final int t = this.t;
        final antb antb = null;
        boolean b = false;
        int i = 0;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        switch (t) {
            default: {
                return ((fkr)o).k() ^ true;
            }
            case 19: {
                boolean b6 = b5;
                if (((ggq)o).og().f("reel_watch_fragment_watch_while") != null) {
                    b6 = true;
                }
                return b6;
            }
            case 18: {
                if (((ggq)o).og().f("reel_watch_pager_fragment") != null) {
                    b = true;
                }
                return b;
            }
            case 17: {
                final boolean equals = ((hsk)o).equals((Object)hsk.b);
                final gio a = gip.a();
                a.f(false);
                a.b(equals);
                a.d(equals);
                a.e(equals);
                a.c(false);
                return a.a();
            }
            case 16: {
                return ((ggq)o) instanceof hpo;
            }
            case 15: {
                final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint = (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)o;
                return hpj.a(true, afeq.q(), null);
            }
            case 14: {
                final akqn akqn = (akqn)o;
                antf antf;
                if ((antf = akqn.d) == null) {
                    antf = antf.a;
                }
                final boolean b7 = antf.b != 423410527;
                antf antf2;
                if ((antf2 = akqn.d) == null) {
                    antf2 = antf.a;
                }
                afeq afeq;
                if (antf2.b == 139970731) {
                    final afel d = afeq.d();
                    antf antf3;
                    if ((antf3 = akqn.d) == null) {
                        antf3 = antf.a;
                    }
                    ante a2;
                    if (antf3.b == 139970731) {
                        a2 = (ante)antf3.c;
                    }
                    else {
                        a2 = ante.a;
                    }
                    if (a2.N.size() > 0) {
                        while (i < a2.N.size()) {
                            d.h((Object)((ahbc)a2.N.get(i)).rx((ahaq)ButtonRendererOuterClass.buttonRenderer));
                            ++i;
                        }
                    }
                    else {
                        final int d2 = a2.d;
                        anuv a3;
                        if (d2 == 25) {
                            a3 = (anuv)a2.e;
                        }
                        else {
                            a3 = anuv.a;
                        }
                        final aicz b8 = hko.b(d2 == 25, a3);
                        aicz b9;
                        if (b8 != null) {
                            b9 = b8;
                        }
                        else {
                            final int d3 = a2.d;
                            anuv a4;
                            if (d3 == 32) {
                                a4 = (anuv)a2.e;
                            }
                            else {
                                a4 = anuv.a;
                            }
                            boolean b10 = b2;
                            if (d3 == 32) {
                                b10 = true;
                            }
                            b9 = hko.b(b10, a4);
                        }
                        if (b9 != null) {
                            d.h((Object)b9);
                        }
                    }
                    afeq = d.g();
                }
                else {
                    afeq = afeq.q();
                }
                antf antf4;
                if ((antf4 = akqn.d) == null) {
                    antf4 = antf.a;
                }
                ante a5;
                if (antf4.b == 139970731) {
                    a5 = (ante)antf4.c;
                }
                else {
                    a5 = ante.a;
                }
                antb antb2 = antb;
                if (a5 != null) {
                    anuv anuv;
                    if ((anuv = a5.M) == null) {
                        anuv = anuv.a;
                    }
                    antb2 = antb;
                    if (((ahbc)anuv).ry((ahaq)ReelPlayerOverlayRendererOuterClass.reelPlayerContextualHeaderRenderer)) {
                        anuv anuv2;
                        if ((anuv2 = a5.M) == null) {
                            anuv2 = anuv.a;
                        }
                        antb2 = (antb)((ahbc)anuv2).rx((ahaq)ReelPlayerOverlayRendererOuterClass.reelPlayerContextualHeaderRenderer);
                    }
                }
                return hpj.a(b7, afeq, antb2);
            }
            case 13: {
                final aany aany = (aany)o;
                final int cl = how.cl;
                return aany.a().A().L((asjr)new gdc(aany, 8));
            }
            case 12: {
                final Throwable t2 = (Throwable)o;
                if (t2 instanceof dbj) {
                    return new hkk(Optional.empty(), Optional.of((Object)t2));
                }
                throw new twa(t2);
            }
            case 11: {
                return new hkk(Optional.ofNullable(o), Optional.empty());
            }
            case 10: {
                return o;
            }
            case 9: {
                return Optional.of((Object)o);
            }
            case 8: {
                final jqf jqf = (jqf)o;
                return new gmv(jqf.v, jqf.t);
            }
            case 7: {
                return hox.d((Context)o);
            }
            case 6: {
                boolean b11 = b3;
                if ((int)o == 2) {
                    b11 = true;
                }
                return b11;
            }
            case 5: {
                boolean b12 = b4;
                if ((int)o != 0) {
                    b12 = true;
                }
                return b12;
            }
            case 4: {
                return tpe.bq((Context)o);
            }
            case 3: {
                return ((Context)o).getApplicationContext();
            }
            case 2: {
                return ((trs)o) instanceof trv;
            }
            case 1: {
                return ((aezp)o).c();
            }
            case 0: {
                final byte[] array = (byte[])o;
                try {
                    return ahbh.parseFrom((ahbh)aosg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahca ahca) {
                    throw new RuntimeException((Throwable)ahca);
                }
                break;
            }
        }
    }
}
