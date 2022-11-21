import android.view.ViewGroup;
import android.view.KeyEvent;
import android.view.View;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class anb
{
    public static final ArrayList a;
    public WeakHashMap b;
    public WeakReference c;
    private SparseArray d;
    
    static {
        a = new ArrayList();
    }
    
    public anb() {
        this.b = null;
        this.d = null;
        this.c = null;
    }
    
    static anb c(final View view) {
        anb anb;
        if ((anb = (anb)view.getTag(2131431941)) == null) {
            anb = new anb();
            view.setTag(2131431941, (Object)anb);
        }
        return anb;
    }
    
    public static final boolean d(final View view) {
        final ArrayList list = (ArrayList)view.getTag(2131431942);
        if (list != null) {
            int size = list.size();
            int n;
            do {
                n = size - 1;
                if (n < 0) {
                    return false;
                }
                size = n;
            } while (!((ana)list.get(n)).a());
            return true;
        }
        return false;
    }
    
    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }
    
    public final View b(final View view, final KeyEvent keyEvent) {
        final WeakHashMap b = this.b;
        if (b != null) {
            if (b.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    final ViewGroup viewGroup = (ViewGroup)view;
                    int childCount = viewGroup.getChildCount();
                    while (--childCount >= 0) {
                        final View b2 = this.b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (d(view)) {
                    return view;
                }
            }
        }
        return null;
    }
}
