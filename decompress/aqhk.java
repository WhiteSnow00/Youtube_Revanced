import com.google.protos.youtube.elements.CommandOuterClass$GestureAccessibilityInfo;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhk
{
    private final CommandOuterClass$GestureOptions a;
    
    public aqhk(final CommandOuterClass$GestureOptions a) {
        this.a = a;
    }
    
    public static agpb b(final CommandOuterClass$GestureOptions commandOuterClass$GestureOptions) {
        return new agpb(((ahcz)commandOuterClass$GestureOptions).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        CommandOuterClass$GestureAccessibilityInfo commandOuterClass$GestureAccessibilityInfo;
        if ((commandOuterClass$GestureAccessibilityInfo = this.a.b) == null) {
            commandOuterClass$GestureAccessibilityInfo = CommandOuterClass$GestureAccessibilityInfo.getDefaultInstance();
        }
        final CommandOuterClass$GestureAccessibilityInfo commandOuterClass$GestureAccessibilityInfo2 = (CommandOuterClass$GestureAccessibilityInfo)((ahcz)commandOuterClass$GestureAccessibilityInfo).toBuilder().build();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqhk && ((ahcz)this.a).equals(((aqhk)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
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
