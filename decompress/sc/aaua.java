import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaua
{
    public final float a;
    public final float b;
    private final aatz c;
    
    public aaua() {
        final aatz c = aatz.c;
        throw null;
    }
    
    public aaua(final aatz c, final float a, final float b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.c == aatz.a || this.c == aatz.b;
    }
    
    public final boolean b() {
        return this.c == aatz.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof aaua) {
            final aaua aaua = (aaua)o;
            if (this.c == aaua.c && this.a == aaua.a && this.b == aaua.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("state", (Object)this.c);
        ab.d("scale", this.a);
        ab.d("offset", this.b);
        return ab.toString();
    }
}
