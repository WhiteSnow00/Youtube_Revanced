import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxu implements cku
{
    public int a;
    public int b;
    private final WeakReference c;
    
    public adxu(final TabLayout tabLayout) {
        this.c = new WeakReference((T)tabLayout);
    }
    
    public final void a(final int b) {
        this.a = this.b;
        this.b = b;
    }
    
    public final void b(final int n, final float n2, int b) {
        final TabLayout tabLayout = (TabLayout)this.c.get();
        if (tabLayout != null) {
            b = this.b;
            boolean b2 = false;
            final boolean b3 = b != 2 || this.a == 1;
            if (b != 2 || this.a != 0) {
                b2 = true;
            }
            tabLayout.l(n, n2, b3, b2);
        }
    }
    
    public final void c(final int n) {
        final TabLayout tabLayout = (TabLayout)this.c.get();
        if (tabLayout != null && tabLayout.a() != n && n < tabLayout.b()) {
            final int b = this.b;
            boolean b2 = true;
            if (b != 0) {
                b2 = (b == 2 && this.a == 0 && b2);
            }
            tabLayout.j(tabLayout.c(n), b2);
        }
    }
}
