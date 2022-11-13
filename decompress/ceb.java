import java.util.Collections;
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceb
{
    static final ceq f;
    public final List a;
    public final List b;
    public final abo c;
    public final SparseBooleanArray d;
    public final cea e;
    
    static {
        f = new ceq();
    }
    
    public ceb(final List a, final List b) {
        this.a = a;
        this.b = b;
        this.d = new SparseBooleanArray();
        this.c = new abo();
        final int size = a.size();
        int i = 0;
        cea e = null;
        int n = Integer.MIN_VALUE;
        while (i < size) {
            final cea cea = this.a.get(i);
            final int b2 = cea.b;
            if (b2 > n) {
                e = cea;
            }
            int n2;
            if (b2 > (n2 = n)) {
                n2 = b2;
            }
            ++i;
            n = n2;
        }
        this.e = e;
    }
    
    public static cdy b(final Bitmap bitmap) {
        return new cdy(bitmap);
    }
    
    public final int a(int a) {
        final cea e = this.e;
        if (e != null) {
            a = e.a;
        }
        return a;
    }
    
    public final cea c(final cec cec) {
        return (cea)this.c.get(cec);
    }
    
    public final List d() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
}
