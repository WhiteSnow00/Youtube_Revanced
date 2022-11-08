import java.util.Iterator;
import j$.util.Optional;
import androidx.mediarouter.app.MediaRouteButton;
import android.widget.TextView;
import android.text.Spanned;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import java.util.function.Consumer;
import android.text.Html;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.tutorial.ClingTutorialView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kri implements fwy, xlk
{
    public final fwz a;
    public ViewGroup b;
    public ClingTutorialView c;
    private final Activity d;
    private final hzz e;
    private final atjj f;
    private final atjj g;
    private final a h;
    
    public kri(final Activity d, final a h, final fwz a, final hzz e, final atjj f, final atjj g, final byte[] array) {
        d.getClass();
        this.d = d;
        this.h = h;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a() {
        this.a.d();
    }
    
    public final int c() {
        return 5500;
    }
    
    public final void d() {
        final ClingTutorialView c = this.c;
        if (c != null) {
            c.b();
            this.b.removeView((View)this.c);
        }
    }
    
    public final void e() {
        if (this.b == null) {
            ViewGroup b;
            if ((b = (ViewGroup)this.d.getWindow().findViewById(2131427411)) == null) {
                b = (ViewGroup)this.d.getWindow().getDecorView();
            }
            this.b = b;
        }
        ClingTutorialView clingTutorialView;
        if ((clingTutorialView = this.c) == null) {
            final ClingTutorialView c = (ClingTutorialView)this.d.getLayoutInflater().inflate(2131625650, this.b).findViewById(2131432202);
            this.c = c;
            c.d = new qpt(this);
            final Spanned fromHtml = Html.fromHtml(this.d.getString(2132017874));
            final TextView b2 = c.b;
            if (b2 != null) {
                b2.setText((CharSequence)fromHtml);
            }
            clingTutorialView = this.c;
            clingTutorialView.c = 1000;
        }
        if (this.b.indexOfChild((View)clingTutorialView) < 0) {
            this.b.addView((View)this.c);
        }
        this.e.b().ifPresent((Consumer)new jpl(this, 13));
        final ClingTutorialView c2 = this.c;
        if (c2.getVisibility() == 0) {
            c2.setAnimation((Animation)null);
            return;
        }
        c2.setVisibility(0);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)alphaAnimation).setDuration((long)c2.c);
        c2.startAnimation((Animation)alphaAnimation);
    }
    
    public final boolean f() {
        final Optional b = this.e.b();
        boolean b2 = false;
        Label_0116: {
            if (b.isPresent() && ((MediaRouteButton)b.get()).isShown()) {
                final dmk dmk = (dmk)this.f.a();
                if (dmk.x() != null) {
                    final dmk dmk2 = (dmk)this.f.a();
                    final Iterator iterator = dmk.x().iterator();
                    while (iterator.hasNext()) {
                        if (((xfw)this.g.a()).E((ccs)iterator.next())) {
                            b2 = true;
                            break Label_0116;
                        }
                    }
                }
            }
            b2 = false;
        }
        if (b2) {
            final a h = this.h;
            if (h != null) {
                return ((fyx)((atjj)h.a).a()).t() && !((fai)h.b).m() && !((fai)h.b).i();
            }
        }
        return b2;
    }
}
