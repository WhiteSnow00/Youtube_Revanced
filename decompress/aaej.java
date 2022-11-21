import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaej implements abtp
{
    public final zqb a;
    public final aadl b;
    private final abtp c;
    private final Executor d;
    private final tkq e;
    
    public aaej(final abtp c, final Executor d, final tkq e, final aadl b, final zqb a) {
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
    
    @Override
    public final void a(final aefs aefs, final tdg tdg) {
        if (this.e.p() && !((SubtitleTrack)aefs.a).m()) {
            this.c.a(aefs, tdg);
            return;
        }
        this.d.execute((Runnable)new zvn(this, aefs, tdg, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    @Override
    public final void b(final aefs aefs, final tdg tdg) {
        this.c.b(aefs, tdg);
    }
}
