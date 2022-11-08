import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkg implements bkq
{
    public bkl a;
    public boolean b;
    public final /* synthetic */ bki c;
    public final trg d;
    
    public bkg(final bki c, final trg d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final Handler j = this.c.j;
        dk.d((Object)j);
        baw.az(j, (Runnable)new aur(this, 9));
    }
}
