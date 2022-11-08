import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class est implements gyl, gyx, gze, ariw
{
    private final eqv a;
    private final eso b;
    
    public est() {
    }
    
    public est(final eqv a, final eso b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final AudioTrackView audioTrackView) {
        audioTrackView.a = (tvt)this.b.p.a();
        audioTrackView.g = (auip)this.a.a.aq.a();
        audioTrackView.f = this.b.aM();
    }
    
    public final void b(final TextTrackView textTrackView) {
        textTrackView.a = (tvt)this.b.p.a();
        final auip auip = (auip)this.a.a.aq.a();
        textTrackView.h = this.b.aM();
        final phq phq = (phq)this.a.a.aw.a();
        final ozv ozv = (ozv)this.a.a.ax.a();
    }
    
    public final void c(final TimelineSeekBar timelineSeekBar) {
        timelineSeekBar.e = (tvt)this.b.p.a();
        timelineSeekBar.f = (gzb)this.b.D.a();
        timelineSeekBar.g = (mrm)this.b.z.a();
    }
}
