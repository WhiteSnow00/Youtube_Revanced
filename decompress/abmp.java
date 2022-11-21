import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmp implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    private final atnb f;
    private final atnb g;
    private final atnb h;
    private final atnb i;
    private final atnb j;
    private final atnb k;
    private final atnb l;
    private final atnb m;
    private final atnb n;
    private final atnb o;
    private final atnb p;
    
    public abmp(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final atnb g, final atnb h, final atnb i, final atnb j, final atnb k, final atnb l, final atnb m, final atnb n, final atnb o, final atnb p16) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    public static abmp b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6, final atnb atnb7, final atnb atnb8, final atnb atnb9, final atnb atnb10, final atnb atnb11, final atnb atnb12, final atnb atnb13, final atnb atnb14, final atnb atnb15, final atnb atnb16) {
        return new abmp(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, atnb7, atnb8, atnb9, atnb10, atnb11, atnb12, atnb13, atnb14, atnb15, atnb16);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return new abmo((thg)this.a.a(), arol.b(this.b), (Handler)this.c.a(), (askz)this.d.a(), (askz)this.e.a(), (askz)this.f.a(), ((tcz)this.g).c(), (ScheduledExecutorService)this.h.a(), (Executor)this.i.a(), (abqc)this.j.a(), ((abrd)this.k).c(), (aske)this.l.a(), (arzb)this.m.a(), (vbo)this.n.a(), (absv)this.o.a(), (askz)this.p.a(), null, null, null, null);
    }
}
