import android.content.Context;
import java.util.Map;
import java.util.List;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbx extends ContextWrapper
{
    static final dcm a;
    public final dgd b;
    public final List c;
    public final Map d;
    public final int e;
    public final clk f;
    public final cxz g;
    public final qbo h;
    private final dpa i;
    private final dbn j;
    private dnp k;
    
    static {
        a = (dcm)new dbm();
    }
    
    public dbx(final Context context, final dgd b, final dpa dpa, final clk f, final dbn j, final Map d, final List c, final qbo h, final cxz g, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context.getApplicationContext());
        this.b = b;
        this.f = f;
        this.j = j;
        this.c = c;
        this.d = d;
        this.h = h;
        this.g = g;
        this.e = e;
        this.i = cll.m(dpa);
    }
    
    public final dcf a() {
        return (dcf)this.i.a();
    }
    
    public final dnp b() {
        synchronized (this) {
            if (this.k == null) {
                final dnp a = this.j.a();
                a.W();
                this.k = a;
            }
            return this.k;
        }
    }
}
