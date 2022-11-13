import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import java.util.Iterator;
import java.util.Queue;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public class gjy extends acqv
{
    public ackp a;
    private final etu b;
    private final acbu c;
    private final aeea d;
    
    public gjy(final aeea aeea, final acqg acqg, final acqg acqg2, final tgd tgd, final tqd tqd, final arwh arwh, final omw omw, final acdp acdp, final vai vai, final atke atke, final ashi ashi, final etu b, final gjl gjl, final IntersectionEngine intersectionEngine, final cya cya, final vai vai2, final acrm acrm, final aeea d, final RecyclerView recyclerView, final vmj vmj, final acpu acpu, final wyw wyw, final acku acku, final acrj acrj, final acqx acqx, final int n, final acdy acdy, final oug oug, acef a, final Context context, final frn b2, final Queue queue, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        final acud acud = new acud(omw, wyw, acdp, vai, acdp.a().E(acdy), oug, atke);
        if (a == null) {
            a = acef.a;
        }
        acud.a = a;
        acud.b = b2;
        acud.c = new hyx(intersectionEngine, gjl, cya, null, null);
        super(acrm, recyclerView, aeea, acqg, acqg2, vmj, tgd, acpu, tqd, wyw, acku, acrj, acqx, (acqs)acud, arwh, ashi, ((acdn)acdp.a()).l, queue, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((acns)this).w((ackn)new gjw(n, acku, context));
        ((acns)this).w((ackn)new kgf((acod)this, 9));
        this.b = b;
        if ((this.d = d) != null) {
            d.ae(super.N, wyw);
        }
        acdp.a();
        if (acdp.a().E(acdy).i) {
            ((acns)this).w((ackn)(this.c = new acbu(acdp.a().E(acdy), omw, wyw)));
            return;
        }
        this.c = null;
    }
    
    protected void h(final anyv anyv) {
        anyu anyu;
        if ((anyu = anyv.g) == null) {
            anyu = anyu.a;
        }
        final int b = anyu.b;
        if (b == 107984702) {
            ((acns)this).v((Object)anyu.c);
        }
        else if (b == 171606645) {
            ((acns)this).v((Object)anyu.c);
        }
        else if (b == 207130962) {
            ((acns)this).v((Object)anyu.c);
        }
        else if (b == 105977417) {
            ((acns)this).v((Object)anyu.c);
        }
        anyw anyw;
        if ((anyw = anyv.f) == null) {
            anyw = anyw.a;
        }
        final int b2 = anyw.b;
        Object o;
        if ((b2 & 0x8) != 0x0) {
            if ((o = anyw.f) == null) {
                o = aloj.a;
            }
        }
        else if ((b2 & 0x10) != 0x0) {
            if ((o = anyw.g) == null) {
                o = aiic.a;
            }
        }
        else if ((b2 & 0x4) != 0x0) {
            if ((o = anyw.e) == null) {
                o = aoix.a;
            }
        }
        else if ((b2 & 0x1) != 0x0) {
            if ((o = anyw.c) == null) {
                o = aijs.a;
            }
        }
        else if ((b2 & 0x2) != 0x0) {
            if ((o = anyw.d) == null) {
                o = anxz.a;
            }
        }
        else if ((b2 & 0x40) != 0x0) {
            if ((o = anyw.i) == null) {
                o = ajmo.a;
            }
        }
        else if ((b2 & 0x20) != 0x0) {
            if ((o = anyw.h) == null) {
                o = anxb.a;
            }
        }
        else {
            o = null;
        }
        ((acns)this).x(o);
    }
    
    public void i() {
        final etu b = this.b;
        for (final ahls ahls : b.b) {
            final rqq a = b.a;
            ahne ahne;
            if ((ahne = ahls.c) == null) {
                ahne = ahne.a;
            }
            if (ahls.d == null) {
                final ahlp a2 = ahlp.a;
            }
            a.e(ahne);
        }
        b.b.clear();
        super.i();
    }
    
    protected final void j() {
        super.j();
        final acbu c = this.c;
        Label_0260: {
            if (c != null) {
                final RecyclerView n = super.N;
                ((oxs)c).a.put(acbj.class, new ziy(c.s, c.r, c.q, (View)n));
                final nq m = n.m;
                if (!(m instanceof ackz)) {
                    n.getContext().getApplicationContext();
                }
                else {
                    n.getContext().getApplicationContext();
                    final afhd p = new afhd(m);
                    final RecyclerView c2 = ((oxs)c).c;
                    if (c2 != null) {
                        if (n.equals(c2)) {
                            break Label_0260;
                        }
                        ((oxs)c).f();
                    }
                    ((oxs)c).b = n.m;
                    ((oxs)c).p = p;
                    ((oxs)c).c = n;
                    ((oxs)c).h = n.getWidth();
                    ((oxs)c).i = n.getHeight();
                    final nw n2 = n.n;
                    final boolean b = n2 instanceof LinearLayoutManager;
                    boolean d = true;
                    if (b) {
                        if (1 != ((LinearLayoutManager)n2).i) {
                            d = false;
                        }
                        ((oxs)c).d = d;
                    }
                    else {
                        ((oxs)c).d = true;
                    }
                    ((oxs)c).c.aE((iw)((oxs)c).e);
                    ((oxs)c).c.addOnLayoutChangeListener(((oxs)c).f);
                    ((oxs)c).b.v((hw)((oxs)c).g);
                    ((hw)((oxs)c).g).f(0, ((oxs)c).b.a());
                }
            }
        }
        final etu b2 = this.b;
        final ackq g = ((acns)this).g;
        b2.c = (ackz)g;
        b2.d = (hw)new ett(b2);
        ((nq)g).v(b2.d);
        b2.d.c();
    }
    
    protected final boolean k(final acos acos) {
        return !acos.c() || acos.d();
    }
    
    public void sa() {
        super.sa();
        final aeea d = this.d;
        if (d != null) {
            d.af(super.N);
        }
        final acbu c = this.c;
        if (c != null) {
            ((oxs)c).f();
        }
        final ackp a = this.a;
        if (a != null) {
            ((ackz)((acns)this).g).i(a);
            this.a = null;
        }
        final etu b = this.b;
        for (final ahls ahls : b.b) {
            final rqq a2 = b.a;
            ahne ahne;
            if ((ahne = ahls.c) == null) {
                ahne = ahne.a;
            }
            ahlp ahlp;
            if ((ahlp = ahls.d) == null) {
                ahlp = ahlp.a;
            }
            a2.b(ahne, ahlp);
        }
        final ackz c2 = b.c;
        if (c2 != null) {
            ((nq)c2).w(b.d);
        }
        b.b.clear();
        b.c = null;
        b.d = null;
    }
}
