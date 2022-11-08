import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dod implements ViewTreeObserver$OnPreDrawListener
{
    private final WeakReference a;
    private final /* synthetic */ int b;
    
    public dod(final cdn cdn, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = new WeakReference((T)cdn);
    }
    
    public dod(final maw maw, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = new WeakReference((T)maw);
    }
    
    public final boolean onPreDraw() {
        final int b = this.b;
        final int n = 0;
        int i = 0;
        if (b != 0) {
            final cdn cdn = (cdn)this.a.get();
            if (cdn != null) {
                if (!((List)cdn.a).isEmpty()) {
                    final int g = cdn.G();
                    final int f = cdn.F();
                    if (cdn.I(g, f)) {
                        for (ArrayList list = new ArrayList((Collection<?>)cdn.a); i < list.size(); ++i) {
                            ((dob)list.get(i)).g(g, f);
                        }
                        cdn.H();
                    }
                }
            }
            return true;
        }
        final maw maw = (maw)this.a.get();
        if (maw != null) {
            if (!((List)maw.b).isEmpty()) {
                final int w = maw.w();
                final int v = maw.v();
                if (maw.y(w, v)) {
                    final ArrayList list2 = new ArrayList((Collection<?>)maw.b);
                    for (int size = list2.size(), j = n; j < size; ++j) {
                        ((dob)list2.get(j)).g(w, v);
                    }
                    maw.x();
                }
            }
        }
        return true;
    }
}
