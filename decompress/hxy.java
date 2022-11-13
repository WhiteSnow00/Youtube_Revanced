import android.app.AlertDialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxy implements sxb
{
    public final Object a;
    private final int b;
    
    public hxy(final AlertDialog a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxy(final hyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.b == 0) {
            ((bi)this.a).dismiss();
            return;
        }
        throw null;
    }
}
