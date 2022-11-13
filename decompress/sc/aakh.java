import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakh implements arls
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    
    public aakh(final atke a, final atke b, final atke c, final atke d, final atke e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aakh c(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new aakh(atke, atke2, atke3, atke4, atke5);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final aakg b() {
        return new aakg((Context)((arlt)this.a).a, (abjj)this.b.a(), (vjg)this.c.a(), (Executor)this.d.a(), (aukf)this.e.a());
    }
}
