// 
// Decompiled by Procyon v0.6.0
// 

public final class dzz
{
    public final boolean a;
    public final dzt b;
    public final ead c;
    public final blf d;
    
    public dzz(final ead c, final blf d, final boolean a, final dzt b, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        if (this.a) {
            try {
                final ead c = this.c;
                final dzt b = this.b;
                bkw.e();
                if (b != null) {
                    c.d(b);
                }
            }
            finally {}
        }
    }
}
