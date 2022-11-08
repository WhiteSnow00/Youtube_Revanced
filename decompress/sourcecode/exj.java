import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exj implements ewu
{
    public final Handler a;
    public final Runnable b;
    public ext c;
    private final atje d;
    private final atjj e;
    private final oas f;
    private final arhr g;
    private ewt h;
    private final uyf i;
    private final arud j;
    
    public exj(final atjj e, final arud j, final uyf i, final arhr g, final arhr arhr, final Handler a, final asho asho, final Executor executor, final oas f, final byte[] array, final byte[] array2) {
        this.c = ext.a;
        this.e = e;
        this.j = j;
        this.i = i;
        this.g = g;
        this.a = a;
        this.f = f;
        this.b = (Runnable)new esi(this, 20);
        this.h = ewt.a;
        this.d = ((atje)atir.aR((Object)ewt.a)).aX();
        if (gkt.v(i)) {
            executor.execute((Runnable)new tu(this, g, arhr, asho, 16));
            return;
        }
        e.a();
        this.i(g, arhr, asho);
    }
    
    private final auev l(final auev auev, final boolean b) {
        int n;
        if (b) {
            n = ((exe)this.g.a()).b().d;
        }
        else {
            n = ((exe)this.g.a()).b().e;
        }
        final auev j = auev.b(n - ((aufv)auev).b.o().a(((aufv)auev).a)).j();
        if (((aufv)j).a > auez.b((aufp)auev)) {
            return j;
        }
        return j.i();
    }
    
    private final void m(final ahzl ahzl, final ahzm ahzm) {
        final akak f = this.j.f();
        if (f != null) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            if (alvs.X) {
                final ahzn a = ahzo.a();
                a.copyOnWrite();
                ahzo.c((ahzo)a.instance, ahzl);
                a.copyOnWrite();
                ahzo.d((ahzo)a.instance, ahzm);
                final ahzo ahzo = (ahzo)a.build();
                final wvu wvu = (wvu)this.e.a();
                final aklo d = aklq.d();
                ((agza)d).copyOnWrite();
                aklq.ct((aklq)d.instance, ahzo);
                wvu.d((aklq)((agza)d).build());
            }
        }
    }
    
    private final boolean n(final auev auev) {
        final int d = ((exe)this.g.a()).b().d;
        final int e = ((exe)this.g.a()).b().e;
        final int a = auey.s.a(((aufv)auev).b).a(((aufv)auev).a);
        if (d < e) {
            return a >= d && a < e;
        }
        return a >= d || a < e;
    }
    
    private final boolean o() {
        return ((exe)this.g.a()).l() && this.c == ext.c;
    }
    
    @Override
    public final ewt a() {
        return this.h;
    }
    
    @Override
    public final ashe b() {
        return ((ashe)this.d).z();
    }
    
    @Override
    public final void c(final ahzm ahzm) {
        boolean b;
        if (this.o()) {
            b = this.k(ewt.j);
        }
        else {
            b = this.k(ewt.f);
        }
        if (b) {
            this.m(ahzl.c, ahzm);
        }
    }
    
    @Override
    public final void d(final ahzm ahzm) {
        this.m(ahzl.b, ahzm);
    }
    
    @Override
    public final void e(final ahzm ahzm) {
        if (this.k(ewt.e)) {
            this.m(ahzl.d, ahzm);
        }
    }
    
    @Override
    public final void f() {
        if (this.o()) {
            this.k(ewt.i);
            return;
        }
        if (((exe)this.g.a()).l() && !this.o()) {
            this.k(ewt.g);
            return;
        }
        if (this.n(new auev(this.f.c()))) {
            this.k(ewt.d);
            return;
        }
        this.k(ewt.b);
    }
    
    @Override
    public final boolean g() {
        return this.h.equals(ewt.c) || this.h.equals(ewt.d) || this.h.equals(ewt.i) || this.h.equals(ewt.h);
    }
    
    public final void h() {
        if (((exe)this.g.a()).l() && this.c == ext.a) {
            return;
        }
        ewt ewt = null;
        Label_0230: {
            if (!this.j()) {
                ewt = ewt.a;
            }
            else {
                final exe exe = (exe)this.g.a();
                final auev auev = new auev(this.f.c());
                if (exe.l()) {
                    if (!this.o()) {
                        ewt = ewt.g;
                        break Label_0230;
                    }
                }
                else if (!this.n(auev)) {
                    ewt = ewt.b;
                    break Label_0230;
                }
                if ((exe.b().b & 0x10) != 0x0) {
                    final boolean h = exe.b().h;
                    if (((aufv)auev).a < exe.b().g) {
                        if (!h) {
                            ewt = ewt.e;
                            break Label_0230;
                        }
                        if (exe.l()) {
                            ewt = ewt.j;
                            break Label_0230;
                        }
                        ewt = ewt.f;
                        break Label_0230;
                    }
                }
                if (exe.m()) {
                    if (this.o()) {
                        ewt = ewt.h;
                    }
                    else {
                        ewt = ewt.c;
                    }
                }
                else if (this.o()) {
                    ewt = ewt.i;
                }
                else {
                    ewt = ewt.d;
                }
            }
        }
        this.k(ewt);
    }
    
    public final void i(final arhr arhr, final arhr arhr2, final asho asho) {
        this.h();
        ((exe)arhr.a()).g().aa(asho).aB((asix)new erw(this, 8));
        ((blt)arhr2.a()).f().aa(asho).aB((asix)new erw(this, 9));
    }
    
    public final boolean j() {
        return ((exe)this.g.a()).j();
    }
    
    public final boolean k(final ewt h) {
        if (h.equals(this.h)) {
            return false;
        }
        final exe exe = (exe)this.g.a();
        final int ordinal = this.h.ordinal();
        Label_0247: {
            if (ordinal != 9) {
                switch (ordinal) {
                    default: {
                        break Label_0247;
                    }
                    case 6: {
                        if (h.equals(ewt.e) || h.equals(ewt.f) || h.equals(ewt.j)) {
                            return false;
                        }
                        break Label_0247;
                    }
                    case 4: {
                        if (!h.equals(ewt.f) && !h.equals(ewt.j)) {
                            this.a.removeCallbacks(this.b);
                            break Label_0247;
                        }
                        return false;
                    }
                    case 2:
                    case 3: {
                        this.a.removeCallbacks(this.b);
                        break Label_0247;
                    }
                    case 1: {
                        this.a.removeCallbacks(this.b);
                        if (h.equals(ewt.e) || h.equals(ewt.f) || h.equals(ewt.j)) {
                            return false;
                        }
                        break Label_0247;
                    }
                    case 0: {
                        if (!this.j()) {
                            return false;
                        }
                        break Label_0247;
                    }
                    case 5: {
                        break;
                    }
                }
            }
            if (h.equals(ewt.e)) {
                return false;
            }
            this.a.removeCallbacks(this.b);
        }
        final auev auev = new auev(this.f.c());
        final int ordinal2 = h.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2 && ordinal2 != 3) {
                if (ordinal2 != 4) {
                    if (ordinal2 != 5) {
                        if (ordinal2 == 9) {
                            final ains b = this.i.b();
                            alvl alvl;
                            if ((alvl = b.e) == null) {
                                alvl = alvl.a;
                            }
                            int ax;
                            if ((alvl.e & 0x8000000) != 0x0) {
                                alvl alvl2;
                                if ((alvl2 = b.e) == null) {
                                    alvl2 = alvl.a;
                                }
                                ax = alvl2.ax;
                            }
                            else {
                                ax = (int)TimeUnit.HOURS.toSeconds(12L);
                            }
                            final int n = ax * 1000;
                            this.a.postDelayed(this.b, (long)n);
                            exe.f(true, ((aufv)auev.a(n)).a).U();
                        }
                    }
                    else {
                        this.a.postDelayed(this.b, ((aufv)this.l(auev, false)).a - ((aufv)auev).a);
                        exe.f(true, ((aufv)this.l(auev, true)).a).U();
                    }
                }
                else {
                    final akak f = this.j.f();
                    alvs alvs;
                    if ((alvs = f.e) == null) {
                        alvs = alvs.a;
                    }
                    int y;
                    if ((alvs.e & 0x10) != 0x0) {
                        alvs alvs2;
                        if ((alvs2 = f.e) == null) {
                            alvs2 = alvs.a;
                        }
                        y = alvs2.Y;
                    }
                    else {
                        y = (int)TimeUnit.MINUTES.toSeconds(10L);
                    }
                    final int n2 = y * 1000;
                    this.a.postDelayed(this.b, (long)n2);
                    exe.f(false, ((aufv)auev.a(n2)).a).U();
                }
            }
            else {
                this.a.postDelayed(this.b, ((aufv)this.l(auev, false)).a - ((aufv)auev).a);
            }
        }
        else {
            this.a.postDelayed(this.b, ((aufv)this.l(auev, true)).a - ((aufv)auev).a);
        }
        this.h = h;
        this.d.tr((Object)h);
        return true;
    }
}
