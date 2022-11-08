import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

final class ksk implements fzi
{
    final /* synthetic */ ksl a;
    private final String b;
    private final byte[] c;
    
    public ksk(final ksl a, final String b, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
        array.getClass();
        this.c = array;
    }
    
    public final int j() {
        return 2131429808;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
    }
    
    public final boolean p() {
        final gtx i = this.a.i;
        ((AlertDialog$Builder)((aeby)i.g).af((Context)i.e)).setMessage((CharSequence)((Activity)i.e).getString(2132019515)).setPositiveButton(2132019514, (DialogInterface$OnClickListener)new gio(i, this.b, this.c, 0, (byte[])null)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create().show();
        return true;
    }
    
    @Override
    public final int q() {
        return 0;
    }
    
    @Override
    public final CharSequence r() {
        return this.a.h.getString(2132018654);
    }
}
