import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irp implements aamw
{
    public final tku a;
    public final WillAutonavInformer b;
    final String c;
    public boolean d;
    private final tku f;
    private final vbq g;
    private final zki h;
    private final Executor i;
    private final asho j;
    private final Set k;
    private final asib l;
    private final uyi m;
    
    public irp(final tku f, final tku a, final vbq g, final zki h, final uyi m, final Executor i, final asho j, final WillAutonavInformer b) {
        this.d = true;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        this.g = g;
        this.h = h;
        this.m = m;
        this.i = i;
        this.j = j;
        this.b = b;
        this.k = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.l = new asib();
        this.c = vek.h(353, "main_app_autonav");
    }
    
    public final void b(final boolean b) {
        if (this.m.f(45369991L)) {
            final vbp a = this.g.a(this.h.c());
            final String c = this.c;
            c.getClass();
            agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
            final agza builder = ((agzi)ahvj.a).createBuilder();
            builder.copyOnWrite();
            final ahvj ahvj = (ahvj)builder.instance;
            ahvj.b |= 0x1;
            ahvj.c = c;
            final ahvh ahvh = new ahvh(builder);
            final agza a2 = ahvh.a;
            final boolean booleanValue = (boolean)b;
            a2.copyOnWrite();
            final ahvj ahvj2 = (ahvj)a2.instance;
            ahvj2.b |= 0x2;
            ahvj2.d = booleanValue;
            final ahvi b2 = ahvh.b();
            final vdv c2 = ((vdo)a).c();
            c2.d((vdm)b2);
            c2.b().X();
        }
    }
    
    public final void c() {
        final boolean i = this.i();
        this.b(i);
        final Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((aamv)iterator.next()).i(i);
        }
    }
    
    @Override
    public final void d(final trb trb) {
        this.l.b();
        this.l.f(this.b.b.z().aa(this.j).aC((asix)new iqv(this, 14), (asix)irb.f), ((asgt)this.b.d).p().al((asix)new iqv(this, 15)));
        tcp.k(this.f.a(), (Executor)afsl.a, (tcn)idu.t, (tco)new exa(this, trb, 20));
        this.b(this.i());
    }
    
    @Override
    public final void e(final aamv aamv) {
        this.k.add(aamv);
    }
    
    public final void f(final boolean b) {
        if (b != this.i()) {
            this.g(b);
        }
    }
    
    public final void g(final boolean b) {
        tcp.k(this.f.b((aexg)new exb(b, 12)), this.i, (tcn)idu.s, (tco)new hfi(this, 13));
    }
    
    public final void h(final aamv aamv) {
        this.k.remove(aamv);
    }
    
    @Override
    public final boolean i() {
        return this.b.k();
    }
}
