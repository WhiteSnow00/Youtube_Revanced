import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsq extends hsp implements fzi
{
    MenuItem a;
    public final /* synthetic */ hsr b;
    
    public hsq(final hsr b) {
        this.b = b;
        super(b);
    }
    
    protected final void a(final boolean visible) {
        final MenuItem a = this.a;
        if (a != null) {
            a.setVisible(visible);
        }
    }
    
    public final int j() {
        return 2131429839;
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
    
    public final void o(final MenuItem a) {
        (this.a = a).setActionView(2131625675);
        this.a.setShowAsAction(2);
        this.c = (YouTubeTextView)this.a.getActionView().findViewById(2131432241);
        this.d = this.b.d.g((TextView)this.c);
        final View viewById = this.a.getActionView().findViewById(2131432242);
        viewById.setFilterTouchesWhenObscured(true);
        viewById.setOnClickListener((View$OnClickListener)new hqg(this, 8));
        this.b.g();
    }
    
    public final boolean p() {
        return true;
    }
    
    public final int q() {
        return 0;
    }
    
    public final CharSequence r() {
        return this.b.a.getString(2132019863);
    }
}
