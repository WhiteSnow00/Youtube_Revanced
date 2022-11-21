import android.view.View;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakb implements DialogInterface$OnCancelListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public aakb(final aakd a, final kkq b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aakb(final fcd a, final aory b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        if (this.c != 0) {
            ((gbt)((fcd)this.a).b).r((aory)this.b, true);
            return;
        }
        final Object a = this.a;
        final Object b = this.b;
        final aakd aakd = (aakd)a;
        aakd.l.onClick((View)aakd.j);
        ((kkq)b).a = false;
    }
}
