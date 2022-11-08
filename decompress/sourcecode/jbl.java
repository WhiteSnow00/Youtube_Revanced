import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbl
{
    public final abns a;
    public final DefaultScrubberEventLogger$LifecycleObserver b;
    public String c;
    private final wvu d;
    private final aays e;
    
    public jbl(final wvu d, final aays e, final abns a, final abcd abcd, final jbj jbj) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = new DefaultScrubberEventLogger$LifecycleObserver(this);
        abcd.q((abcc)new jbk(this, 0));
        jbj.a = this;
    }
    
    public final void a(final int n) {
        final TimelineMarker[] n2 = this.e.n(abcg.f);
        if (n2 != null) {
            if (n2.length != 0) {
                final anuu a = anuv.a();
                ((agza)a).copyOnWrite();
                final anuv anuv = (anuv)a.instance;
                boolean b = true;
                anuv.c(anuv, true);
                if (n != 1) {
                    b = false;
                }
                ((agza)a).copyOnWrite();
                anuv.d((anuv)a.instance, b);
                final String c = this.c;
                if (c != null) {
                    ((agza)a).copyOnWrite();
                    anuv.e((anuv)a.instance, c);
                }
                final aklo d = aklq.d();
                ((agza)d).copyOnWrite();
                aklq.cs((aklq)d.instance, (anuv)((agza)a).build());
                this.d.d((aklq)((agza)d).build());
            }
        }
    }
}
