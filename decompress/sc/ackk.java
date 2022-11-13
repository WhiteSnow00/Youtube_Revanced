import java.util.HashMap;
import android.view.View;
import java.util.Collections;
import java.util.Map;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackk implements View$OnClickListener
{
    private static final ackh b;
    private static final acki c;
    public vcy a;
    private final ackr d;
    private final ackh e;
    private wyw f;
    private aiqj g;
    private Map h;
    private acki i;
    
    static {
        b = (ackh)new ackf();
        c = (acki)new ackg();
    }
    
    public ackk(final vcy vcy, final ackr ackr) {
        this(vcy, ackr, null);
    }
    
    public ackk(final vcy a, final ackr ackr, final ackh ackh) {
        a.getClass();
        this.a = a;
        Object d = ackr;
        if (ackr == null) {
            d = new ackj();
        }
        (this.d = (ackr)d).d((View$OnClickListener)this);
        ((ackr)d).b(false);
        ackh b;
        if ((b = ackh) == null) {
            b = ackk.b;
        }
        this.e = b;
        this.f = wyw.k;
        this.i = ackk.c;
        this.h = Collections.emptyMap();
    }
    
    public ackk(final vcy vcy, final View view) {
        this(vcy, (ackr)new aclf(view));
    }
    
    public ackk(final vcy vcy, final View view, final ackh ackh) {
        this(vcy, (ackr)new aclf(view), ackh);
    }
    
    public final void a(final wyw wyw, final aiqj aiqj, final Map map) {
        this.b(wyw, aiqj, map, null);
    }
    
    public final void b(final wyw wyw, final aiqj g, final Map map, final acki acki) {
        wyw k = wyw;
        if (wyw == null) {
            k = wyw.k;
        }
        this.f = k;
        this.g = g;
        Map<Object, Object> emptyMap;
        if ((emptyMap = map) == null) {
            emptyMap = Collections.emptyMap();
        }
        this.h = emptyMap;
        acki c;
        if ((c = acki) == null) {
            c = ackk.c;
        }
        this.i = c;
        this.d.b(g != null);
    }
    
    public final void c() {
        this.g = null;
        this.d.b(false);
        this.f = wyw.k;
        this.h = Collections.emptyMap();
        this.i = ackk.c;
    }
    
    public final void onClick(final View view) {
        if (!this.e.h(view)) {
            final aiqj f = this.f.f(this.g);
            this.g = f;
            final vcy a = this.a;
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
            hashMap.putAll(this.h);
            this.i.pG(hashMap);
            a.c(f, (Map)hashMap);
        }
    }
}
