// 
// Decompiled by Procyon v0.6.0
// 

public final class oyx
{
    public final String a;
    public final int b;
    
    public oyx(final int b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public static oyx a(final String s) {
        s.getClass();
        return new oyx(1, s);
    }
    
    public static oyx b() {
        return new oyx(2, null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof oyx) {
            final oyx oyx = (oyx)o;
            if (oyx.b - 1 == this.b - 1 && aeda.v((Object)oyx.a, (Object)this.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return b - 1 + hashCode * 31;
    }
}
