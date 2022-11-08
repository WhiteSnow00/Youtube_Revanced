import android.util.Pair;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnh extends admd
{
    public final ScheduledExecutorService a;
    public final adjk b;
    public final adit c;
    public final adjo d;
    public final adjc f;
    public final Map g;
    final adji h;
    public final adcr i;
    private final zki k;
    
    public adnh(final arud arud, final ScheduledExecutorService a, final adcr i, final zki k, final adit c, final adjk b, final adjo d, final adjc f, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3) {
        super(arud, apfs.n, d, i, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.g = new HashMap();
        final adnf h = new adnf(this);
        this.h = (adji)h;
        this.a = a;
        this.i = i;
        this.k = k;
        this.c = c;
        this.b = b;
        this.d = d;
        this.f = f;
        b.a((adji)h);
    }
    
    public final adkb a(final adku adku) {
        return null;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.ae) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(final String s, final adit adit, final adku adku) {
        final TimeUnit hours = TimeUnit.HOURS;
        final ScheduledExecutorService a = this.a;
        zkh d;
        if ((adku.b & 0x1) != 0x0) {
            d = this.k.d(adku.e);
        }
        else {
            d = null;
        }
        zkh a2 = d;
        if (d == null) {
            a2 = zkg.a;
        }
        return aejt.a((aejs)new adns(this, a2, s, adku, 1), hours, a);
    }
    
    public final asit f() {
        return (asit)adna.c;
    }
    
    public final String g() {
        return "UploadFeedbackTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adku adku) {
        final adks a = adks.a;
        adks adks;
        if ((adks = adks.a(adku.l)) == null) {
            adks = adks.a;
        }
        Label_0144: {
            switch (adks.ordinal()) {
                case 3: {
                    adkr adkr;
                    if ((adkr = adku.R) == null) {
                        adkr = adkr.a;
                    }
                    final int c = adio.C(adkr.c);
                    if (c != 0 && c == 2) {
                        break Label_0144;
                    }
                    break;
                }
                case 1:
                case 5:
                case 6: {
                    adkr adkr2;
                    if ((adkr2 = adku.Q) == null) {
                        adkr2 = adkr.a;
                    }
                    final int c2 = adio.C(adkr2.c);
                    if (c2 != 0 && c2 == 2) {
                        break Label_0144;
                    }
                    break;
                }
                case 0:
                case 2:
                case 4: {
                    if ((adku.c & 0x200000) != 0x0) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public final void s(final String s, final adkr adkr) {
        synchronized (this.g) {
            final Pair pair = this.g.remove(s);
            if (pair == null) {
                return;
            }
            ((aeby)pair.second).g(((adnr)this).t(adkr, true));
        }
    }
}
