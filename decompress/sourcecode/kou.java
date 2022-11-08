import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class kou implements View$OnLayoutChangeListener
{
    final /* synthetic */ kov a;
    private final aorm b;
    private final boolean c;
    
    public kou(final kov a, final aorm b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.a.b.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        this.a.a(this.b, this.c);
    }
}
