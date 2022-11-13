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

public final class isn implements aaor
{
    public final tmx a;
    public final WillAutonavInformer b;
    final String c;
    public boolean d;
    private final tmx f;
    private final vdr g;
    private final zmf h;
    private final Executor i;
    private final asid j;
    private final Set k;
    private final asiq l;
    private final vai m;
    
    public isn(final tmx f, final tmx a, final vdr g, final zmf h, final vai m, final Executor i, final asid j, final WillAutonavInformer b) {
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
        this.l = new asiq();
        this.c = vgl.h(353, "main_app_autonav");
    }
    
    public static void a(final Throwable t) {
        ttr.d("Failed to load autonav store.", t);
    }
    
    public static void j() {
        ttr.l("Error updating autonav setting.");
    }
    
    public static void k() {
        ttr.l("Error updating autonav toggle user edu triggers remaining.");
    }
    
    public static void l() {
        ttr.l("Error updating server based autonav edu triggers remaining.");
    }
    
    public final void b(final boolean b) {
        if (this.m.f(45369991L)) {
            final vdq a = this.g.a(this.h.c());
            final String c = this.c;
            c.getClass();
            adkp.R(c.isEmpty() ^ true, "key cannot be empty");
            final ahaz builder = ((ahbh)ahxh.a).createBuilder();
            builder.copyOnWrite();
            final ahxh ahxh = (ahxh)builder.instance;
            ahxh.b |= 0x1;
            ahxh.c = c;
            final ahxf ahxf = new ahxf(builder);
            final ahaz a2 = ahxf.a;
            final boolean booleanValue = (boolean)b;
            a2.copyOnWrite();
            final ahxh ahxh2 = (ahxh)a2.instance;
            ahxh2.b |= 0x2;
            ahxh2.d = booleanValue;
            final ahxg b2 = ahxf.b();
            final vfw c2 = ((vfp)a).c();
            c2.d((vfn)b2);
            c2.b().X();
        }
    }
    
    public final void c() {
        final boolean i = this.i();
        this.b(i);
        final Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((aaoq)iterator.next()).i(i);
        }
    }
    
    @Override
    public final void d(final ttg ttg) {
        this.l.b();
        this.l.f(new asir[] { this.b.b.A().af(this.j).aI((asjm)new irw(this, 13), (asjm)ise.e), ((ashi)this.b.d).p().am((asjm)new irw(this, 14)) });
        teu.k(this.f.a(), (Executor)afum.a, (tes)ieq.t, (tet)new exe(this, ttg, 20));
        this.b(this.i());
    }
    
    @Override
    public final void e(final aaoq aaoq) {
        this.k.add(aaoq);
    }
    
    public final void f(final boolean b) {
        if (b != this.i()) {
            this.g(b);
        }
    }
    
    public final void g(final boolean b) {
        teu.k(this.f.b((aezf)new exf(b, 12)), this.i, (tes)ieq.s, (tet)new hgd(this, 13));
    }
    
    public final void h(final aaoq aaoq) {
        this.k.remove(aaoq);
    }
    
    @Override
    public final boolean i() {
        return this.b.k();
    }
}
