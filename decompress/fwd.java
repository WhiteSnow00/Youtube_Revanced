import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwd implements adep
{
    public static final fwd a;
    
    static {
        a = new fwd();
    }
    
    private fwd() {
    }
    
    public final Object a(final byte[] array) {
        return ahbh.parseFrom((ahbh)aoaf.a, array, ExtensionRegistryLite.getGeneratedRegistry());
    }
}
