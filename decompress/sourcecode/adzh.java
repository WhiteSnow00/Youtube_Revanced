import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzh extends adzl
{
    public adzh(final adzj adzj, final nmo nmo, final byte[] array) {
        new aeby("OnCompleteUpdateCallback", (byte[])null);
        super(adzj, nmo, (byte[])null);
    }
    
    public final void a(final Bundle bundle) {
        super.a(bundle);
        if (adzj.a(bundle) != 0) {
            this.c.d((Exception)new adzr(adzj.a(bundle)));
            return;
        }
        this.c.e((Object)null);
    }
}
