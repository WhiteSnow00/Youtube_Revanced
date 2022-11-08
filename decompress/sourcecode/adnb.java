import java.io.FileNotFoundException;
import java.io.File;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnb extends admd
{
    private final adoa a;
    private final adio b;
    private final adcr c;
    private final aeim d;
    private final aeim f;
    
    public adnb(final arud arud, final aeim f, final adio b, final adjo adjo, final adcr c, final adcr adcr, final aeim d, final adoa a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.s, adjo, c, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public final adkb a(final adku adku) {
        return (adkb)this.a;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.an) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(final String s, final adit adit, final adku adku) {
        this.b.b();
        this.f.i(2, Uri.parse(adku.g), (adlf)null).g((File)null);
        return afva.m(((adnr)this).t(this.e.t(), true));
    }
    
    public final asit f() {
        return (asit)adna.a;
    }
    
    public final String g() {
        return "SourceFileCheckerTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        final int b = adku.b;
        return (b & 0x4) != 0x0 && (b & 0x40) != 0x0;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof FileNotFoundException) {
            final adcr c = this.c;
            adks adks;
            if ((adks = adks.a(adku.l)) == null) {
                adks = adks.a;
            }
            c.l("SourceFileCheckerTask File Not Found", t, adks);
            return ((adnr)this).t(this.e.s(this.d.e(adku)), b);
        }
        return super.w(t, adku, b);
    }
}
