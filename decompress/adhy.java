import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhy implements arom
{
    private final atnb a;
    private final atnb b;
    
    public adhy(final atnb a, final atnb b) {
        this.a = a;
        this.b = b;
    }
    
    public static adhy b(final atnb atnb, final atnb atnb2) {
        return new adhy(atnb, atnb2);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final Executor c() {
        return adfe.k(((tcr)this.a).c(), this.b);
    }
}
