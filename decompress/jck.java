import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jck
{
    public final abpu a;
    public final DefaultScrubberEventLogger$LifecycleObserver b;
    public String c;
    private final wxx d;
    private final abap e;
    
    public jck(final wxx d, final abap e, final abpu a, final abdx abdx, final jci jci) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = new DefaultScrubberEventLogger$LifecycleObserver(this);
        abdx.q((abdw)new jcj(this, 0));
        jci.a = this;
    }
    
    public final void a(final int n) {
        final TimelineMarker[] n2 = this.e.n(abea.f);
        if (n2 != null) {
            if (n2.length != 0) {
                final anwx a = anwy.a();
                ((ahaz)a).copyOnWrite();
                final anwy anwy = (anwy)a.instance;
                boolean b = true;
                anwy.c(anwy, true);
                if (n != 1) {
                    b = false;
                }
                ((ahaz)a).copyOnWrite();
                anwy.d((anwy)a.instance, b);
                final String c = this.c;
                if (c != null) {
                    ((ahaz)a).copyOnWrite();
                    anwy.e((anwy)a.instance, c);
                }
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.ct((aknt)d.instance, (anwy)((ahaz)a).build());
                this.d.d((aknt)((ahaz)d).build());
            }
        }
    }
}
