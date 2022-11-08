import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.View$OnAttachStateChangeListener;
import app.revanced.integrations.sponsorblock.VotingButton;
import app.revanced.integrations.sponsorblock.ShieldButton;
import android.widget.ImageView;
import java.util.List;
import android.animation.Animator$AnimatorListener;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import android.view.ViewStub;
import android.view.View;
import android.widget.LinearLayout;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfi
{
    private static final Duration g;
    private static final Duration h;
    private static final Duration i;
    public abfn a;
    public LinearLayout b;
    public final View c;
    public final abfh d;
    public tmt e;
    public tmt f;
    private abfl j;
    private abfe k;
    private boolean l;
    private final abff m;
    private ViewStub n;
    private boolean o;
    private tmt p;
    
    static {
        g = Duration.ofMillis(200L);
        h = Duration.ofMillis(200L);
        i = Duration.ofMillis(200L);
    }
    
    public abfi(final View c, final ViewStub n, final abfh d, final abff m) {
        this.c = c;
        this.n = n;
        this.d = d;
        this.m = m;
        if (n == null) {
            this.a();
        }
    }
    
    public final void a() {
        if (this.o) {
            return;
        }
        final ViewStub n = this.n;
        if (n != null) {
            n.inflate();
            this.n = null;
        }
        final int integer = this.c.getResources().getInteger(2131492903);
        this.p = new tmt((View)this.c.findViewById(2131431941));
        this.f = new tmt((View)this.c.findViewById(2131428987), (long)integer, 8);
        final abfl j = new abfl((TapBloomView)this.p.a, 650, 0);
        this.j = j;
        j.a().addListener((Animator$AnimatorListener)new abfg(this));
        final adkk c = abfn.c();
        c.f(abfi.g);
        final Duration i = abfi.i;
        c.e((List)afcr.t((Object)abfm.a(0.0f, 1.0f, i), (Object)abfm.a(1.0f, 1.0f, abfi.h), (Object)abfm.a(1.0f, 0.0f, i)));
        c.g((List)afcr.t((Object)this.c.findViewById(2131431911), (Object)this.c.findViewById(2131431912), (Object)this.c.findViewById(2131431913)));
        this.a = c.d();
        final tmt e = new tmt((View)this.c.findViewById(2131428597));
        this.e = e;
        e.d = 300L;
        e.c = 200L;
        this.b = (LinearLayout)this.c.findViewById(2131428988);
        final abfe k = new abfe(this.c.findViewById(2131432269), this.m);
        this.k = k;
        k.f = this.l;
        this.o = true;
    }
    
    public final void b() {
        this.e.a(true);
        this.p.a(true);
        this.f.a(true);
        this.d.L();
    }
    
    public final void c(final boolean b) {
        ShieldButton.changeVisibilityNegatedImmediate(b);
        VotingButton.changeVisibilityNegatedImmediate(b);
        this.l = b;
        if (this.o) {
            this.k.f = b;
        }
    }
    
    public final void d(final View$OnAttachStateChangeListener view$OnAttachStateChangeListener) {
        this.c.addOnAttachStateChangeListener(view$OnAttachStateChangeListener);
    }
    
    public final void e(final boolean b) {
        this.f(b, 0);
    }
    
    public final void f(final boolean b, int n) {
        this.a();
        if (b) {
            final abfe k = this.k;
            if (!k.h) {
                final int integer = k.d.getResources().getInteger(2131492903);
                k.g = (TextView)k.d.findViewById(2131432262);
                k.i = new tmt((View)k.d.findViewById(2131432269), (long)integer, 8);
                k.b = k.a(2131432265, 2131432264, 2131432263);
                k.c = k.a(2131432268, 2131432267, 2131432266);
                k.h = true;
            }
            final TextView g = k.g;
            final abff e = k.e;
            String text;
            if (n == 1) {
                text = e.a.getString(2132017696);
            }
            else {
                n = (int)e.a().getSeconds();
                text = e.a.getQuantityString(2131886173, n, new Object[] { n });
            }
            g.setText((CharSequence)text);
            k.i.b(true);
            k.i.g((tpf)new iut(k, 10));
            return;
        }
        final abfe i = this.k;
        if (!i.h) {
            return;
        }
        i.i.a(true);
        i.b.a();
        i.c.a();
        i.g.removeCallbacks((Runnable)new abdq(i, 3));
    }
    
    public final void g(final CharSequence text, final aeef aeef, final boolean b) {
        this.a();
        int a;
        if (aeef.b == 1) {
            a = 1;
        }
        else {
            a = 0;
        }
        ((CircularClipTapBloomView)this.p.a).invalidate();
        ((TextView)this.f.a).setText(text);
        float n;
        if (b) {
            n = 0.0f;
        }
        else {
            n = this.c.getWidth() * 0.25f;
        }
        ((TextView)this.f.a).setWidth(this.c.getWidth() / 2);
        final TextView textView = (TextView)this.f.a;
        float translationX;
        if (a != 0) {
            translationX = n;
        }
        else {
            translationX = -n;
        }
        textView.setTranslationX(translationX);
        final LinearLayout b2 = this.b;
        float translationX2 = n;
        if (a == 0) {
            translationX2 = -n;
        }
        b2.setTranslationX(translationX2);
        final LinearLayout b3 = this.b;
        float scaleX;
        if (a == 0) {
            scaleX = -1.0f;
        }
        else {
            scaleX = 1.0f;
        }
        b3.setScaleX(scaleX);
        final CircularClipTapBloomView circularClipTapBloomView = (CircularClipTapBloomView)this.p.a;
        circularClipTapBloomView.a = a;
        circularClipTapBloomView.a(b);
        this.d.K();
        this.e.b(true);
        this.j.b((int)((MotionEvent)aeef.d).getX(), (int)((MotionEvent)aeef.d).getY());
        this.a.b();
        this.p.b(true);
        this.f.b(true);
    }
}
