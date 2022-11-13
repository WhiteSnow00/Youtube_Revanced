import android.view.View;
import java.util.Map;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gom
{
    public final goq a;
    public final acns b;
    public final RecyclerView c;
    public final Map d;
    
    public gom(final goq a, final acns b, final RecyclerView c, final Map d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ahab ahab) {
        final goq a = this.a;
        final acns b = this.b;
        final RecyclerView c = this.c;
        final Map d = this.d;
        goq.b(b.g, (View)c);
        final Object value = d.get("chipSelected");
        aikr aikr;
        if (value instanceof aikr) {
            aikr = (aikr)value;
        }
        else {
            aikr = null;
        }
        if (aikr != null && (aikr.b & 0x1000) != 0x0 && ahab != null) {
            a.b.m((wzz)new wyt(ahab), (wzz)new wyt(aikr.l));
        }
    }
}
