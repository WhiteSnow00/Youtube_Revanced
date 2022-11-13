import java.util.Iterator;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hol implements Runnable
{
    public final Object a;
    private final int b;
    
    public hol(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final aslr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final ReelPlayerProgressPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final EditVideoActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final UploadActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hnm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final how a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hrf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hro a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hts a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hvk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hol(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final hwl hwl = (hwl)this.a;
                hwl.aT.post((Runnable)new hvt(hwl, 1));
                return;
            }
            case 19: {
                ((hwl)this.a).br(true);
                return;
            }
            case 18: {
                ((hvk)this.a).h();
                return;
            }
            case 17: {
                ((hun)this.a).q();
                return;
            }
            case 16: {
                final UploadActivity uploadActivity = (UploadActivity)this.a;
                uploadActivity.G(uploadActivity.H);
                return;
            }
            case 15: {
                final UploadActivity uploadActivity2 = (UploadActivity)this.a;
                final hun s = uploadActivity2.s;
                for (final adop adop : s.B) {
                    s.D.j(adop.c(), apht.at, adop.e(), adop.d());
                }
                uploadActivity2.J.a();
                uploadActivity2.K.d(true);
                return;
            }
            case 14: {
                final UploadActivity uploadActivity3 = (UploadActivity)this.a;
                final hun s2 = uploadActivity3.s;
                for (final adop adop2 : s2.B) {
                    s2.D.j(adop2.c(), apht.as, adop2.e(), adop2.d());
                }
                uploadActivity3.J();
                uploadActivity3.J.a();
                uploadActivity3.K.d(true);
                uploadActivity3.w();
                return;
            }
            case 13: {
                ((aslr)this.a).a();
                return;
            }
            case 12: {
                final EditVideoActivity editVideoActivity = (EditVideoActivity)this.a;
                editVideoActivity.D = true;
                if (editVideoActivity.E) {
                    editVideoActivity.w();
                    editVideoActivity.E = false;
                }
                return;
            }
            case 11: {
                ((EditVideoActivity)this.a).v();
                return;
            }
            case 10: {
                ((hts)this.a).e();
                return;
            }
            case 9: {
                final hro hro = (hro)this.a;
                if (!hro.i() && hro.h()) {
                    final hro hro2 = (hro)this.a;
                    if (!hro2.g) {
                        hro2.b();
                    }
                }
                return;
            }
            case 8: {
                ((ReelPlayerProgressPresenter)this.a).c();
                return;
            }
            case 7: {
                ((View)this.a).setVisibility(0);
                return;
            }
            case 6: {
                final hrf hrf = (hrf)this.a;
                hnu.f(hrf.i, hrf.t);
                return;
            }
            case 5: {
                ((hou)this.a).b.aq.C();
                return;
            }
            case 4: {
                how.bF(((hou)this.a).b);
                return;
            }
            case 3: {
                ((how)this.a).aX(37419);
                return;
            }
            case 2: {
                ((how)this.a).aX(37419);
                return;
            }
            case 1: {
                ((hnm)this.a).a();
                return;
            }
            case 0: {
                final how how = (how)this.a;
                how.aq.C();
                if (how.al.e()) {
                    how.aq.a();
                }
            }
        }
    }
}
