import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenc extends avo
{
    public final avh a;
    public final AccountId b;
    public final Object c;
    public volatile Object d;
    public final aseo e;
    
    public aenc(final avh a, final aseo e, final AccountId b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = new Object();
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    public final void d() {
        synchronized (this.c) {
            arid b;
            if (this.d != null) {
                b = ((aena)aqqm.k(this.d, (Class)aena.class)).b();
            }
            else {
                b = null;
            }
            monitorexit(this.c);
            if (b != null) {
                b.a();
            }
        }
    }
}
