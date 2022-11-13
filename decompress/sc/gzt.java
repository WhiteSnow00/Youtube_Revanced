import j$.time.Duration;
import android.view.View;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

final class gzt implements uel
{
    final ShortsVideoTrimView2 a;
    final View b;
    final gzu c;
    private boolean d;
    
    public gzt(final gzu c, final ShortsVideoTrimView2 a, final View b) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = false;
    }
    
    public final void a(final boolean b, final long n) {
        final txz txz = (txz)this.c.a.a();
        if (b) {
            final boolean ah = txz.ah();
            this.d = ah;
            if (ah) {
                txz.W();
            }
        }
        else {
            txz.ab(n);
            if (this.d) {
                txz.X();
            }
        }
    }
    
    public final /* bridge */ void accept(final Object o) {
        final Long n = (Long)o;
        gzu.c(this.a, this.b, Duration.ofMillis((long)n));
        ((txz)this.c.a.a()).ac((long)n, (Runnable)null);
    }
    
    public final void b() {
        gzu.d(this.a, this.b, ((txz)this.c.a.a()).J());
    }
}
