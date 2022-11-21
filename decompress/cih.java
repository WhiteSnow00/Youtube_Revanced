import android.animation.ObjectAnimator;
import java.util.Map;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import android.graphics.PointF;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cih extends ciq
{
    private static final String[] p;
    private static final Property q;
    private static final Property r;
    private static final Property s;
    private static final Property t;
    private static final Property u;
    
    static {
        p = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
        new chy(PointF.class);
        q = new chz(PointF.class);
        r = new cia(PointF.class);
        s = new cib(PointF.class);
        t = new cic(PointF.class);
        u = new cid(PointF.class);
    }
    
    private static final void e(final cjc cjc) {
        final View b = cjc.b;
        if (!anc.ao(b) && b.getWidth() == 0 && b.getHeight() == 0) {
            return;
        }
        cjc.a.put("android:changeBounds:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
        cjc.a.put("android:changeBounds:parent", cjc.b.getParent());
    }
    
    @Override
    public final Animator a(ViewGroup viewGroup, final cjc cjc, final cjc cjc2) {
        if (cjc == null || cjc2 == null) {
            return null;
        }
        final Map a = cjc.a;
        final Map a2 = cjc2.a;
        viewGroup = (ViewGroup)a.get("android:changeBounds:parent");
        final ViewGroup viewGroup2 = a2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
        final View b = cjc2.b;
        final Rect rect = cjc.a.get("android:changeBounds:bounds");
        final Rect rect2 = cjc2.a.get("android:changeBounds:bounds");
        final int left = rect.left;
        final int left2 = rect2.left;
        final int top = rect.top;
        final int top2 = rect2.top;
        final int right = rect.right;
        final int right2 = rect2.right;
        final int bottom = rect.bottom;
        final int bottom2 = rect2.bottom;
        final int n = right - left;
        final int n2 = bottom - top;
        final int n3 = right2 - left2;
        final int n4 = bottom2 - top2;
        final Rect rect3 = cjc.a.get("android:changeBounds:clip");
        final Rect rect4 = cjc2.a.get("android:changeBounds:clip");
        int n5 = n2;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        Label_0332: {
            int n6 = 0;
            Label_0252: {
                if (n != 0) {
                    if ((n6 = n2) != 0) {
                        break Label_0252;
                    }
                    n5 = 0;
                }
                int n7 = n4;
                if (n3 != 0) {
                    n6 = n5;
                    if (n4 != 0) {
                        break Label_0252;
                    }
                    n7 = 0;
                }
                n8 = 0;
                n9 = n7;
                n10 = n5;
                break Label_0332;
            }
            int n11;
            if (left == left2 && top == top2) {
                n11 = 0;
            }
            else {
                n11 = 1;
            }
            if (right == right2) {
                n10 = n6;
                n9 = n4;
                n8 = n11;
                if (bottom == bottom2) {
                    break Label_0332;
                }
            }
            n8 = n11 + 1;
            n10 = n6;
            n9 = n4;
        }
        int n12 = 0;
        Label_0366: {
            if (rect3 == null || rect3.equals((Object)rect4)) {
                n12 = n8;
                if (rect3 != null) {
                    break Label_0366;
                }
                n12 = n8;
                if (rect4 == null) {
                    break Label_0366;
                }
            }
            n12 = n8 + 1;
        }
        if (n12 > 0) {
            cjh.b(b, left, top, right, bottom);
            Object o;
            if (n12 == 2) {
                if (n == n3 && n10 == n9) {
                    o = cim.a(b, cih.u, chw.b((float)left, (float)top, (float)left2, (float)top2));
                }
                else {
                    final cig cig = new cig(b);
                    final ObjectAnimator a3 = cim.a(cig, cih.q, chw.b((float)left, (float)top, (float)left2, (float)top2));
                    final ObjectAnimator a4 = cim.a(cig, cih.r, chw.b((float)right, (float)bottom, (float)right2, (float)bottom2));
                    o = new AnimatorSet();
                    ((AnimatorSet)o).playTogether(new Animator[] { (Animator)a3, (Animator)a4 });
                    ((AnimatorSet)o).addListener((Animator$AnimatorListener)new cie(cig));
                }
            }
            else if (left == left2 && top == top2) {
                o = cim.a(b, cih.s, chw.b((float)right, (float)bottom, (float)right2, (float)bottom2));
            }
            else {
                o = cim.a(b, cih.t, chw.b((float)left, (float)top, (float)left2, (float)top2));
            }
            if (b.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup3 = (ViewGroup)b.getParent();
                cje.a(viewGroup3, true);
                this.w((cip)new cif(viewGroup3));
            }
            return (Animator)o;
        }
        return null;
    }
    
    @Override
    public final void b(final cjc cjc) {
        e(cjc);
    }
    
    @Override
    public final void c(final cjc cjc) {
        e(cjc);
    }
    
    @Override
    public final String[] d() {
        return cih.p;
    }
}
