import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aebj extends aebn
{
    public aebj(final aebl aebl, final nns nns, final byte[] array) {
        new adet("OnCompleteUpdateCallback");
        super(aebl, nns, (byte[])null);
    }
    
    public final void a(final Bundle bundle) {
        super.a(bundle);
        if (aebl.a(bundle) != 0) {
            this.c.c((Exception)new aebt(aebl.a(bundle)));
            return;
        }
        this.c.d((Object)null);
    }
}
