// 
// Decompiled by Procyon v0.6.0
// 

public final class accd
{
    private boolean a;
    private byte b;
    
    public final acce a() {
        if (this.b == 1) {
            return new acce(this.a);
        }
        throw new IllegalStateException("Missing required properties: swipeToCameraEnabled");
    }
    
    public final void b(final boolean a) {
        this.a = a;
        this.b = 1;
    }
    
    public final sik c() {
        if (this.b == 1) {
            return new sik(this.a);
        }
        throw new IllegalStateException("Missing required properties: remotePlayback");
    }
    
    public final void d(final boolean a) {
        this.a = a;
        this.b = 1;
    }
}
