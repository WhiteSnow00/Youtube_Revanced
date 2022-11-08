import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gis implements View$OnClickListener
{
    private final vax a;
    private final acng b;
    private final FloatingActionButton c;
    private gdr d;
    
    public gis(final vax a, final acng b, final FloatingActionButton c) {
        this.a = a;
        this.b = b;
        (this.c = c).setOnClickListener((View$OnClickListener)this);
    }
    
    private static Map b(final Object o) {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
        return hashMap;
    }
    
    public final void a(final gdr d) {
        if (d != null && this.d == d) {
            tmy.v((View)this.c, true);
            return;
        }
        if ((this.d = d) != null) {
            final akbf c = d.c();
            if (c != null) {
                final acng b = this.b;
                akbe akbe;
                if ((akbe = akbe.b(c.c)) == null) {
                    akbe = akbe.a;
                }
                this.c.setImageResource(b.a(akbe));
            }
            else {
                this.c.setImageDrawable((Drawable)null);
            }
            this.c.setContentDescription((CharSequence)d.e());
            tmy.v((View)this.c, true);
            return;
        }
        tmy.v((View)this.c, false);
    }
    
    public final void onClick(final View view) {
        final gdr d = this.d;
        if (d == null) {
            return;
        }
        final aioe a = d.a();
        final aioe b = this.d.b();
        if (a != null) {
            this.a.c(a, b(this.d));
            return;
        }
        if (b != null) {
            this.a.c(b, b(this.d));
        }
    }
}
