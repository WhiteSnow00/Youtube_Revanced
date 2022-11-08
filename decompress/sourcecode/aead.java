import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aead
{
    public IBinder a;
    public boolean b;
    public String c;
    public int d;
    public float e;
    public int f;
    public int g;
    public byte h;
    
    public final void a(final int f) {
        this.f = f;
        this.h |= 0x8;
    }
    
    public final void b(final float e) {
        this.e = e;
        this.h |= 0x4;
    }
    
    public final void c(final boolean b) {
        this.b = b;
        this.h |= 0x1;
    }
}
