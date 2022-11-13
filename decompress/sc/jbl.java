import android.view.View;
import java.util.Map;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbl implements View$OnLongClickListener
{
    public final jbm a;
    public final ajvs b;
    public final Map c;
    
    public jbl(final jbm a, final ajvs b, final Map c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean onLongClick(final View view) {
        final jbm a = this.a;
        final ajvs b = this.b;
        final Map c = this.c;
        boolean b2;
        if ((b.b & 0x2) != 0x0) {
            final vcy h = a.h;
            aiqj aiqj;
            if ((aiqj = b.d) == null) {
                aiqj = aiqj.a;
            }
            h.c(aiqj, c);
            b2 = true;
        }
        else {
            b2 = false;
        }
        return b2;
    }
}
