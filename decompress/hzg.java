import android.content.ComponentCallbacks;
import android.graphics.Rect;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnClickListener;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzg implements ashv
{
    public final Object a;
    private final int b;
    
    public hzg(final Activity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hzg(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hzg(final exr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hzg(final hzj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hzg(final msr a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public hzg(final ykb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final ashu ashu) {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final hzi hzi = new hzi(ashu);
            final hzj hzj = (hzj)a;
            hzj.p.L((syv)hzi);
            asjv.d((AtomicReference)ashu, asfn.d((asjg)new gcw(hzj, (syv)hzi, 6)));
            return;
        }
        if (b == 1) {
            final exr exr = (exr)this.a;
            exr.a.setOnClickListener((View$OnClickListener)new exq(exr, ashu, 0));
            asjv.d((AtomicReference)ashu, asfn.d(new esa(exr, 4)));
            return;
        }
        if (b != 2) {
            if (b == 3) {
                msr.P((Runnable)new tei((msr)this.a, ashu, 2, (byte[])null, (byte[])null));
                return;
            }
            if (b == 4) {
                final View view = (View)this.a;
                final adwj adwj = new adwj(ashu, view, 1);
                ashu.d((asjl)new tra(view, 0));
                anb.Z(view, (alw)adwj);
                return;
            }
            if (b != 5) {
                final ykb ykb = (ykb)this.a;
                if (((zbd)ykb.e).h.f(45360844L)) {
                    ykb.m = (ashu)new ynf(ashu);
                }
                else {
                    ykb.m = (ashu)new asyq(ashu);
                }
                ykb.m.f(asfn.d((asjg)new toa(ykb, 10)));
                ykb.p();
                return;
            }
            final Object a2 = this.a;
            final jcy jcy = new jcy(ashu, 15);
            final View view2 = (View)a2;
            ashu.d((asjl)new tqz(view2, (View$OnLayoutChangeListener)jcy, 0));
            if (!ashu.tA()) {
                ashu.c((Object)new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom()));
            }
            view2.addOnLayoutChangeListener((View$OnLayoutChangeListener)jcy);
        }
        else {
            final Object a3 = this.a;
            if (ashu.tA()) {
                return;
            }
            final Activity activity = (Activity)a3;
            ashu.c((Object)activity.getResources().getConfiguration());
            final tbz tbz = new tbz(ashu);
            activity.registerComponentCallbacks((ComponentCallbacks)tbz);
            asjv.d((AtomicReference)ashu, asfn.d((asjg)new spx(activity, (ComponentCallbacks)tbz, 4)));
        }
    }
}
