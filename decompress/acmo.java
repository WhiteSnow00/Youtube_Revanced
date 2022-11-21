import android.view.ViewParent;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmo extends acku implements acmk
{
    private final acmn b;
    private final agpw c;
    
    public acmo() {
        final agpw agpw = new agpw((char[])null, null);
        final afgm b = afkc.b;
        this(b, b, agpw, null, null, null, null);
    }
    
    public acmo(final Map map, final Map map2, final agpw c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(map, map2);
        this.b = new acmn();
        this.c = c;
    }
    
    protected final acmb a(final int n) {
        final oo k = this.c.K(n);
        if (k == null) {
            return null;
        }
        if (k instanceof acmg) {
            return ((acmg)k).t;
        }
        final Object tag = k.a.getTag(2131429592);
        if (tag instanceof acmb) {
            return (acmb)tag;
        }
        return null;
    }
    
    public final void b(final View view) {
        final ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            znh.b(zng.b, znf.b, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    znh.b(zng.b, znf.b, "Cannot call removeView on a RecyclerView parent.");
                }
                else {
                    ((ViewGroup)parent).removeView(view);
                }
            }
        }
        final int y = aamz.y(view);
        final acmb b = aamz.B(view);
        aamz.F(b, (acmh)this);
        final agpw c = this.c;
        acmg acmg;
        if ((acmg = (acmg)b.a().getTag(2131430572)) == null) {
            final acmn b2 = this.b;
            b2.a = b;
            acmg = (acmg)b2.mP((ViewGroup)null, y);
            b2.a = null;
            b.a().setTag(2131430572, (Object)acmg);
        }
        c.O(acmg);
    }
    
    public final agpw g() {
        return this.c;
    }
}
