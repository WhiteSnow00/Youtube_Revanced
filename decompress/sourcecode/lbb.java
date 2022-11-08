import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbb implements jat
{
    public final int a;
    public final lbn b;
    public final Context c;
    public final jdj d;
    public final abns e;
    public final DownAndOutController$LifecycleObserver f;
    public final lbc g;
    public final tdz h;
    public final boolean i;
    public boolean j;
    public boolean k;
    public final a l;
    private boolean m;
    private boolean n;
    
    public lbb(final Context c, final uyi uyi, final lbn b, final abns e, final lbc g, final tdz h, final jdj d, final a l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        e.getClass();
        this.e = e;
        this.g = g;
        this.h = h;
        this.f = new DownAndOutController$LifecycleObserver(this);
        this.d = d;
        this.i = (uyi.f(45366672L) ^ true);
        this.l = l;
        this.a = tmy.aZ(c.getResources().getDisplayMetrics(), 64);
    }
    
    public final void a(final aalo aalo) {
        final PlayerResponseModel b = aalo.b();
        if (aalo.c().b(abij.d) && b != null) {
            this.m = b.m().al();
            this.n = b.m().am();
        }
    }
    
    public final boolean b() {
        boolean b;
        if (tmy.bo(this.c)) {
            b = this.m;
        }
        else {
            b = this.n;
        }
        return b;
    }
    
    @Override
    public final void pf(final int n, final boolean b) {
        this.j = (n == 2);
    }
}
