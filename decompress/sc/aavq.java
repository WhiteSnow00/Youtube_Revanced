import java.util.concurrent.CopyOnWriteArraySet;
import android.view.ViewGroup;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavq implements aaod, aaqy
{
    public final Set a;
    public angg b;
    private final Context c;
    private final acgs d;
    private final ViewGroup e;
    private aavp f;
    private boolean g;
    
    public aavq(final Context c, final acgs d, final ViewGroup e) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.a = new CopyOnWriteArraySet();
    }
    
    public final void mk() {
        final aavp f = this.f;
        if (f != null) {
            ((aasb)f).l = true;
            this.b = null;
        }
    }
    
    public final void n(final angg b, final boolean g) {
        if (this.f != null && b != null && (!b.equals((Object)this.b) || this.g != g)) {
            this.b = b;
            this.g = g;
            final aavp f = this.f;
            final int b2 = b.b;
            final ajut ajut = null;
            ajut ajut2;
            if ((b2 & 0x2) != 0x0) {
                if ((ajut2 = b.d) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            final String string = acak.b(ajut2).toString();
            ajut ajut3 = ajut;
            if ((b.b & 0x4) != 0x0 && (ajut3 = b.e) == null) {
                ajut3 = ajut.a;
            }
            final String string2 = acak.b(ajut3).toString();
            aotp aotp;
            if ((aotp = b.j) == null) {
                aotp = aotp.a;
            }
            ((aasb)f.b).l = true;
            f.a.k(aald.J(aotp), (tcc)new aavo(f, 0));
            f.e.b(string);
            f.e.a(string2);
            final aatj c = f.c;
            ((aasb)c.a.b).l = true;
            final aath h = c.h;
            if (h != null) {
                ((aaus)h).i();
            }
            ((aasb)f).l = false;
        }
    }
    
    public final void o(final long n, final long n2) {
        final aavp f = this.f;
        if (f != null) {
            final aapl f2 = f.f;
            if (f2 == null) {
                ttr.b("Attempting to update progress on a null countdown progress UI component.");
                return;
            }
            final aapk k = f2.k;
            if (k != null && !k.isIndeterminate()) {
                f2.j.post((Runnable)new ypn(f2, n, n2, 3));
            }
            if (n == n2 && n != 0L) {
                f.c.g();
            }
        }
    }
    
    public final void rT(final aatn aatn, final aatj aatj) {
        aatj.c((aaru)(this.f = new aavp(this.c, aatn, aatj, this.d, this.e, this)));
        aatj.j = (aatd)this.f;
    }
    
    public final void rU() {
        this.f = null;
    }
}
