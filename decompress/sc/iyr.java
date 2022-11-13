import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyr implements atke
{
    public final int a;
    private final int b;
    
    public iyr(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        final int b = this.b;
        if (b == 0) {
            final int a = this.a;
            return new LinearLayout$LayoutParams(a, a);
        }
        if (b == 1) {
            final int a2 = this.a;
            return new LinearLayout$LayoutParams(a2, a2);
        }
        if (b == 2) {
            return new FrameLayout$LayoutParams(-1, this.a);
        }
        if (b == 3) {
            final int a3 = this.a;
            return new FrameLayout$LayoutParams(a3, a3);
        }
        if (b != 4) {
            return this.a;
        }
        return new FrameLayout$LayoutParams(this.a, -1);
    }
}
