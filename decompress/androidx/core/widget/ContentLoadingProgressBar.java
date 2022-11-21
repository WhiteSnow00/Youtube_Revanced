// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Runnable e;
    public final Runnable f;
    
    public ContentLoadingProgressBar(final Context context) {
        this(context, null);
    }
    
    public ContentLoadingProgressBar(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = (Runnable)new uw(this, 16);
        this.f = (Runnable)new uw(this, 17);
    }
    
    private final void c() {
        this.removeCallbacks(this.e);
        this.removeCallbacks(this.f);
    }
    
    public final void a() {
        this.post((Runnable)new uw(this, 15));
    }
    
    public final void b() {
        this.post((Runnable)new uw(this, 14));
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }
}
