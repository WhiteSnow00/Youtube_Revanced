// 
// Decompiled by Procyon v0.6.0
// 

final class asca implements arvg
{
    private final int a;
    
    public asca(final int a) {
        this.a = a;
    }
    
    public final Object a(final byte[] array) {
        if (this.a != 0) {
            return array;
        }
        if (array.length >= 3) {
            return (array[0] - 48) * 100 + (array[1] - 48) * 10 + (array[2] - 48);
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(array, arvh.a)));
    }
    
    public final byte[] b(final Object o) {
        if (this.a != 0) {
            return (byte[])o;
        }
        final Integer n = (Integer)o;
        throw new UnsupportedOperationException();
    }
}
