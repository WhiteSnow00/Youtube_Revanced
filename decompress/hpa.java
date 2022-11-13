import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpa
{
    public final wyv a;
    public final acpk b;
    public final vcy c;
    View d;
    public hoz e;
    public antb f;
    
    public hpa(final acpk b, final vcy c, final wyv a) {
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
            final antb f = this.f;
            boolean b3;
            final boolean b2 = b3 = true;
            if (f != null) {
                b3 = b2;
                if (f.d) {
                    b3 = (b && b2);
                }
            }
            hnu.f((View)o, b3);
        }
    }
}
