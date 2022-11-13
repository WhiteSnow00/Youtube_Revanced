import android.os.SystemClock;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bef extends azb
{
    public final int c;
    public final String d;
    public final int e;
    public final ayg f;
    public final int g;
    public final ayy h;
    final boolean i;
    
    public bef(final int n, final Throwable t, final int n2) {
        this(n, t, null, n2, null, -1, null, 4, false);
    }
    
    public bef(final int n, final Throwable t, final String s, final int n2, final String s2, final int n3, final ayg ayg, final int n4, final boolean b) {
        String string;
        if (n != 0) {
            if (n != 1) {
                if (n != 3) {
                    string = "Unexpected runtime error";
                }
                else {
                    string = "Remote error";
                }
            }
            else {
                final String value = String.valueOf(ayg);
                final String r = bax.R(n4);
                final StringBuilder sb = new StringBuilder();
                sb.append(s2);
                sb.append(" error, index=");
                sb.append(n3);
                sb.append(", format=");
                sb.append(value);
                sb.append(", format_supported=");
                sb.append(r);
                string = sb.toString();
            }
        }
        else {
            string = "Source error";
        }
        String string2 = string;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(": ");
            sb2.append(s);
            string2 = sb2.toString();
        }
        this(string2, t, n2, n, s2, n3, ayg, n4, null, SystemClock.elapsedRealtime(), b);
    }
    
    private bef(final String s, final Throwable t, int c, final int n, final String d, final int e, final ayg f, final int g, final ayy h, final long n2, final boolean i) {
        super(s, t, c, n2);
        final boolean b = false;
        boolean b2 = false;
        Label_0042: {
            if (i) {
                c = n;
                if (c != 1) {
                    b2 = false;
                    break Label_0042;
                }
                c = 1;
            }
            else {
                c = n;
            }
            b2 = true;
        }
        dk.f(b2);
        boolean b3 = false;
        Label_0063: {
            if (t == null) {
                b3 = b;
                if (c != 3) {
                    break Label_0063;
                }
            }
            b3 = true;
        }
        dk.f(b3);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static bef b(final RuntimeException ex, final int n) {
        return new bef(2, ex, n);
    }
    
    final bef a(final ayy ayy) {
        final String message = this.getMessage();
        final int a = bax.a;
        return new bef(message, this.getCause(), this.a, this.c, this.d, this.e, this.f, this.g, ayy, this.b, this.i);
    }
}
