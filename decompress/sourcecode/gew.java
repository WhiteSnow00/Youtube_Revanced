import com.google.android.libraries.youtube.player.ui.PlayerView;
import java.util.Iterator;
import android.view.View;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.Set;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gew extends fnh implements kyx, foa, fjo, abrw, abnq, geo
{
    public boolean a;
    public float b;
    public Rect c;
    private final Set d;
    private final abns e;
    private final asib f;
    private float g;
    private float h;
    private int i;
    private int j;
    private Rect k;
    private fkk l;
    private boolean m;
    private final iqi n;
    
    public gew(final iqi n, final atjj atjj, final abns e, final qv qv, final fjp fjp, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        this.c = new Rect();
        this.l = fkk.a;
        this.n = n;
        this.d = (Set)new abi();
        this.e = e;
        this.f = new asib();
        this.j();
        fjp.l((fjo)this);
        ((abrx)atjj.a()).a(this);
        inlinePlaybackLifecycleController.o((geo)this);
    }
    
    private final void i() {
        final YouTubePlayerViewNotForReflection r = ((iqw)this.n.b()).R;
        if (r != null) {
            final View m = ((absd)r).m;
            if (m != null && !ana.an(m)) {
                ((absd)r).m.requestLayout();
            }
        }
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((qpt)iterator.next()).o();
        }
    }
    
    private final void j() {
        this.g = -1.0f;
        this.l = fkk.a;
        this.k = null;
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
    }
    
    private final void k(final float g) {
        if (this.g == g) {
            return;
        }
        this.g = g;
        this.i();
    }
    
    public final Rect a(Rect k) {
        Rect i = k;
        if (this.m) {
            i = k;
            if (this.h > 0.0f) {
                final float g = this.g;
                i = k;
                if (g > 0.0f) {
                    if (Float.isNaN(g)) {
                        i = k;
                    }
                    else {
                        if (this.k == null) {
                            this.k = new Rect();
                        }
                        gow.s(this.h, k, this.k);
                        k = this.k;
                        gow.q(k, this.g, k);
                        i = this.k;
                    }
                }
            }
        }
        return i;
    }
    
    public final void b() {
        if (this.l.e()) {
            final float b = this.b;
            if (b > 0.0f) {
                final float h = this.h;
                if (h > 0.0f) {
                    if (this.m) {
                        float n2;
                        final float n = n2 = b / h;
                        if (n <= 1.0f) {
                            n2 = 1.0f / n;
                        }
                        this.k(n2);
                        return;
                    }
                    this.k(1.0f);
                }
            }
        }
    }
    
    public final void f(final int i, final int j) {
        if (i <= 0 || j <= 0) {
            this.h = 0.0f;
            this.i = 0;
            this.j = 0;
            return;
        }
        if (this.i == i && this.j == j) {
            return;
        }
        this.i = i;
        this.j = j;
        this.h = i / (float)j;
        this.b();
        this.i();
    }
    
    public final void g(final qpt qpt) {
        this.d.add(qpt);
    }
    
    public final void h(final qpt qpt) {
        this.d.remove(qpt);
    }
    
    public final void lV() {
        this.f.b();
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().b).am((asix)new gag(this, 9), (asix)fts.k) };
    }
    
    public final void oK(final fkk l) {
        if (l != fkk.j) {
            this.j();
            return;
        }
        this.l = l;
        this.b();
    }
    
    public final void q(final ged ged, final int n, final int n2) {
        if (n2 == 0) {
            this.m = false;
            final YouTubePlayerViewNotForReflection r = ((iqw)this.n.b()).R;
            if (r != null) {
                ((PlayerView)r).setBackgroundColor(-16777216);
            }
            return;
        }
        if (n2 == 1) {
            final gle b = ged.b;
            this.m = b.n();
            final YouTubePlayerViewNotForReflection r2 = ((iqw)this.n.b()).R;
            if (b.m() && r2 != null) {
                ((PlayerView)r2).setBackgroundColor(tmy.cn(((PlayerView)r2).getContext(), 2130970838));
            }
        }
    }
    
    public final void qB() {
        this.f.b();
        this.f.f(this.lX(this.e));
    }
}
