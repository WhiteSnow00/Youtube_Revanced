import java.io.FileNotFoundException;
import java.io.File;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqr extends adpt
{
    private final adrt a;
    private final adgg b;
    private final adme c;
    private final aheu d;
    private final aheu f;
    
    public adqr(final arzb arzb, final aheu f, final adme c, final adnd adnd, final adgg b, final adgg adgg, final aheu d, final adrt a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(arzb, apki.s, adnd, b, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.a;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.an) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        this.c.E();
        this.f.q(adoj, 2, Uri.parse(adoj.g), (adou)null).g(null);
        return afxr.l(((adrh)this).t(this.e.n(), true));
    }
    
    public final asme f() {
        return adqi.d;
    }
    
    public final String g() {
        return "SourceFileCheckerTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x4) != 0x0 && (b & 0x40) != 0x0;
    }
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof FileNotFoundException) {
            final adgg b2 = this.b;
            adoh adoh;
            if ((adoh = adoh.a(adoj.l)) == null) {
                adoh = adoh.a;
            }
            b2.E("SourceFileCheckerTask File Not Found", t, adoh);
            return ((adrh)this).t(this.e.m(this.d.m(adoj)), b);
        }
        return super.w(t, adoj, b);
    }
}
