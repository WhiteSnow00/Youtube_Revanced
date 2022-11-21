import java.util.Collection;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciu
{
    static final ArrayList a;
    private static final ciq b;
    private static final ThreadLocal c;
    
    static {
        b = new cix(null);
        c = new ThreadLocal();
        a = new ArrayList();
    }
    
    static abi a() {
        final ThreadLocal c = ciu.c;
        final WeakReference weakReference = c.get();
        if (weakReference != null) {
            final abi abi = (abi)weakReference.get();
            if (abi != null) {
                return abi;
            }
        }
        final abi abi2 = new abi();
        c.set(new WeakReference(abi2));
        return abi2;
    }
    
    public static void b(final ViewGroup viewGroup, final ciq ciq) {
        final ArrayList a = ciu.a;
        if (!a.contains(viewGroup) && anc.ao((View)viewGroup)) {
            a.add(viewGroup);
            ciq b;
            if ((b = ciq) == null) {
                b = ciu.b;
            }
            final ciq h = b.h();
            final ArrayList list = (ArrayList)((abp)a()).get((Object)viewGroup);
            if (list != null && list.size() > 0) {
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((ciq)list.get(i)).q((View)viewGroup);
                }
            }
            if (h != null) {
                h.m(viewGroup, true);
            }
            if (viewGroup.getTag(2131432179) != null) {
                throw null;
            }
            viewGroup.setTag(2131432179, (Object)null);
            if (h != null && viewGroup != null) {
                final cit cit = new cit(h, viewGroup);
                viewGroup.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)cit);
                viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)cit);
            }
        }
    }
    
    public static void c(final ViewGroup viewGroup) {
        ciu.a.remove(viewGroup);
        final ArrayList list = (ArrayList)((abp)a()).get((Object)viewGroup);
        if (list != null && !list.isEmpty()) {
            final ArrayList list2 = new ArrayList(list);
            int size = list2.size();
            while (--size >= 0) {
                ((ciq)list2.get(size)).p(viewGroup);
            }
        }
    }
}
