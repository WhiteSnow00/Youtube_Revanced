import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public class jsu extends RtlAwareViewPager implements ariy
{
    private arit h;
    private boolean k;
    
    public jsu(final Context context) {
        super(context);
        this.y();
    }
    
    public jsu(final Context context, final AttributeSet set) {
        super(context, set);
        this.y();
    }
    
    public final Object aR() {
        return this.x().aR();
    }
    
    public final arit x() {
        if (this.h == null) {
            this.h = new arit((View)this, false);
        }
        return this.h;
    }
    
    protected final void y() {
        if (!this.k) {
            this.k = true;
            ((jtq)this.aR()).h((MainRtlAwareViewPager)this);
        }
    }
}
