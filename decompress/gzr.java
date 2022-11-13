import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class gzr extends FrameLayout implements arln
{
    private aeqd a;
    private boolean b;
    
    gzr(final Context context) {
        super(context);
        this.b();
    }
    
    gzr(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    public gzr(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b();
    }
    
    gzr(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b();
    }
    
    public final aeqd a() {
        if (this.a == null) {
            this.a = new aeqd((View)this);
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected final void b() {
        if (!this.b) {
            this.b = true;
            ((gzv)this.aR()).c((TimelineSeekBar)this);
        }
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
    }
}
