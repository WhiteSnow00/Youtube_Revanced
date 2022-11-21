import android.view.View;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.widget.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adt
{
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final ConstraintLayout h;
    
    public adt(final ConstraintLayout h, final ConstraintLayout a) {
        this.h = h;
        this.a = a;
    }
    
    private static final boolean b(int mode, int size, final int n) {
        if (mode == size) {
            return true;
        }
        final int mode2 = View$MeasureSpec.getMode(mode);
        mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        return mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0) && n == size;
    }
    
    public final void a(final act act, final adb adb) {
        if (act == null) {
            return;
        }
        if (act.ah == 8) {
            adb.c = 0;
            adb.d = 0;
            adb.e = 0;
            return;
        }
        if (act.U == null) {
            return;
        }
        final int i = adb.i;
        final int j = adb.j;
        final int a = adb.a;
        final int b = adb.b;
        final int n = this.b + this.c;
        final int d = this.d;
        final Object ag = act.ag;
        final int n2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int n3 = 0;
        Label_0315: {
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            n3 = 0;
                        }
                        else {
                            final int f = this.f;
                            final acs k = act.J;
                            int f2;
                            if (k != null) {
                                f2 = k.f;
                            }
                            else {
                                f2 = 0;
                            }
                            final acs l = act.L;
                            int n4 = f2;
                            if (l != null) {
                                n4 = f2 + l.f;
                            }
                            n3 = ViewGroup.getChildMeasureSpec(f, d + n4, -1);
                        }
                    }
                    else {
                        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, d, -2);
                        final int s = act.s;
                        final int h = adb.h;
                        if (h != 1) {
                            n3 = childMeasureSpec;
                            if (h != 2) {
                                break Label_0315;
                            }
                        }
                        final int measuredHeight = ((View)ag).getMeasuredHeight();
                        final int h2 = act.h();
                        if (adb.h != 2 && s == 1 && measuredHeight != h2 && !(ag instanceof aed)) {
                            n3 = childMeasureSpec;
                            if (!act.e()) {
                                break Label_0315;
                            }
                        }
                        n3 = View$MeasureSpec.makeMeasureSpec(act.j(), 1073741824);
                    }
                }
                else {
                    n3 = ViewGroup.getChildMeasureSpec(this.f, d, -2);
                }
            }
            else {
                n3 = View$MeasureSpec.makeMeasureSpec(a, 1073741824);
            }
        }
        final int n5 = j - 1;
        if (j == 0) {
            throw null;
        }
        int n6 = 0;
        Label_0558: {
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 != 3) {
                            n6 = 0;
                        }
                        else {
                            final int g = this.g;
                            int f3;
                            if (act.J != null) {
                                f3 = act.K.f;
                            }
                            else {
                                f3 = 0;
                            }
                            int n7 = f3;
                            if (act.L != null) {
                                n7 = f3 + act.M.f;
                            }
                            n6 = ViewGroup.getChildMeasureSpec(g, n + n7, -1);
                        }
                    }
                    else {
                        final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, n, -2);
                        final int t = act.t;
                        final int h3 = adb.h;
                        if (h3 != 1) {
                            n6 = childMeasureSpec2;
                            if (h3 != 2) {
                                break Label_0558;
                            }
                        }
                        final int measuredWidth = ((View)ag).getMeasuredWidth();
                        final int m = act.j();
                        if (adb.h != 2 && t == 1 && measuredWidth != m && !(ag instanceof aed)) {
                            n6 = childMeasureSpec2;
                            if (!act.f()) {
                                break Label_0558;
                            }
                        }
                        n6 = View$MeasureSpec.makeMeasureSpec(act.h(), 1073741824);
                    }
                }
                else {
                    n6 = ViewGroup.getChildMeasureSpec(this.g, n, -2);
                }
            }
            else {
                n6 = View$MeasureSpec.makeMeasureSpec(b, 1073741824);
            }
        }
        final act u = act.U;
        if (u != null && acy.b(this.h.f, 256)) {
            final View view = (View)ag;
            if (view.getMeasuredWidth() == act.j() && view.getMeasuredWidth() < u.j() && view.getMeasuredHeight() == act.h() && view.getMeasuredHeight() < u.h() && view.getBaseline() == act.ab && !act.J() && b(act.H, n3, act.j())) {
                if (b(act.I, n6, act.h())) {
                    adb.c = act.j();
                    adb.d = act.h();
                    adb.e = act.ab;
                    return;
                }
            }
        }
        final boolean b2 = i == 3;
        final boolean b3 = j == 3;
        final boolean b4 = j == 4 || j == 1;
        final boolean b5 = i == 4 || i == 1;
        final boolean b6 = b2 && act.X > 0.0f;
        final boolean b7 = b3 && act.X > 0.0f;
        if (ag == null) {
            return;
        }
        final View view2 = (View)ag;
        final ads ads = (ads)view2.getLayoutParams();
        final int h4 = adb.h;
        int baseline = 0;
        int measuredWidth2 = 0;
        int measuredHeight2 = 0;
        Label_1302: {
            if (h4 != 1 && h4 != 2 && b2 && act.s == 0 && b3 && act.t == 0) {
                baseline = 0;
                measuredWidth2 = 0;
                measuredHeight2 = 0;
            }
            else {
                if (ag instanceof aeg && act instanceof acz) {
                    final acz acz = (acz)act;
                    final aeg aeg = (aeg)ag;
                    throw null;
                }
                view2.measure(n3, n6);
                act.z(n3, n6);
                final int measuredWidth3 = view2.getMeasuredWidth();
                final int measuredHeight3 = view2.getMeasuredHeight();
                final int baseline2 = view2.getBaseline();
                final int v = act.v;
                int max;
                if (v > 0) {
                    max = Math.max(v, measuredWidth3);
                }
                else {
                    max = measuredWidth3;
                }
                final int w = act.w;
                int min = max;
                if (w > 0) {
                    min = Math.min(w, max);
                }
                final int y = act.y;
                int max2;
                if (y > 0) {
                    max2 = Math.max(y, measuredHeight3);
                }
                else {
                    max2 = measuredHeight3;
                }
                final int z = act.z;
                int min2 = max2;
                if (z > 0) {
                    min2 = Math.min(z, max2);
                }
                int n8 = min;
                int n9 = min2;
                if (!acy.b(this.h.f, 1)) {
                    if (b6 && b4) {
                        n8 = (int)(min2 * act.X + 0.5f);
                        n9 = min2;
                    }
                    else {
                        n8 = min;
                        n9 = min2;
                        if (b7) {
                            n8 = min;
                            n9 = min2;
                            if (b5) {
                                n9 = (int)(min / act.X + 0.5f);
                                n8 = min;
                            }
                        }
                    }
                }
                Label_1229: {
                    if (measuredWidth3 != n8) {
                        break Label_1229;
                    }
                    baseline = baseline2;
                    measuredWidth2 = n8;
                    if (measuredHeight3 != (measuredHeight2 = n9)) {
                        break Label_1229;
                    }
                    break Label_1302;
                }
                if (measuredWidth3 != n8) {
                    n3 = View$MeasureSpec.makeMeasureSpec(n8, 1073741824);
                }
                if (measuredHeight3 != n9) {
                    n6 = View$MeasureSpec.makeMeasureSpec(n9, 1073741824);
                }
                view2.measure(n3, n6);
                act.z(n3, n6);
                measuredWidth2 = view2.getMeasuredWidth();
                measuredHeight2 = view2.getMeasuredHeight();
                baseline = view2.getBaseline();
            }
        }
        final boolean b8 = baseline != -1;
        adb.g = (measuredWidth2 != adb.a || measuredHeight2 != adb.b);
        final boolean f4 = b8 | ads.ag;
        if (f4) {
            if (baseline != -1) {
                if (act.ab != baseline) {
                    adb.g = true;
                }
            }
            else {
                baseline = -1;
            }
        }
        adb.c = measuredWidth2;
        adb.d = measuredHeight2;
        adb.f = f4;
        adb.e = baseline;
    }
}
