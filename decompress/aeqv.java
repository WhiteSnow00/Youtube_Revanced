import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqv extends avq
{
    public final avj a;
    public final AccountId b;
    public final Object c;
    public volatile Object d;
    public final agnv e;
    
    public aeqv(final avj a, final agnv e, final AccountId b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = new Object();
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    public final void d() {
        synchronized (this.c) {
            arnm b;
            if (this.d != null) {
                b = ((aeqt)aqvs.i(this.d, (Class)aeqt.class)).b();
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
