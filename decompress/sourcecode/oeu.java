import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oeu
{
    public final Context a;
    public final aexq b;
    public final aexq c;
    private final aexq d;
    
    public oeu() {
    }
    
    public oeu(final Context a, final aexq d, final aexq b, final aexq c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oeu) {
            final oeu oeu = (oeu)o;
            if (this.a.equals(oeu.a) && this.d.equals(oeu.d) && this.b.equals(oeu.b) && this.c.equals(oeu.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.b.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.b);
        final String value4 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("CollectionBasisContext{context=");
        sb.append(value);
        sb.append(", accountNames=");
        sb.append(value2);
        sb.append(", stacktrace=");
        sb.append(value3);
        sb.append(", googlerOverridesCheckbox=false, executor=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
