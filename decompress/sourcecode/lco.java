import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class lco extends WeakReference
{
    private Object a;
    
    public lco(final Object a, final int n) {
        super(a);
        if (n == 1) {
            this.a = a;
        }
    }
    
    final void a(final int n) {
        monitorenter(this);
        Label_0014: {
            if (n != 0) {
                break Label_0014;
            }
            try {
                this.a = null;
                return;
                this.a = this.get();
            }
            finally {
                monitorexit(this);
            }
        }
    }
}
