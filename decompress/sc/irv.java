import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irv implements fju, fod
{
    public int a;
    public View b;
    public View c;
    public final foj[] d;
    private final abpq e;
    private final abjj f;
    private final boolean g;
    private int h;
    private final iri i;
    
    public irv(final abpq e, final abjj f, final iri i, final vai vai) {
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = vai.aY();
        this.d = new foj[2];
        this.h = -1;
    }
    
    public final void a(float max) {
        this.d[this.a].setAlpha(max);
        final int h = (int)(max * 5.0f);
        if (h != this.h) {
            this.h = h;
            max = Math.max(0.0f, Math.min(1.0f, 1.0f - (float)(Math.log(5 - h + 1) / Math.log(6.0))));
            ((iru)this.i.b()).u.O(max);
        }
    }
    
    public final void b(final int a) {
        if (this.a == a) {
            return;
        }
        this.a(1.0f);
        if (!this.g) {
            if (!this.f.k) {
                this.e.a();
            }
            this.e.B(false);
        }
        final View b = this.b;
        b.getClass();
        final View c = this.c;
        c.getClass();
        this.d[this.a].b(b, c);
        this.a = a;
        this.d[a].a(this.b, this.c);
        final iru iru = (iru)this.i.b();
        final YouTubePlayerViewNotForReflection r = iru.R;
        if (r != null) {
            if (!iru.K) {
                iru.u.y(((PlayerView)r).d, (abjg)iru.r.a(), iru.H.C);
                return;
            }
            if (iru.L) {
                iru.u.al(1L, anza.D);
            }
        }
    }
    
    @Override
    public final void n(final fkr fkr) {
        if (fkr != fkr.a) {
            this.b(fkr.e() ? 1 : 0);
        }
        if (fkr != fkr.h && fkr.g()) {
            this.a(1.0f);
        }
    }
    
    @Override
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
}
