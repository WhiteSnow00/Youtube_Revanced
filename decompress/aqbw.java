// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbw
{
    private final aqbx a;
    
    public aqbw(final aqbx a) {
        this.a = a;
    }
    
    public static final afhk a() {
        return new afhi().g();
    }
    
    public static aefs b(final aqbx aqbx) {
        return new aefs(aqbx.toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqbw && this.a.equals(((aqbw)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("YtMainVideoEntityLocalizedStringsModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
