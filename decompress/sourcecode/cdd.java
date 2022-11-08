import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdd extends bkt
{
    public cdd() {
    }
    
    public final void d(final String s, final Bundle bundle) {
        final StringBuilder sb = new StringBuilder("Error: ");
        sb.append(s);
        sb.append(", data: ");
        sb.append(bundle);
    }
    
    public final void e(final Bundle bundle) {
        bundle.getString("groupableTitle");
        bundle.getString("transferableTitle");
    }
}
