import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxe implements aqwn
{
    private final CronetEngine a;
    private final oby b;
    private final ExecutorService c;
    
    public aqxe(final CronetEngine a, final oby b, final ExecutorService c) {
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public final aqxa a(final String s, final String s2, final aqwo aqwo, final aqwl aqwl) {
        s.getClass();
        s2.getClass();
        final aqxg aqxg = new aqxg(this.c);
        aqxj aqxj;
        if (aqwl != null) {
            aqxj = new aqxj(this.c, aqwl);
        }
        else {
            aqxj = null;
        }
        return (aqxa)new aqxh(s, s2, aqwo, this.a, this.c, aqxg, aqxj);
    }
}
