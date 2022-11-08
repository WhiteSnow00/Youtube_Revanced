import java.util.HashMap;
import android.view.View;
import java.util.Collections;
import java.util.Map;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acih implements View$OnClickListener
{
    private static final acie b;
    private static final acif c;
    public vax a;
    private final acio d;
    private final acie e;
    private wwv f;
    private aioe g;
    private Map h;
    private acif i;
    
    static {
        b = (acie)new acic();
        c = (acif)new acid();
    }
    
    public acih(final vax vax, final acio acio) {
        this(vax, acio, null);
    }
    
    public acih(final vax a, final acio acio, final acie acie) {
        a.getClass();
        this.a = a;
        Object d = acio;
        if (acio == null) {
            d = new acig();
        }
        (this.d = (acio)d).d((View$OnClickListener)this);
        ((acio)d).b(false);
        acie b;
        if ((b = acie) == null) {
            b = acih.b;
        }
        this.e = b;
        this.f = wwv.k;
        this.i = acih.c;
        this.h = Collections.emptyMap();
    }
    
    public acih(final vax vax, final View view) {
        this(vax, (acio)new acjc(view));
    }
    
    public acih(final vax vax, final View view, final acie acie) {
        this(vax, (acio)new acjc(view), acie);
    }
    
    public final void a(final wwv wwv, final aioe aioe, final Map map) {
        this.b(wwv, aioe, map, null);
    }
    
    public final void b(final wwv wwv, final aioe g, final Map map, final acif acif) {
        wwv k = wwv;
        if (wwv == null) {
            k = wwv.k;
        }
        this.f = k;
        this.g = g;
        Map<Object, Object> emptyMap;
        if ((emptyMap = map) == null) {
            emptyMap = Collections.emptyMap();
        }
        this.h = emptyMap;
        acif c;
        if ((c = acif) == null) {
            c = acih.c;
        }
        this.i = c;
        this.d.b(g != null);
    }
    
    public final void c() {
        this.g = null;
        this.d.b(false);
        this.f = wwv.k;
        this.h = Collections.emptyMap();
        this.i = acih.c;
    }
    
    public final void onClick(final View view) {
        if (!this.e.h(view)) {
            final aioe f = this.f.f(this.g);
            this.g = f;
            final vax a = this.a;
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
            hashMap.putAll(this.h);
            this.i.pB(hashMap);
            a.c(f, (Map)hashMap);
        }
    }
}
