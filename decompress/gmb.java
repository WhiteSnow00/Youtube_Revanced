import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import java.util.concurrent.atomic.AtomicReference;
import android.app.AlertDialog;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gmb implements acay
{
    public final afeq a;
    public AlertDialog b;
    public final aeea c;
    private final fjv d;
    private asir e;
    
    protected gmb(final aeea c, final fjv d, final afeq a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    protected abstract AlertDialog a();
    
    public final void b() {
        final asir e = this.e;
        if (e != null) {
            asjv.b((AtomicReference)e);
            this.e = null;
        }
    }
    
    public final void c() {
        this.b();
        final AlertDialog b = this.b;
        if (b != null) {
            b.dismiss();
        }
    }
    
    public void e() {
    }
    
    public final void f() {
        final AlertDialog b = this.b;
        if (b != null && b.isShowing()) {
            return;
        }
        if (this.a.contains((Object)this.d.j())) {
            if (this.e == null) {
                this.e = this.d.k().K((asjs)new fdp(this, 9)).aI((asjm)new ghy(this, 19), (asjm)fua.s);
            }
            return;
        }
        this.b();
        AlertDialog b2;
        if ((b2 = this.b) == null) {
            b2 = this.a();
            b2.setOnShowListener((DialogInterface$OnShowListener)new eyk(this, 3));
            b2.setOnDismissListener((DialogInterface$OnDismissListener)new fap(this, 3));
            this.b = b2;
        }
        b2.show();
    }
    
    public final void nu() {
        this.c();
    }
}
