import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgj extends acja
{
    public final View a;
    public final RecyclerView b;
    public final atir c;
    public final Context d;
    public aclp e;
    public ldv f;
    private final acjb g;
    private final achw h;
    private final kww i;
    private final vdo j;
    private final asho k;
    private ldt l;
    private asic m;
    private String n;
    private asic o;
    private int p;
    
    public kgj(final Context d, final acno acno, final asho k, final aeby aeby, final uyf uyf, final vbq vbq, final zki zki, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.k = k;
        this.d = d;
        if (gkt.o(uyf)) {
            this.a = LayoutInflater.from(d).inflate(2131625287, (ViewGroup)null);
        }
        else {
            this.a = LayoutInflater.from(d).inflate(2131625286, (ViewGroup)null);
        }
        final RecyclerView b = (RecyclerView)this.a.findViewById(2131431126);
        this.b = b;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ac(0);
        b.af((nw)linearLayoutManager);
        b.ae((nt)null);
        final aciw u = aeby.U((acir)acno.a(), new ViewGroup$LayoutParams(-2, -2));
        this.c = atir.e();
        final kww kww = new kww();
        this.i = kww;
        final achw h = new achw();
        this.h = h;
        h.a = (wwv)kww;
        u.f((acik)h);
        u.f((acik)new kcu(this, 3));
        u.h((achk)(this.g = new acjb()));
        b.ac((nq)u);
        b.aC((hy)new kgi(this, d.getResources().getDimensionPixelSize(2131170369)));
        this.j = (vdo)vbq.a(zki.c());
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        final asic m = this.m;
        if (m != null && !m.tx()) {
            asjg.b((AtomicReference)this.m);
        }
        final asic o = this.o;
        if (o != null) {
            athh.f((AtomicReference)o);
            this.o = null;
        }
        this.n = null;
        ((tdv)this.g).clear();
        this.f = null;
        this.e = null;
        this.l = null;
    }
    
    public final void f(final int p) {
        final int p2 = this.p;
        this.p = p;
        if (this.f == null) {
            return;
        }
        this.k.f((Runnable)new ccl(this, p, 15));
        this.c.tr((Object)p);
        final ldt l = this.l;
        if (l != null) {
            if (p == 0) {
                l.b();
                return;
            }
            if (p2 == 0) {
                l.a();
            }
        }
    }
    
    final void g(final int n) {
        this.f.m(n);
        if (!aexs.f(this.n)) {
            final vdv c = this.j.c();
            final String n2 = this.n;
            n2.getClass();
            agot.E(n2.isEmpty() ^ true, (Object)"key cannot be empty");
            final agza builder = ((agzi)ansg.a).createBuilder();
            builder.copyOnWrite();
            final ansg ansg = (ansg)builder.instance;
            ansg.b |= 0x1;
            ansg.c = n2;
            final ansd ansd = new ansd(builder);
            final long n3 = n;
            final agza a = ansd.a;
            final long longValue = n3;
            a.copyOnWrite();
            final ansg ansg2 = (ansg)a.instance;
            ansg2.b |= 0x2;
            ansg2.d = longValue;
            c.j((vdj)ansd);
            c.b().U();
            return;
        }
        if (this.o == null) {
            this.f(n);
        }
    }
}
