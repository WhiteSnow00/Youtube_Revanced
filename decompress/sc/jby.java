import android.view.View;
import android.view.MotionEvent;
import java.util.concurrent.Callable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jby extends try implements las
{
    public final atiw a;
    public final ativ b;
    public final ativ c;
    public int d;
    public boolean e;
    private final jej g;
    private final tqe h;
    private final ativ i;
    private final ativ j;
    private final ativ k;
    private final ashi l;
    private final ashi m;
    private final ashi n;
    private float o;
    private final lgj p;
    private final jki q;
    
    public jby(final Context context, final jej g, final jki q, final abty abty, final iuv iuv, final lgj p12, final msr msr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.g = g;
        this.h = tpe.c(context, 200, 20);
        this.q = q;
        this.p = p12;
        final ativ ae = ativ.aE();
        this.i = ae;
        final ativ af = ativ.aF((Object)0);
        this.j = af;
        this.a = ((atiw)atiy.aE()).aL();
        this.k = ativ.aE();
        this.b = ativ.aE();
        this.c = ativ.aE();
        this.d = 0;
        this.e = true;
        this.l = ((ashi)ae).w((asjm)new izs(this, 19)).B((asjs)iva.g).L((asjr)iqm.r);
        final ashi ae2 = ((ashi)af).p().ay().aE();
        this.m = ae2;
        this.n = ae2.L((asjr)iqm.s).Y((asjr)new jbe(this, 2)).ay().aE();
        abty.a((abtx)new jbx(this, abty));
        iuv.a((iuu)new jdw(this, 1));
        msr.S((Callable)new imy(this, p12, 8, (byte[])null));
    }
    
    private final void i(final tqe tqe, final MotionEvent motionEvent, final View view) {
        tqe.e(motionEvent);
        if (this.j()) {
            this.a.tu((Object)(int)(motionEvent.getRawY() - this.o));
            return;
        }
        final int d = tqe.d(motionEvent, 1);
        if (d != 2 && d != 4) {
            return;
        }
        this.j.tu((Object)1);
        this.i.tu((Object)d);
        this.o = motionEvent.getRawY();
        tqe.h(motionEvent);
        view.getParent().requestDisallowInterceptTouchEvent(true);
    }
    
    private final boolean j() {
        final Integer n = (Integer)this.j.aG();
        return n != null && !n.equals(0);
    }
    
    public final ashi b() {
        return (ashi)this.k;
    }
    
    public final void c() {
        final ativ i = this.i;
        final Integer value = 0;
        i.tu((Object)value);
        this.j.tu((Object)value);
        this.k.tu((Object)value);
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
            final tqe h = this.h;
            if (this.j()) {
                this.i(h, motionEvent, view);
                this.k.tu((Object)h.j(motionEvent, 1));
                final ativ i = this.i;
                final Integer value = 0;
                i.tu((Object)value);
                this.j.tu((Object)value);
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
    
    public final ashi e() {
        return this.m;
    }
    
    public final ashi f() {
        return this.n;
    }
    
    public final ashi g() {
        return this.l;
    }
    
    public final boolean h() {
        return this.q.n() && this.e;
    }
}
