import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakc implements DialogInterface$OnDismissListener
{
    public final aakd a;
    public final kkq b;
    public final aefs c;
    
    public aakc(final aakd a, final aefs c, final kkq b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final aakd a = this.a;
        final aefs c = this.c;
        final kkq b = this.b;
        c.ac(a.m);
        final DialogInterface$OnDismissListener s = a.s;
        if (s != null) {
            s.onDismiss(dialogInterface);
        }
        b.a = false;
    }
}
