import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esw implements gzb, gzo, gzv, arll
{
    private final eqy a;
    private final esr b;
    
    public esw() {
    }
    
    public esw(final eqy a, final esr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final AudioTrackView audioTrackView) {
        audioTrackView.a = (txz)this.b.p.a();
        audioTrackView.f = (aujg)this.a.a.ar.a();
        audioTrackView.g = this.b.aS();
    }
    
    @Override
    public final void b(final TextTrackView textTrackView) {
        textTrackView.a = (txz)this.b.p.a();
        final aujg aujg = (aujg)this.a.a.ar.a();
        textTrackView.h = this.b.aS();
        final pja pja = (pja)this.a.a.ax.a();
        final pbg pbg = (pbg)this.a.a.ay.a();
    }
    
    @Override
    public final void c(final TimelineSeekBar timelineSeekBar) {
        timelineSeekBar.e = (txz)this.b.p.a();
        timelineSeekBar.f = (gzs)this.b.C.a();
        timelineSeekBar.g = (msr)this.b.y.a();
    }
}
