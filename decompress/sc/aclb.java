import android.view.ViewParent;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aclb extends acjh implements ackx
{
    private final acla b;
    private final agoe c;
    
    public aclb() {
        final agoe agoe = new agoe((char[])null, null);
        final afev b = afim.b;
        this(b, b, agoe, null, null, null, null);
    }
    
    public aclb(final Map map, final Map map2, final agoe c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(map, map2);
        this.b = new acla();
        this.c = c;
    }
    
    protected final acko a(final int n) {
        final on k = this.c.K(n);
        if (k == null) {
            return null;
        }
        if (k instanceof ackt) {
            return ((ackt)k).t;
        }
        final Object tag = k.a.getTag(2131429592);
        if (tag instanceof acko) {
            return (acko)tag;
        }
        return null;
    }
    
    public final void b(final View view) {
        final ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            zlm.b(zll.b, zlk.b, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    zlm.b(zll.b, zlk.b, "Cannot call removeView on a RecyclerView parent.");
                }
                else {
                    ((ViewGroup)parent).removeView(view);
                }
            }
        }
        final int v = aald.v(view);
        final acko y = aald.y(view);
        aald.C(y, (acku)this);
        final agoe c = this.c;
        ackt ackt;
        if ((ackt = (ackt)y.a().getTag(2131430572)) == null) {
            final acla b = this.b;
            b.a = y;
            ackt = (ackt)((nq)b).mS((ViewGroup)null, v);
            b.a = null;
            y.a().setTag(2131430572, (Object)ackt);
        }
        c.O(ackt);
    }
    
    public final agoe g() {
        return this.c;
    }
}
