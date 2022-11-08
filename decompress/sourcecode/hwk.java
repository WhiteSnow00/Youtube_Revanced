import android.view.View;
import android.app.Activity;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwk implements fzi
{
    public final /* synthetic */ hwl a;
    
    public hwk(final hwl a) {
        this.a = a;
    }
    
    public final int j() {
        return 2131429835;
    }
    
    public final int k() {
        if (this.a.am.aQ()) {
            return 2131755021;
        }
        return 2131755020;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        menuItem.setShowAsAction(6);
        if (this.a.am.aQ()) {
            final View actionView = menuItem.getActionView();
            final fa at = this.a.at;
            if (at != null && actionView != null) {
                if (actionView.findViewById(2131431234) != null) {
                    final acqu g = this.a.an.g((TextView)actionView.findViewById(2131431234));
                    final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
                    ((agza)agzc).copyOnWrite();
                    final aibb aibb = (aibb)agzc.instance;
                    aibb.d = 44;
                    aibb.c = 1;
                    final ajsq g2 = abyh.g(new String[] { ((Activity)at).getResources().getString(2132019532) });
                    ((agza)agzc).copyOnWrite();
                    final aibb aibb2 = (aibb)agzc.instance;
                    g2.getClass();
                    aibb2.i = g2;
                    aibb2.b |= 0x200;
                    ((acqt)g).b(((agza)agzc).build(), (wwv)null);
                    ((acqt)g).c = (acqs)new rfk(this, (Activity)at, 1);
                }
            }
            return;
        }
        menuItem.setIcon(2131231663);
    }
    
    public final boolean p() {
        if (!this.a.am.aQ()) {
            this.a.r((znj)new fcd(this, 10));
        }
        return true;
    }
    
    public final int q() {
        return 0;
    }
    
    public final CharSequence r() {
        return "";
    }
}
