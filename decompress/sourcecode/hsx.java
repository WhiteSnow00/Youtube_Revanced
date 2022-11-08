import android.widget.TextView;
import java.util.Map;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsx implements fzi
{
    final /* synthetic */ EditVideoActivity a;
    private MenuItem b;
    private boolean c;
    private acqu d;
    
    public hsx(final EditVideoActivity a) {
        this.a = a;
    }
    
    private final void c() {
        final MenuItem b = this.b;
        if (b != null) {
            b.setEnabled(this.c);
            final YouTubeTextView youTubeTextView = (YouTubeTextView)this.b.getActionView().findViewById(2131432241);
            final acqu d = this.d;
            final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
            ((agza)agzc).copyOnWrite();
            final aibb aibb = (aibb)agzc.instance;
            aibb.d = 2;
            aibb.c = 1;
            final boolean c = this.c;
            ((agza)agzc).copyOnWrite();
            final aibb aibb2 = (aibb)agzc.instance;
            aibb2.b |= 0x40;
            aibb2.h = (c ^ true);
            ((acqt)d).b(((agza)agzc).build(), (wwv)null);
            if (!this.a.E.aO()) {
                youTubeTextView.setText(2132019527);
            }
            else {
                youTubeTextView.setText(2132019528);
            }
            youTubeTextView.setFilterTouchesWhenObscured(true);
            youTubeTextView.setOnClickListener((View$OnClickListener)new hqg(this, 11));
            youTubeTextView.setEnabled(this.c);
        }
    }
    
    public final void a() {
        if (!this.c) {
            return;
        }
        final EditVideoActivity a = this.a;
        final akrj x = a.x;
        if ((x.b & 0x8) != 0x0) {
            final vax i = a.i;
            aioe aioe;
            if ((aioe = x.d) == null) {
                aioe = aioe.a;
            }
            i.c(aioe, (Map)null);
        }
    }
    
    public final void b(final boolean c) {
        this.c = c;
        this.c();
    }
    
    public final int j() {
        return 2131429834;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return false;
    }
    
    public final void o(final MenuItem b) {
        (this.b = b).setActionView(2131625675);
        this.b.setShowAsAction(2);
        this.d = this.a.K.g((TextView)this.b.getActionView().findViewById(2131432241));
        this.b.getActionView().findViewById(2131432242).setOnClickListener((View$OnClickListener)new hqg(this, 12));
        this.c();
    }
    
    public final boolean p() {
        return true;
    }
    
    public final int q() {
        return 0;
    }
    
    public final CharSequence r() {
        return this.a.getString(2132019527);
    }
}
