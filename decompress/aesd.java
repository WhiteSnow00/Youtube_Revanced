import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesd implements qle
{
    public final Object a;
    private final int b;
    
    public aesd(final afbh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aesd(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.b != 0) {
            ofm.d = (ofm)((afbn)this.a).a;
            return;
        }
        new qoe((qog)new qof()).a((Context)this.a);
    }
}
