import android.content.Intent;
import java.util.Map;
import java.util.List;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpl implements vax
{
    private final Context a;
    private final Set b;
    
    public gpl(final Context a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    public final void c(final aioe aioe, final Map map) {
        final Object a = vay.a(aioe);
        if (a != null && this.b.contains(a.getClass())) {
            final Intent h = fvu.h(this.a);
            h.putExtra("navigation_endpoint", ((agxl)aioe).toByteArray());
            this.a.startActivity(h);
            return;
        }
        zjp.b(zjo.b, zjn.e, "Command not supported when delegating to WWA");
    }
}
