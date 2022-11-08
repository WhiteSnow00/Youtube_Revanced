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

public class gjq extends acor
{
    public acim a;
    private final etr b;
    private final abzs c;
    private final aeby d;
    
    public gjq(final aeby aeby, final acoc acoc, final acoc acoc2, final tdz tdz, final tny tny, final arud arud, final olq olq, final acbo acbo, final uyi uyi, final atjj atjj, final asgt asgt, final etr b, final gjd gjd, final IntersectionEngine intersectionEngine, final cxz cxz, final uyi uyi2, final acpi acpi, final aeby d, final RecyclerView recyclerView, final vke vke, final acnq acnq, final wwv wwv, final acir acir, final acpf acpf, final acot acot, final int n, final acbx acbx, final osx osx, final acce acce, final Context context, final fre b2, final Queue queue, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        final acrz acrz = new acrz(olq, wwv, acbo, uyi, acbo.a().E(acbx), osx, atjj);
        acce a;
        if (acce != null) {
            a = acce;
        }
        else {
            a = acce.a;
        }
        acrz.a = a;
        acrz.b = b2;
        acrz.c = new hyc(intersectionEngine, gjd, cxz, (byte[])null, (byte[])null);
        super(acpi, recyclerView, aeby, acoc, acoc2, vke, tdz, acnq, tny, wwv, acir, acpf, acot, (acoo)acrz, arud, asgt, ((acbm)acbo.a()).l, queue, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((aclp)this).w((acik)new gjo(n, acir, context));
        ((aclp)this).w((acik)new kfe((acma)this, 9));
        this.b = b;
        this.d = d;
        if (d != null) {
            d.Y(super.N, wwv);
        }
        acbo.a();
        if (acbo.a().E(acbx).i) {
            ((aclp)this).w((acik)(this.c = new abzs(acbo.a().E(acbx), olq, wwv)));
            return;
        }
        this.c = null;
    }
    
    protected void h(final anws anws) {
        anwr anwr;
        if ((anwr = anws.g) == null) {
            anwr = anwr.a;
        }
        final int b = anwr.b;
        if (b == 107984702) {
            ((aclp)this).v((Object)anwr.c);
        }
        else if (b == 171606645) {
            ((aclp)this).v((Object)anwr.c);
        }
        else if (b == 207130962) {
            ((aclp)this).v((Object)anwr.c);
        }
        else if (b == 105977417) {
            ((aclp)this).v((Object)anwr.c);
        }
        anwt anwt;
        if ((anwt = anws.f) == null) {
            anwt = anwt.a;
        }
        final int b2 = anwt.b;
        Object o;
        if ((b2 & 0x8) != 0x0) {
            if ((o = anwt.f) == null) {
                o = almg.a;
            }
        }
        else if ((b2 & 0x10) != 0x0) {
            if ((o = anwt.g) == null) {
                o = aige.a;
            }
        }
        else if ((b2 & 0x4) != 0x0) {
            if ((o = anwt.e) == null) {
                o = aogu.a;
            }
        }
        else if ((b2 & 0x1) != 0x0) {
            if ((o = anwt.c) == null) {
                o = aihu.a;
            }
        }
        else if ((b2 & 0x2) != 0x0) {
            if ((o = anwt.d) == null) {
                o = anvw.a;
            }
        }
        else if ((b2 & 0x40) != 0x0) {
            if ((o = anwt.i) == null) {
                o = ajkj.a;
            }
        }
        else if ((b2 & 0x20) != 0x0) {
            if ((o = anwt.h) == null) {
                o = anuy.a;
            }
        }
        else {
            o = null;
        }
        ((aclp)this).x(o);
    }
    
    public void i() {
        final etr b = this.b;
        for (final ahju ahju : b.b) {
            final rom a = b.a;
            ahlg ahlg;
            if ((ahlg = ahju.c) == null) {
                ahlg = ahlg.a;
            }
            if (ahju.d == null) {
                final ahjr a2 = ahjr.a;
            }
            a.e(ahlg);
        }
        b.b.clear();
        super.i();
    }
    
    protected final void j() {
        super.j();
        final abzs c = this.c;
        Label_0244: {
            if (c != null) {
                final RecyclerView n = super.N;
                ((owj)c).a.put(abzh.class, new zhb(c.s, c.r, c.q, (View)n));
                final nq m = n.m;
                if (!(m instanceof aciw)) {
                    n.getContext().getApplicationContext();
                }
                else {
                    n.getContext().getApplicationContext();
                    final aepj p = new aepj(m);
                    final RecyclerView c2 = ((owj)c).c;
                    if (c2 != null) {
                        if (n.equals(c2)) {
                            break Label_0244;
                        }
                        ((owj)c).f();
                    }
                    ((owj)c).b = n.m;
                    ((owj)c).p = p;
                    ((owj)c).c = n;
                    ((owj)c).h = n.getWidth();
                    ((owj)c).i = n.getHeight();
                    final nw n2 = n.n;
                    final boolean b = n2 instanceof LinearLayoutManager;
                    boolean d = true;
                    if (b) {
                        if (1 != ((LinearLayoutManager)n2).i) {
                            d = false;
                        }
                        ((owj)c).d = d;
                    }
                    else {
                        ((owj)c).d = true;
                    }
                    ((owj)c).c.aE((iw)((owj)c).e);
                    ((owj)c).c.addOnLayoutChangeListener(((owj)c).f);
                    ((owj)c).b.v((hw)((owj)c).g);
                    ((hw)((owj)c).g).f(0, ((owj)c).b.a());
                }
            }
        }
        final etr b2 = this.b;
        final acin g = ((aclp)this).g;
        b2.c = (aciw)g;
        b2.d = new etq(b2);
        ((nq)g).v(b2.d);
        b2.d.c();
    }
    
    protected final boolean k(final acmp acmp) {
        return !acmp.c() || acmp.d();
    }
    
    public void rU() {
        super.rU();
        final aeby d = this.d;
        if (d != null) {
            d.Z(super.N);
        }
        final abzs c = this.c;
        if (c != null) {
            ((owj)c).f();
        }
        final acim a = this.a;
        if (a != null) {
            ((aciw)((aclp)this).g).i(a);
            this.a = null;
        }
        final etr b = this.b;
        for (final ahju ahju : b.b) {
            final rom a2 = b.a;
            ahlg ahlg;
            if ((ahlg = ahju.c) == null) {
                ahlg = ahlg.a;
            }
            ahjr ahjr;
            if ((ahjr = ahju.d) == null) {
                ahjr = ahjr.a;
            }
            a2.b(ahlg, ahjr);
        }
        final aciw c2 = b.c;
        if (c2 != null) {
            ((nq)c2).w(b.d);
        }
        b.b.clear();
        b.c = null;
        b.d = null;
    }
}
