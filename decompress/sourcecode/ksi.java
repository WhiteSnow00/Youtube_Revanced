import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksi implements fzi
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;
    
    public ksi(final fzo a, final anqp c, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ksi(final ksl a, final String c, final int b) {
        this.b = b;
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public final int j() {
        if (this.b != 0) {
            return 2131429833;
        }
        return 2131429805;
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
        if (this.b != 0) {
            menuItem.setShowAsAction(2);
            menuItem.setIcon(2131233836);
        }
    }
    
    public final boolean p() {
        if (this.b != 0) {
            final fzo fzo = (fzo)this.a;
            final Object b = fzo.b;
            final Object a = fzo.a;
            amer amer;
            if ((amer = ((anqp)this.c).d) == null) {
                amer = amer.a;
            }
            ameo ameo;
            if ((ameo = amer.c) == null) {
                ameo = ameo.a;
            }
            ((hsn)b).b((bu)a, ameo);
            return true;
        }
        ((ksl)this.a).i.b((String)this.c).show();
        return true;
    }
    
    @Override
    public final int q() {
        return 0;
    }
    
    @Override
    public final CharSequence r() {
        if (this.b != 0) {
            return ((bu)((fzo)this.a).a).getString(2132019349);
        }
        return ((ksl)this.a).h.getString(2132018652);
    }
}
