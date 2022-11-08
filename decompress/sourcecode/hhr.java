import com.google.android.libraries.video.editablevideo.EditableVideo;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhr implements View$OnClickListener, tvl
{
    public Context a;
    public View b;
    public AudioTrackView c;
    public AudioCrossFadeView d;
    public TextView e;
    public TextView f;
    public ImageButton g;
    public Button h;
    public Button i;
    public boolean j;
    public float k;
    public hhq l;
    
    public final float a() {
        if (this.j) {
            return this.k;
        }
        return 0.0f;
    }
    
    public final float b() {
        if (this.j) {
            return 0.0f;
        }
        return this.k;
    }
    
    public final View c() {
        return this.b;
    }
    
    public final void d() {
    }
    
    public final void e() {
    }
    
    public final void f() {
        if (this.j) {
            uji.I((tvl)this);
            this.j = false;
            tmy.v(this.b, false);
        }
    }
    
    public final void onClick(final View view) {
        if (view == this.h) {
            ((hid)this.l).bA();
            return;
        }
        if (view == this.g) {
            final hid hid = (hid)this.l;
            hid.bB((Track)null);
            hid.ak.f();
            final EditableVideo bu = hid.bu();
            final hhp al = hid.al;
            boolean b = false;
            if (bu != null) {
                b = b;
                if (bu.G()) {
                    b = true;
                }
            }
            al.g(b);
            return;
        }
        if (view == this.i) {
            this.l.e();
        }
    }
}
