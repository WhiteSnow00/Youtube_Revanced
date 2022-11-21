import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aedb extends aedf
{
    public aedb(final aedd aedd, final noj noj, final byte[] array) {
        new aefs("OnCompleteUpdateCallback", null);
        super(aedd, noj, (byte[])null);
    }
    
    public final void a(final Bundle bundle) {
        super.a(bundle);
        if (aedd.a(bundle) != 0) {
            this.c.c((Exception)new aedl(aedd.a(bundle)));
            return;
        }
        this.c.d((Object)null);
    }
}
