import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawn implements tcb
{
    public final aawr a;
    public final int b;
    
    public aawn(final aawr a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final int n, int b, final Intent intent) {
        final aawr a = this.a;
        b = this.b;
        if (n == 500) {
            a.c.post((Runnable)new aasq(a, b, 5));
        }
    }
}
