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

public final class abij
{
    private static final Duration g;
    private static final Duration h;
    private static final Duration i;
    public abip a;
    public LinearLayout b;
    public final View c;
    public final abii d;
    public tqa e;
    public tqa f;
    private abim j;
    private abif k;
    private boolean l;
    private final abig m;
    private ViewStub n;
    private boolean o;
    private tqa p;
    
    static {
        g = Duration.ofMillis(200L);
        h = Duration.ofMillis(200L);
        i = Duration.ofMillis(200L);
    }
    
    public abij(final View c, final ViewStub n, final abii d, final abig m) {
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
        this.p = new tqa((View)this.c.findViewById(2131431945));
        this.f = new tqa((View)this.c.findViewById(2131428987), (long)integer, 8);
        final abim j = new abim((TapBloomView)this.p.a, 650, 0);
        this.j = j;
        j.a().addListener((Animator$AnimatorListener)new abih(this));
        final abio a = abip.a();
        a.c(abij.g);
        final Duration i = abij.i;
        a.b(afgh.t(abin.a(0.0f, 1.0f, i), abin.a(1.0f, 1.0f, abij.h), abin.a(1.0f, 0.0f, i)));
        a.d(afgh.t(this.c.findViewById(2131431915), this.c.findViewById(2131431916), this.c.findViewById(2131431917)));
        this.a = a.a();
        final tqa e = new tqa((View)this.c.findViewById(2131428597));
        this.e = e;
        e.d = 300L;
        e.c = 200L;
        this.b = (LinearLayout)this.c.findViewById(2131428988);
        final abif k = new abif(this.c.findViewById(2131432273), this.m);
        this.k = k;
        k.f = this.l;
        this.o = true;
    }
    
    public final void b() {
        this.e.a(true);
        this.p.a(true);
        this.f.a(true);
        this.d.M();
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
            final abif k = this.k;
            if (!k.h) {
                final int integer = k.d.getResources().getInteger(2131492903);
                k.g = (TextView)k.d.findViewById(2131432266);
                k.i = new tqa((View)k.d.findViewById(2131432273), (long)integer, 8);
                k.b = k.a(2131432269, 2131432268, 2131432267);
                k.c = k.a(2131432272, 2131432271, 2131432270);
                k.h = true;
            }
            final TextView g = k.g;
            final abig e = k.e;
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
            k.i.g((tsl)new iwb(k, 10));
            return;
        }
        final abif i = this.k;
        if (!i.h) {
            return;
        }
        i.i.a(true);
        i.b.b();
        i.c.b();
        i.g.removeCallbacks((Runnable)new abgl(i, 4));
    }
    
    public final void g(final CharSequence text, final aehz aehz, final boolean b) {
        this.a();
        final int b2 = aehz.b;
        ((CircularClipTapBloomView)this.p.a).invalidate();
        ((TextView)this.f.a).setText(text);
        float n;
        if (b) {
            n = 0.0f;
        }
        else {
            n = this.c.getWidth() * 0.25f;
        }
        int a;
        if (b2 == 1) {
            a = 1;
        }
        else {
            a = 0;
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
        final LinearLayout b3 = this.b;
        float translationX2 = n;
        if (a == 0) {
            translationX2 = -n;
        }
        b3.setTranslationX(translationX2);
        final LinearLayout b4 = this.b;
        float scaleX;
        if (a == 0) {
            scaleX = -1.0f;
        }
        else {
            scaleX = 1.0f;
        }
        b4.setScaleX(scaleX);
        final CircularClipTapBloomView circularClipTapBloomView = (CircularClipTapBloomView)this.p.a;
        circularClipTapBloomView.a = a;
        circularClipTapBloomView.a(b);
        this.d.L();
        this.e.b(true);
        this.j.b((int)((MotionEvent)aehz.d).getX(), (int)((MotionEvent)aehz.d).getY());
        this.a.c();
        this.p.b(true);
        this.f.b(true);
    }
}
