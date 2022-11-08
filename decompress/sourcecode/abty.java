import java.util.UUID;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public class abty
{
    public final abtx u;
    public final abtx v;
    public final String w;
    public final int x;
    
    public abty(final long n, final long n2, final int x, final String s) {
        agot.u(n <= n2);
        this.u = new abtx(this, 1, n);
        this.v = new abtx(this, 2, n2);
        this.x = x;
        String string = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            string = UUID.randomUUID().toString();
        }
        this.w = string;
    }
    
    public static abtx r(final long n) {
        return new abty(n, n, Integer.MIN_VALUE, "\u0000").u;
    }
    
    public final long p() {
        return this.v.a;
    }
    
    public final long q() {
        return this.u.a;
    }
    
    public final boolean s(final long n) {
        final long q = this.q();
        boolean b2;
        final boolean b = b2 = false;
        if (n >= q) {
            if (n >= this.p()) {
                b2 = b;
                if (n == this.p()) {
                    if (this.q() == this.p()) {
                        return true;
                    }
                    b2 = b;
                }
            }
            else {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final String toString() {
        final String string = Long.toString(this.q());
        final String string2 = Long.toString(this.p());
        String s;
        if (this.q() == this.p()) {
            s = "]";
        }
        else {
            s = ")";
        }
        final StringBuilder sb = new StringBuilder("Interval[");
        sb.append(string);
        sb.append(", ");
        sb.append(string2);
        sb.append(s);
        return sb.toString();
    }
}
