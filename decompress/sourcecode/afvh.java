import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvh implements Comparable
{
    private final byte[] a;
    
    public afvh(final byte[] array) {
        this.a = Arrays.copyOf(array, array.length);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof afvh && Arrays.equals(this.a, ((afvh)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return aety.y(this.a);
    }
}
