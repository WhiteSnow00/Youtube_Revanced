import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advc implements apc
{
    final int a;
    final BottomSheetBehavior b;
    
    public advc(final BottomSheetBehavior b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean a(final View view) {
        this.b.I(this.a);
        return true;
    }
}
