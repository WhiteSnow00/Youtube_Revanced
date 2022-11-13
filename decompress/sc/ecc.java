import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.GridLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class ecc extends GridLayoutManager
{
    public ecc(final int n, final int n2) {
        super(n, n2);
    }
    
    public final nx rm(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof eea) {
            return (nx)new ecb((eea)viewGroup$LayoutParams);
        }
        return super.rm(viewGroup$LayoutParams);
    }
}
