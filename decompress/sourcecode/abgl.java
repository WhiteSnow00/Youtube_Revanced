import android.content.res.TypedArray;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.animation.Animator$AnimatorListener;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.content.Context;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class abgl extends FrameLayout
{
    public ImageView a;
    public TextView b;
    public ObjectAnimator c;
    public boolean d;
    
    public abgl(final Context context) {
        super(context);
        new Rect();
        this.d = false;
        this.c(context, null, 0, 0);
    }
    
    public abgl(final Context context, final AttributeSet set) {
        super(context, set);
        new Rect();
        this.d = false;
        this.c(context, set, 0, 2132083530);
    }
    
    public abgl(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        new Rect();
        this.d = false;
        this.c(context, set, n, 0);
    }
    
    public abgl(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        new Rect();
        this.d = false;
        this.c(context, set, n, n2);
    }
    
    private final void b() {
        (this.c = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 0.0f, 1.0f })).setDuration((long)this.getResources().getInteger(2131492903));
        this.c.addListener((Animator$AnimatorListener)new abgk(this));
    }
    
    private final void c(final Context context, AttributeSet obtainStyledAttributes, int round, int dimensionPixelSize) {
        LayoutInflater.from(context).inflate(this.a(), (ViewGroup)this);
        this.a = (ImageView)this.findViewById(2131432006);
        this.b = (TextView)this.findViewById(2131432078);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, abgi.a, round, dimensionPixelSize);
            try {
                dimensionPixelSize = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, tmy.aZ(context.getResources().getDisplayMetrics(), 90));
                round = Math.round(dimensionPixelSize * ((TypedArray)obtainStyledAttributes).getFloat(0, 1.778f));
                tmy.aF((View)this.a, tmy.aE(round, dimensionPixelSize), (Class)ViewGroup$LayoutParams.class);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        this.b();
        tmy.v((View)this, false);
    }
    
    protected int a() {
        return 2131625310;
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b();
    }
}
