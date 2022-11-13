import android.util.SparseArray;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adaj implements adct
{
    static final afev a;
    public acax b;
    private final Activity c;
    private final SparseArray d;
    
    static {
        a = afev.p(amzq.b, "android.permission.READ_CONTACTS", amzq.k, "android.permission.CAMERA", amzq.i, "android.permission.WRITE_EXTERNAL_STORAGE", amzq.e, "android.permission.ACCESS_FINE_LOCATION");
    }
    
    public adaj(final Activity c, final atke atke, final atke atke2, final atke atke3) {
        this.d = new SparseArray();
        c.getClass();
        this.c = c;
        atke.getClass();
        atke2.getClass();
        atke3.getClass();
    }
    
    final adai a(final amzq amzq) {
        if (this.d.get(amzq.m, (Object)null) == null) {
            final afev a = adaj.a;
            if (a.containsKey(amzq)) {
                this.d.put(amzq.m, (Object)new adai(this.c, amzq, (String)a.get(amzq)));
            }
        }
        if (this.d.get(amzq.m, (Object)null) != null) {
            return (adai)this.d.get(amzq.m);
        }
        throw new IllegalArgumentException("Unsupported Permission Type");
    }
    
    final adai b(final amzr amzr) {
        adkp.H(amzr != null);
        amzq amzq;
        if ((amzq = amzq.b(amzr.c)) == null) {
            amzq = amzq.a;
        }
        return this.a(amzq);
    }
    
    public final void c(final int n, final int[] array) {
        final amzq b = amzq.b(n);
        if (adaj.a.containsKey(b)) {
            final adai a = this.a(b);
            final adcs d = a.d;
            if (d != null) {
                if (array.length > 0 && array[0] == 0) {
                    d.c();
                }
                else {
                    d.b();
                    if (!a.a.shouldShowRequestPermissionRationale(a.c)) {
                        a.d.a();
                    }
                }
                a.d = null;
            }
        }
    }
    
    public final boolean d(final amzr amzr) {
        final adai b = this.b(amzr);
        return b.a.checkSelfPermission(b.c) == 0;
    }
    
    public final void e(final amzr amzr, final adcs d) {
        final adai b = this.b(amzr);
        if (d != null) {
            b.d = d;
        }
        b.a.requestPermissions(new String[] { b.c }, b.b.m);
    }
}
