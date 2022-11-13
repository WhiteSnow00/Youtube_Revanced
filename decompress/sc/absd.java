import java.util.Map;
import android.util.Pair;
import java.util.concurrent.Future;
import java.util.TreeMap;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absd
{
    public final ScheduledExecutorService a;
    public final FormatStreamModel b;
    public final TreeMap c;
    public final String d;
    public final abwa e;
    public final abhv f;
    public final abss g;
    public final String h;
    public Future i;
    public Long j;
    public boolean k;
    public final Long l;
    public final Long m;
    public final aukf n;
    
    public absd(final String h, final ScheduledExecutorService a, final FormatStreamModel b, final String d, final abwa e, final ttg ttg, final abhv f, final aukf n, final Long l, final Long m) {
        this.h = h;
        this.b = b;
        this.a = a;
        this.d = d;
        this.e = e;
        final int e2 = b.e();
        Object g;
        if (e2 != 386) {
            if (e2 != 387) {
                g = null;
            }
            else {
                g = new absu(ttg);
            }
        }
        else {
            g = new abst(ttg);
        }
        this.g = (abss)g;
        this.f = f;
        this.n = n;
        this.l = l;
        this.m = m;
        this.c = new TreeMap();
        this.i = null;
        this.j = null;
        this.k = false;
    }
    
    public final Long a(final long n) {
        final TreeMap c = this.c;
        final Long value = n;
        Object floorEntry = c.floorEntry(value);
        final Map.Entry<Long, Object> ceilingEntry = this.c.ceilingEntry(value);
        Label_0102: {
            if (floorEntry == null && ceilingEntry == null) {
                floorEntry = null;
            }
            else {
                if (floorEntry != null) {
                    if (ceilingEntry == null) {
                        break Label_0102;
                    }
                    if (n - ((Map.Entry<Long, Object>)floorEntry).getKey() < ceilingEntry.getKey() - n) {
                        break Label_0102;
                    }
                }
                floorEntry = ceilingEntry;
            }
        }
        if (floorEntry == null) {
            return null;
        }
        final Pair pair = ((Map.Entry<Long, Pair>)floorEntry).getValue();
        return (long)((long)pair.first + (n - ((Map.Entry<Long, Object>)floorEntry).getKey()) / (float)(int)pair.second);
    }
    
    public final void b() {
        synchronized (this) {
            this.c.clear();
            final Future i = this.i;
            if (i != null && !i.isDone()) {
                this.i.cancel(true);
            }
            this.i = null;
            this.j = null;
            this.k = false;
        }
    }
    
    public final boolean c() {
        return this.f != null;
    }
}
