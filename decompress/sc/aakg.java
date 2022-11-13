import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import android.media.AudioManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakg
{
    public final Context a;
    public final abjj b;
    public final vjg c;
    public final AudioManager d;
    public final aake e;
    public final aukf f;
    public final aakd g;
    public aakf h;
    public PlaybackAudioManager$RestorableState i;
    public int j;
    public PlayerResponseModel k;
    public int l;
    private final Executor m;
    
    public aakg(final Context a, final abjj b, final vjg c, final Executor m, final aukf f) {
        this.l = 2;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        m.getClass();
        this.m = m;
        this.f = f;
        this.j = 0;
        this.i = new PlaybackAudioManager$RestorableState();
        this.d = (AudioManager)a.getSystemService("audio");
        this.e = new aake(this);
        (this.g = new aakd(this)).a();
    }
    
    public final void a() {
        if (this.i.a) {
            this.m.execute(new aaog(this, 1));
        }
    }
}
