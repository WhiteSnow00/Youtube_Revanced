import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class arwq
{
    final InputStream a;
    final byte[] b;
    final int c;
    final boolean d;
    
    public arwq(final byte[] b, final int c, final boolean d) {
        this.a = null;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        String s;
        if (!this.d) {
            s = "]";
        }
        else {
            s = "(last)]";
        }
        final StringBuilder sb = new StringBuilder("TransactionData[");
        sb.append(c);
        sb.append("b array");
        sb.append(s);
        return sb.toString();
    }
}
