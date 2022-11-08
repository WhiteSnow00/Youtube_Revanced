import android.util.Pair;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.view.View;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acts implements actt
{
    public final vax a;
    public final boolean b;
    public final Set c;
    public final Map d;
    public final ReferenceQueue e;
    public final fzo f;
    private final acue g;
    
    public acts(final acue g, final vax a, final fzo f, final uyf uyf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        boolean b = false;
        if (uyf != null) {
            alvl alvl;
            if ((alvl = uyf.b().e) == null) {
                alvl = alvl.a;
            }
            b = b;
            if (alvl.aM) {
                b = true;
            }
        }
        this.b = b;
        this.c = new HashSet();
        this.d = new HashMap();
        this.e = new ReferenceQueue();
    }
    
    private static aibb g(final ajzf ajzf) {
        final aioe aioe = null;
        if (ajzf == null) {
            return null;
        }
        final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
        ajsq i;
        if ((i = ajzf.f) == null) {
            i = ajsq.a;
        }
        ((agza)agzc).copyOnWrite();
        final aibb aibb = (aibb)agzc.instance;
        i.getClass();
        aibb.i = i;
        aibb.b |= 0x200;
        final boolean d = ajzf.d;
        ((agza)agzc).copyOnWrite();
        final aibb aibb2 = (aibb)agzc.instance;
        aibb2.b |= 0x40;
        aibb2.h = d;
        akbf g;
        if ((g = ajzf.e) == null) {
            g = akbf.a;
        }
        ((agza)agzc).copyOnWrite();
        final aibb aibb3 = (aibb)agzc.instance;
        g.getClass();
        aibb3.g = g;
        aibb3.b |= 0x20;
        final int b = ajzf.b;
        final int n = 16;
        aioe n2;
        if ((b & 0x10) != 0x0) {
            if ((n2 = ajzf.g) == null) {
                n2 = aioe.a;
            }
        }
        else {
            n2 = null;
        }
        if (n2 != null) {
            ((agza)agzc).copyOnWrite();
            final aibb aibb4 = (aibb)agzc.instance;
            aibb4.n = n2;
            aibb4.b |= 0x4000;
        }
        aioe o = aioe;
        if ((ajzf.b & 0x20) != 0x0 && (o = ajzf.h) == null) {
            o = aioe.a;
        }
        if (o != null) {
            ((agza)agzc).copyOnWrite();
            final aibb aibb5 = (aibb)agzc.instance;
            aibb5.o = o;
            aibb5.b |= 0x8000;
        }
        ahgn t;
        if ((t = ajzf.i) == null) {
            t = ahgn.a;
        }
        ((agza)agzc).copyOnWrite();
        final aibb aibb6 = (aibb)agzc.instance;
        t.getClass();
        aibb6.t = t;
        aibb6.b |= 0x100000;
        final agyc j = ajzf.j;
        ((agza)agzc).copyOnWrite();
        final aibb aibb7 = (aibb)agzc.instance;
        j.getClass();
        aibb7.b |= 0x800000;
        aibb7.w = j;
        int n3 = n;
        if ((ajzf.b & 0x1) != 0x0) {
            ajzg ajzg;
            if ((ajzg = ajzf.c) == null) {
                ajzg = ajzg.a;
            }
            final int d2 = afld.D(ajzg.b);
            if (d2 == 0) {
                n3 = n;
            }
            else {
                n3 = n;
                if (d2 == 2) {
                    n3 = 14;
                }
            }
        }
        ((agza)agzc).copyOnWrite();
        final aibb aibb8 = (aibb)agzc.instance;
        aibb8.d = n3 - 1;
        aibb8.c = 1;
        return (aibb)((agza)agzc).build();
    }
    
    public final void a() {
        while (true) {
            final Reference poll = this.e.poll();
            if (poll != null) {
                synchronized (this.e) {
                    this.d.remove(((acui)poll).a);
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public final void b(final ajzl ajzl, final View view, final Object o, final wwv wwv) {
        this.e(ajzl, view, o, wwv, this.b, false, null);
    }
    
    public final void c(final ajzl ajzl, final View view, final Object o, final wwv wwv, final actk actk) {
        this.e(ajzl, view, o, wwv, this.b, false, actk);
    }
    
    public final void d(final ajzl ajzl, final View a, final Object o, final wwv wwv, final boolean b, final boolean b2, final actk actk) {
        final acue g = this.g;
        final actr f = new actr(this, actk, ajzl, o, wwv, b2);
        final acuf a2 = g.a();
        a2.a = a;
        ajzm ajzm;
        if ((ajzm = ajzl.h) == null) {
            ajzm = ajzm.a;
        }
        int n = 0;
        Label_0137: {
            Label_0061: {
                if (ajzm != null) {
                    int a3;
                    if ((a3 = afld.A(ajzm.c)) == 0) {
                        a3 = 1;
                    }
                    if (--a3 != 2) {
                        if (a3 != 3) {
                            if (a3 != 4) {
                                break Label_0061;
                            }
                            if (b) {
                                n = 4;
                                break Label_0137;
                            }
                        }
                        else if (b) {
                            n = 3;
                            break Label_0137;
                        }
                    }
                    n = 2;
                    break Label_0137;
                }
            }
            n = 1;
        }
        a2.m(n);
        a2.f(2);
        a2.f = (actk)f;
        int b3;
        if ((ajzl.b & 0x4) != 0x0) {
            ajzj ajzj;
            if ((ajzj = ajzl.e) == null) {
                ajzj = ajzj.a;
            }
            if ((b3 = afld.B(ajzj.b)) == 0) {
                b3 = 1;
            }
        }
        else {
            b3 = 2;
        }
        int n2;
        if (b3 == 3) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        a2.o(n2);
        int n3;
        if (b3 == 2) {
            n3 = -2;
        }
        else {
            n3 = (int)ajzl.f;
        }
        a2.k(n3);
        final int b4 = ajzl.b;
        final ajzf ajzf = null;
        ajze a4;
        if ((b4 & 0x2) != 0x0) {
            ajzi ajzi;
            if ((ajzi = ajzl.d) == null) {
                ajzi = ajzi.a;
            }
            if (ajzi.b == 106514900) {
                a4 = (ajze)ajzi.c;
            }
            else {
                a4 = ajze.a;
            }
        }
        else {
            a4 = null;
        }
        if (a4 != null) {
            a2.h(true ^ a4.e);
            ajsq ajsq;
            if ((a4.b & 0x2) != 0x0) {
                if ((ajsq = a4.f) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            a2.b = (CharSequence)abyh.b(ajsq);
            ajsq ajsq2;
            if ((a4.b & 0x4) != 0x0) {
                if ((ajsq2 = a4.g) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            a2.c = (CharSequence)abyh.b(ajsq2);
            ajzf a5;
            if ((a4.b & 0x400) != 0x0) {
                ajzd ajzd;
                if ((ajzd = a4.l) == null) {
                    ajzd = ajzd.a;
                }
                if (ajzd.b == 47244396) {
                    a5 = (ajzf)ajzd.c;
                }
                else {
                    a5 = ajzf.a;
                }
            }
            else {
                a5 = null;
            }
            final acuf a6 = a2.a(g(a5));
            ajzf a7 = ajzf;
            if ((a4.b & 0x200) != 0x0) {
                ajzd ajzd2;
                if ((ajzd2 = a4.k) == null) {
                    ajzd2 = ajzd.a;
                }
                if (ajzd2.b == 47244396) {
                    a7 = (ajzf)ajzd2.c;
                }
                else {
                    a7 = ajzf.a;
                }
            }
            final acuf b5 = a6.b(g(a7));
            float j;
            if ((j = a4.j) <= 0.0f) {
                j = 1.0f;
            }
            b5.l(j);
            aoqe a8;
            if (a4.c == 13) {
                a8 = (aoqe)a4.d;
            }
            else {
                a8 = aoqe.a;
            }
            if ((a8.b & 0x4) != 0x0) {
                final Context context = a.getContext();
                aoqe a9;
                if (a4.c == 13) {
                    a9 = (aoqe)a4.d;
                }
                else {
                    a9 = aoqe.a;
                }
                aoqb aoqb;
                if ((aoqb = aoqb.b(a9.e)) == null) {
                    aoqb = aoqb.a;
                }
                a2.g(actf.b(context, aoqb));
            }
        }
        g.c(a2.c());
    }
    
    public final void e(final ajzl ajzl, final View view, final Object o, final wwv wwv, final boolean b, final boolean b2, final actk actk) {
        this.a();
        if (view != null) {
            if (ajzl != null) {
                Label_0303: {
                    if (!b2) {
                        this.d.put(ajzl.c, new acga(this, ajzl, view, wwv, actk));
                        if ((ajzl.b & 0x40) != 0x0) {
                            ajzh ajzh;
                            if ((ajzh = ajzl.i) == null) {
                                ajzh = ajzh.a;
                            }
                            final int c = afld.C(ajzh.b);
                            if (c != 0) {
                                if (c == 3) {
                                    return;
                                }
                            }
                        }
                        final fzo f = this.f;
                        long d;
                        if ((ajzl.b & 0x10) != 0x0) {
                            ajzk ajzk;
                            if ((ajzk = ajzl.g) == null) {
                                ajzk = ajzk.a;
                            }
                            d = ajzk.d;
                        }
                        else {
                            d = 0L;
                        }
                        long c2;
                        if ((ajzl.b & 0x10) != 0x0) {
                            ajzk ajzk2;
                            if ((ajzk2 = ajzl.g) == null) {
                                ajzk2 = ajzk.a;
                            }
                            c2 = ajzk2.c;
                        }
                        else {
                            c2 = 0L;
                        }
                        final boolean e = adff.e((SharedPreferences)f.a, fzo.aa(ajzl), TimeUnit.SECONDS.toMillis(c2), ((oas)f.b).c());
                        int n = 0;
                        if (e) {
                            n = n;
                            if (((SharedPreferences)f.a).getLong(fzo.ab(ajzl), 0L) < d) {
                                n = 1;
                            }
                        }
                        if (!this.c.contains(new Pair((Object)ajzl, o)) && n != 0) {
                            break Label_0303;
                        }
                        return;
                    }
                }
                if (view.isShown() && view.isAttachedToWindow()) {
                    this.d(ajzl, view, o, wwv, b, b2, actk);
                    return;
                }
                view.post((Runnable)new actq(this, view, ajzl, o, wwv, b, b2, actk, 0));
            }
        }
    }
    
    public final void f(final ajzl ajzl, final View view, final wwv wwv) {
        this.e(ajzl, view, null, wwv, this.b, true, null);
    }
}
