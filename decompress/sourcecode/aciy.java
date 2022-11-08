import android.view.ViewParent;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aciy extends ache implements aciu
{
    private final acix b;
    private final agmd c;
    
    public aciy() {
        final agmd agmd = new agmd((char[])null, (byte[])null);
        final afcw b = afgm.b;
        this((Map)b, (Map)b, agmd, null, null, null, null);
    }
    
    public aciy(final Map map, final Map map2, final agmd c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(map, map2);
        this.b = new acix();
        this.c = c;
    }
    
    protected final acil a(final int n) {
        final on k = this.c.K(n);
        if (k == null) {
            return null;
        }
        if (k instanceof aciq) {
            return ((aciq)k).t;
        }
        final Object tag = k.a.getTag(2131429592);
        if (tag instanceof acil) {
            return (acil)tag;
        }
        return null;
    }
    
    public final void b(final View view) {
        final ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            zjp.b(zjo.b, zjn.b, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    zjp.b(zjo.b, zjn.b, "Cannot call removeView on a RecyclerView parent.");
                }
                else {
                    ((ViewGroup)parent).removeView(view);
                }
            }
        }
        final int p = actc.p(view);
        final acil s = actc.s(view);
        actc.w(s, (acir)this);
        final agmd c = this.c;
        aciq aciq;
        if ((aciq = (aciq)s.a().getTag(2131430569)) == null) {
            final acix b = this.b;
            b.a = s;
            aciq = (aciq)((nq)b).mS((ViewGroup)null, p);
            b.a = null;
            s.a().setTag(2131430569, (Object)aciq);
        }
        c.O((on)aciq);
    }
    
    public final agmd g() {
        return this.c;
    }
}
