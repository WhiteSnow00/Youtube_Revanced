import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.GridLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class ecb extends GridLayoutManager
{
    public ecb(final int n, final int n2) {
        super(n, n2);
    }
    
    public final nx rg(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof edz) {
            return (nx)new eca((edz)viewGroup$LayoutParams);
        }
        return super.rg(viewGroup$LayoutParams);
    }
}
