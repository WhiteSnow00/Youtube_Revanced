import android.view.MotionEvent;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation$AnimationListener;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.content.Context;
import android.widget.ImageButton;
import android.view.OrientationEventListener;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arct extends FrameLayout implements View$OnTouchListener
{
    public int a;
    public boolean b;
    public Runnable c;
    public Runnable d;
    private OrientationEventListener e;
    private ImageButton f;
    
    public arct(final Context context) {
        super(context);
        this.a = -1;
        this.setOnTouchListener((View$OnTouchListener)this);
        this.setBackground((Drawable)new ColorDrawable(-12232092));
        this.removeAllViews();
        LayoutInflater.from(this.getContext()).inflate(2131625653, (ViewGroup)this, true);
        this.findViewById(2131432186).setOnClickListener((View$OnClickListener)new acun(this, 17));
        ((ImageView)this.findViewById(2131432180)).setOnClickListener((View$OnClickListener)new acun(this, 18));
        this.h();
        if (this.getResources().getConfiguration().orientation == 2) {
            this.findViewById(2131432177).setVisibility(8);
        }
        super.setVisibility(8);
    }
    
    public static boolean d(final int n) {
        return Math.abs(n - 270) < 5;
    }
    
    public static /* bridge */ void e(final arct arct) {
        arct.f(false);
    }
    
    private final void f(final boolean b) {
        this.g();
        final Animation animation = this.getAnimation();
        boolean b2 = b;
        if (animation != null) {
            if (b || animation.getStartOffset() == 0L) {
                return;
            }
            animation.setAnimationListener((Animation$AnimationListener)null);
            this.clearAnimation();
            b2 = false;
        }
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setInterpolator((Interpolator)new AccelerateInterpolator());
        ((Animation)alphaAnimation).setRepeatCount(0);
        ((Animation)alphaAnimation).setDuration(500L);
        if (b2) {
            ((Animation)alphaAnimation).setStartOffset(2000L);
        }
        ((Animation)alphaAnimation).setAnimationListener((Animation$AnimationListener)new arcs(this));
        this.startAnimation((Animation)alphaAnimation);
    }
    
    private final void g() {
        final OrientationEventListener e = this.e;
        if (e == null) {
            return;
        }
        this.a = -1;
        e.disable();
        this.e = null;
    }
    
    private final void h() {
        final ImageButton f = (ImageButton)((ViewGroup)this.findViewById(2131432179)).findViewById(2131427738);
        this.f = f;
        final Runnable d = this.d;
        if (d == null) {
            f.setVisibility(8);
            this.f.setTag((Object)null);
            this.f.setOnClickListener((View$OnClickListener)null);
            return;
        }
        f.setTag((Object)d);
        this.f.setVisibility(0);
        this.f.setOnClickListener((View$OnClickListener)new acun(this, 19));
    }
    
    public final void a() {
        if (this.getWidth() > 0 && this.getHeight() > 0 && this.a != -1 && this.e != null) {
            if (!this.b) {
                final int width = this.getWidth();
                final int height = this.getHeight();
                final boolean b = width < height;
                final int abs = Math.abs(this.a - 180);
                if (b != abs > 135) {
                    final View viewById = this.findViewById(2131432179);
                    final int width2 = viewById.getWidth();
                    final int height2 = viewById.getHeight();
                    if (this.getLayoutDirection() == 1) {
                        viewById.setPivotX(height2 - viewById.getPivotX());
                        viewById.setPivotY(width2 - viewById.getPivotY());
                    }
                    if (width < height) {
                        viewById.setRotation(90.0f);
                    }
                    else {
                        viewById.setRotation(-90.0f);
                    }
                    viewById.setTranslationX((float)((width2 - height2) / 2));
                    viewById.setTranslationY((float)((height2 - width2) / 2));
                    final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
                    layoutParams.height = width2;
                    layoutParams.width = height2;
                    viewById.requestLayout();
                }
                if (abs <= 135) {
                    this.findViewById(2131432177).setVisibility(8);
                }
                else {
                    this.findViewById(2131432177).setVisibility(0);
                }
                this.b = true;
                if (d(this.a)) {
                    this.f(true);
                }
            }
        }
    }
    
    public final void b(final Runnable d) {
        this.d = d;
        this.h();
    }
    
    public final void c(final String s) {
        final TextView textView = (TextView)this.findViewById(2131432187);
        if (s != null) {
            textView.setText((CharSequence)this.getContext().getString(2132019134, new Object[] { s }));
            return;
        }
        textView.setText((CharSequence)this.getContext().getString(2132019133));
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final OrientationEventListener e = this.e;
        if (e != null) {
            e.enable();
        }
        this.a();
    }
    
    protected final void onDetachedFromWindow() {
        final OrientationEventListener e = this.e;
        if (e != null) {
            this.a = -1;
            e.disable();
        }
        super.onDetachedFromWindow();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        return true;
    }
    
    public final void setVisibility(final int visibility) {
        final int visibility2 = this.getVisibility();
        super.setVisibility(visibility);
        if (visibility2 != visibility) {
            if (visibility == 0) {
                if (this.e == null) {
                    (this.e = new arcr(this, this.getContext())).enable();
                }
            }
            else {
                this.g();
            }
        }
    }
}
