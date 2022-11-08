// 
// Decompiled by Procyon v0.6.0
// 

public final class byo
{
    public final int a;
    public final int b;
    
    public byo(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public byo(final int b, final int a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public byo(final int a, final int b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public byo(final int b, final int a, final char[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final int a() {
        final int b = this.b;
        if (b == 2) {
            return 10;
        }
        if (b == 5) {
            return 11;
        }
        if (b == 29) {
            return 12;
        }
        if (b == 42) {
            return 16;
        }
        if (b == 22) {
            return 1073741824;
        }
        if (b != 23) {
            return 0;
        }
        return 15;
    }
}
