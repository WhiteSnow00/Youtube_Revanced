import android.app.AlertDialog;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abni implements abnn
{
    public final Activity a;
    public final abng b;
    protected String c;
    protected String d;
    protected anfd e;
    public AlertDialog f;
    public final aeea g;
    
    public abni(final Activity activity) {
        this(activity, null, null, null, null, null);
    }
    
    public abni(final Activity a, final abng b, final aeea g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = "";
        this.d = "";
        this.a = a;
        this.b = b;
        this.g = g;
    }
    
    static /* bridge */ void c(final abni abni) {
        abni.f = null;
    }
    
    public final Activity a() {
        return this.a;
    }
    
    public final void b() {
        final Activity a = this.a;
        if (a != null && !a.isFinishing() && !this.a.isDestroyed()) {
            final AlertDialog f = this.f;
            if (f != null && f.isShowing()) {
                this.f.cancel();
            }
        }
        this.f = null;
    }
}
