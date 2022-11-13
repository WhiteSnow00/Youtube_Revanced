import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acha implements View$OnLayoutChangeListener
{
    public boolean a;
    final achb b;
    private tpn c;
    private final int d;
    
    public acha(final achb b, final boolean b2, final int d) {
        this.b = b;
        this.c(b2);
        this.d = d;
    }
    
    public final void a(final tpn c) {
        this.c = c;
        this.b.a.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
    }
    
    public final void b() {
        if (!this.a) {
            this.b.a.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
        this.c = null;
    }
    
    public final void c(final boolean a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        if (a) {
            this.a(null);
            return;
        }
        if (this.c == null) {
            this.b.a.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final achb b = this.b;
        final tpn c = this.c;
        tpj d;
        if (this.a) {
            d = null;
        }
        else {
            d = b.d;
        }
        b.d(c, d, this.d);
    }
}
