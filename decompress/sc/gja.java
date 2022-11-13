import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gja implements View$OnClickListener
{
    private final vcy a;
    private final acpk b;
    private final FloatingActionButton c;
    private gdz d;
    
    public gja(final vcy a, final acpk b, final FloatingActionButton c) {
        this.a = a;
        this.b = b;
        (this.c = c).setOnClickListener((View$OnClickListener)this);
    }
    
    private static Map b(final Object o) {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
        return hashMap;
    }
    
    public final void a(final gdz d) {
        if (d != null && this.d == d) {
            tpe.v((View)this.c, true);
            return;
        }
        if ((this.d = d) != null) {
            final akdi c = d.c();
            if (c != null) {
                final acpk b = this.b;
                akdh akdh;
                if ((akdh = akdh.b(c.c)) == null) {
                    akdh = akdh.a;
                }
                this.c.setImageResource(b.a(akdh));
            }
            else {
                this.c.setImageDrawable((Drawable)null);
            }
            this.c.setContentDescription((CharSequence)d.e());
            tpe.v((View)this.c, true);
            return;
        }
        tpe.v((View)this.c, false);
    }
    
    public final void onClick(final View view) {
        final gdz d = this.d;
        if (d == null) {
            return;
        }
        final aiqj a = d.a();
        final aiqj b = this.d.b();
        if (a != null) {
            this.a.c(a, b(this.d));
            return;
        }
        if (b != null) {
            this.a.c(b, b(this.d));
        }
    }
}
