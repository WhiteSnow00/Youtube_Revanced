import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquq implements aqua
{
    private final CronetEngine a;
    private final oas b;
    private final ExecutorService c;
    
    public aquq(final CronetEngine a, final oas b, final ExecutorService c) {
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    @Override
    public final aqum a(final String s, final String s2, final aqub aqub, final aqty aqty) {
        s.getClass();
        s2.getClass();
        final aqus aqus = new aqus(this.c);
        aquv aquv;
        if (aqty != null) {
            aquv = new aquv(this.c, aqty);
        }
        else {
            aquv = null;
        }
        return new aqut(s, s2, aqub, this.a, this.c, aqus, aquv);
    }
}
