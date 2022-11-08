import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class fjr extends FrameLayout implements ariy
{
    private arit a;
    private boolean b;
    
    public fjr(final Context context) {
        super(context);
        this.b();
    }
    
    fjr(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    public fjr(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    fjr(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b();
    }
    
    public final arit a() {
        if (this.a == null) {
            this.a = new arit((View)this, false);
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected final void b() {
        if (!this.b) {
            this.b = true;
            ((fjw)this.aR()).l((SpecificNetworkErrorViewLoadingFrameLayout)this);
        }
    }
}
