import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exn implements ewy
{
    public final Handler a;
    public final Runnable b;
    public exx c;
    private final atjz d;
    private final atke e;
    private final oby f;
    private final arkg g;
    private ewx h;
    private final vaf i;
    private final arwh j;
    
    public exn(final atke e, final arwh j, final vaf i, final arkg g, final arkg arkg, final Handler a, final asid asid, final Executor executor, final oby f, final byte[] array, final byte[] array2) {
        this.c = exx.a;
        this.e = e;
        this.j = j;
        this.i = i;
        this.g = g;
        this.a = a;
        this.f = f;
        this.b = new esl(this, 19);
        this.h = ewx.a;
        this.d = ((atjz)atjm.aW((Object)ewx.a)).bc();
        if (fbu.X(i)) {
            executor.execute((Runnable)new tu(this, g, arkg, asid, 16));
            return;
        }
        e.a();
        this.i(g, arkg, asid);
    }
    
    private final aufm l(final aufm aufm, final boolean b) {
        int n;
        if (b) {
            n = ((exi)this.g.a()).b().d;
        }
        else {
            n = ((exi)this.g.a()).b().e;
        }
        final aufm j = aufm.b(n - ((augm)aufm).b.o().a(((augm)aufm).a)).j();
        if (((augm)j).a > aufq.b((augg)aufm)) {
            return j;
        }
        return j.i();
    }
    
    private final void m(final aibj aibj, final aibk aibk) {
        final akcn f = this.j.f();
        if (f != null) {
            alxw alxw;
            if ((alxw = f.e) == null) {
                alxw = alxw.a;
            }
            if (alxw.X) {
                final aibl a = aibm.a();
                ((ahaz)a).copyOnWrite();
                aibm.c((aibm)a.instance, aibj);
                ((ahaz)a).copyOnWrite();
                aibm.d((aibm)a.instance, aibk);
                final aibm aibm = (aibm)((ahaz)a).build();
                final wxx wxx = (wxx)this.e.a();
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.cu((aknt)d.instance, aibm);
                wxx.d((aknt)((ahaz)d).build());
            }
        }
    }
    
    private final boolean n(final aufm aufm) {
        final int d = ((exi)this.g.a()).b().d;
        final int e = ((exi)this.g.a()).b().e;
        final int a = aufp.s.a(((augm)aufm).b).a(((augm)aufm).a);
        if (d < e) {
            return a >= d && a < e;
        }
        return a >= d || a < e;
    }
    
    private final boolean o() {
        return ((exi)this.g.a()).l() && this.c == exx.c;
    }
    
    public final ewx a() {
        return this.h;
    }
    
    public final asht b() {
        return ((asht)this.d).A();
    }
    
    public final void c(final aibk aibk) {
        boolean b;
        if (this.o()) {
            b = this.k(ewx.j);
        }
        else {
            b = this.k(ewx.f);
        }
        if (b) {
            this.m(aibj.c, aibk);
        }
    }
    
    public final void d(final aibk aibk) {
        this.m(aibj.b, aibk);
    }
    
    public final void e(final aibk aibk) {
        if (this.k(ewx.e)) {
            this.m(aibj.d, aibk);
        }
    }
    
    public final void f() {
        if (this.o()) {
            this.k(ewx.i);
            return;
        }
        if (((exi)this.g.a()).l() && !this.o()) {
            this.k(ewx.g);
            return;
        }
        if (this.n(new aufm(this.f.c()))) {
            this.k(ewx.d);
            return;
        }
        this.k(ewx.b);
    }
    
    public final boolean g() {
        return this.h.equals((Object)ewx.c) || this.h.equals((Object)ewx.d) || this.h.equals((Object)ewx.i) || this.h.equals((Object)ewx.h);
    }
    
    public final void h() {
        if (((exi)this.g.a()).l() && this.c == exx.a) {
            return;
        }
        ewx ewx = null;
        Label_0248: {
            if (!this.j()) {
                ewx = ewx.a;
            }
            else {
                final exi exi = (exi)this.g.a();
                final aufm aufm = new aufm(this.f.c());
                if (exi.l()) {
                    if (!this.o()) {
                        ewx = ewx.g;
                        break Label_0248;
                    }
                }
                else if (!this.n(aufm)) {
                    ewx = ewx.b;
                    break Label_0248;
                }
                if ((exi.b().b & 0x10) != 0x0) {
                    final boolean h = exi.b().h;
                    if (((augm)aufm).a < exi.b().g) {
                        if (!h) {
                            ewx = ewx.e;
                            break Label_0248;
                        }
                        if (exi.l()) {
                            ewx = ewx.j;
                            break Label_0248;
                        }
                        ewx = ewx.f;
                        break Label_0248;
                    }
                }
                if (exi.m()) {
                    if (this.o()) {
                        ewx = ewx.h;
                    }
                    else {
                        ewx = ewx.c;
                    }
                }
                else if (this.o()) {
                    ewx = ewx.i;
                }
                else {
                    ewx = ewx.d;
                }
            }
        }
        this.k(ewx);
    }
    
    public final void i(final arkg arkg, final arkg arkg2, final asid asid) {
        this.h();
        ((exi)arkg.a()).g().af(asid).aH(new erz(this, 8));
        ((blu)arkg2.a()).f().af(asid).aH(new erz(this, 9));
    }
    
    public final boolean j() {
        return ((exi)this.g.a()).j();
    }
    
    public final boolean k(final ewx h) {
        if (h.equals((Object)this.h)) {
            return false;
        }
        final exi exi = (exi)this.g.a();
        final int ordinal = this.h.ordinal();
        Label_0247: {
            if (ordinal != 9) {
                switch (ordinal) {
                    default: {
                        break Label_0247;
                    }
                    case 6: {
                        if (h.equals((Object)ewx.e) || h.equals((Object)ewx.f) || h.equals((Object)ewx.j)) {
                            return false;
                        }
                        break Label_0247;
                    }
                    case 4: {
                        if (!h.equals((Object)ewx.f) && !h.equals((Object)ewx.j)) {
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
                        if (h.equals((Object)ewx.e) || h.equals((Object)ewx.f) || h.equals((Object)ewx.j)) {
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
            if (h.equals((Object)ewx.e)) {
                return false;
            }
            this.a.removeCallbacks(this.b);
        }
        final aufm aufm = new aufm(this.f.c());
        final int ordinal2 = h.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2 && ordinal2 != 3) {
                if (ordinal2 != 4) {
                    if (ordinal2 != 5) {
                        if (ordinal2 == 9) {
                            final aipx b = this.i.b();
                            alxp alxp;
                            if ((alxp = b.e) == null) {
                                alxp = alxp.a;
                            }
                            int ax;
                            if ((alxp.e & 0x8000000) != 0x0) {
                                alxp alxp2;
                                if ((alxp2 = b.e) == null) {
                                    alxp2 = alxp.a;
                                }
                                ax = alxp2.ax;
                            }
                            else {
                                ax = (int)TimeUnit.HOURS.toSeconds(12L);
                            }
                            final int n = ax * 1000;
                            this.a.postDelayed(this.b, (long)n);
                            exi.f(true, ((augm)aufm.a(n)).a).U();
                        }
                    }
                    else {
                        this.a.postDelayed(this.b, ((augm)this.l(aufm, false)).a - ((augm)aufm).a);
                        exi.f(true, ((augm)this.l(aufm, true)).a).U();
                    }
                }
                else {
                    final akcn f = this.j.f();
                    alxw alxw;
                    if ((alxw = f.e) == null) {
                        alxw = alxw.a;
                    }
                    int y;
                    if ((alxw.e & 0x10) != 0x0) {
                        alxw alxw2;
                        if ((alxw2 = f.e) == null) {
                            alxw2 = alxw.a;
                        }
                        y = alxw2.Y;
                    }
                    else {
                        y = (int)TimeUnit.MINUTES.toSeconds(10L);
                    }
                    final int n2 = y * 1000;
                    this.a.postDelayed(this.b, (long)n2);
                    exi.f(false, ((augm)aufm.a(n2)).a).U();
                }
            }
            else {
                this.a.postDelayed(this.b, ((augm)this.l(aufm, false)).a - ((augm)aufm).a);
            }
        }
        else {
            this.a.postDelayed(this.b, ((augm)this.l(aufm, true)).a - ((augm)aufm).a);
        }
        this.h = h;
        this.d.tu((Object)h);
        return true;
    }
}
