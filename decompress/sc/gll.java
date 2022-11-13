import android.text.TextUtils;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gll
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
    
    public gll(final String b, final amgs amgs, final String s) {
        this.i = 1;
        tvb.n(b);
        this.b = b;
        amgs.getClass();
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
    
    public final void c(final adms adms) {
        this.h = 0;
        int i;
        if ((i = adkp.i(adms.c)) == 0) {
            i = 1;
        }
        if (--i != 0) {
            if (i == 1) {
                this.f = 1.0;
                return;
            }
            if (i == 3) {
                this.c = true;
            }
        }
        else {
            aphv aphv;
            if ((aphv = aphv.b(adms.d)) == null) {
                aphv = aphv.a;
            }
            if (aphv == aphv.h) {
                this.h = 1;
                return;
            }
            aphv aphv2;
            if ((aphv2 = aphv.b(adms.d)) == null) {
                aphv2 = aphv.a;
            }
            if (aphv2 == aphv.i) {
                this.h = 2;
            }
        }
    }
}
