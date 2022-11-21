import java.util.HashMap;
import android.view.View;
import java.util.Collections;
import java.util.Map;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aclx implements View$OnClickListener
{
    private static final aclu b;
    private static final aclv c;
    public veh a;
    private final acme d;
    private final aclu e;
    private xab f;
    private aisc g;
    private Map h;
    private aclv i;
    
    static {
        b = (aclu)new acls();
        c = (aclv)new aclt();
    }
    
    public aclx(final veh veh, final acme acme) {
        this(veh, acme, null);
    }
    
    public aclx(final veh a, final acme acme, final aclu aclu) {
        a.getClass();
        this.a = a;
        Object d = acme;
        if (acme == null) {
            d = new aclw();
        }
        (this.d = (acme)d).d((View$OnClickListener)this);
        ((acme)d).b(false);
        aclu b;
        if ((b = aclu) == null) {
            b = aclx.b;
        }
        this.e = b;
        this.f = xab.k;
        this.i = aclx.c;
        this.h = Collections.emptyMap();
    }
    
    public aclx(final veh veh, final View view) {
        this(veh, new acms(view));
    }
    
    public aclx(final veh veh, final View view, final aclu aclu) {
        this(veh, new acms(view), aclu);
    }
    
    public final void a(final xab xab, final aisc aisc, final Map map) {
        this.b(xab, aisc, map, null);
    }
    
    public final void b(final xab xab, final aisc g, final Map map, final aclv aclv) {
        xab k = xab;
        if (xab == null) {
            k = xab.k;
        }
        this.f = k;
        this.g = g;
        Map<Object, Object> emptyMap;
        if ((emptyMap = map) == null) {
            emptyMap = Collections.emptyMap();
        }
        this.h = emptyMap;
        aclv c;
        if ((c = aclv) == null) {
            c = aclx.c;
        }
        this.i = c;
        this.d.b(g != null);
    }
    
    public final void c() {
        this.g = null;
        this.d.b(false);
        this.f = xab.k;
        this.h = Collections.emptyMap();
        this.i = aclx.c;
    }
    
    public final void onClick(final View view) {
        if (!this.e.h(view)) {
            final aisc f = this.f.f(this.g);
            this.g = f;
            final veh a = this.a;
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
            hashMap.putAll(this.h);
            this.i.pF(hashMap);
            a.c(f, (Map)hashMap);
        }
    }
}
