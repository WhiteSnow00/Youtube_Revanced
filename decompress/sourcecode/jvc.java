import java.util.Map;
import android.view.ViewStub;
import java.util.Iterator;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jvc extends acms implements acma
{
    private final acno a;
    protected final ViewGroup b;
    protected final acor c;
    protected RecyclerView d;
    protected View e;
    public boolean f;
    public boolean g;
    public agza h;
    protected fas i;
    private anwk j;
    private boolean k;
    private acjb l;
    private aciw m;
    private bx n;
    private final aeby o;
    
    public jvc(final ViewGroup b, final acor c, final aeby o, final acno a, final vke vke, final tdz tdz, final tny tny, final wwv wwv, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(vke, tdz, tny, wwv);
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        this.c = c;
        o.getClass();
        this.o = o;
        a.b((Class)anwk.class);
    }
    
    protected abstract void e(final acjb p0, final anwg p1, final boolean p2);
    
    public void g(final acij acij, final achk achk, final int n) {
        final Boolean value = true;
        acij.f("is_drawer_context", (Object)value);
        acij.f("avatar_selection_listener", (Object)this.i);
        acij.f("avatar_selection_controller", (Object)this.n);
        acij.f("sectionListController", (Object)this.c);
        kfe.d(acij, this);
        if (n == 0) {
            acij.f("is_first_drawer_list", (Object)value);
        }
    }
    
    protected abstract void l();
    
    public final void lH(final ansi ansi, final aioe aioe) {
        this.mD(aaiy.y((Object)ansi));
    }
    
    protected void m(final aciw aciw) {
    }
    
    protected final void o(final anwk anwk) {
        for (final anwj anwj : anwk.b) {
            final int b = anwj.b;
            if (b == 106506504) {
                this.e(this.l, (anwg)anwj.c, false);
            }
            else {
                if (b != 117271479) {
                    continue;
                }
                this.l.add((Object)anwj.c);
            }
        }
    }
    
    public final void p() {
        if (this.f) {
            return;
        }
        if (this.j == null) {
            this.k = true;
            return;
        }
        this.e = this.b.findViewById(2131431330);
        ((ViewStub)this.b.findViewById(2131428757)).inflate();
        this.d = (RecyclerView)this.b.findViewById(2131428755);
        this.l();
        final aciw t = this.o.T((acir)this.a.a());
        this.m = t;
        this.d.ac((nq)t);
        this.m(this.m);
        final acjb l = new acjb();
        this.l = l;
        this.m.h((achk)l);
        this.n = new bx((byte[])null, (byte[])null, (char[])null);
        final fas i = new fas(this, 16);
        this.i = i;
        this.m.f((acik)i);
        this.o(this.j);
        this.f = true;
    }
    
    public final void q(final anwk j) {
        if (aeda.v(this.j, j)) {
            return;
        }
        this.j = j;
        if (this.f) {
            this.h = null;
            this.l = new acjb();
            this.o(j);
            this.m.h((achk)this.l);
            return;
        }
        if (this.k) {
            this.p();
        }
    }
    
    protected final void r(final anwe anwe, final boolean g) {
        if (anwe != null) {
            this.h = ((agzi)anwe).toBuilder();
        }
        this.g = g;
    }
    
    public void s(final int n) {
    }
    
    public void t(final agza h) {
        final bx n = this.n;
        final agza h2 = this.h;
        if (h2 != null) {
            final jvb jvb = ((Map<K, jvb>)n.a).get(h2.build());
            if (jvb != null) {
                jvb.e((anwe)h2.build(), false);
            }
            h2.copyOnWrite();
            final anwe anwe = (anwe)h2.instance;
            final anwe a = anwe.a;
            anwe.b |= 0x400;
            anwe.l = false;
        }
        if (h != null) {
            final jvb jvb2 = ((Map<K, jvb>)n.a).get(h.build());
            if (jvb2 != null) {
                jvb2.e((anwe)h.build(), true);
            }
            h.copyOnWrite();
            final anwe anwe2 = (anwe)h.instance;
            final anwe a2 = anwe.a;
            anwe2.b |= 0x400;
            anwe2.l = true;
        }
        if ((this.h = h) != null) {
            final anwe anwe3 = (anwe)h.instance;
            anwf a3;
            if (anwe3.e == 11) {
                a3 = (anwf)anwe3.f;
            }
            else {
                a3 = anwf.a;
            }
            if (a3.b == 60487319) {
                ((aclp)this.c).i();
                final acor c = this.c;
                final anwe anwe4 = (anwe)h.instance;
                anwf a4;
                if (anwe4.e == 11) {
                    a4 = (anwf)anwe4.f;
                }
                else {
                    a4 = anwf.a;
                }
                ansi a5;
                if (a4.b == 60487319) {
                    a5 = (ansi)a4.c;
                }
                else {
                    a5 = ansi.a;
                }
                ((acms)c).mD(aaiy.y((Object)a5));
            }
        }
    }
}
