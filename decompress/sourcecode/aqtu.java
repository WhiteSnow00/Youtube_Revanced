// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtu
{
    public int a;
    public int b;
    
    public aqtu(final byte[] array) {
        final byte b = array[0];
        final byte b2 = array[1];
        if (b != 3) {
            if (b != 4) {
                final StringBuilder sb = new StringBuilder("The address type is illegal. Value:");
                sb.append(b);
                throw new IllegalArgumentException(sb.toString());
            }
            this.a = 4;
        }
        else {
            this.a = 3;
        }
        if (b2 == 2) {
            this.b = 2;
            return;
        }
        if (b2 == 3) {
            this.b = 3;
            return;
        }
        if (b2 == 4) {
            this.b = 4;
            return;
        }
        final StringBuilder sb2 = new StringBuilder("The score type is illegal. Value:");
        sb2.append(b2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
