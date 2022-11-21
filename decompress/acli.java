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

public final class acli extends acku
{
    private final SparseArray b;
    
    public acli() {
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
    
    protected final acmb a(final int n) {
        return this.g(n).poll();
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
        if (y != -1) {
            if (b != null) {
                aamz.F(b, (acmh)this);
                this.g(y).offer(b);
            }
        }
    }
}
