import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.DurationButtonView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxx implements hcs
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public gxx(final gwg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxx(final gxz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.b != 0) {
            ((gwg)this.a).y();
            final gwj br = ((gwg)this.a).br;
            if (br != null) {
                final MultiSegmentCameraProgressIndicator a = br.a;
                if (a != null) {
                    a.setVisibility(0);
                }
            }
            final gwg gwg = (gwg)this.a;
            final DurationButtonView y = gwg.Y;
            if (y != null && gwg.bj) {
                y.setVisibility(0);
            }
            return;
        }
        ((gxz)this.a).w.n();
    }
    
    public final void b() {
        if (this.b != 0) {
            ((gwg)this.a).m();
            final gwj br = ((gwg)this.a).br;
            if (br != null) {
                final MultiSegmentCameraProgressIndicator a = br.a;
                if (a != null) {
                    a.setVisibility(4);
                }
            }
            final DurationButtonView y = ((gwg)this.a).Y;
            if (y != null) {
                y.setVisibility(8);
            }
            return;
        }
        ((gxz)this.a).w.i();
    }
}
