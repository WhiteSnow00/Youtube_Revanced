import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jai implements rpe, jar
{
    public final jas a;
    public final smd b;
    CountDownTimer c;
    public long d;
    public boolean e;
    private final tqf f;
    private final rpi g;
    private final fjv h;
    private final wyw i;
    private sfr j;
    private shm k;
    private sfw l;
    private final qcy m;
    private tan n;
    private final ziy o;
    
    public jai(final jas a, final tqf f, final smd b, final rpi g, final ziy o, final qcy m, final fjv h, final wyw i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        o.getClass();
        this.o = o;
        m.getClass();
        this.m = m;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        this.f();
    }
    
    private final void f() {
        this.b();
        this.d = 0L;
        this.a.setVisibility(8);
        this.a.e();
        this.n = null;
        this.f.j(false);
    }
    
    private final void g() {
        this.j = null;
        this.l = null;
        this.k = null;
    }
    
    private final void h(final int n) {
        final sfw l = this.l;
        if (l != null) {
            this.g.e(this.j, this.k, l, n);
            this.g.h(this.j, this.k, this.l);
        }
        final shm k = this.k;
        if (k != null) {
            this.g.l(this.j, k);
            this.g.q(this.j, this.k);
        }
        this.g();
    }
    
    public final void a(final scz scz) {
        if (this.n != null) {
            this.h(sfw.a(scz));
            this.n.i(scz);
        }
        this.f();
    }
    
    public final void b() {
        final CountDownTimer c = this.c;
        if (c != null) {
            c.cancel();
            this.c = null;
        }
    }
    
    public final void c() {
        this.h(4);
        this.f();
    }
    
    public final void d() {
        this.c = new jah(this, this.d).start();
    }
    
    public final boolean e(final tan n) {
        if (n.f().i() == null) {
            return false;
        }
        final ahnr i = n.f().i();
        this.j = sfr.a(n.h(), n.g());
        final shm p = this.o.P();
        this.k = p;
        this.l = this.m.u(p, i);
        this.g.p(this.j, this.k);
        this.g.g(this.j, this.k, this.l);
        this.f();
        this.n = n;
        final int z = adyf.Z(i.f);
        if (z != 0) {
            if (z == 2 && this.h.j().m()) {
                this.g.j(this.j, this.k);
                this.g.b(this.j, this.k, this.l);
                this.a(scz.i);
                return false;
            }
        }
        anuv anuv;
        if ((anuv = i.e) == null) {
            anuv = anuv.a;
        }
        if (((ahbc)anuv).ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
            this.e = i.g;
            this.d = TimeUnit.SECONDS.toMillis((long)i.d);
            this.d();
            if ((i.b & 0x40) != 0x0) {
                final jas a = this.a;
                ahns k;
                if ((k = i.h) == null) {
                    k = ahns.a;
                }
                a.k = k;
            }
            anuv anuv2;
            if ((anuv2 = i.e) == null) {
                anuv2 = anuv.a;
            }
            final ajmo e = (ajmo)((ahbc)anuv2).rx((ahaq)ElementRendererOuterClass.elementRenderer);
            final aezp j = this.l.j;
            this.f.j(true);
            final ackm ackm = new ackm();
            ackm.g((Map)new HashMap());
            ((wyy)ackm).a(this.i);
            if (j.h()) {
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final algn v = (algn)j.c();
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                alhi.v = v;
                alhi.c |= 0x400;
                ((wyy)ackm).e = (alhi)builder.build();
            }
            final jas a2 = this.a;
            if (a2.f == null) {
                a2.f = (ViewGroup)LayoutInflater.from(a2.getContext()).inflate(2131624001, (ViewGroup)a2);
                a2.g = (ViewGroup)a2.f.findViewById(2131427516);
                a2.h = a2.f.findViewById(2131431561);
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)a2.h.getLayoutParams();
                relativeLayout$LayoutParams.bottomMargin += a2.c;
                a2.h.setOnClickListener((View$OnClickListener)new jan(a2, 2));
                a2.h.setOnTouchListener((View$OnTouchListener)new gcf(a2, 4));
            }
            a2.e = e;
            ((accf)a2.a.a()).d(a2.e);
            a2.l = ((accf)a2.a.a()).d(a2.e);
            a2.g.addView(a2.b.a(), 0);
            a2.b.b(ackm, a2.l);
            a2.f.setVisibility(0);
            a2.g.setVisibility(0);
            a2.h.setVisibility(0);
            a2.f();
            this.g.j(this.j, this.k);
            this.g.b(this.j, this.k, this.l);
            return true;
        }
        this.g.h(this.j, this.k, this.l);
        this.g.q(this.j, this.k);
        this.g();
        return false;
    }
}
