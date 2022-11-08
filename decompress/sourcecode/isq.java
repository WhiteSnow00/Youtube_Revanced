import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class isq implements View$OnLayoutChangeListener
{
    final /* synthetic */ isr a;
    private final int b;
    private int c;
    
    public isq(final isr a) {
        this.a = a;
        this.b = a.getResources().getDimensionPixelSize(2131165403);
    }
    
    public final void onLayoutChange(final View view, int c, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        c = n3 - n;
        if (this.c != c) {
            this.c = c;
            final isr a = this.a;
            a.a = c - a.c - this.b;
            a.o(a.b.a, false, 0);
        }
    }
}
