import android.app.Activity;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gms implements vau
{
    public final tny a;
    private final bu b;
    private final zki c;
    private final zkw d;
    private final bx e;
    private final fzo f;
    
    public gms(final bu b, final zki c, final zkw d, final tny a, final fzo f, final bx e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.f = f;
        this.e = e;
    }
    
    public final void b(final aioe aioe) {
        this.e.O();
        final fzo f = this.f;
        final hwd hwd = new hwd();
        aenz.e((br)hwd, ((zjy)f.b).a(((zki)f.a).c()));
        Bundle m;
        if ((m = ((br)hwd).m) == null) {
            m = new Bundle();
        }
        m.putByteArray("navigation_endpoint", ((agxl)aioe).toByteArray());
        ((br)hwd).ag(m);
        final ct i = this.b.getSupportFragmentManager().i();
        i.s((br)hwd, "DialogFragmentFromNavigation");
        i.e();
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (this.c.t()) {
            this.b(aioe);
            return;
        }
        this.d.b((Activity)this.b, (byte[])null, (zku)new gmr(this, aioe, 0));
    }
}
