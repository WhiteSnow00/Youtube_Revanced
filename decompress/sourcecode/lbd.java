import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lbd extends ViewGroup implements ariy
{
    private arit a;
    private boolean b;
    
    lbd(final Context context) {
        super(context);
        this.b();
    }
    
    lbd(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    lbd(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    public lbd(final Context context, final AttributeSet set, final int n, final int n2) {
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
            ((lbh)this.aR()).i((NextGenWatchContainerLayout)this);
        }
    }
}
