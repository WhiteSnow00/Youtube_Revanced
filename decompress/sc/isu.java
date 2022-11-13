import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isu implements iss
{
    public final Activity a;
    public final hyx b;
    private ist c;
    
    public isu(final Activity a, final hyx b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ist a() {
        if (this.c == null) {
            (this.c = new ist(this.a.getString(2132018656), new iso(this, 2))).g(true);
            ((qkq)this.c).e = tpe.k((Context)this.a, 2131233868, 2130970924);
        }
        final ist c = this.c;
        c.getClass();
        return c;
    }
    
    @Override
    public final void oO() {
        this.c = null;
    }
    
    @Override
    public final boolean oP() {
        return false;
    }
    
    @Override
    public final String oQ() {
        return "menu_item_help_and_feedback";
    }
}
