import android.util.LruCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmq extends LruCache
{
    public abmq() {
        super(16);
    }
    
    public abmq(final byte[] array) {
        super(4096);
    }
}
