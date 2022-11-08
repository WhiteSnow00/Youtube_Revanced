import android.content.Context;
import android.widget.EdgeEffect;

// 
// Decompiled by Procyon v0.6.0
// 

final class fqv extends EdgeEffect
{
    private final EdgeEffect a;
    
    public fqv(final Context context, final EdgeEffect a) {
        super(context);
        this.a = a;
    }
    
    public final void finish() {
        super.finish();
        this.a.finish();
    }
    
    public final void onAbsorb(final int n) {
        super.onAbsorb(n);
        this.a.onAbsorb(n);
    }
    
    public final void onPull(final float n) {
        super.onPull(n);
        this.a.onPull(n);
    }
    
    public final void onPull(final float n, final float n2) {
        super.onPull(n, n2);
        this.a.onPull(n, n2);
    }
    
    public final float onPullDistance(final float n, final float n2) {
        this.a.onPullDistance(n, n2);
        return super.onPullDistance(n, n2);
    }
    
    public final void onRelease() {
        super.onRelease();
        this.a.onRelease();
    }
}
