import android.view.View;
import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

final class anx extends anw
{
    static final aoa c;
    
    static {
        c = aoa.o(WindowInsets.CONSUMED);
    }
    
    public anx(final aoa aoa, final WindowInsets windowInsets) {
        super(aoa, windowInsets);
    }
    
    public aia a(final int n) {
        return aia.e(this.a.getInsets(anz.a(n)));
    }
    
    public aia c(final int n) {
        return aia.e(this.a.getInsetsIgnoringVisibility(anz.a(7)));
    }
    
    public final void f(final View view) {
    }
    
    public boolean l(final int n) {
        return this.a.isVisible(anz.a(8));
    }
}
