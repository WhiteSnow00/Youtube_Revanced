import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfh extends acnu
{
    private final acle a;
    private final asir b;
    
    public jfh(final acps acps, final vdr vdr, final ajyh ajyh) {
        (this.a = new acle()).add((Object)ajyh);
        acps.b((Class)ajyh.class);
        this.b = vdr.b().h(ajyh.c, false).af(asil.a()).aG();
    }
    
    public final acjn a() {
        return (acjn)this.a;
    }
    
    public final void sa() {
        asjv.b((AtomicReference)this.b);
    }
}
