import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsc
{
    int a;
    int b;
    int c;
    int d;
    int e;
    int[] f;
    
    public dsc() {
        this.f = new int[] { 255, 255, 255, 255 };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final dsc dsc = (dsc)o;
            return this.b == dsc.b && this.d == dsc.d && this.c == dsc.c && this.e == dsc.e && this.a == dsc.a && Arrays.equals(this.f, dsc.f);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int[] f = this.f;
        int hashCode;
        if (f != null) {
            hashCode = Arrays.hashCode(f);
        }
        else {
            hashCode = 0;
        }
        return ((((a * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + hashCode;
    }
}
