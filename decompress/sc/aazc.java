import android.view.ViewGroup$LayoutParams;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazc implements View$OnClickListener
{
    public final ViewGroup a;
    public final aaza b;
    public aayr c;
    public final Animation d;
    public final Animation e;
    public abjv f;
    private final CreatorEndscreenOverlayPresenter g;
    private final aazb h;
    private final int i;
    
    public aazc(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ViewGroup a) {
        context.getClass();
        this.g = creatorEndscreenOverlayPresenter;
        a.getClass();
        this.a = a;
        this.h = (aazb)creatorEndscreenOverlayPresenter;
        final LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        final aaza b = new aaza();
        this.b = b;
        b.a = layoutInflater.inflate(2131624406, (ViewGroup)creatorEndscreenOverlayPresenter.f, false);
        ((FrameLayout)b.a).setOnClickListener((View$OnClickListener)this);
        ((FrameLayout)b.a).findViewById(2131427752);
        b.b = ((FrameLayout)b.a).findViewById(2131429261);
        b.c = ((View)b.b).findViewById(2131429260);
        ((View)b.c).setOnClickListener((View$OnClickListener)this);
        b.d = ((FrameLayout)b.a).findViewById(2131429264);
        b.e = ((FrameLayout)b.a).findViewById(2131429265);
        b.f = ((FrameLayout)b.a).findViewById(2131429266);
        b.g = ((FrameLayout)b.a).findViewById(2131429259);
        b.h = ((FrameLayout)b.a).findViewById(2131429267);
        b.j = ((FrameLayout)b.a).findViewById(2131429262);
        b.k = ((FrameLayout)b.a).findViewById(2131429256);
        b.l = ((FrameLayout)b.a).findViewById(2131429257);
        final ViewGroup viewGroup = (ViewGroup)((View)b.b).findViewById(2131432017);
        b.i = ((FrameLayout)b.a).findViewById(2131429258);
        ((TextView)b.h).setOnClickListener((View$OnClickListener)this);
        ((TextView)b.i).setOnClickListener((View$OnClickListener)this);
        b.m = ((View)b.b).findViewById(2131429263);
        this.i = tpe.aZ(context.getResources().getDisplayMetrics(), 400);
        (this.d = (Animation)new AlphaAnimation(0.0f, 1.0f)).setDuration((long)context.getResources().getInteger(2131492902));
        final AlphaAnimation e = new AlphaAnimation(1.0f, 0.0f);
        (this.e = (Animation)e).setDuration((long)context.getResources().getInteger(2131492902));
        ((Animation)e).setAnimationListener((Animation$AnimationListener)new cbi(this, 19));
    }
    
    public final void a(final boolean b) {
        if (!b) {
            this.b();
            return;
        }
        if (this.b.a != null && (!this.e.hasStarted() || this.e.hasEnded())) {
            ((FrameLayout)this.b.a).clearAnimation();
            this.d.reset();
            ((FrameLayout)this.b.a).startAnimation(this.e);
        }
    }
    
    public final void b() {
        final Object a = this.b.a;
        if (a != null && ((FrameLayout)a).getParent() != null) {
            this.a.removeView((View)this.b.a);
        }
    }
    
    public final void c() {
        final abjv f = this.f;
        final abjv c = abjv.c;
        if (this.b.b == null) {
            return;
        }
        float n;
        if (f == c) {
            n = 0.6f;
        }
        else {
            n = 0.9f;
        }
        tpe.aF((View)this.b.b, tpe.aD(Math.min(this.i, (int)(this.a.getWidth() * n))), (Class)ViewGroup$LayoutParams.class);
    }
    
    public final void onClick(final View view) {
        if (view.getId() == 2131429267 || view.getId() == 2131429260) {
            this.h.r(this.c);
            return;
        }
        if (view.getId() != 2131429258 && view.getId() != 2131427743) {
            return;
        }
        this.h.q();
    }
}
