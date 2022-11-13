import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.List;
import java.lang.ref.WeakReference;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ism extends aaon implements fju, jbs, abdw, fyx, tgg
{
    private asir A;
    private final vai B;
    private final arwh C;
    private final hzm D;
    private final aeea E;
    public akwz a;
    private final ewy k;
    private final kyf l;
    private final abyp m;
    private final fnt n;
    private final asjm o;
    private final fzb p;
    private final jbh q;
    private final isn r;
    private final Context s;
    private fkr t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private WatchNextResponseModel z;
    
    public ism(final aaot aaot, final isn r, final fzw fzw, final vcy vcy, final wyw wyw, final abpl abpl, final trc trc, final tjm tjm, final ewy k, final tgd tgd, final arwh c, final kyf l, final fzb p26, final abyp m, final fnt n, final atke atke, final jbh q, final Context s, final aeea e, final vai b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aaot, r, fzw, vcy, wyw, abpl, trc, tjm, tgd, atke, null, null, null);
        this.t = fkr.a;
        this.C = c;
        this.D = new hzm(fzw, null, null, null);
        this.k = k;
        this.l = l;
        this.p = p26;
        this.m = m;
        this.n = n;
        this.q = q;
        this.r = r;
        this.s = s;
        this.B = b;
        this.E = e;
        this.o = new irw(this, 9);
    }
    
    private final boolean G() {
        return this.v && this.w;
    }
    
    private final boolean H() {
        return this.n.b == fnq.a;
    }
    
    public final void a(final angg angg) {
        this.C(angg);
    }
    
    @Override
    protected final int b() {
        if (this.t.c() && super.v() >= 0) {
            return super.v();
        }
        if (this.t.f()) {
            final int u = this.u;
            if (u >= 0) {
                return u;
            }
        }
        return super.b();
    }
    
    @Override
    protected final void c() {
        super.c();
        this.r.g(true);
        this.D();
    }
    
    @Override
    public final void d(final aans aans) {
        super.d(aans);
        final abke a = abke.a;
        final int ordinal = aans.c().ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                if (this.m != null) {
                    final asir a2 = this.A;
                    if (a2 == null || a2.tA()) {
                        this.A = ((ashi)this.m.c).p().am(this.o);
                    }
                }
            }
            return;
        }
        final asir a3 = this.A;
        if (a3 != null && !a3.tA()) {
            athz.f((AtomicReference)this.A);
        }
        this.A = null;
        this.a = null;
    }
    
    public final void f(final aanw aanw) {
        this.x = (aanw.a() == 9);
        this.D();
    }
    
    public final void h(final int n, final long n2) {
        boolean y = true;
        if (n != 1) {
            y = (n == 2 && y);
        }
        this.y = y;
    }
    
    @Override
    protected final void j(final WatchNextResponseModel z) {
        this.z = z;
        if (!TextUtils.isEmpty((CharSequence)z.b)) {
            final fyw a = this.p.a(z.b);
            final WeakReference weakReference = new WeakReference((T)this);
            a.f.add(weakReference);
            final List h = a.h;
            if (h != null) {
                a.d(h, (List)afeq.q(), (List)afeq.q(), (List)afeq.q(), (List)afeq.r((Object)weakReference), a.b);
            }
        }
    }
    
    @Override
    protected final void k() {
        final WatchNextResponseModel z = this.z;
        if (z != null) {
            final vgs h = z.h;
            if (h != null) {
                final vgp e = h.e();
                if (e == null) {
                    return;
                }
                final aiqj a = e.a();
                if (a == null) {
                    return;
                }
                final abjp d = PlaybackStartDescriptor.d();
                d.a = a;
                d.e = true;
                d.f = true;
                this.l.f(d.a(), false);
            }
        }
    }
    
    @Override
    protected final void l() {
        final WatchNextResponseModel z = this.z;
        if (z != null) {
            final Context s = this.s;
            final aeea e = this.E;
            aldz aldz;
            if ((aldz = z.f.e) == null) {
                aldz = aldz.a;
            }
            ahxm a;
            if (aldz.b == 46659098) {
                a = (ahxm)aldz.c;
            }
            else {
                a = ahxm.a;
            }
            anuv anuv;
            if ((anuv = a.e) == null) {
                anuv = anuv.a;
            }
            aixf aixf;
            if (((ahbc)anuv).ry((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                aixf = (aixf)((ahbc)anuv).rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            }
            else {
                aixf = null;
            }
            if (aixf != null) {
                acax.p(s, aixf, super.c, super.d, (aeea)null, false, false, true, (acaw)this, (Object)null, (acpk)null, (trc)null, (acgs)null, (ziy)null, (atke)null, e);
            }
        }
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        final asir[] lx = super.lX(abpu);
        final asir am = ((ashi)abpu.p().k).am((asjm)new irw(this, 10));
        final asir ah = this.k.b().ap(asil.a()).aH((asjm)new irw(this, 11));
        final asir am2 = this.q.b().am((asjm)new irw(this, 12));
        final ArrayList list = new ArrayList();
        Collections.addAll(list, am, ah, am2);
        Collections.addAll(list, lx);
        final asir a = this.A;
        if (a != null) {
            list.add(a);
        }
        return list.toArray(new asir[0]);
    }
    
    @Override
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == ism.class) {
            Class[] array;
            if (n != -1) {
                if (n != 0) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.f((aanw)o);
                array = null;
            }
            else {
                array = new Class[] { aanw.class };
            }
            return array;
        }
        return aakv.a(this, o, n);
    }
    
    @Override
    public final void n(final fkr t) {
        if (this.t != t) {
            this.t = t;
            if (t.o()) {
                this.D.n();
            }
            else {
                this.D.o();
            }
            if (this.t.f()) {
                this.u = fbu.aB(this.C);
            }
        }
    }
    
    @Override
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    @Override
    protected final void p() {
        final akwz a = this.a;
        final aiqj aiqj = null;
        aiqj aiqj2 = null;
        Label_0099: {
            if (a != null) {
                akwt akwt;
                if ((akwt = a.o) == null) {
                    akwt = akwt.a;
                }
                aluq aluq;
                if ((aluq = akwt.c) == null) {
                    aluq = aluq.a;
                }
                if ((aluq.b & 0x4) != 0x0) {
                    final int dm = aqsx.dM(aluq.e);
                    if (dm != 0) {
                        if (dm == 4) {
                            if ((aiqj2 = aluq.c) == null) {
                                aiqj2 = aiqj.a;
                            }
                            break Label_0099;
                        }
                    }
                }
            }
            aiqj2 = null;
        }
        if (aiqj2 == null) {
            aiqj2 = aiqj;
        }
        else {
            final angg h = super.h;
            final String d = ((apsk)((ahbc)aiqj2).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).d;
            if (h != null && (d.isEmpty() || d.equals(h.q)) && !h.p) {
                aiqj2 = aiqj;
            }
        }
        if (aiqj2 != null) {
            this.B(aiqj2);
        }
    }
    
    @Override
    public final void ph(final int n, final boolean b) {
        final boolean g = this.G();
        final boolean v = this.v;
        final boolean v2 = n == 2 || n == 1;
        this.v = v2;
        boolean w = b;
        Label_0067: {
            if (v2 == v) {
                if (this.w || !b) {
                    break Label_0067;
                }
                w = true;
            }
            this.w = w;
        }
        if (g == this.G()) {
            return;
        }
        this.D();
    }
    
    @Override
    protected final boolean q() {
        return !this.x && !this.t.e() && !this.G() && this.H() && !this.y && !this.k.g() && !this.q.j();
    }
    
    @Override
    protected final boolean r() {
        return this.H();
    }
    
    @Override
    protected final boolean s() {
        return this.B.f(45381478L) && this.r.b.m() == 2;
    }
}
