import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmx implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    
    public abmx(final atnb a, final atnb b, final atnb c, final atnb d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static abmx b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new abmx(atnb, atnb2, atnb3, atnb4);
    }
    
    public static acjq d(final askz askz, final Executor executor, final absv absv, final arzb arzb) {
        return new acjq(askz, executor, absv, arzb, null, null);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final acjq c() {
        return d((askz)this.a.a(), (Executor)this.b.a(), (absv)this.c.a(), (arzb)this.d.a());
    }
}
