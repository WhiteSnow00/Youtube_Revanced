// 
// Decompiled by Procyon v0.6.0
// 

public final class adrf
{
    public volatile boolean a;
    
    public adrf() {
        this.a = false;
    }
    
    public adrf(final byte[] array) {
    }
    
    public static adrf c() {
        return new adrf(null);
    }
    
    public final boolean a() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final void b() {
        if (!this.a) {
            return;
        }
        throw new IllegalStateException("Already released");
    }
}
