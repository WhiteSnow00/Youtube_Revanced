import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaas implements abqd
{
    public final zmj a;
    public final zzu b;
    private final abqd c;
    private final Executor d;
    private final thh e;
    
    public aaas(final abqd c, final Executor d, final thh e, final zzu b, final zmj a) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public final void a(final aeby aeby, final szx szx) {
        if (this.e.p() && !((SubtitleTrack)aeby.a).m()) {
            this.c.a(aeby, szx);
            return;
        }
        this.d.execute((Runnable)new zry(this, aeby, szx, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void b(final aeby aeby, final szx szx) {
        this.c.b(aeby, szx);
    }
}
