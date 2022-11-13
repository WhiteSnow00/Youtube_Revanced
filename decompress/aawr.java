import android.content.Context;
import java.util.Iterator;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import com.google.vr.ndk.base.DaydreamApi;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawr implements aarf, aatw, abps, tgg
{
    public final aaqz a;
    public final aawv b;
    public final Handler c;
    public DaydreamApi d;
    public aawp e;
    public aawo f;
    public bu g;
    public boolean h;
    public vwa i;
    public pvh j;
    private final atke k;
    private final atke l;
    private final Set m;
    private final abrj n;
    private final aeea o;
    
    public aawr(final aaqz a, final aeea o, final atke k, final atke l, final aawv b, final abrj n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.m = new HashSet();
        a.getClass();
        this.a = a;
        o.getClass();
        this.o = o;
        k.getClass();
        this.k = k;
        l.getClass();
        this.l = l;
        this.b = b;
        this.c = new Handler(Looper.getMainLooper());
        a.m = new aaog(new afhd(this), 8, null, null, null);
        final aaqc f = a.f;
        if (f != null) {
            f.h(a.m);
        }
        a.p = (aatw)this;
        this.n = n;
    }
    
    public final void a(final boolean b) {
        this.c.post((Runnable)new a(this, b, 17));
    }
    
    public final void b(final aawq aawq) {
        this.m.add(aawq);
    }
    
    public final void c() {
        this.a.o(null, false);
        this.h(false);
        final Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ((aawq)iterator.next()).r(false);
        }
        this.o.aV(false);
    }
    
    public final void d(final aamh aamh) {
        if (aamh.c() != abjv.c && this.a.r) {
            this.c();
        }
    }
    
    public final void f() {
        if (!this.i()) {
            ttr.b("Attempted to enter VR mode when it wasn't available. Doing nothing.");
            return;
        }
        if (this.b.b()) {
            return;
        }
        final aawo f = this.f;
        if (f != null) {
            final kue kue = (kue)f;
            if (kue.d) {
                if (((aqrf)kue.b.c()).d) {
                    ((abpq)kue.c.a()).a();
                    kue.e = true;
                    final Context a = kue.a;
                    a.startActivity(aawu.a(a));
                    return;
                }
            }
        }
        final abpq abpq = (abpq)this.k.a();
        if (!abpq.Y()) {
            abpq.C();
        }
        final Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ((aawq)iterator.next()).r(true);
        }
        this.a.o(new aarg((aarf)this), true);
        this.o.aV(true);
        this.h(true);
    }
    
    public final void g(final aawq aawq) {
        this.m.remove(aawq);
    }
    
    public final void h(final boolean b) {
        final pvh j = this.j;
        if (j != null) {
            final bu od = ((iru)j.a).a.od();
            if (od != null) {
                if (b) {
                    od.getWindow().addFlags(128);
                    return;
                }
                od.getWindow().clearFlags(128);
            }
        }
    }
    
    public final boolean i() {
        final Object a = ((abpq)this.k.a()).u.a;
        return a != null && (((abvb)a).am().a & 0x1) != 0x0 && (boolean)this.l.a() && !this.h && !this.n.y();
    }
    
    public final void j(final int n) {
        if (!aawu.f((Context)this.g, n)) {
            ttr.b("Attempted to launch the YouTube VR app on a non-supported device. Doing nothing.");
            return;
        }
        if (this.b.b()) {
            return;
        }
        if (!aawu.e((Context)this.g, n)) {
            final bu g = this.g;
            if (g != null && this.i != null) {
                this.i.S(aawu.c((Context)g, n), 500, (tcb)new aawn(this, n));
            }
            return;
        }
        aawu.d((Context)this.g, n, this.d, (abpq)this.k.a());
    }
    
    public final asir[] lX(final abpu abpu) {
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new aauu(this, 4), (asjm)aaof.k);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 256L)).j(aale.q(0)).an((asjm)new aauu(this, 4), (asjm)aaof.k);
        }
        return new asir[] { asir };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.d((aamh)o);
            array = null;
        }
        else {
            array = new Class[] { aamh.class };
        }
        return array;
    }
}
