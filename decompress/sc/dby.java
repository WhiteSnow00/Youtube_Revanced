import android.content.Context;
import java.util.Map;
import java.util.List;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dby extends ContextWrapper
{
    static final dcn a;
    public final dge b;
    public final List c;
    public final Map d;
    public final int e;
    public final cll f;
    public final cya g;
    public final qcy h;
    private final dpb i;
    private final dbo j;
    private dnq k;
    
    static {
        a = (dcn)new dbn();
    }
    
    public dby(final Context context, final dge b, final dpb dpb, final cll f, final dbo j, final Map d, final List c, final qcy h, final cya g, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context.getApplicationContext());
        this.b = b;
        this.f = f;
        this.j = j;
        this.c = c;
        this.d = d;
        this.h = h;
        this.g = g;
        this.e = e;
        this.i = clm.m(dpb);
    }
    
    public final dcg a() {
        return (dcg)this.i.a();
    }
    
    public final dnq b() {
        synchronized (this) {
            if (this.k == null) {
                final dnq a = this.j.a();
                a.W();
                this.k = a;
            }
            return this.k;
        }
    }
}
