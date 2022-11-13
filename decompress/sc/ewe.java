import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewe extends ewh implements aejp
{
    public final Shell_UrlActivity a;
    public final fjp b;
    public final BandaidConnectionOpenerController c;
    public final tgd d;
    public final fez e;
    public final llp f;
    public final abrj g;
    public final c h;
    private final rzv j;
    
    public ewe(final Shell_UrlActivity a, final fjp b, final BandaidConnectionOpenerController c, final tgd d, final c h, final fez e, final llp f, final abrj g, final aeij aeij, final rzv j, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        final aeju b2 = aejv.b((Activity)a);
        b2.b(rmv.class);
        aeij.d(b2.a());
        aeij.c((aejp)this);
    }
    
    public final void b() {
    }
    
    public final void c() {
        afse.j((aejp)this);
    }
    
    public final void d(final aeea aeea) {
        this.j.h(5, 2, 2);
    }
    
    public final boolean e() {
        final Intent intent = this.a.getIntent();
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
    
    public final void sX(final Throwable t) {
        this.j.i(5, t);
        this.a.finish();
    }
}
