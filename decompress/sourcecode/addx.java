import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addx implements addw
{
    private final Map a;
    
    public addx() {
        this.a = new HashMap();
    }
    
    public final ListenableFuture a(final String s) {
        if (this.a.containsKey(s)) {
            return afva.m(this.a.get(s));
        }
        return afva.m(null);
    }
    
    public final void b(final String s, final agmd agmd) {
        this.a.put(s, agmd);
    }
}
