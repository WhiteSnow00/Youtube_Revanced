import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duy extends ckx
{
    public final WeakReference a;
    public final WeakReference b;
    
    public duy(final ComponentTree componentTree, final ViewPager viewPager) {
        this.a = new WeakReference((T)componentTree);
        this.b = new WeakReference((T)viewPager);
    }
    
    public final void b(final int n, final float n2, final int n3) {
        final ComponentTree componentTree = (ComponentTree)this.a.get();
        if (componentTree != null) {
            componentTree.k();
        }
    }
}
