import android.view.ViewParent;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import java.util.LinkedList;
import java.util.Queue;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjv extends acjh
{
    private final SparseArray b;
    
    public acjv() {
        this.b = new SparseArray(16);
    }
    
    private final Queue g(final int n) {
        Queue queue;
        if ((queue = (Queue)this.b.get(n)) == null) {
            queue = new LinkedList();
            this.b.put(n, (Object)queue);
        }
        return queue;
    }
    
    protected final acko a(final int n) {
        return this.g(n).poll();
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
        if (v != -1) {
            if (y != null) {
                aald.C(y, (acku)this);
                this.g(v).offer(y);
            }
        }
    }
}
