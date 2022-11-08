import j$.time.Duration;
import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public class abff
{
    public final Resources a;
    private final tku b;
    private int c;
    private aeef d;
    private aeef e;
    
    public abff(final Context context, final tku b) {
        this.b = b;
        this.a = context.getResources();
    }
    
    public Duration a() {
        Duration duration;
        if ((((aqos)this.b.c()).b & 0x1) != 0x0) {
            agyo agyo;
            if ((agyo = ((aqos)this.b.c()).c) == null) {
                agyo = agyo.a;
            }
            duration = Duration.ofSeconds(agyo.b);
        }
        else {
            duration = Duration.ofSeconds(10L);
            duration.getClass();
        }
        return duration;
    }
    
    public final CharSequence b() {
        final int n = (int)(this.c * this.a().getSeconds());
        return this.a.getQuantityString(2131886136, n, new Object[] { n });
    }
    
    public final void c() {
        this.c = 0;
    }
    
    public final void d(final aeef e) {
        final aeef e2 = this.e;
        this.d = e2;
        this.e = e;
        if (e2 != null && e2.b != this.e.b) {
            this.c();
        }
        ++this.c;
    }
}
