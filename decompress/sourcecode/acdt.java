import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdt implements vau
{
    public final vax a;
    private final vbq b;
    private final zki c;
    private final asho d;
    private final aeim e;
    
    public acdt(final vbq b, final zki c, final asho d, final aeim e, final vax a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final ajrg ajrg = (ajrg)((agzd)aioe).rr((agyr)ajrg.b);
        if ((ajrg.c & 0x1) != 0x0) {
            final List k = this.e.K(ajrg.d);
            if (k == null) {
                return;
            }
            for (final acds acds : k) {
                final vbp a = this.b.a(this.c.c());
                ((vdo)a).f(acds.f).E(this.d).s((asix)new abde(this, ajrg, acds, (vdo)a, 2)).ab();
            }
        }
    }
}
