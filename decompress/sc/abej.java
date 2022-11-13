import java.lang.ref.WeakReference;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View$OnLayoutChangeListener;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.widget.TextView;
import android.view.View;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abej extends abtz implements abek
{
    public boolean a;
    public boolean b;
    public long c;
    private final Handler d;
    private View e;
    private TextView f;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private final Runnable l;
    
    public abej(final Context context) {
        super(context);
        this.g = false;
        this.h = false;
        this.a = false;
        this.b = false;
        this.l = new aavc(this, 20);
        this.setBackgroundColor(0);
        this.setVisibility(8);
        this.setFocusable(false);
        this.setFocusableInTouchMode(false);
        anb.X((View)this, 2);
        this.d = new Handler(context.getMainLooper());
    }
    
    private final boolean k() {
        return this.e != null && this.f != null;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new abud(-1, -1, true);
    }
    
    public final void b(final boolean a) {
        this.a = a;
        if (this.h) {
            this.j(a, a ^ true);
        }
    }
    
    public final void c(final long c) {
        this.c = c;
    }
    
    public final void d(final boolean g) {
        this.g = g;
        if (this.h) {
            this.j(this.a, false);
        }
    }
    
    public final void e(final View$OnClickListener onClickListener) {
        this.i();
        final View viewById = this.e.findViewById(2131430240);
        if (viewById != null) {
            viewById.setOnClickListener(onClickListener);
        }
        final View viewById2 = this.e.findViewById(2131430237);
        if (viewById2 != null) {
            if (onClickListener != null) {
                viewById2.setVisibility(0);
                return;
            }
            viewById2.setVisibility(8);
        }
    }
    
    public final void f(final CharSequence charSequence) {
        this.i();
        this.f.setText(charSequence);
        final View viewById = this.e.findViewById(2131430240);
        if (charSequence != null && viewById != null) {
            viewById.setContentDescription(charSequence);
        }
    }
    
    public final void g() {
        if (this.k()) {
            if (this.c != 0L) {
                this.h = true;
                this.setVisibility(0);
                this.e.clearAnimation();
                this.e.setAlpha(0.0f);
                final bx ab = anb.aB(this.e);
                ab.p(1.0f);
                ab.r((Interpolator)new DecelerateInterpolator());
                ab.q(250L);
                ab.o();
                final Context context = this.getContext();
                final TextView f = this.f;
                tsy.c(context, (View)f, f.getText());
                this.addOnLayoutChangeListener((View$OnLayoutChangeListener)new zfa(this, 3));
                this.d.postDelayed(this.l, this.c);
            }
        }
    }
    
    public final void h() {
        this.i();
        final ImageView imageView = (ImageView)this.e.findViewById(2131430239);
        if (imageView != null) {
            imageView.setImageDrawable((Drawable)null);
            imageView.setVisibility(8);
        }
    }
    
    public final void i() {
        if (this.k()) {
            return;
        }
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.i = tpe.aX(displayMetrics, -24.0f);
        this.j = tpe.aX(displayMetrics, -48.0f);
        this.k = tpe.aX(displayMetrics, -16.0f);
        final View inflate = LayoutInflater.from(this.getContext()).inflate(2131624968, (ViewGroup)this);
        this.e = inflate;
        this.f = (TextView)inflate.findViewById(2131430241);
    }
    
    public final void j(final boolean b, final boolean b2) {
        if (!this.k()) {
            return;
        }
        float n;
        if (this.g) {
            n = this.j;
        }
        else {
            n = this.i;
        }
        final int height = this.getHeight();
        final int height2 = this.e.getHeight();
        if (!b) {
            n = 0.0f;
        }
        final float y = height - height2 + n + this.k;
        if (b2) {
            this.b = true;
            final bx ab = anb.aB(this.e);
            ab.r((Interpolator)new DecelerateInterpolator());
            ab.q(150L);
            final View view = (View)((WeakReference)ab.a).get();
            if (view != null) {
                view.animate().y(y);
            }
            ab.w((Runnable)new abei(this, 0));
            ab.o();
            return;
        }
        if (this.b) {
            anb.aB(this.e).n();
            this.b = false;
        }
        this.e.setY(y);
    }
    
    public final void tf(final boolean b) {
        if (this.k()) {
            if (this.h) {
                this.h = false;
                this.d.removeCallbacks(this.l);
                if (!b) {
                    this.e.clearAnimation();
                    this.setVisibility(8);
                    return;
                }
                final bx ab = anb.aB(this.e);
                ab.p(0.0f);
                ab.r((Interpolator)new DecelerateInterpolator());
                ab.q(250L);
                ab.w((Runnable)new abei(this, 1));
                ab.o();
            }
        }
    }
}
