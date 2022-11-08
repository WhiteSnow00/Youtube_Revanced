import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmg
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mmg)) {
            return false;
        }
        final mmg mmg = (mmg)o;
        final int a = mmg.a;
        if (this.b == mmg.b) {
            final int c = mmg.c;
            final int d = mmg.d;
            final int e = mmg.e;
            final boolean f = mmg.f;
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Integer value = 0;
        return Arrays.hashCode(new Object[] { value, this.b, value, value, value, false });
    }
}
