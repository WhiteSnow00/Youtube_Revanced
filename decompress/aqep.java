import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqep
{
    private final CommandOuterClass$Command a;
    
    public aqep(final CommandOuterClass$Command a) {
        this.a = a;
    }
    
    public static final afft a() {
        return new affr().g();
    }
    
    public static aeea b(final CommandOuterClass$Command commandOuterClass$Command) {
        return new aeea((ahbb)((ahbh)commandOuterClass$Command).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqep && ((ahbh)this.a).equals((Object)((aqep)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
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
