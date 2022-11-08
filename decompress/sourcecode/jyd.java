import android.widget.LinearLayout;
import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyd extends iw
{
    public jyc a;
    final /* synthetic */ jxq b;
    
    public jyd() {
        this.a = jyc.a();
    }
    
    public jyd(final jxq b) {
        this.b = b;
        this.a = jyc.a();
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, int a, int n) {
        final jyc a2 = this.a;
        a += a2.a;
        a2.a = a;
        if (!a2.c) {
            return;
        }
        if (Math.abs(a) > 50) {
            a = 1;
        }
        else {
            a = 0;
        }
        final boolean b = this.a.b;
        n = a;
        if (!b) {
            if (a != 0) {
                final LinearLayout b2 = this.b.b;
                if (b2 == null) {
                    return;
                }
                jxq.j((View)b2, true, ((View)b2).getWidth());
                final jxq b3 = this.b;
                final agyc c = b3.c;
                if (c != null) {
                    b3.a.t((wxz)new wws(c), (alff)null);
                }
                this.a.b = true;
                return;
            }
            else {
                n = 0;
            }
        }
        if (b && n == 0) {
            final LinearLayout b4 = this.b.b;
            if (b4 != null) {
                jxq.j((View)b4, false, ((View)b4).getWidth());
                this.a.b = false;
            }
        }
    }
}
