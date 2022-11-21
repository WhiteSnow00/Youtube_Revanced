import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cem implements DialogInterface$OnMultiChoiceClickListener
{
    final cen a;
    
    public cem(final cen a) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n, final boolean b) {
        final cen a = this.a;
        if (b) {
            a.af |= a.ae.add(a.ah[n].toString());
            return;
        }
        a.af |= a.ae.remove(a.ah[n].toString());
    }
}
