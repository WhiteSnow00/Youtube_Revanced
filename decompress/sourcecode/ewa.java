import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewa extends ewd implements aeho
{
    public final Shell_UrlActivity a;
    public final fjj b;
    public final BandaidConnectionOpenerController c;
    public final tdz d;
    public final fes e;
    public final abpj f;
    public final lkn g;
    public final c h;
    private final rxr j;
    
    public ewa(final Shell_UrlActivity a, final fjj b, final BandaidConnectionOpenerController c, final tdz d, final c h, final fes e, final lkn g, final abpj f, final aegi aegi, final rxr j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.g = g;
        this.f = f;
        this.j = j;
        final aeht b2 = aehu.b((Activity)a);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        this.j.h(5, 2, 2);
    }
    
    public final boolean e() {
        final Intent intent = ((ewb)this.a).getIntent();
        final Uri data = intent.getData();
        boolean b = false;
        if (data != null) {
            if (!intent.getBooleanExtra("force_fullscreen", false)) {
                if (intent.getBooleanExtra("finish_on_ended", false)) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final void sR(final Throwable t) {
        this.j.i(5, t);
        this.a.finish();
    }
}
