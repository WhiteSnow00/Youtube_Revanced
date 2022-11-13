import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czy
{
    public volatile String a;
    public volatile dai b;
    public volatile dah c;
    private volatile boolean d;
    private final Context e;
    private volatile czw f;
    
    public czy(final Context e) {
        this.e = e;
    }
    
    public final czz a() {
        if (this.e == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.b == null && this.c == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (this.b != null && this.c != null) {
            throw new IllegalArgumentException("Please provide only one valid listener for purchases updates.");
        }
        if (!this.d) {
            throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
        }
        if (this.b != null) {
            return new czz(this.e, this.d, this.b, czz.e(), this.a);
        }
        return new czz(this.a, this.d, this.e, this.c);
    }
    
    public final void b() {
        this.d = true;
    }
}
