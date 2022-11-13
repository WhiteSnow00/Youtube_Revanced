import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfz implements adfx
{
    private final Map a;
    
    public adfz() {
        this.a = new HashMap();
    }
    
    public final ListenableFuture a(final String s) {
        if (this.a.containsKey(s)) {
            return afwm.m((Object)this.a.get(s));
        }
        return afwm.m((Object)null);
    }
    
    public final void b(final String s, final agoe agoe) {
        this.a.put(s, agoe);
    }
}
