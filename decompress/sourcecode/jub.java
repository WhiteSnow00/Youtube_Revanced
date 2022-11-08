import androidx.viewpager.widget.ViewPager;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class jub extends cko
{
    final /* synthetic */ jud a;
    
    public jub(final jud a) {
        this.a = a;
    }
    
    public final Object c(final ViewGroup viewGroup, final int n) {
        final jud a = this.a;
        final View view = a.c.get(a.b.z(n));
        this.a.b.addView(view, 0);
        return view;
    }
    
    public final void d(final ViewGroup viewGroup, final int n, final Object o) {
        ((ViewPager)this.a.b).removeView((View)o);
    }
    
    public final boolean g(final View view, final Object o) {
        return view == o;
    }
    
    public final int j() {
        return this.a.c.size();
    }
    
    public final int k(final Object o) {
        for (int i = 0; i < this.a.c.size(); ++i) {
            if (this.a.c.get(i) == o) {
                return this.a.b.z(i);
            }
        }
        return -2;
    }
}
