import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isw implements iss
{
    public final vcy a;
    private final Activity b;
    private final uve c;
    private final boolean d;
    private ist e;
    
    public isw(final Activity b, final vcy a, final vaf vaf, final uve c) {
        this.b = b;
        this.a = a;
        this.c = c;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        this.d = alxp.bh;
    }
    
    @Override
    public final ist a() {
        if (this.e == null) {
            final ist e = new ist(this.b.getString(2132018358), new iso(this, 4));
            this.e = e;
            ((qkq)e).e = tpe.k((Context)this.b, 2131233024, 2130970924);
            final ist e2 = this.e;
            final boolean d = this.d;
            boolean b = false;
            if (d) {
                b = b;
                if (this.c.b("listen-first") != null) {
                    b = true;
                }
            }
            e2.g(b);
        }
        final ist e3 = this.e;
        e3.getClass();
        return e3;
    }
    
    @Override
    public final void oO() {
        this.e = null;
    }
    
    @Override
    public final boolean oP() {
        return false;
    }
    
    @Override
    public final String oQ() {
        return "menu_item_listen_first";
    }
}
