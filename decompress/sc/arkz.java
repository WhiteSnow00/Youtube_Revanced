import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkz implements arlm
{
    private final Object a;
    private volatile esq b;
    private final aln c;
    
    public arkz(final qt qt) {
        this.a = new Object();
        this.c = new aln((avv)qt, (avr)new arkv((Context)qt));
    }
    
    public final /* bridge */ Object aR() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = ((arkx)this.c.h((Class)arkx.class)).a;
                }
            }
        }
        return this.b;
    }
}
