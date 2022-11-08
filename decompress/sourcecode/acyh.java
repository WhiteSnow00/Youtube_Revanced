import android.util.SparseArray;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyh implements adaq
{
    static final afcw a;
    public abyv b;
    private final Activity c;
    private final SparseArray d;
    
    static {
        a = afcw.p((Object)amxm.b, (Object)"android.permission.READ_CONTACTS", (Object)amxm.k, (Object)"android.permission.CAMERA", (Object)amxm.i, (Object)"android.permission.WRITE_EXTERNAL_STORAGE", (Object)amxm.e, (Object)"android.permission.ACCESS_FINE_LOCATION");
    }
    
    public acyh(final Activity c, final atjj atjj, final atjj atjj2, final atjj atjj3) {
        this.d = new SparseArray();
        c.getClass();
        this.c = c;
        atjj.getClass();
        atjj2.getClass();
        atjj3.getClass();
    }
    
    final acyg a(final amxm amxm) {
        if (this.d.get(amxm.m, (Object)null) == null) {
            final afcw a = acyh.a;
            if (a.containsKey((Object)amxm)) {
                this.d.put(amxm.m, (Object)new acyg(this.c, amxm, (String)a.get((Object)amxm)));
            }
        }
        if (this.d.get(amxm.m, (Object)null) != null) {
            return (acyg)this.d.get(amxm.m);
        }
        throw new IllegalArgumentException("Unsupported Permission Type");
    }
    
    final acyg b(final amxn amxn) {
        agot.u(amxn != null);
        amxm amxm;
        if ((amxm = amxm.b(amxn.c)) == null) {
            amxm = amxm.a;
        }
        return this.a(amxm);
    }
    
    public final void c(final int n, final int[] array) {
        final amxm b = amxm.b(n);
        if (acyh.a.containsKey((Object)b)) {
            final acyg a = this.a(b);
            final adap d = a.d;
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
    
    public final boolean d(final amxn amxn) {
        final acyg b = this.b(amxn);
        return b.a.checkSelfPermission(b.c) == 0;
    }
    
    public final void e(final amxn amxn, final adap d) {
        final acyg b = this.b(amxn);
        if (d != null) {
            b.d = d;
        }
        b.a.requestPermissions(new String[] { b.c }, b.b.m);
    }
}
