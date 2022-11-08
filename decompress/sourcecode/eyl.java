import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyl
{
    public final String a;
    public final String b;
    public final Optional c;
    
    public eyl(final String a, final String b, final Optional c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        final eyl eyl = (eyl)o;
        return this.a.equals(eyl.a) && this.b.equals(eyl.b) && this.c.equals((Object)eyl.c);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return ((hashCode2 + 159) * 53 + hashCode) * 53 + this.c.hashCode();
    }
}
