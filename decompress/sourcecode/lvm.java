import java.util.Arrays;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvm
{
    public final Uri a;
    public final long b;
    public final long c;
    
    public lvm(final Uri a, final long b, final long c) {
        final boolean b2 = false;
        jfi.S(b >= 0L);
        boolean b3 = b2;
        if (c >= 0L) {
            b3 = true;
        }
        jfi.S(b3);
        jfi.S(true);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = Arrays.toString((byte[])null);
        final long b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(string);
        sb.append(", ");
        sb.append(string2);
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        sb.append(", -1, null, 0]");
        return sb.toString();
    }
}
