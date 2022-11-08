import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import java.util.concurrent.atomic.AtomicReference;
import android.app.AlertDialog;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class glt implements abyw
{
    public final afcr a;
    public AlertDialog b;
    public final aeby c;
    private final fjp d;
    private asic e;
    
    protected glt(final aeby c, final fjp d, final afcr a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    protected abstract AlertDialog a();
    
    public final void b() {
        final asic e = this.e;
        if (e != null) {
            asjg.b((AtomicReference)e);
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
                this.e = this.d.k().J((asjd)new fdl(this, 9)).aC((asix)new ghp(this, 18), (asix)fts.s);
            }
            return;
        }
        this.b();
        AlertDialog b2;
        if ((b2 = this.b) == null) {
            b2 = this.a();
            b2.setOnShowListener((DialogInterface$OnShowListener)new eyh(this, 3));
            b2.setOnDismissListener((DialogInterface$OnDismissListener)new fal(this, 3));
            this.b = b2;
        }
        b2.show();
    }
    
    public final void nu() {
        this.c();
    }
}
