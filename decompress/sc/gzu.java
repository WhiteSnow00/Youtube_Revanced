import java.util.concurrent.TimeUnit;
import j$.util.Optional;
import j$.time.Duration;
import android.view.View;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzu
{
    public final atke a;
    public udg b;
    public rff c;
    public ShortsVideoTrimView2 d;
    public View e;
    boolean f;
    public final fzw g;
    private final asid h;
    private final asiq i;
    private final msr j;
    private final aeea k;
    
    public gzu(final atke a, final msr j, final asid h, final fzw g, final wyw wyw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = new asiq();
        this.a = a;
        this.j = j;
        this.h = h;
        this.g = g;
        this.k = new aeea(wyw, (byte[])null);
    }
    
    public static final void c(final ShortsVideoTrimView2 shortsVideoTrimView2, final View view, final Duration duration) {
        final long a = afsp.a(duration);
        final qyu v = shortsVideoTrimView2.v;
        Optional optional;
        if (v != null && shortsVideoTrimView2.u.width() != 0) {
            optional = Optional.of((Object)(shortsVideoTrimView2.u.left + (int)(v.b(a) * shortsVideoTrimView2.u.width())));
        }
        else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            view.setVisibility(0);
            view.setX((float)(int)optional.get());
            return;
        }
        view.setVisibility(8);
    }
    
    public static final void d(final ShortsVideoTrimView2 shortsVideoTrimView2, final View view, final long n) {
        final Duration ofMillis = Duration.ofMillis(n);
        shortsVideoTrimView2.H(afsp.a(ofMillis));
        c(shortsVideoTrimView2, view, ofMillis);
    }
    
    private final boolean f() {
        return this.i.a() > 0;
    }
    
    public final void a() {
        if (this.f) {
            if (this.f()) {
                this.i.b();
                final ShortsVideoTrimView2 d = this.d;
                if (d != null) {
                    d.H = null;
                }
            }
        }
    }
    
    public final void b() {
        if (this.f) {
            if (!this.f()) {
                final ShortsVideoTrimView2 d = this.d;
                final View e = this.e;
                if (d != null && e != null) {
                    d(d, e, ((txz)this.a.a()).J());
                    this.i.c(((txz)this.a.a()).N().q(tpe.cl(this.j.K())).aH((asjm)new fdu(d, e, 11)));
                    this.i.c(asht.W(10L, 10L, TimeUnit.MILLISECONDS, atjj.a()).q(tpe.cl(this.j.K())).af(this.h).aH((asjm)new gng(this, d, e, 3)));
                    d.H = (uel)new gzt(this, d, e);
                }
            }
        }
    }
    
    public final twx e() {
        return this.k.cG(xaa.c(161363));
    }
}
