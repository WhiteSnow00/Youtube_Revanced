import java.lang.ref.WeakReference;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advf
{
    public int a;
    public boolean b;
    public final BottomSheetBehavior c;
    private final Runnable d;
    
    public advf(final BottomSheetBehavior c) {
        this.c = c;
        this.d = new adps(this, 10);
    }
    
    public final void a(final int a) {
        final WeakReference d = this.c.D;
        if (d != null) {
            if (d.get() != null) {
                this.a = a;
                if (!this.b) {
                    anc.I((View)this.c.D.get(), this.d);
                    this.b = true;
                }
            }
        }
    }
}
