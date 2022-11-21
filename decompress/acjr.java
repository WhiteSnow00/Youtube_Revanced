import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjr implements din
{
    private final atnb a;
    private final din b;
    
    public acjr(final atnb a, final din b) {
        this.a = a;
        this.b = b;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return ((acjs)this.a.a()).a(((did)o).b()) != null;
    }
    
    public final /* bridge */ alo b(final Object o, final int n, final int n2, final dds dds) {
        return this.b.b((Object)new File(twd.i(((acjs)this.a.a()).a(((did)o).b()))), n, n2, dds);
    }
}
