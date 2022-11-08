import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import j$.time.Duration;
import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import java.util.Collection;
import java.util.Set;
import com.google.android.libraries.video.editablevideo.EditableVideo;

// 
// Decompiled by Procyon v0.6.0
// 

final class heh implements qxv
{
    final /* synthetic */ br a;
    private final /* synthetic */ int b;
    
    public heh(final hef a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public heh(final hek a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public heh(final hfl a, final int b) {
        this.b = b;
        this.a = (br)a;
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((hfl)this.a).at.addAll(set);
        }
    }
    
    public final void b(final EditableVideo editableVideo, int n) {
        final int b = this.b;
        if (b == 0) {
            if (n == 0 || n == 1) {
                final hek hek = (hek)this.a;
                final uac ai = hek.ai;
                if (ai != null) {
                    final EditableVideo b2 = ai.b;
                    if (b2 != null && (b2.n() != editableVideo.n() || b2.l() != editableVideo.l())) {
                        final uac ai2 = hek.ai;
                        ai2.getClass();
                        final EditableVideo b3 = ai2.b;
                        b3.getClass();
                        b3.F(editableVideo.n(), editableVideo.l());
                    }
                }
                final hem ak = ((hek)this.a).ak;
                if (ak != null) {
                    ak.d();
                }
            }
            return;
        }
        if (b == 1) {
            if (n == 0 || n == 1) {
                final hef hef = (hef)this.a;
                hef.ai = hgd.h(hef.ai, editableVideo);
                final aqyq ai3 = ((hef)this.a).ai;
                final int d = ai3.d;
                n = ai3.c;
                final uir e = ProgressBarData.e();
                e.d(d - n);
                e.c(2131102061);
                e.e(2131102069);
                final ProgressBarData a = e.a();
                final hef hef2 = (hef)this.a;
                final ProgressBarData[] am = hef2.am;
                if (am != null) {
                    final int length = am.length;
                    n = hef2.d;
                    if (length > n) {
                        am[n] = a;
                    }
                }
                final MultiSegmentCameraProgressIndicator aq = hef2.aq;
                if (aq != null) {
                    aq.d(am);
                }
            }
            return;
        }
        if (n == 0) {
            ((hfl)this.a).ar = editableVideo;
            ((hfl)this.a).aB.b(editableVideo.m());
            ((hfl)this.a).aQ();
            return;
        }
        if (n != 1) {
            return;
        }
        final hfl hfl = (hfl)this.a;
        hfl.ar = editableVideo;
        if (!hfl.at.isEmpty() && !((hfl)this.a).at.contains(0)) {
            ((hfl)this.a).aB.j(editableVideo.k() - Duration.ofSeconds(1L).toMillis());
        }
        ((hfl)this.a).aQ();
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((hfl)this.a).at.removeAll(set);
        }
    }
}
