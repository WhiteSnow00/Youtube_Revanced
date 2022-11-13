import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gzq extends ViewGroup implements arln
{
    private aeqd a;
    private boolean b;
    
    gzq(final Context context) {
        super(context);
        this.i();
    }
    
    public gzq(final Context context, final AttributeSet set) {
        super(context, set);
        this.i();
    }
    
    gzq(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.i();
    }
    
    gzq(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.i();
    }
    
    public final Object aR() {
        return this.h().aR();
    }
    
    public final aeqd h() {
        if (this.a == null) {
            this.a = new aeqd((View)this);
        }
        return this.a;
    }
    
    protected final void i() {
        if (!this.b) {
            this.b = true;
            ((gzo)this.aR()).b((TextTrackView)this);
        }
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.h();
    }
}
