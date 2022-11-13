import com.google.android.apps.youtube.app.player.overlay.SizeAdjustableOverlayWrapperLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class iwe extends FrameLayout implements arln
{
    private arli a;
    private boolean b;
    
    public iwe(final Context context) {
        super(context);
        this.f();
    }
    
    public iwe(final Context context, final AttributeSet set) {
        super(context, set);
        this.f();
    }
    
    iwe(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f();
    }
    
    iwe(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.f();
    }
    
    public final Object aR() {
        return this.e().aR();
    }
    
    public final arli e() {
        if (this.a == null) {
            this.a = new arli((View)this, false);
        }
        return this.a;
    }
    
    protected final void f() {
        if (!this.b) {
            this.b = true;
            ((iyj)this.aR()).k((SizeAdjustableOverlayWrapperLayout)this);
        }
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.e();
    }
}
