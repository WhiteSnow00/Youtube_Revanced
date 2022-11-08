import java.util.Map;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jje extends acja implements acie
{
    private final View a;
    private final vax b;
    private final TextView c;
    private final TextView d;
    private final acih e;
    private final acih f;
    private akaf g;
    private final uyi h;
    
    public jje(final Context context, final vax b, final uyi h) {
        b.getClass();
        this.b = b;
        final View inflate = View.inflate(context, 2131625642, (ViewGroup)null);
        this.a = inflate;
        final TextView c = (TextView)inflate.findViewById(2131432092);
        this.c = c;
        final TextView d = (TextView)inflate.findViewById(2131427916);
        this.d = d;
        this.e = new acih(b, (View)c);
        this.f = new acih(b, (View)d, (acie)this);
        this.h = h;
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        this.e.c();
        this.f.c();
    }
    
    public final boolean h(final View view) {
        antx antx;
        if ((antx = this.g.e) == null) {
            antx = antx.a;
        }
        aibb a;
        if (antx.b == 65153809) {
            a = (aibb)antx.c;
        }
        else {
            a = aibb.a;
        }
        if ((a.b & 0x4000) != 0x0) {
            final vax b = this.b;
            antx antx2;
            if ((antx2 = this.g.e) == null) {
                antx2 = antx.a;
            }
            aibb a2;
            if (antx2.b == 65153809) {
                a2 = (aibb)antx2.c;
            }
            else {
                a2 = aibb.a;
            }
            aioe aioe;
            if ((aioe = a2.n) == null) {
                aioe = aioe.a;
            }
            b.c(aioe, (Map)null);
        }
        return false;
    }
}
