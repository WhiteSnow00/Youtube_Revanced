import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbj implements actk
{
    private final wwv a;
    private final oas b;
    private final vax c;
    private final actk d;
    private final amdk e;
    private long f;
    
    public gbj(final vax c, final oas b, final amdk e, final wwv a, final actk d) {
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
        this.d = d;
        this.f = 0L;
    }
    
    private final void c(final amdj amdj) {
        if (amdj != null) {
            aibb aibb;
            if ((aibb = amdj.c) == null) {
                aibb = aibb.a;
            }
            if ((aibb.b & 0x800000) != 0x0) {
                final wwv a = this.a;
                aibb aibb2;
                if ((aibb2 = amdj.c) == null) {
                    aibb2 = aibb.a;
                }
                a.t((wxz)new wws(aibb2.w), (alff)null);
            }
        }
    }
}
