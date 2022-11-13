import android.view.View;
import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

final class any extends anx
{
    static final aob c;
    
    static {
        c = aob.o(WindowInsets.CONSUMED);
    }
    
    public any(final aob aob, final WindowInsets windowInsets) {
        super(aob, windowInsets);
    }
    
    public aib a(final int n) {
        return aib.e(this.a.getInsets(aoa.a(n)));
    }
    
    public aib c(final int n) {
        return aib.e(this.a.getInsetsIgnoringVisibility(aoa.a(7)));
    }
    
    public final void f(final View view) {
    }
    
    public boolean l(final int n) {
        return this.a.isVisible(aoa.a(8));
    }
}
