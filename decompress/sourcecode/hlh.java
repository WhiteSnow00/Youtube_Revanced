import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlh implements acpf, reu, hld
{
    public final bu a;
    public final CoordinatorLayout b;
    public final LoadingFrameLayout c;
    public final gkh d;
    public final wwu e;
    public final kww f;
    public final acor g;
    public final hle h;
    public ct i;
    public final uyi j;
    
    public hlh(final Context context, final bu a, final tdz tdz, final wwu e, final tny tny, final vlq vlq, final acno acno, final aboh aboh, final aeby aeby, final arud arud, final uyi j, final asgt asgt, final ioe ioe, final aeby aeby2, final osx osx, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = e;
        this.a = a;
        this.j = j;
        final hlg hlg = new hlg(aboh, vlq, e, (byte[])null);
        final View inflate = LayoutInflater.from(context).inflate(2131625191, (ViewGroup)null);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final double n = displayMetrics.heightPixels;
        Double.isNaN(n);
        final int n2 = (int)(n * 0.75);
        this.b = (CoordinatorLayout)inflate.findViewById(2131430841);
        tmy.aF((View)(this.c = (LoadingFrameLayout)inflate.findViewById(2131430842)), tmy.at(n2), (Class)ViewGroup$LayoutParams.class);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131430843);
        final OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager((byte[])null);
        ((LinearLayoutManager)overScrollLinearLayoutManager).ac(1);
        recyclerView.af((nw)overScrollLinearLayoutManager);
        final hle am = hle.aM(n2);
        final kww f = new kww();
        (this.f = f).A(e.n());
        Object a2;
        if (j.f(45367419L)) {
            a2 = ioe.a((acpi)null, aeby2, recyclerView, (vke)vlq, (acnq)hlg, (wwv)f, (acir)acno.a(), (acpf)this, acot.d, acbx.f, osx, context);
        }
        else {
            a2 = new acor(null, recyclerView, aeby, new acoc(), (vke)vlq, tdz, (acnq)hlg, tny, (wwv)f, (acir)acno.a(), (acpf)this, acot.d, arud, asgt, null, null, null, null);
        }
        this.d = new gkh((StickyHeaderContainer)inflate.findViewById(2131431754), (nq)((aclp)a2).g, (gjw)new hli((achk)((aclp)a2).f));
        this.g = (acor)a2;
        this.h = am;
        if (j.f(45367214L)) {
            am.ae = (hld)this;
        }
    }
    
    public final void a() {
        final acor g = this.g;
        if (g != null) {
            g.i();
        }
    }
    
    public final void b() {
    }
    
    public final void c() {
        this.om();
    }
    
    public final void mV() {
        this.om();
    }
    
    public final void om() {
        final acor g = this.g;
        if (g != null) {
            g.i();
            ((acms)this.g).ah();
        }
        final gkh d = this.d;
        if (d != null) {
            d.e();
        }
    }
    
    public final boolean pN() {
        return true;
    }
}
