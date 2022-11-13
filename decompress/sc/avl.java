import java.util.Iterator;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avl implements cgh
{
    public Bundle a;
    private final cgi b;
    private boolean c;
    private final atkh d;
    
    public avl(final cgi b, final avv avv) {
        this.b = b;
        this.d = aqsz.x((atmv)new cfx(avv, 1));
    }
    
    private final avm c() {
        return (avm)this.d.a();
    }
    
    @Override
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        final Bundle a = this.a;
        if (a != null) {
            bundle.putAll(a);
        }
        for (final Map.Entry<String, V> entry : this.c().a.entrySet()) {
            final String s = entry.getKey();
            final Bundle a2 = ((avi)entry.getValue()).f.a();
            if (!atoc.c((Object)a2, (Object)Bundle.EMPTY)) {
                bundle.putBundle(s, a2);
            }
        }
        this.c = false;
        return bundle;
    }
    
    public final void b() {
        if (!this.c) {
            this.a = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.c = true;
            this.c();
        }
    }
}
