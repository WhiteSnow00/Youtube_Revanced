import com.google.protos.youtube.elements.CommandOuterClass$GestureAccessibilityInfo;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqeq
{
    private final CommandOuterClass$GestureOptions a;
    
    public aqeq(final CommandOuterClass$GestureOptions a) {
        this.a = a;
    }
    
    public static aeea b(final CommandOuterClass$GestureOptions commandOuterClass$GestureOptions) {
        return new aeea(((ahbh)commandOuterClass$GestureOptions).toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        CommandOuterClass$GestureAccessibilityInfo commandOuterClass$GestureAccessibilityInfo;
        if ((commandOuterClass$GestureAccessibilityInfo = this.a.b) == null) {
            commandOuterClass$GestureAccessibilityInfo = CommandOuterClass$GestureAccessibilityInfo.getDefaultInstance();
        }
        final CommandOuterClass$GestureAccessibilityInfo commandOuterClass$GestureAccessibilityInfo2 = (CommandOuterClass$GestureAccessibilityInfo)((ahbh)commandOuterClass$GestureAccessibilityInfo).toBuilder().build();
        affr.j((Iterable)new affr().g());
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqeq && ((ahbh)this.a).equals((Object)((aqeq)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("GestureOptionsModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
