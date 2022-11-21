import android.util.Pair;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqw extends adpt
{
    public final ScheduledExecutorService a;
    public final adna b;
    public final admj c;
    public final adnd d;
    public final adms f;
    public final Map g;
    final admy h;
    public final adgg i;
    private final zoa k;
    
    public adqw(final arzb arzb, final ScheduledExecutorService a, final adgg i, final zoa k, final admj c, final adna b, final adnd d, final adms f, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arzb, apki.n, d, i, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.g = new HashMap();
        final adqu h = new adqu(this);
        this.h = h;
        this.a = a;
        this.i = i;
        this.k = k;
        this.c = c;
        this.b = b;
        this.d = d;
        this.f = f;
        b.a(h);
    }
    
    public final adnq a(final adoj adoj) {
        return null;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.ae) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        final TimeUnit hours = TimeUnit.HOURS;
        final ScheduledExecutorService a = this.a;
        znz d;
        if ((adoj.b & 0x1) != 0x0) {
            d = this.k.d(adoj.e);
        }
        else {
            d = null;
        }
        znz a2 = d;
        if (d == null) {
            a2 = zny.a;
        }
        return aenn.a((aenm)new adri(this, a2, s, adoj, 1), hours, a);
    }
    
    public final asme f() {
        return adqi.e;
    }
    
    public final String g() {
        return "UploadFeedbackTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adoj adoj) {
        final adoh a = adoh.a;
        adoh adoh;
        if ((adoh = adoh.a(adoj.l)) == null) {
            adoh = adoh.a;
        }
        Label_0148: {
            switch (adoh.ordinal()) {
                case 3: {
                    adog adog;
                    if ((adog = adoj.R) == null) {
                        adog = adog.a;
                    }
                    final int y = adme.y(adog.c);
                    if (y != 0 && y == 2) {
                        break Label_0148;
                    }
                    break;
                }
                case 1:
                case 5:
                case 6: {
                    adog adog2;
                    if ((adog2 = adoj.Q) == null) {
                        adog2 = adog.a;
                    }
                    final int y2 = adme.y(adog2.c);
                    if (y2 != 0 && y2 == 2) {
                        break Label_0148;
                    }
                    break;
                }
                case 0:
                case 2:
                case 4: {
                    if ((adoj.c & 0x200000) != 0x0) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public final void s(final String s, final adog adog) {
        synchronized (this.g) {
            final Pair pair = this.g.remove(s);
            if (pair == null) {
                return;
            }
            ((adgg)pair.second).Q((Object)((adrh)this).t(adog, true));
        }
    }
}
