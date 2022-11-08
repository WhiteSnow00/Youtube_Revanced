import j$.util.Optional;
import j$.time.Duration;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.view.View;
import android.view.MotionEvent;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfc
{
    public final wwv a;
    public final abff b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Runnable g;
    public abfi h;
    public final qv i;
    private final absi j;
    private final abno k;
    
    public abfc(final atjj atjj, final abff b, final Handler c, final absi j, final qv i, final abno k, final byte[] array) {
        this.g = new abdq(this, 2);
        this.a = (wwv)atjj.a();
        this.b = b;
        this.c = c;
        this.j = j;
        this.i = i;
        this.k = k;
    }
    
    private static final anwx c(final abfb abfb) {
        anwx anwx;
        if (abfb.a) {
            anwx = anwx.f;
        }
        else {
            anwx = anwx.e;
        }
        return anwx;
    }
    
    public final void a(final MotionEvent motionEvent, final View view, final boolean b) {
        final aeef aeef = new aeef(motionEvent, aeef.a(motionEvent, view.getWidth(), b), b);
        final int b2 = aeef.b;
        if (b2 != 0) {
            if (this.h == null) {
                return;
            }
            int n;
            if (aeef.c) {
                if (b2 == 1) {
                    n = 123453;
                }
                else {
                    n = 123454;
                }
            }
            else if (b2 == 1) {
                n = 28240;
            }
            else {
                n = 28239;
            }
            final qv i = this.i;
            final Duration a = this.b.a();
            abfb abfb;
            if (i.b && aeef.c) {
                Optional optional;
                if (aeef.b == 1) {
                    optional = ((aays)i.a).c(abcg.f);
                }
                else {
                    optional = ((aays)i.a).d(abcg.f);
                }
                if (optional.isEmpty()) {
                    abfb = abfb.a(a);
                }
                else {
                    final abtt q = ((abno)((atjj)i.c).a()).q();
                    if (q == null) {
                        abfb = abfb.a(a);
                    }
                    else {
                        abfb = new abfb(true, Duration.ofMillis(Math.abs(((TimelineMarker)optional.get()).a - q.c())), Optional.ofNullable((Object)((TimelineMarker)optional.get()).d), true);
                    }
                }
            }
            else {
                abfb = abfb.a(a);
            }
            final Duration b3 = abfb.b;
            long millis;
            if (aeef.b == 1) {
                millis = b3.toMillis();
            }
            else {
                millis = -b3.toMillis();
            }
            final wwv a2 = this.a;
            final wws wws = new wws(wya.c(n));
            final anwx c = c(abfb);
            Optional optional2;
            if (!this.e) {
                optional2 = Optional.empty();
            }
            else {
                int d;
                if (this.k.q() == null) {
                    d = 0;
                }
                else {
                    d = (int)this.k.q().c();
                }
                if (d < 0) {
                    optional2 = Optional.empty();
                }
                else {
                    final long min = Math.min(this.k.j(), Math.max(0L, d + millis));
                    final agza builder = ((agzi)alfq.a).createBuilder();
                    builder.copyOnWrite();
                    final alfq alfq = (alfq)builder.instance;
                    alfq.c = c.H;
                    alfq.b |= 0x1;
                    builder.copyOnWrite();
                    final alfq alfq2 = (alfq)builder.instance;
                    alfq2.b |= 0x2;
                    alfq2.d = d;
                    builder.copyOnWrite();
                    final alfq alfq3 = (alfq)builder.instance;
                    alfq3.b |= 0x4;
                    alfq3.e = (int)min;
                    final alfq j = (alfq)builder.build();
                    final agza builder2 = ((agzi)alff.a).createBuilder();
                    builder2.copyOnWrite();
                    final alff alff = (alff)builder2.instance;
                    j.getClass();
                    alff.I = j;
                    alff.c |= 0x4000000;
                    optional2 = Optional.of((Object)builder2.build());
                }
            }
            a2.J(3, (wxz)wws, (alff)optional2.orElse((Object)null));
            if (this.f) {
                this.j.k(millis, c(abfb));
            }
            else {
                this.j.g(millis);
            }
            this.b.d(aeef);
            this.c.removeCallbacks(this.g);
            this.c.postDelayed(this.g, 650L);
            this.d = true;
            CharSequence b4;
            if (abfb.a && abfb.c.isPresent()) {
                b4 = (CharSequence)abfb.c.get();
            }
            else {
                b4 = this.b.b();
            }
            this.h.g(b4, aeef, abfb.d);
        }
    }
    
    public final void b() {
        this.d = false;
        this.b.c();
    }
}
