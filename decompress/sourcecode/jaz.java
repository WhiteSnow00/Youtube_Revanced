import android.view.View;
import android.view.MotionEvent;
import java.util.concurrent.Callable;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jaz extends tpt implements kzr
{
    public final atie a;
    public final atid b;
    public final atid c;
    public int d;
    public boolean e;
    private final jdj g;
    private final tnz h;
    private final atid i;
    private final atid j;
    private final atid k;
    private final asgt l;
    private final asgt m;
    private final asgt n;
    private float o;
    private final lfh p;
    private final a q;
    
    public jaz(final Context context, final jdj g, final a q, final abrx abrx, final itx itx, final lfh p12, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.g = g;
        this.h = tmy.c(context, 200, 20);
        this.q = q;
        this.p = p12;
        final atid ad = atid.aD();
        this.i = ad;
        final atid ae = atid.aE((Object)0);
        this.j = ae;
        this.a = ((atie)atig.aD()).aK();
        this.k = atid.aD();
        this.b = atid.aD();
        this.c = atid.aD();
        this.d = 0;
        this.e = true;
        this.l = ((asgt)ad).w((asix)new iys(this, 20)).B((asjd)iuc.g).L((asjc)iqc.p);
        final asgt ad2 = ((asgt)ae).p().ax().aD();
        this.m = ad2;
        this.n = ad2.L((asjc)iqc.q).Y((asjc)new jax(this, 0)).ax().aD();
        abrx.a(new jay(this, abrx));
        itx.a((itw)new jcw(this, 1));
        mrm.C((Callable)new imb(this, p12, 8, null));
    }
    
    private final void i(final tnz tnz, final MotionEvent motionEvent, final View view) {
        tnz.e(motionEvent);
        if (this.j()) {
            this.a.tr((Object)(int)(motionEvent.getRawY() - this.o));
            return;
        }
        final int d = tnz.d(motionEvent, 1);
        if (d != 2 && d != 4) {
            return;
        }
        this.j.tr((Object)1);
        this.i.tr((Object)d);
        this.o = motionEvent.getRawY();
        tnz.h(motionEvent);
        view.getParent().requestDisallowInterceptTouchEvent(true);
    }
    
    private final boolean j() {
        final Integer n = (Integer)this.j.aF();
        return n != null && !n.equals(0);
    }
    
    public final asgt b() {
        return (asgt)this.k;
    }
    
    public final void c() {
        final atid i = this.i;
        final Integer value = 0;
        i.tr((Object)value);
        this.j.tr((Object)value);
        this.k.tr((Object)value);
        this.o = 0.0f;
        this.h.g();
    }
    
    public final boolean d(final View view, final MotionEvent motionEvent) {
        if (this.g.c()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return this.p.e();
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.i(this.h, motionEvent, view);
                    return this.j();
                }
                if (actionMasked != 3) {
                    return this.j();
                }
            }
            final tnz h = this.h;
            if (this.j()) {
                this.i(h, motionEvent, view);
                this.k.tr((Object)h.j(motionEvent, 1));
                final atid i = this.i;
                final Integer value = 0;
                i.tr((Object)value);
                this.j.tr((Object)value);
                this.o = 0.0f;
                h.g();
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        else {
            this.h.h(motionEvent);
        }
        return this.j();
    }
    
    public final asgt e() {
        return this.m;
    }
    
    public final asgt f() {
        return this.n;
    }
    
    public final asgt g() {
        return this.l;
    }
    
    public final boolean h() {
        return this.q.m() && this.e;
    }
}
