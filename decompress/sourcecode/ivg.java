import com.google.android.apps.youtube.app.player.overlay.SizeAdjustableOverlayWrapperLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class ivg extends FrameLayout implements ariy
{
    private arit a;
    private boolean b;
    
    public ivg(final Context context) {
        super(context);
        this.f();
    }
    
    public ivg(final Context context, final AttributeSet set) {
        super(context, set);
        this.f();
    }
    
    ivg(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f();
    }
    
    ivg(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.f();
    }
    
    public final Object aR() {
        return this.e().aR();
    }
    
    public final arit e() {
        if (this.a == null) {
            this.a = new arit((View)this, false);
        }
        return this.a;
    }
    
    protected final void f() {
        if (!this.b) {
            this.b = true;
            ((ixl)this.aR()).k((SizeAdjustableOverlayWrapperLayout)this);
        }
    }
}
