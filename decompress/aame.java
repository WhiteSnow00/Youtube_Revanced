import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import android.media.AudioManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aame
{
    public final Context a;
    public final abkq b;
    public final vko c;
    public final AudioManager d;
    public final aamc e;
    public final auna f;
    public final aamb g;
    public aamd h;
    public PlaybackAudioManager$RestorableState i;
    public int j;
    public PlayerResponseModel k;
    public int l;
    private final Executor m;
    
    public aame(final Context a, final abkq b, final vko c, final Executor m, final auna f) {
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
        this.e = new aamc(this);
        (this.g = new aamb(this)).a();
    }
    
    public final void a() {
        if (this.i.a) {
            this.m.execute((Runnable)new zvy(this, 20));
        }
    }
}
