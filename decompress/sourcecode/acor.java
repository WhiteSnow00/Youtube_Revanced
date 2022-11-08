import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Bundle;
import java.util.Iterator;
import android.content.res.Configuration;
import java.util.ArrayDeque;
import android.view.ViewGroup$OnHierarchyChangeListener;
import java.util.Queue;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public class acor extends aclp
{
    public static final acoo M;
    public final RecyclerView N;
    public int O;
    private acoq P;
    private int Q;
    private int R;
    private final acir a;
    private final acop b;
    private final acoo c;
    private final boolean d;
    private acon e;
    
    static {
        M = (acoo)new acom();
    }
    
    public acor(final acpi acpi, final RecyclerView n, final aeby aeby, final acoc acoc, final acoc acoc2, final vke vke, final tdz tdz, final acnq acnq, final tny tny, final wwv wwv, final acir a, final acpf acpf, final acot acot, final acoo c, final arud f, final asgt asgt, final boolean d, final Queue queue, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        super(acpi, (acin)aeby.T(a), acoc, acoc2, vke, tdz, acnq, tny, wwv, acpf, acot, f, asgt, queue, (byte[])null, (byte[])null);
        n.getClass();
        this.N = n;
        this.a = a;
        this.c = c;
        this.Q = n.getResources().getConfiguration().smallestScreenWidthDp;
        this.R = n.getResources().getConfiguration().orientation;
        this.d = d;
        final acib f2 = super.f;
        ((achk)f2).qK((achj)(this.b = new acop((achk)f2)));
        Label_0262: {
            Label_0249: {
                if (f != null) {
                    if (f.f() != null) {
                        altu altu;
                        if ((altu = f.f().m) == null) {
                            altu = altu.a;
                        }
                        algr algr;
                        if ((algr = altu.d) == null) {
                            algr = algr.a;
                        }
                        if (!algr.h) {
                            altu altu2;
                            if ((altu2 = f.f().m) == null) {
                                altu2 = altu.a;
                            }
                            algr algr2;
                            if ((algr2 = altu2.d) == null) {
                                algr2 = algr.a;
                            }
                            if (!algr2.i) {
                                break Label_0249;
                            }
                        }
                        n.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new acmd((ViewGroup$OnHierarchyChangeListener)new wxm(wwv), (aext)aacc.j));
                        break Label_0262;
                    }
                }
            }
            n.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new wxm(wwv));
        }
        ((aciw)super.g).f = f;
    }
    
    public acor(final acpi acpi, final RecyclerView recyclerView, final aeby aeby, final acoc acoc, final vke vke, final tdz tdz, final acnq acnq, final tny tny, final wwv wwv, final acir acir, final acpf acpf, final acot acot, final arud arud, final asgt asgt, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this(acpi, recyclerView, aeby, acoc, null, vke, tdz, acnq, tny, wwv, acir, acpf, acot, acor.M, arud, asgt, false, new ArrayDeque(), null, null, null, null);
    }
    
    private final void p() {
        if (this.N.n != null && ((aciw)super.g).a() > 0) {
            this.N.aa(0);
        }
    }
    
    public final void G(final Configuration configuration) {
        final Iterator iterator = super.h.iterator();
        while (iterator.hasNext()) {
            ((acnp)iterator.next()).lI(configuration);
        }
        if (this.Q != configuration.smallestScreenWidthDp) {
            this.Q = configuration.smallestScreenWidthDp;
            final RecyclerView n = this.N;
            final nw n2 = n.n;
            n.af(null);
            this.N.aI().M();
            this.N.af(n2);
        }
        if (!this.d || this.e == null || configuration.orientation == this.R) {
            ((nq)super.g).rT();
        }
        this.o();
        final acon e = this.e;
        if (e != null) {
            final int orientation = configuration.orientation;
            final acse acse = (acse)e;
            if (orientation != acse.b) {
                acse.c = true;
                acse.b = configuration.orientation;
            }
        }
        this.R = configuration.orientation;
    }
    
    protected final void I(final Bundle bundle) {
        if (bundle == null) {
            this.p();
            return;
        }
        final int int1 = bundle.getInt("scroll_position", 0);
        if (int1 > 0) {
            this.N.post((Runnable)new aaqw(this, int1, 7));
            return;
        }
        this.p();
    }
    
    public final void W(final veu veu, final Bundle bundle) {
        if (this.T(veu, (wyh)null, bundle)) {
            final RecyclerView n = this.N;
            if (n != null) {
                final nq m = n.m;
                if (m != null) {
                    m.rT();
                }
            }
        }
        this.b.f();
    }
    
    public final void aq() {
        final RecyclerView n = this.N;
        if (n != null && ((acms)this).al(abxw.b)) {
            if (n.n instanceof LinearLayoutManager) {
                final amoy amoy = (amoy)aaiy.z(((acms)this).X(abxw.b), (Class)amoy.class);
                if (amoy != null && amoy.h) {
                    if (amoy.c == 8 && (boolean)amoy.d) {
                        this.E();
                        return;
                    }
                    if (amoy.c == 9 && n.n != null) {
                        final int a = ((aciw)super.g).a();
                        final int l = ((LinearLayoutManager)n.n).L();
                        int intValue;
                        if (amoy.c == 9) {
                            intValue = (int)amoy.d;
                        }
                        else {
                            intValue = 0;
                        }
                        if (l >= a - 1 - intValue) {
                            this.E();
                        }
                    }
                }
            }
        }
    }
    
    public void i() {
        super.D(false);
        this.b.f();
    }
    
    protected void j() {
        final acir a = this.a;
        if (a instanceof aciu) {
            this.N.aJ(((aciu)a).g());
        }
        final acon a2 = this.c.a(this.N, (aciw)super.g);
        if ((this.e = a2) != null) {
            a2.a(this.N);
        }
        else {
            this.N.ac((nq)super.g);
            ((nq)super.g).rT();
        }
        if (this.P == null) {
            this.P = new acoq(this);
        }
        this.N.aE((iw)this.P);
    }
    
    protected void l(final int n, final int n2) {
        this.N.post((Runnable)new wlr(this, n, n2, 4));
    }
    
    protected void o() {
        this.N.post((Runnable)new aaqw(this, this.O, 6));
    }
    
    public final Bundle r() {
        final Bundle bundle = new Bundle();
        int n;
        if ((n = ((LinearLayoutManager)this.N.n).L()) < 0) {
            n = ((LinearLayoutManager)this.N.n).K();
        }
        if (this.b.a < n) {
            n = -1;
        }
        bundle.putInt("scroll_position", n);
        return bundle;
    }
    
    public void rU() {
        super.rU();
        final acon e = this.e;
        if (e != null) {
            e.b(this.N);
            this.e = null;
        }
        final acoq p = this.P;
        if (p != null) {
            this.N.aH((iw)p);
        }
        this.N.ac(null);
        this.N.aJ(null);
    }
}
