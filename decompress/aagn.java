import java.util.Collections;
import java.util.Map;
import android.net.Uri;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagn implements bbn
{
    public static final aagn a;
    public static final zcj b;
    
    static {
        a = new aagn();
        b = (zcj)aagm.a;
    }
    
    private aagn() {
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        throw new UnsupportedOperationException();
    }
    
    public final long b(final bbr bbr) {
        throw new IOException("Empty DataSource");
    }
    
    public final Uri c() {
        return Uri.EMPTY;
    }
    
    public final Map d() {
        return Collections.emptyMap();
    }
    
    public final void e(final bcq bcq) {
    }
    
    public final void f() {
    }
}
