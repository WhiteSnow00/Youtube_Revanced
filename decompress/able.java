// 
// Decompiled by Procyon v0.6.0
// 

public final class able
{
    public final int a;
    public final int b;
    
    public able() {
    }
    
    public able(final int b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public static abld a() {
        final abld abld = new abld();
        abld.b(0);
        abld.c = 1;
        return abld;
    }
    
    public final anez b() {
        final ahcr builder = ((ahcz)anez.a).createBuilder();
        final int a = this.a;
        if (a > 0) {
            builder.copyOnWrite();
            final anez anez = (anez)builder.instance;
            anez.b |= 0x1;
            anez.c = a;
        }
        final int b = this.b;
        if (b != 1) {
            builder.copyOnWrite();
            final anez anez2 = (anez)builder.instance;
            if (b == 0) {
                throw null;
            }
            anez2.d = b - 1;
            anez2.b |= 0x2;
        }
        return (anez)builder.build();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof able)) {
            return false;
        }
        final able able = (able)o;
        final int b = this.b;
        final int b2 = able.b;
        if (b != 0) {
            return b == b2 && this.a == able.a;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        if (b != 0) {
            return (b ^ 0xF4243) * 1000003 ^ this.a;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        String string;
        if (b != 0) {
            string = Integer.toString(b - 1);
        }
        else {
            string = "null";
        }
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("PrefetchPlaybackContextWrapper{prefetchReason=");
        sb.append(string);
        sb.append(", playbackBeginsInSeconds=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
