import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhj
{
    private final CommandOuterClass$Command a;
    
    public aqhj(final CommandOuterClass$Command a) {
        this.a = a;
    }
    
    public static final afhk a() {
        return new afhi().g();
    }
    
    public static agpb b(final CommandOuterClass$Command commandOuterClass$Command) {
        return new agpb((ahct)((ahcz)commandOuterClass$Command).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqhj && ((ahcz)this.a).equals(((aqhj)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("CommandModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
