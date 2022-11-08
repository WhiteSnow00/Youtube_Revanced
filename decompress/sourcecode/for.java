import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class for extends ViewGroup implements ariy
{
    private arit a;
    private boolean b;
    
    for(final Context context) {
        super(context);
        this.d();
    }
    
    for(final Context context, final AttributeSet set) {
        super(context, set);
        this.d();
    }
    
    public for(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d();
    }
    
    for(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.d();
    }
    
    public final Object aR() {
        return this.b().aR();
    }
    
    public final arit b() {
        if (this.a == null) {
            this.a = new arit((View)this, false);
        }
        return this.a;
    }
    
    protected final void d() {
        if (!this.b) {
            this.b = true;
            final fph fph = (fph)this.aR();
            final InlineTimeBarWrapper inlineTimeBarWrapper = (InlineTimeBarWrapper)this;
            fph.r();
        }
    }
}
