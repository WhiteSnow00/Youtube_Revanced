import android.text.TextUtils;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gld
{
    public final Uri a;
    public final String b;
    public boolean c;
    public boolean d;
    public double e;
    public double f;
    public double g;
    public int h;
    public int i;
    
    public gld(final String b, final ameo ameo, final String s) {
        this.i = 1;
        tsx.n(b);
        this.b = b;
        ameo.getClass();
        Uri parse;
        if (TextUtils.isEmpty((CharSequence)s)) {
            parse = null;
        }
        else {
            parse = Uri.parse(s);
        }
        this.a = parse;
        this.i = 1;
        this.e = 0.0;
        this.f = 0.0;
        this.g = 0.0;
    }
    
    public final double a() {
        return (this.e + this.f + this.g) / 3.0;
    }
    
    public final void b() {
        this.d = true;
    }
    
    public final void c(final adkr adkr) {
        this.h = 0;
        int c;
        if ((c = adio.C(adkr.c)) == 0) {
            c = 1;
        }
        if (--c != 0) {
            if (c == 1) {
                this.f = 1.0;
                return;
            }
            if (c == 3) {
                this.c = true;
            }
        }
        else {
            apfr apfr;
            if ((apfr = apfr.b(adkr.d)) == null) {
                apfr = apfr.a;
            }
            if (apfr == apfr.h) {
                this.h = 1;
                return;
            }
            apfr apfr2;
            if ((apfr2 = apfr.b(adkr.d)) == null) {
                apfr2 = apfr.a;
            }
            if (apfr2 == apfr.i) {
                this.h = 2;
            }
        }
    }
}
