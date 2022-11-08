import java.util.function.Predicate;
import android.view.View;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.PlayerRotationLatencyLoggerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzi
{
    public final lbn a;
    public final lcf b;
    public final lbb c;
    public final ghg d;
    public final boolean e;
    public kzn f;
    public final kzl g;
    public final kzg h;
    public final lfh i;
    public final blt j;
    private final UpForFullController k;
    private final wwv l;
    private final PlayerRotationLatencyLoggerController m;
    private final ghd n;
    private final abrx o;
    private float p;
    private final hob q;
    private final a r;
    
    public kzi(final lbn a, final lcf b, final lbb c, final UpForFullController k, final wwv l, final blt j, final hob q, final ghg d, final uyi uyi, final PlayerRotationLatencyLoggerController m, final ghd n, final lfh i, final abrx o, final a r, final kzl g, final kzg h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.k = k;
        this.l = l;
        this.j = j;
        this.q = q;
        this.d = d;
        this.e = uyi.cH();
        this.m = m;
        this.n = n;
        this.i = i;
        this.o = o;
        this.r = r;
        this.g = g;
        this.h = h;
    }
    
    private final void h(final kzn f) {
        final kzn f2 = this.f;
        if (f2 != null) {
            f2.c();
        }
        this.f = f;
        this.i.d(Optional.of((Object)f));
        this.a.n((kyz)f.d);
        this.f.getClass();
    }
    
    public final int a(int n) {
        final kzn f = this.f;
        int n2 = 0;
        if (f == null) {
            return 0;
        }
        if (n == 2) {
            n = (n2 = f.a(2, true));
            if (ana.f((View)this.h) == 1) {
                n2 = -n;
            }
        }
        else if (n == 1) {
            final lfh i = this.i;
            if (!i.i() && !i.k()) {
                n = 0;
            }
            else {
                n = 1;
            }
            final int a = f.a(1, (boolean)((n ^ 0x1) != 0x0));
            final lfh j = this.i;
            final Object e = j.e;
            final kzv kzv = new kzv(j, 0, null);
            n = a;
            if (((Optional)e).filter((Predicate)kzv).isPresent()) {
                n = -a;
            }
            n2 = n;
            if (this.r.n()) {
                if (this.i.f()) {
                    n2 = Math.max(n, this.c.a);
                }
                else {
                    if (this.i.j()) {
                        return Math.min(n, -this.k.a);
                    }
                    n2 = n;
                }
            }
        }
        return n2;
    }
    
    public final int b(final int n, final int n2) {
        int b = this.a.b();
        final kzl g = this.g;
        int n3 = 3;
        int b2 = 0;
        Label_0059: {
            if (b == 3) {
                if (((jaz)g.f).d == 2) {
                    b2 = 1024;
                    break Label_0059;
                }
                b = 3;
            }
            else {
                n3 = b;
            }
            b2 = g.b(b);
        }
        if (!this.j.S(b2, n2)) {
            return 2;
        }
        return this.c(n3, b2, n, n2);
    }
    
    public final int c(final int n, final int n2, final int n3, final int n4) {
        final kzn f = this.f;
        if (f != null) {
            f.b();
            if (f.b == n2 && f.c == n4) {
                return 1;
            }
        }
        this.h(new kzn((View)this.h, n2, n4, this.a.d(n), this.a.d(n3), this.b, this.j, null, null, null, null));
        return 0;
    }
    
    final kzn d() {
        final kzn f = this.f;
        f.getClass();
        return f;
    }
    
    public final void e(int n, int n2, int c) {
        if (this.f != null) {
            if (!this.i.h()) {
                final int n3 = 2;
                Label_0062: {
                    Label_0060: {
                        if (n == 1) {
                            if (this.a(n2) <= 0) {
                                break Label_0060;
                            }
                        }
                        else if (n != 2 || this.a(n2) >= 0) {
                            break Label_0060;
                        }
                        n = 1;
                        break Label_0062;
                    }
                    n = 0;
                }
                if (!this.i.j() && !this.i.f() && !this.i.g()) {
                    if (n == 0 && this.p <= 0.5f) {
                        n = 0;
                    }
                    else {
                        n = 1;
                    }
                }
                else {
                    Label_0348: {
                        Label_0346: {
                            Label_0344: {
                                Label_0339: {
                                    Label_0206: {
                                        if (this.i.f() || this.i.g()) {
                                            final lbb c2 = this.c;
                                            n = tmy.bf(c2.c.getResources().getDisplayMetrics(), c);
                                            if (c2.l.n()) {
                                                if (n <= 0 || Math.abs(n) < 64) {
                                                    break Label_0206;
                                                }
                                            }
                                            else if (Math.abs(n) < 64) {
                                                break Label_0206;
                                            }
                                            if (this.q.a) {
                                                break Label_0344;
                                            }
                                            if (!this.a.o()) {
                                                break Label_0344;
                                            }
                                            break Label_0339;
                                        }
                                    }
                                    if (this.i.j()) {
                                        final UpForFullController k = this.k;
                                        if (this.r.n()) {
                                            n = c;
                                        }
                                        else {
                                            n = this.h.c();
                                        }
                                        n2 = tmy.bf(k.b.getResources().getDisplayMetrics(), n);
                                        if (n < 0 && Math.abs(n2) >= 64) {
                                            if (!this.r.n()) {
                                                break Label_0339;
                                            }
                                            if (this.o.g()) {
                                                break Label_0344;
                                            }
                                            if (this.q.a) {
                                                break Label_0344;
                                            }
                                            break Label_0339;
                                        }
                                    }
                                    n = 0;
                                    n2 = 0;
                                    break Label_0348;
                                }
                                n = 0;
                                break Label_0346;
                            }
                            n = 1;
                        }
                        n2 = 1;
                    }
                    if (n != 0) {
                        this.p = 0.0f;
                        final kzn f = this.f;
                        f.getClass();
                        final kzl g = this.g;
                        if (((lfh)g.i).f()) {
                            n = g.b(1);
                        }
                        else if (((lfh)g.i).g()) {
                            n = g.b(0);
                        }
                        else if (((lfh)g.i).j()) {
                            n = g.b(3);
                        }
                        else {
                            n = 0;
                        }
                        final kzg h = this.h;
                        c = f.c;
                        this.h(new kzn((View)h, c, n, (kyz)f.d, this.a.d(blt.Q(n)), this.b, this.j, null, null, null, null));
                        n = n2;
                    }
                    else if ((n = n2) != 0) {
                        this.p = 1.0f;
                        n = n2;
                    }
                }
                final float p3 = this.p;
                n2 = blt.Q(this.d().c);
                float n4;
                if (n != 0) {
                    if (n2 != this.a.b()) {
                        if (n2 != 2 && n2 != 1 && n2 != 3) {
                            if (n2 == 0) {
                                this.l.J(3, (wxz)new wws(wya.c(34699)), (alff)null);
                            }
                        }
                        else {
                            if (n2 == 2) {
                                n = 35988;
                            }
                            else {
                                n = 35989;
                            }
                            if (this.i.f()) {
                                n = 161611;
                            }
                            if (this.i.c() == 512) {
                                n = 90951;
                            }
                            if (this.i.j()) {
                                n = 106927;
                            }
                            if (this.i.i()) {
                                n = 161574;
                            }
                            if (this.i.k()) {
                                n = 161575;
                            }
                            final wyb c3 = wya.c(n);
                            this.l.D((wxz)new wws(c3));
                            this.l.J(65, (wxz)new wws(c3), (alff)null);
                        }
                    }
                    final PlayerRotationLatencyLoggerController m = this.m;
                    n = blt.Q(this.d().b);
                    if (m.e && m.d && (n2 == 3 || (n == 3 && n2 == 1))) {
                        final itq c4 = m.c;
                        n = n3;
                        if (n2 == 3) {
                            n = 3;
                        }
                        c4.c(n);
                    }
                    if (this.i.j()) {
                        this.n.b = true;
                        n4 = p3;
                    }
                    else {
                        n4 = p3;
                        if (this.i.i()) {
                            this.n.b = false;
                            n4 = p3;
                        }
                    }
                }
                else {
                    final kzn d = this.d();
                    d.b();
                    final View a = d.a;
                    n2 = d.c;
                    n = d.b;
                    final kzu d2 = d.d;
                    d2.b();
                    final kzn f2 = new kzn(a, n2, n, d2, d.g);
                    this.f = f2;
                    n4 = 1.0f - p3;
                    this.i.d(Optional.of((Object)f2));
                }
                this.d().f(n4, new kzh(this, this.d, this.e));
            }
        }
    }
    
    public final void f(final float p) {
        final kzn f = this.f;
        if (f == null) {
            return;
        }
        f.d(this.p = p);
    }
    
    public final void g(int a) {
        a = this.g.a(a);
        this.b(blt.Q(a), a);
    }
}
