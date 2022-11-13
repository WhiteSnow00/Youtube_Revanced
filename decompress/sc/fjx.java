import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class fjx extends FrameLayout implements arln
{
    private arli a;
    private boolean b;
    
    public fjx(final Context context) {
        super(context);
        this.b();
    }
    
    fjx(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    public fjx(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    fjx(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b();
    }
    
    public final arli a() {
        if (this.a == null) {
            this.a = new arli((View)this, false);
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected final void b() {
        if (!this.b) {
            this.b = true;
            ((fkc)this.aR()).l((SpecificNetworkErrorViewLoadingFrameLayout)this);
        }
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
    }
}
