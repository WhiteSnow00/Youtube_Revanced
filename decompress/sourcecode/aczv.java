import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczv implements View$OnLayoutChangeListener
{
    private final /* synthetic */ int b;
    
    static {
        a = new aczv(1);
    }
    
    public aczv(final int b) {
        this.b = b;
    }
    
    public final void onLayoutChange(final View view, int i, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (this.b != 0) {
            i = jac.i;
            i = view.getWidth() / 2;
            view.setPadding(i, 0, i, 0);
            return;
        }
        throw null;
    }
}
