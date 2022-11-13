import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class iwd extends CoordinatorLayout implements arln
{
    private arli i;
    private boolean j;
    
    iwd(final Context context) {
        super(context);
        this.p();
    }
    
    iwd(final Context context, final AttributeSet set) {
        super(context, set);
        this.p();
    }
    
    public iwd(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.o();
    }
    
    public final arli o() {
        if (this.i == null) {
            this.i = new arli((View)this, false);
        }
        return this.i;
    }
    
    protected final void p() {
        if (!this.j) {
            this.j = true;
            ((ivx)this.aR()).d((FullscreenEngagementPanelCoordinatorLayout)this);
        }
    }
}
