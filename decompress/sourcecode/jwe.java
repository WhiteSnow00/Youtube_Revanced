import java.util.Map;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwe implements fzi
{
    private final /* synthetic */ int a;
    private final Context b;
    private final Object c;
    private final Object d;
    
    public jwe(final Activity b, final hyc d, final aeyr c, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        b.getClass();
        this.b = (Context)b;
        d.getClass();
        this.d = d;
        this.c = c;
    }
    
    public jwe(final apem c, final vax d, final Context b, final int a) {
        this.a = a;
        agot.D((c.b & 0x2) != 0x0);
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public jwe(final apem c, final vax d, final Context b, final int a, final byte[] array) {
        this.a = a;
        agot.D((c.b & 0x2) != 0x0);
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public final int j() {
        final int a = this.a;
        if (a == 0) {
            return 2131429809;
        }
        if (a != 1) {
            return 2131429838;
        }
        return 2131429804;
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
        final int a = this.a;
        if (a == 0) {
            menuItem.setShowAsAction(0);
            return;
        }
        if (a != 1) {
            menuItem.setShowAsAction(2);
            menuItem.setIcon(2131233033);
            return;
        }
        menuItem.setShowAsAction(2);
        menuItem.setIcon(2131232077);
    }
    
    public final boolean p() {
        final int a = this.a;
        if (a == 0) {
            ((hyc)this.d).q((Activity)this.b, (String)((aeyr)this.c).a());
            return true;
        }
        if (a != 1) {
            final Object d = this.d;
            aioe aioe;
            if ((aioe = ((apem)this.c).c) == null) {
                aioe = aioe.a;
            }
            ((vax)d).c(aioe, (Map)null);
            return true;
        }
        final Object d2 = this.d;
        aioe aioe2;
        if ((aioe2 = ((apem)this.c).c) == null) {
            aioe2 = aioe.a;
        }
        ((vax)d2).c(aioe2, (Map)null);
        return true;
    }
    
    public final int q() {
        if (this.a != 0) {
            return 40;
        }
        return 105;
    }
    
    public final CharSequence r() {
        final int a = this.a;
        if (a == 0) {
            return ((Activity)this.b).getString(2132018655);
        }
        if (a != 1) {
            return this.b.getString(2132018661);
        }
        return this.b.getString(2132018650);
    }
}
