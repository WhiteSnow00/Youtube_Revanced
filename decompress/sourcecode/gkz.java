import android.widget.ProgressBar;
import android.view.View;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkz
{
    public final ViewStub a;
    public boolean b;
    public View c;
    
    public gkz(final ViewStub a) {
        a.getClass();
        this.a = a;
    }
    
    public gkz(final ViewStub a, final byte[] array) {
        this.a = a;
    }
    
    public final void a(final aoqy aoqy) {
        if (aoqy != null && aoqy.c > 0) {
            if (!this.b) {
                final ProgressBar c = (ProgressBar)this.a.inflate();
                this.c = (View)c;
                final ProgressBar progressBar = c;
                c.setMax(100);
                this.b = true;
            }
            this.a.setVisibility(0);
            ((ProgressBar)this.c).setVisibility(0);
            ((ProgressBar)this.c).setProgress(aoqy.c);
            return;
        }
        this.a.setVisibility(8);
    }
}
