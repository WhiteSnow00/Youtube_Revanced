import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
import java.util.Queue;
import java.util.ArrayDeque;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import android.content.Context;
import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzt extends gjq implements fvk, fzt
{
    private final InlinePlaybackController P;
    private final LinearLayoutManager Q;
    private final ActiveStateScrollSelectionController R;
    private Parcelable S;
    private boolean T;
    private final jzq U;
    private final atjj V;
    public final gee b;
    public aivu c;
    public final acib d;
    public achk e;
    
    public jzt(final Context context, final acoc acoc, final tdz tdz, final tny tny, final acno acno, final InlinePlaybackController p39, final lht lht, final aejr aejr, final aeby aeby, final arud arud, final olq olq, final acbo acbo, final uyi uyi, final atjj v, final aeby aeby2, final asgt asgt, final etr etr, final gjd gjd, final IntersectionEngine intersectionEngine, final cxz cxz, final uyi uyi2, final acpi acpi, final wwv wwv, final RecyclerView recyclerView, final vke vke, final acnq acnq, final acpf acpf, final acot acot, final int n, final acbx acbx, final osx osx, final acce acce, final ActiveStateScrollSelectionController r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aeby, acoc, (acoc)null, tdz, tny, arud, olq, acbo, uyi, v, asgt, etr, gjd, intersectionEngine, cxz, uyi2, acpi.a(acpi), aeby2, recyclerView, vke, acnq, wwv, (acir)acno.a(), acpf, acot, n, acbx, osx, acce, context, fbp.h(r), (Queue)new ArrayDeque(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.V = v;
        this.P = p39;
        this.R = r;
        recyclerView.af((nw)(this.Q = (LinearLayoutManager)new ScrollToTopLinearLayoutManager()));
        final fqu o = new fqu();
        recyclerView.o = o;
        if (acpi instanceof jzr) {
            this.S = ((jzr)acpi).a;
        }
        final RecyclerView n2 = ((acor)this).N;
        final acin g = ((aclp)this).g;
        final acib f = ((aclp)this).f;
        final gjd gjd2 = (gjd)((atjj)lht.e).a();
        gjd2.getClass();
        final gem gem = (gem)((atjj)lht.f).a();
        gem.getClass();
        final jzv jzv = (jzv)((atjj)lht.d).a();
        jzv.getClass();
        final tdz tdz2 = (tdz)((atjj)lht.a).a();
        tdz2.getClass();
        final InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController)((atjj)lht.b).a();
        inlinePlaybackLifecycleController.getClass();
        final tox tox = (tox)((atjj)lht.c).a();
        tox.getClass();
        n2.getClass();
        g.getClass();
        f.getClass();
        this.b = (gee)new kah(gjd2, gem, jzv, tdz2, inlinePlaybackLifecycleController, tox, n2, (aciw)g, (achk)f, o);
        final jzq u = new jzq(aejr.b);
        this.U = u;
        aejr.g((fvk)this);
        final acib acib = new acib();
        (this.d = acib).m((achk)u);
        this.T = true;
        final achk n3 = ((aclp)this).n;
        if (n3 == acib) {
            return;
        }
        if (n3 != null) {
            ((aclp)this).f.q(n3);
        }
        ((aclp)this).n = (achk)acib;
        ((aclp)this).f.m((achk)acib);
    }
    
    public final void a(final int n) {
        this.U.d(n);
    }
    
    public final void d() {
        super.d();
        if (!this.T) {
            return;
        }
        final Parcelable s = this.S;
        if (s != null) {
            ((nw)this.Q).Z(s);
            this.S = null;
        }
        this.P.s(this.b);
        final ActiveStateScrollSelectionController r = this.R;
        if (r != null) {
            r.k((gje)this.b);
        }
        this.T = false;
    }
    
    public final void e(final int n) {
        if (n == 0) {
            this.P.s(this.b);
            final ActiveStateScrollSelectionController r = this.R;
            if (r != null) {
                r.k((gje)this.b);
            }
        }
    }
    
    public final boolean f(final int n) {
        ((otu)this.V.a()).c(((acor)this).N);
        return false;
    }
    
    protected final void h(final anws anws) {
        super.h(anws);
        aivu a;
        if ((anws.c & 0x10) != 0x0) {
            anwq anwq;
            if ((anwq = anws.j) == null) {
                anwq = anwq.a;
            }
            if (anwq.b == 93737126) {
                a = (aivu)anwq.c;
            }
            else {
                a = aivu.a;
            }
        }
        else {
            a = null;
        }
        this.c = a;
    }
    
    public final void i() {
        super.i();
        this.c = null;
    }
    
    public final void m() {
        super.m();
        this.T = true;
    }
    
    protected final void o() {
        if (this.b.g()) {
            return;
        }
        super.o();
    }
    
    public final boolean p() {
        return this.b.g();
    }
    
    public final void pM(final int n, final boolean b) {
        ((otu)this.V.a()).b(((acor)this).N);
    }
    
    public final acpi qv() {
        return new jzr(super.qv(), ((nw)this.Q).Q());
    }
    
    public final void rU() {
        super.rU();
        this.P.u(this.b);
        final ActiveStateScrollSelectionController r = this.R;
        if (r != null && r.a == this.b) {
            r.l((gje)null);
        }
    }
    
    public final void sl(final float n) {
    }
}
