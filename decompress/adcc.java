import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcc implements View$OnLayoutChangeListener
{
    final View a;
    final akdp b;
    final Object c;
    final adce d;
    
    public adcc(final adce d, final View a, final akdp b, final Object c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.d.a(this.a)) {
            this.d.b(this.b, this.a, this.c);
            this.a.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
    }
}
