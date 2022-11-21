// 
// Decompiled by Procyon v0.6.0
// 

public final class arqc implements afci
{
    public static final arqc a;
    private final afci b;
    
    static {
        a = new arqc();
    }
    
    public arqc() {
        final afci n = adzw.N((Object)new arqe());
        this.b = adzw.M(n);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final arqd b() {
        return (arqd)this.b.a();
    }
}
