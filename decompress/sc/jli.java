import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jli extends acld
{
    private final Context a;
    private final FrameLayout b;
    private jlf c;
    private jlf d;
    private final ktn e;
    
    public jli(final Context a, final vcy vcy, final acgs acgs, final acvi acvi, final ziy ziy, final acpk acpk, final hwn hwn, final hyx hyx, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
        this.e = new ktn(a, vcy, acgs, acvi, ziy, acpk, hwn, hyx, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = new FrameLayout(a);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acku acku) {
        final jlf c = this.c;
        if (c != null) {
            c.c(acku);
        }
        final jlf d = this.d;
        if (d != null) {
            d.c(acku);
        }
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aprq)o).o.I();
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aprq aprq = (aprq)o;
        jlf jlf;
        if (tpe.bq(this.a)) {
            if (this.d == null) {
                this.d = this.e.c((ViewGroup)this.b, 2);
            }
            jlf = this.d;
        }
        else {
            if (this.c == null) {
                this.c = this.e.c((ViewGroup)this.b, 1);
            }
            jlf = this.c;
        }
        this.b.removeAllViews();
        this.b.addView(jlf.a);
        jlf.d(ackm, aprq);
    }
}
