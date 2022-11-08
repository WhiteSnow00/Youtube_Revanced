import android.content.res.Resources$Theme;
import android.content.res.Resources;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivm extends fnh implements fjo
{
    public final abqa a;
    public final abrv b;
    public SubtitleTrack c;
    public Runnable d;
    private final abbh e;
    private final CaptioningManager f;
    private final Context g;
    private final fjp h;
    private boolean i;
    private SubtitlesStyle j;
    
    public ivm(final Context g, final CaptioningManager f, final abqa a, final abrv b, final abbh e, final qv qv, final fjp h, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        this.g = g;
        this.e = e;
        this.b = b;
        this.f = f;
        this.h = h;
        this.a = a;
        a.f.add(new qpt(this));
    }
    
    public final void lV() {
        this.h.n((fjo)this);
    }
    
    public final void oL(final fkk fkk, final fkk fkk2) {
        if (fkk.e() && !fkk2.e()) {
            final ihc d = new ihc(this, 14);
            this.d = (Runnable)d;
            if (this.c != null) {
                ((Runnable)d).run();
                this.d = null;
                this.c = null;
            }
        }
        else if (!fkk.e() && fkk2.e()) {
            this.d = null;
        }
        if (fkk2.e()) {
            final CaptioningManager f = this.f;
            if (f != null && !f.isEnabled()) {
                this.e.g(1.0f);
                final abbh e = this.e;
                if (this.j == null) {
                    final Resources resources = this.g.getResources();
                    final Resources$Theme theme = this.g.getTheme();
                    this.j = new SubtitlesStyle(ahu.a(resources, 2131100927, theme), ahu.a(resources, 2131100930, theme), ahu.a(resources, 2131100928, theme), 5, ahu.a(resources, 2131100929, theme), 8);
                }
                e.i(this.j);
                this.e.h(this.g.getResources().getDimensionPixelOffset(2131166937), 0);
                this.i = true;
                return;
            }
        }
        if (this.i) {
            this.e.i(this.b.b());
            this.e.g(this.b.a());
            this.e.h(0, 0);
            this.i = false;
        }
    }
    
    public final void qB() {
        this.h.l((fjo)this);
    }
}
