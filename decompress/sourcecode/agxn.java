import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agxn implements ahbe
{
    private static final ExtensionRegistryLite a;
    
    static {
        a = ExtensionRegistryLite.a;
    }
    
    private static final void o(final MessageLite messageLite) {
        if (messageLite != null && !messageLite.isInitialized()) {
            throw ((agxl)messageLite).newUninitializedMessageException().a();
        }
    }
    
    public final MessageLite a(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        final MessageLite d = this.d(inputStream, extensionRegistryLite);
        o(d);
        return d;
    }
    
    public final MessageLite b(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return this.c(array, 0, array.length, extensionRegistryLite);
    }
    
    public final MessageLite c(final byte[] array, final int n, final int n2, final ExtensionRegistryLite extensionRegistryLite) {
        final MessageLite e = this.e(array, n, n2, extensionRegistryLite);
        o(e);
        return e;
    }
    
    public final MessageLite d(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        final agyh m = agyh.M(inputStream);
        final Object n = this.n(m, extensionRegistryLite);
        try {
            m.B(0);
            return (MessageLite)n;
        }
        catch (final ahab ahab) {
            throw ahab;
        }
    }
    
    public MessageLite e(final byte[] array, final int n, final int n2, final ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }
}
