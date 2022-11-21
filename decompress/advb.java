import java.lang.ref.WeakReference;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advb extends aqi
{
    final BottomSheetBehavior a;
    
    public advb(final BottomSheetBehavior a) {
        this.a = a;
    }
    
    @Override
    public final int b(final View view) {
        final BottomSheetBehavior a = this.a;
        if (a.L()) {
            return a.C;
        }
        return a.u;
    }
    
    @Override
    public final void e(final int n) {
        if (n == 1) {
            final BottomSheetBehavior a = this.a;
            if (a.y) {
                a.J(1);
            }
        }
    }
    
    @Override
    public final void f(final View view, final float n, final float n2) {
        int n3 = 6;
        Label_0370: {
            Label_0020: {
                if (n2 < 0.0f) {
                    if (!this.a.a) {
                        final int top = view.getTop();
                        System.currentTimeMillis();
                        if (top > this.a.s) {
                            break Label_0370;
                        }
                    }
                }
                else {
                    final BottomSheetBehavior a = this.a;
                    if (a.w && a.M(view, n2)) {
                        if (Math.abs(n) >= Math.abs(n2) || n2 <= this.a.b) {
                            final int top2 = view.getTop();
                            final BottomSheetBehavior a2 = this.a;
                            if (top2 <= (a2.C + a2.x()) / 2) {
                                if (this.a.a) {
                                    break Label_0020;
                                }
                                if (Math.abs(view.getTop() - this.a.x()) < Math.abs(view.getTop() - this.a.s)) {
                                    break Label_0020;
                                }
                                break Label_0370;
                            }
                        }
                        n3 = 5;
                        break Label_0370;
                    }
                    if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                        if (!this.a.a) {
                            final int top3 = view.getTop();
                            if (Math.abs(top3 - this.a.s) < Math.abs(top3 - this.a.u)) {
                                break Label_0370;
                            }
                        }
                    }
                    else {
                        final int top4 = view.getTop();
                        final BottomSheetBehavior a3 = this.a;
                        if (a3.a) {
                            if (Math.abs(top4 - a3.r) < Math.abs(top4 - this.a.u)) {
                                break Label_0020;
                            }
                        }
                        else {
                            final int s = a3.s;
                            if (top4 < s) {
                                if (top4 < Math.abs(top4 - a3.u)) {
                                    break Label_0020;
                                }
                                break Label_0370;
                            }
                            else if (Math.abs(top4 - s) < Math.abs(top4 - this.a.u)) {
                                break Label_0370;
                            }
                        }
                    }
                    n3 = 4;
                    break Label_0370;
                }
            }
            n3 = 3;
        }
        this.a.K(view, n3, true);
    }
    
    @Override
    public final boolean g(final View view, final int n) {
        final BottomSheetBehavior a = this.a;
        final int z = a.z;
        if (z == 1) {
            return false;
        }
        if (a.H) {
            return false;
        }
        if (z == 3 && a.G == n) {
            final WeakReference e = a.E;
            View view2;
            if (e != null) {
                view2 = (View)e.get();
            }
            else {
                view2 = null;
            }
            if (view2 != null) {
                if (view2.canScrollVertically(-1)) {
                    return false;
                }
            }
        }
        System.currentTimeMillis();
        final WeakReference d = this.a.D;
        return d != null && d.get() == view;
    }
    
    @Override
    public final int h(final View view, final int n) {
        return view.getLeft();
    }
    
    @Override
    public final int i(final View view, final int n) {
        return aaa.a(n, this.a.x(), this.b(view));
    }
    
    @Override
    public final void l(final View view, final int n, final int n2, final int n3) {
        this.a.B(n2);
    }
}
