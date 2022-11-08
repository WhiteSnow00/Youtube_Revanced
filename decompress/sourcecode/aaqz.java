import com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import java.util.ArrayList;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqz extends aaqq implements View$OnLayoutChangeListener
{
    public final ViewGroup i;
    public aaqx j;
    private final Handler k;
    private final float o;
    private final float p;
    private final ArrayList q;
    private float r;
    private float s;
    private boolean t;
    
    public aaqz(final ViewGroup i, final Context context, final Handler k, final atjj atjj, final aasb aasb, final float n, final float n2) {
        super(n, n2, aasa.a(1.0f, 1.0f, aaqq.m), aasb, atjj);
        this.k = k;
        this.i = i;
        this.o = n;
        this.p = n2;
        this.s = n2;
        ((aann)this).sT(this.r = n, n2, 0.0f);
        this.q = new ArrayList();
        k.post((Runnable)new aaqv(this, context, i, n, n2, 0));
    }
    
    public final void A(final float n) {
        this.k.post((Runnable)new hqh(this, n, 8));
    }
    
    public final void B(final boolean b, final boolean b2) {
        int s = -2;
        int s2;
        if (b) {
            s2 = -2;
        }
        else {
            s2 = s(this.o);
        }
        if (!b2) {
            s = s(this.p);
        }
        this.k.post((Runnable)new aaer(this, new FrameLayout$LayoutParams(s2, s), 11));
    }
    
    public final void g(final aaqy aaqy) {
        this.q.add(aaqy);
    }
    
    public final void h(final int n) {
        this.k.post((Runnable)new aaqw(this, n, 2));
    }
    
    public final void o(final foi foi) {
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.s = aarz.a((float)this.j.getHeight());
        this.r = aarz.a((float)this.j.getWidth());
        this.t = true;
    }
    
    public final void p(final foi foi) {
        super.p(foi);
        if (this.t) {
            int i = 0;
            this.t = false;
            for (ArrayList q = this.q; i < q.size(); ++i) {
                ((aaqy)q.get(i)).a(this.r, this.s);
            }
            this.w(this.r, this.s);
            this.k.post((Runnable)new aano(this, 12));
            ((aann)this).sT(this.r, this.s, 0.0f);
        }
    }
    
    public final void rK() {
        this.k.post((Runnable)new aano(this, 13));
        super.rK();
    }
    
    public final void rM(final boolean l) {
        ((aaqh)this).l = l;
        this.k.post((Runnable)new a(this, l, 14));
    }
    
    public final void y(final String s) {
        this.k.post((Runnable)new aaer(this, s, 12));
    }
    
    public final void z(final int n) {
        this.k.post((Runnable)new aaqw(this, n, 0));
    }
}
