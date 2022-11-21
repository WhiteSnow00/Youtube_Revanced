import java.util.Collections;
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cee
{
    static final cdn f;
    public final List a;
    public final List b;
    public final abp c;
    public final SparseBooleanArray d;
    public final ced e;
    
    static {
        f = new cdn();
    }
    
    public cee(final List a, final List b) {
        this.a = a;
        this.b = b;
        this.d = new SparseBooleanArray();
        this.c = new abp();
        final int size = a.size();
        int i = 0;
        ced e = null;
        int n = Integer.MIN_VALUE;
        while (i < size) {
            final ced ced = this.a.get(i);
            final int b2 = ced.b;
            if (b2 > n) {
                e = ced;
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
    
    public static ceb b(final Bitmap bitmap) {
        return new ceb(bitmap);
    }
    
    public final int a(int a) {
        final ced e = this.e;
        if (e != null) {
            a = e.a;
        }
        return a;
    }
    
    public final ced c(final cef cef) {
        return (ced)this.c.get((Object)cef);
    }
    
    public final List d() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
}
