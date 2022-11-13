import android.media.SoundPool;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.CountdownNumeralView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class gxh extends CountDownTimer
{
    final int a;
    final int b;
    final gxj c;
    
    public gxh(final gxj c, final long n, final long n2, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(n, n2);
    }
    
    public final void onFinish() {
        final gxj c = this.c;
        c.n = null;
        c.h.a();
        this.c.f.setVisibility(4);
        final pvh s = this.c.s;
        final int a = this.a;
        final int b = this.b;
        final ShortsRecordButtonView o = ((gww)s.a).O;
        if (o != null) {
            o.setVisibility(0);
        }
        final gww gww = (gww)s.a;
        gww.an = b;
        gww.E(a, true);
    }
    
    public final void onTick(final long n) {
        final CountdownNumeralView h = this.c.h;
        final boolean b = h.b;
        int n2 = -1;
        if (b) {
            final int a = h.a;
            if (a <= 0) {
                h.a();
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(a);
                h.setText((CharSequence)sb.toString());
                n2 = h.a--;
            }
        }
        final gxj c = this.c;
        if (n2 <= 0) {
            return;
        }
        final SoundPool m = c.m;
        int n3;
        if (n2 > 1) {
            n3 = c.k;
        }
        else {
            n3 = c.l;
        }
        m.play(n3, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
