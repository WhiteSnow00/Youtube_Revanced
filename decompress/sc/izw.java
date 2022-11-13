import com.google.android.libraries.youtube.player.ui.PlayerView;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izw implements fnw, gew, fju, iyo, fof, abcj, tgg
{
    public final izv a;
    public final PlaybackLifecycleMonitor b;
    public final fjv c;
    public izu d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final vai h;
    public final qv i;
    public final msr j;
    private final tgd k;
    private final abpu l;
    private final asiq m;
    private final boolean n;
    private izu o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final iri s;
    
    public izw(final izv a, final PlaybackLifecycleMonitor b, final qv i, final msr j, final tgd k, final abpu l, final iri s, final fjv c, final vai vai, final vai h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.k = k;
        this.l = l;
        this.j = j;
        this.s = s;
        this.c = c;
        this.m = new asiq();
        this.h = h;
        this.n = vai.bB();
    }
    
    private final void i() {
        if (this.n) {
            if (this.q) {
                this.a.q(null);
                return;
            }
        }
        else if (this.q) {
            final izu o = this.o;
            if (o != null) {
                this.a.q(o);
                return;
            }
        }
        this.a.q(this.d);
    }
    
    public final void a(final aiqj aiqj, final aotp aotp, final Bitmap bitmap) {
        if (aiqj != null) {
            this.d = new izu(abjr.e(aiqj), aotp, bitmap);
            this.i();
        }
    }
    
    public final void b(final int n) {
        if (n == 0) {
            this.d = null;
            this.i();
        }
        else if (n == 1) {
            this.p = false;
        }
        this.h();
    }
    
    public final void f(final boolean p) {
        if (this.p == p) {
            return;
        }
        this.p = p;
        this.h();
    }
    
    public final void g(final aotp aotp) {
        final izu d = this.d;
        if (d != null && aotp != null) {
            this.d = new izu(d.a, aotp, (Bitmap)null);
            this.i();
        }
    }
    
    public final void h() {
        if (this.n && this.q) {
            this.a.mk();
            return;
        }
        final int b = this.b.b;
        final YouTubePlayerViewNotForReflection r = ((iru)this.s.b()).R;
        final izu d = this.d;
        int n = 0;
        if (d != null) {
            n = n;
            if (d.c != null) {
                n = 1;
            }
        }
        if (!this.f && !this.g && this.i.b && b != 1 && b != 5 && ((b != 3 && this.a.c == null) || r == null || ((PlayerView)r).d.D()) && (!this.e || b != 3 || n == 0) && !this.r && (!this.q || b == 2 || b == 4) && !this.p) {
            this.a.mk();
            return;
        }
        this.a.mm();
    }
    
    public final void lV() {
        this.m.b();
        this.k.m((Object)this);
        this.h();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final foo foo = (foo)o;
            final izu d = this.d;
            array = null;
            if (d != null) {
                if (TextUtils.equals((CharSequence)d.a, (CharSequence)foo.a())) {
                    this.a.Y();
                    return null;
                }
                array = array;
            }
        }
        else {
            array = new Class[] { foo.class };
        }
        return array;
    }
    
    public final void n(final fkr fkr) {
        final boolean q = this.q;
        final boolean r = this.r;
        this.q = this.c.j().e();
        final boolean r2 = this.c.j() == fkr.h;
        this.r = r2;
        final boolean q2 = this.q;
        if (q2 == q && r2 == r) {
            return;
        }
        if (q2 != q) {
            this.i();
        }
        this.h();
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void q(final gel gel, final int n, final int n2) {
        if (n2 == 0) {
            this.o = null;
            return;
        }
        if (n2 == 2) {
            if (this.n) {
                this.o = null;
            }
            else {
                final glm b = gel.b;
                this.o = new izu(b.i(), b.g(), (Bitmap)null);
            }
            this.i();
            this.h();
        }
    }
    
    public final void qG() {
        final asiq m = this.m;
        final abpu l = this.l;
        final asir an = ((ashi)l.cc().j).an((asjm)new izs(this, 3), (asjm)ixp.i);
        asir asir;
        if (((vai)l.ci().g).bw()) {
            asir = ((ashi)l.cc().a).an((asjm)new izs(this, 4), (asjm)ixp.i);
        }
        else {
            asir = l.cc().c().an((asjm)new izs(this, 4), (asjm)ixp.i);
        }
        m.f(new asir[] { an, asir });
        this.k.g((Object)this);
        this.h();
    }
}
