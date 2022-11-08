import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hod
{
    public final wwu a;
    public final acng b;
    public final vax c;
    View d;
    public hoc e;
    public anqy f;
    
    public hod(final acng b, final vax c, final wwu a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final void a(final boolean b) {
        if (this.f == null) {
            return;
        }
        final View d = this.d;
        Object o;
        if (d == null) {
            o = null;
        }
        else {
            o = d.findViewById(2131428445);
        }
        if (o != null) {
            final anqy f = this.f;
            boolean b3;
            final boolean b2 = b3 = true;
            if (f != null) {
                b3 = b2;
                if (f.d) {
                    b3 = (b && b2);
                }
            }
            iba.e((View)o, b3);
        }
    }
}
