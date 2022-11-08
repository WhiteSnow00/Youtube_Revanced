import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class geh extends gef implements ariy
{
    private arit g;
    private boolean h;
    
    public geh(final Context context) {
        super(context);
        this.b();
    }
    
    public geh(final Context context, final float n, final tpc tpc) {
        super(context, n, tpc);
        this.b();
    }
    
    public geh(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    public geh(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    public final arit a() {
        if (this.g == null) {
            this.g = new arit((View)this, false);
        }
        return this.g;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected final void b() {
        if (!this.h) {
            this.h = true;
            ((gev)this.aR()).f((InlinePlayerOverlayLayout)this);
        }
    }
}
