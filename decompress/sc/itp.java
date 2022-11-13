import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class itp implements View$OnLayoutChangeListener
{
    final itq a;
    private final int b;
    private int c;
    
    public itp(final itq a) {
        this.a = a;
        this.b = a.getResources().getDimensionPixelSize(2131165403);
    }
    
    public final void onLayoutChange(final View view, int c, int c2, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        c = this.c;
        c2 = n2 - c2;
        if (c != c2) {
            this.c = c2;
            final itq a = this.a;
            a.a = c2 - a.c - this.b;
            a.o(a.b.a, false, 0);
        }
    }
}
