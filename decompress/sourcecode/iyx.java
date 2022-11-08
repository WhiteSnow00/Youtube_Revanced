import com.google.android.libraries.youtube.player.ui.PlayerView;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyx implements fnr, geo, fjo, ixq, foa, abao, tec
{
    public final iyw a;
    public final PlaybackLifecycleMonitor b;
    public final fjp c;
    public iyv d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final uyi h;
    public final qv i;
    public final mrm j;
    private final tdz k;
    private final abns l;
    private final asib m;
    private final boolean n;
    private iyv o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final iqi s;
    
    public iyx(final iyw a, final PlaybackLifecycleMonitor b, final qv i, final mrm j, final tdz k, final abns l, final iqi s, final fjp c, final uyi uyi, final uyi h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.k = k;
        this.l = l;
        this.j = j;
        this.s = s;
        this.c = c;
        this.m = new asib();
        this.h = h;
        this.n = uyi.bC();
    }
    
    private final void i() {
        if (this.n) {
            if (this.q) {
                this.a.p(null);
                return;
            }
        }
        else if (this.q) {
            final iyv o = this.o;
            if (o != null) {
                this.a.p(o);
                return;
            }
        }
        this.a.p(this.d);
    }
    
    public final void a(final aioe aioe, final aorm aorm, final Bitmap bitmap) {
        if (aioe != null) {
            this.d = new iyv(abhz.e(aioe), aorm, bitmap);
            this.i();
        }
    }
    
    @Override
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
    
    public final void g(final aorm aorm) {
        final iyv d = this.d;
        if (d != null && aorm != null) {
            this.d = new iyv(d.a, aorm, (Bitmap)null);
            this.i();
        }
    }
    
    public final void h() {
        if (this.n && this.q) {
            this.a.mk();
            return;
        }
        final int b = this.b.b;
        final YouTubePlayerViewNotForReflection r = ((iqw)this.s.b()).R;
        final iyv d = this.d;
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
            final foj foj = (foj)o;
            final iyv d = this.d;
            array = null;
            if (d != null) {
                if (TextUtils.equals((CharSequence)d.a, (CharSequence)foj.a())) {
                    this.a.Y();
                    return null;
                }
                array = array;
            }
        }
        else {
            array = new Class[] { foj.class };
        }
        return array;
    }
    
    @Override
    public final void oK(final fkk fkk) {
        final boolean q = this.q;
        final boolean r = this.r;
        this.q = this.c.j().e();
        final boolean r2 = this.c.j() == fkk.h;
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
    
    @Override
    public final void q(final ged ged, final int n, final int n2) {
        if (n2 == 0) {
            this.o = null;
            return;
        }
        if (n2 == 2) {
            if (this.n) {
                this.o = null;
            }
            else {
                final gle b = ged.b;
                this.o = new iyv(b.i(), b.g(), (Bitmap)null);
            }
            this.i();
            this.h();
        }
    }
    
    public final void qB() {
        final asib m = this.m;
        final abns l = this.l;
        final asic am = ((asgt)l.f().a).am((asix)new iys(this, 4), (asix)iwn.j);
        asic asic;
        if (((uyi)l.cd().h).bw()) {
            asic = ((asgt)l.f().f).am((asix)new iys(this, 5), (asix)iwn.j);
        }
        else {
            asic = l.f().b().am((asix)new iys(this, 5), (asix)iwn.j);
        }
        m.f(am, asic);
        this.k.g((Object)this);
        this.h();
    }
}
