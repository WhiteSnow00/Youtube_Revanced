import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaby extends vjn
{
    public final List a;
    public long b;
    public long c;
    public int d;
    public float e;
    public final arud f;
    
    public aaby(final adcr adcr, final zkh zkh, final arud f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline/playlist_sync_check", adcr, zkh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.a = new ArrayList();
    }
    
    protected final void c() {
        final boolean empty = this.a.isEmpty();
        final boolean b = true;
        agot.D(empty ^ true);
        agot.u(this.b >= 0L);
        agot.u(this.c >= 0L);
        agot.u(true);
        final float e = this.e;
        agot.u(e >= 0.0f && e <= 1.0f && b);
    }
}
