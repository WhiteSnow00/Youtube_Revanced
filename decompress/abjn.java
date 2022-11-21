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

public class abjn extends FrameLayout
{
    public ImageView a;
    public TextView b;
    public ObjectAnimator c;
    public boolean d;
    
    public abjn(final Context context) {
        super(context);
        new Rect();
        this.d = false;
        this.c(context, null, 0, 0);
    }
    
    public abjn(final Context context, final AttributeSet set) {
        super(context, set);
        new Rect();
        this.d = false;
        this.c(context, set, 0, 2132083530);
    }
    
    public abjn(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        new Rect();
        this.d = false;
        this.c(context, set, n, 0);
    }
    
    public abjn(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        new Rect();
        this.d = false;
        this.c(context, set, n, n2);
    }
    
    private final void b() {
        (this.c = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 0.0f, 1.0f })).setDuration((long)this.getResources().getInteger(2131492903));
        this.c.addListener((Animator$AnimatorListener)new abjm(this));
    }
    
    private final void c(final Context context, AttributeSet obtainStyledAttributes, int round, int dimensionPixelSize) {
        LayoutInflater.from(context).inflate(this.a(), (ViewGroup)this);
        this.a = (ImageView)this.findViewById(2131432010);
        this.b = (TextView)this.findViewById(2131432082);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, abjk.a, round, dimensionPixelSize);
            try {
                dimensionPixelSize = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, tqf.aZ(context.getResources().getDisplayMetrics(), 90));
                round = Math.round(dimensionPixelSize * ((TypedArray)obtainStyledAttributes).getFloat(0, 1.778f));
                tqf.aF((View)this.a, tqf.aE(round, dimensionPixelSize), (Class)ViewGroup$LayoutParams.class);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        this.b();
        tqf.v((View)this, false);
    }
    
    protected int a() {
        return 2131625317;
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b();
    }
}
