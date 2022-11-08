import android.widget.Button;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import android.widget.ProgressBar;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ing extends FrameLayout
{
    public ProgressBar e;
    public TintableImageView f;
    public ProgressBar g;
    public AnimationDrawable h;
    public LottieAnimationView i;
    public Drawable j;
    public int k;
    public int l;
    public int m;
    public int n;
    public ColorStateList o;
    
    public ing(final Context context) {
        super(context);
    }
    
    public ing(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ing(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public ing(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public abstract void j(final int p0);
    
    public final void k() {
        tmy.v((View)this.i, false);
        tmy.v((View)this.f, true);
    }
    
    public final void l() {
        tmy.v((View)this.e, false);
        tmy.v((View)this.g, false);
    }
    
    public final void m(final float n) {
        this.j((int)(Math.min(n, 1.0f) * 100.0f));
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
}
