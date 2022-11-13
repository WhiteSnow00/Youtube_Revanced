import android.app.Activity;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmz implements vcv
{
    public final tqd a;
    private final bu b;
    private final zmf c;
    private final zmt d;
    private final bx e;
    private final fzw f;
    
    public gmz(final bu b, final zmf c, final zmt d, final tqd a, final fzw f, final bx e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.f = f;
        this.e = e;
    }
    
    public final void b(final aiqj aiqj) {
        this.e.O();
        final fzw f = this.f;
        final hxa hxa = new hxa();
        aepz.e((br)hxa, ((zlv)f.b).a(((zmf)f.a).c()));
        Bundle m;
        if ((m = hxa.m) == null) {
            m = new Bundle();
        }
        m.putByteArray("navigation_endpoint", ((agzk)aiqj).toByteArray());
        hxa.ag(m);
        final ct i = this.b.getSupportFragmentManager().i();
        i.s((br)hxa, "DialogFragmentFromNavigation");
        i.e();
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (this.c.t()) {
            this.b(aiqj);
            return;
        }
        this.d.b((Activity)this.b, (byte[])null, (zmr)new gmy(this, aiqj, 0));
    }
}
