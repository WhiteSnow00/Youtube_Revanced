import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aden implements adeo
{
    public static final aden a;
    public static final aden b;
    private final int c;
    
    static {
        b = new aden(1);
        a = new aden(0);
    }
    
    private aden(final int c) {
        this.c = c;
    }
    
    public final byte[] a(final Object o) {
        if (this.c != 0) {
            return ((agzk)o).toByteArray();
        }
        return ((MessageLite)o).toByteArray();
    }
}
