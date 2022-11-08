import android.animation.AnimatorSet;
import java.util.List;
import android.widget.TextView;
import android.view.View;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfe
{
    public static final Duration a;
    private static final Duration j;
    private static final Duration k;
    private static final Duration l;
    public abfn b;
    public abfn c;
    public final View d;
    public final abff e;
    public boolean f;
    public TextView g;
    public boolean h;
    public tmt i;
    
    static {
        j = Duration.ofMillis(200L);
        k = Duration.ofMillis(200L);
        l = Duration.ofMillis(200L);
        a = Duration.ofSeconds(1L);
    }
    
    public abfe(final View d, final abff e) {
        this.d = d;
        this.e = e;
    }
    
    public final abfn a(final int n, final int n2, final int n3) {
        final adkk c = abfn.c();
        c.f(abfe.j);
        final Duration l = abfe.l;
        c.e((List)afcr.t((Object)abfm.a(0.0f, 1.0f, l), (Object)abfm.a(1.0f, 1.0f, abfe.k), (Object)abfm.a(1.0f, 0.0f, l)));
        c.g((List)afcr.t((Object)this.d.findViewById(n), (Object)this.d.findViewById(n2), (Object)this.d.findViewById(n3)));
        c.a = new abfd(this);
        return c.d();
    }
    
    public final void b() {
        if (!this.f) {
            return;
        }
        final AnimatorSet a = this.b.a;
        if (a != null && a.isStarted()) {
            return;
        }
        this.b.b();
        this.c.b();
    }
}
