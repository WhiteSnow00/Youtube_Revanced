import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamf implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    
    public aamf(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aamf c(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5) {
        return new aamf(atnb, atnb2, atnb3, atnb4, atnb5);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final aame b() {
        return new aame((Context)((aron)this.a).a, (abkq)this.b.a(), (vko)this.c.a(), (Executor)this.d.a(), (auna)this.e.a());
    }
}
