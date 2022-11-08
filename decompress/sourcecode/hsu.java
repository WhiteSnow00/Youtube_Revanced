import android.widget.TextView;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.content.Context;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsu implements fzi
{
    public boolean a;
    final /* synthetic */ hsv b;
    private MenuItem c;
    private final Context d;
    private acqu e;
    
    public hsu(final hsv b, final Context d) {
        this.b = b;
        this.d = d;
    }
    
    public final void a() {
        if (!this.a) {
            return;
        }
        final aorg c = this.b.a.c();
        if (c != null && c.equals(aorg.f)) {
            final zer e = this.b.e;
            if (e != null && e.ag.d()) {
                e.aj.o(e.ag.a());
            }
        }
        this.b.e();
    }
    
    public final void b() {
        final MenuItem c = this.c;
        if (c != null) {
            c.setEnabled(this.a);
            final YouTubeTextView youTubeTextView = (YouTubeTextView)this.c.getActionView().findViewById(2131432241);
            final acqu e = this.e;
            ajsq ajsq = null;
            if (e != null) {
                final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
                ((agza)agzc).copyOnWrite();
                final aibb aibb = (aibb)agzc.instance;
                aibb.d = 2;
                aibb.c = 1;
                final boolean a = this.a;
                ((agza)agzc).copyOnWrite();
                final aibb aibb2 = (aibb)agzc.instance;
                aibb2.b |= 0x40;
                aibb2.h = (a ^ true);
                ((acqt)e).b(((agza)agzc).build(), (wwv)null);
            }
            final amak g = this.b.g;
            if (g != null) {
                if ((0x2 & g.b) != 0x0 && (ajsq = g.c) == null) {
                    ajsq = ajsq.a;
                }
                youTubeTextView.setText((CharSequence)abyh.b(ajsq));
            }
            youTubeTextView.setOnClickListener((View$OnClickListener)new hqg(this, 9));
            youTubeTextView.setEnabled(this.a);
        }
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
    
    public final void o(final MenuItem c) {
        (this.c = c).setActionView(2131625675);
        c.setShowAsAction(2);
        this.e = this.b.h.g((TextView)c.getActionView().findViewById(2131432241));
        c.getActionView().findViewById(2131432242).setOnClickListener((View$OnClickListener)new hqg(this, 10));
        this.b();
    }
    
    public final boolean p() {
        return true;
    }
    
    public final int q() {
        return 0;
    }
    
    public final CharSequence r() {
        return this.d.getString(2132019527);
    }
}
