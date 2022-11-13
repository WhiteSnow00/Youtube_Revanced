import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jii implements cp
{
    public final jim a;
    
    public jii(final jim a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final Bundle bundle) {
        final jim a = this.a;
        if (s.equals(jhy.ae)) {
            final aezp ak = jhy.aK(bundle);
            if (ak.h()) {
                final aohl k = (aohl)ak.c();
                final jhx ad = a.aD;
                final String ao = a.ao;
                if (!((ahbh)k).equals((Object)ad.K)) {
                    ad.K = k;
                    ad.J = null;
                    ad.e(ao);
                }
                a.q();
            }
        }
    }
}
