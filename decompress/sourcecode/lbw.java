import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbw implements foe
{
    private final ViewGroup a;
    private final lba b;
    
    public lbw(final ViewGroup a, final lba b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final View view, final View view2) {
        gej.b();
        if (view.getParent() == null) {
            this.a.addView(view, -1, -1);
        }
        ((ViewGroup)this.b.t()).addView(view2);
    }
    
    public final void b(final View view, final View view2) {
        gej.b();
        this.a.removeView(view);
        ((ViewGroup)this.b.t()).removeView(view2);
    }
    
    public final void setAlpha(final float n) {
        this.a.setAlpha(n);
        this.b.setAlpha(n);
    }
}
