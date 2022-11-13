import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgl implements arls
{
    private final atke a;
    private final atke b;
    
    public adgl(final atke a, final atke b) {
        this.a = a;
        this.b = b;
    }
    
    public static adgl b(final atke atke, final atke atke2) {
        return new adgl(atke, atke2);
    }
    
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final Executor c() {
        return adds.j(((tbo)this.a).c(), this.b);
    }
}
