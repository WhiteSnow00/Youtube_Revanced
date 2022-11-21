import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkk implements bku
{
    public bkp a;
    public boolean b;
    public final bkm c;
    public final tun d;
    
    public bkk(final bkm c, final tun d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final Handler j = this.c.j;
        bad.b(j);
        baz.az(j, new asa(this, 10));
    }
}
