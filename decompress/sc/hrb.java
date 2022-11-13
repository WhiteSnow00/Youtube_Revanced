import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import android.app.Activity;
import java.util.function.Consumer;
import j$.util.Optional;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrb implements View$OnClickListener
{
    public final Object a;
    private final int b;
    
    public hrb(final UploadActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hrf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hrm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hro a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final htm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final htn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final htr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final htu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hws a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hxa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hxj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final hxm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final iam a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hrb(final qcy a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final iam iam = (iam)this.a;
                ((Optional)iam.a.a()).ifPresent((Consumer)new hvr(iam, 17));
                return;
            }
            case 19: {
                ((hxm)this.a).aP();
                return;
            }
            case 18: {
                ((hxj)this.a).dismiss();
                return;
            }
            case 17: {
                ((hxa)this.a).dismiss();
                return;
            }
            case 16: {
                ((hws)this.a).a.br(false);
                return;
            }
            case 15: {
                ((vcy)((qcy)this.a).g).a(vdb.a("FEmy_videos"));
                return;
            }
            case 14: {
                ((hun)this.a).p();
                return;
            }
            case 13: {
                final Object a = this.a;
                ((UploadActivity)a).p.b((Activity)a, (byte[])null, (zmr)null);
                return;
            }
            case 12: {
                ((htu)this.a).a();
                return;
            }
            case 11: {
                ((htu)this.a).a();
                return;
            }
            case 10: {
                ((htr)this.a).a();
                return;
            }
            case 9: {
                ((htr)this.a).a();
                return;
            }
            case 8: {
                ((htn)this.a).b.c();
                return;
            }
            case 7: {
                ((htm)this.a).e.c();
                return;
            }
            case 6: {
                final hro hro = (hro)this.a;
                final int i = hro.i;
                if (i != 3) {
                    if (i != 1) {
                        if (i == 2) {
                            hro.i = 3;
                            hro.c.a(ControlsState.d());
                            hro.c();
                            if (!hro.h() || hro.g) {
                                hro.a();
                            }
                            final hpu hpu = (hpu)hro.b;
                            if (hpu.b.X()) {
                                hpu.h.d();
                                return;
                            }
                            hpu.b.a();
                        }
                        else {
                            hro.i = 1;
                            hro.c.a(ControlsState.e());
                            hro.f();
                            final hpu hpu2 = (hpu)hro.b;
                            if (hpu2.b.f()) {
                                hpu2.h.e();
                                return;
                            }
                            hpu2.b.Z(0L);
                            hpu2.b.C();
                        }
                    }
                }
                return;
            }
            case 5: {
                ((hrm)this.a).b.h();
                return;
            }
            case 4: {
                final hrf hrf = (hrf)this.a;
                if (hrf.f.f()) {
                    hrf.f.a();
                    hrf.C();
                    return;
                }
                hrf.f.C();
                hrf.x();
                return;
            }
            case 3: {
                ((hrf)this.a).y();
                return;
            }
            case 2: {
                ((hrf)this.a).b.bH();
                return;
            }
            case 1: {
                ((hrf)this.a).m();
                return;
            }
            case 0: {
                ((hrf)this.a).g();
            }
        }
    }
}
