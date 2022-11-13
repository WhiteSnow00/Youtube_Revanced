import android.content.res.Resources;
import j$.time.Duration;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.DurationButtonView;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxu implements View$OnClickListener
{
    public final YouTubeTextView a;
    final View b;
    public final DurationButtonView c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public uby h;
    public int i;
    public final aeea j;
    private final Context k;
    private final acwt l;
    private final YouTubeTextView m;
    private final ucb n;
    private final ubi o;
    
    public gxu(final Context k, final YouTubeTextView a, final acwt l, final View b, final YouTubeTextView m, final DurationButtonView c, final aeea j, final aujg aujg, final uby h, final ucb n, final ubi o, int n2, final int f, final int n3, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.i = -1;
        this.k = k;
        this.a = a;
        this.l = l;
        this.b = b;
        this.m = m;
        this.c = c;
        this.j = j;
        final boolean bb = aujg.bB();
        this.d = bb;
        this.h = h;
        this.n = n;
        this.o = o;
        this.e = n2;
        this.f = f;
        this.g = n3;
        n2 = n.c;
        if (n3 <= 0) {
            ttr.b("Invalid maxDurationMs");
        }
        else {
            c.c(0);
            n2 = Math.max(0, Math.min(n2, n3));
            final float n4 = (float)n2;
            c.e = n2;
            c.f = n3;
            c.a(n4 / n3, 1.0f);
            c.b(n2);
        }
        if (bb) {
            b.setVisibility(0);
        }
        c.setVisibility(0);
    }
    
    public static void c(final YouTubeTextView youTubeTextView, final String text) {
        youTubeTextView.setText((CharSequence)text);
        youTubeTextView.setVisibility(0);
        if (ValueAnimator.areAnimatorsEnabled()) {
            youTubeTextView.setAlpha(0.0f);
            youTubeTextView.animate().setStartDelay(0L).alpha(1.0f).setDuration(100L).setListener((Animator$AnimatorListener)new gxt(youTubeTextView));
            return;
        }
        youTubeTextView.setAlpha(1.0f);
        youTubeTextView.postDelayed((Runnable)new gxo(youTubeTextView, 3), 1000L);
    }
    
    public final boolean a() {
        final ShortsCreationSelectedTrack a = this.o.a();
        return !this.d || a == null;
    }
    
    public final void b(int n, final int n2) {
        n = (int)Duration.ofMillis((long)n).getSeconds();
        final Resources resources = this.k.getResources();
        final Integer value = n;
        String s = resources.getString(2132019781, new Object[] { value });
        if (n2 - 1 != 0) {
            s = this.k.getResources().getString(2132019787, new Object[] { value });
        }
        if (this.d) {
            final acwt l = this.l;
            final acwj a = acwk.a();
            a.a = this.b;
            a.f(2);
            a.m(2);
            a.o(1);
            a.k(-1);
            a.c = s;
            a.g(aezp.k((Object)this.k.getResources().getColor(2131102421)));
            l.c(a.c());
            return;
        }
        this.j.cG(xaa.c(115119)).h();
        this.a.animate().cancel();
        final float dimension = this.k.getResources().getDimension(2131169608);
        this.a.setText((CharSequence)s);
        this.a.setTranslationY(-dimension);
        this.a.setAlpha(0.0f);
        this.a.setVisibility(0);
        this.a.animate().translationY(0.0f).setStartDelay(0L).setDuration(500L).withEndAction((Runnable)new hrc(this, dimension, 1)).start();
        this.a.animate().alpha(1.0f).setStartDelay(0L).setDuration(500L).withEndAction((Runnable)new gxo(this, 2)).start();
    }
    
    public final void onClick(final View view) {
        if (!this.a()) {
            this.b(this.i, 1);
            this.j.cG(xaa.c(159418)).d();
            return;
        }
        this.j.cG(xaa.c(120988)).d();
        int n;
        if (this.n.c == (n = this.e)) {
            n = this.g;
        }
        final YouTubeTextView m = this.m;
        if (m != null) {
            c(m, this.k.getResources().getString(2132019786, new Object[] { Duration.ofMillis((long)n).getSeconds() }));
        }
        final uby h = this.h;
        if (h != null) {
            h.O(n);
            this.h.Q(n);
        }
    }
}
