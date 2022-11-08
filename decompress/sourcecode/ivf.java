import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class ivf extends CoordinatorLayout implements ariy
{
    private arit i;
    private boolean j;
    
    ivf(final Context context) {
        super(context);
        this.p();
    }
    
    ivf(final Context context, final AttributeSet set) {
        super(context, set);
        this.p();
    }
    
    public ivf(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final arit o() {
        if (this.i == null) {
            this.i = new arit((View)this, false);
        }
        return this.i;
    }
    
    protected final void p() {
        if (!this.j) {
            this.j = true;
            ((iuy)this.aR()).d((FullscreenEngagementPanelCoordinatorLayout)this);
        }
    }
}
