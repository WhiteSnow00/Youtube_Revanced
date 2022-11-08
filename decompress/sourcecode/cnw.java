import android.util.Log;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnw extends clm
{
    private static final String g;
    public final coe a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private cmw i;
    
    static {
        g = cmr.b("WorkContinuationImpl");
    }
    
    public cnw(final coe coe, final String s, final int n, final List list) {
        this(coe, s, n, list, null);
    }
    
    public cnw(final coe a, final String b, int i, final List c, final byte[] array) {
        this.a = a;
        this.b = b;
        this.f = i;
        this.c = c;
        this.d = new ArrayList(c.size());
        this.h = new ArrayList();
        String u;
        for (i = 0; i < c.size(); ++i) {
            u = c.get(i).u();
            this.d.add(u);
            this.h.add(u);
        }
    }
    
    public static Set C() {
        return new HashSet();
    }
    
    public final cmw B() {
        if (!this.e) {
            final csf csf = new csf(this, new cnq());
            csk.b(this.a.k, (Runnable)csf);
            this.i = (cmw)csf.a;
        }
        else {
            cmr.a();
            final String g = cnw.g;
            final StringBuilder sb = new StringBuilder("Already enqueued work ids (");
            sb.append(TextUtils.join((CharSequence)", ", (Iterable)this.d));
            sb.append(")");
            Log.w(g, sb.toString());
        }
        return this.i;
    }
}
