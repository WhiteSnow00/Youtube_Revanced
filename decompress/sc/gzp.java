import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gzp extends ViewGroup implements arln
{
    private aeqd a;
    private boolean b;
    
    gzp(final Context context) {
        super(context);
        this.h();
    }
    
    gzp(final Context context, final AttributeSet set) {
        super(context, set);
        this.h();
    }
    
    public gzp(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h();
    }
    
    gzp(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.h();
    }
    
    public final Object aR() {
        return this.g().aR();
    }
    
    public final aeqd g() {
        if (this.a == null) {
            this.a = new aeqd((View)this);
        }
        return this.a;
    }
    
    protected final void h() {
        if (!this.b) {
            this.b = true;
            ((gzb)this.aR()).a((AudioTrackView)this);
        }
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.g();
    }
}
