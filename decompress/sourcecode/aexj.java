import java.util.regex.Pattern;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aexj extends aexc implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final Pattern a;
    
    public aexj(final Pattern a) {
        a.getClass();
        this.a = a;
    }
    
    public final adcr a(final CharSequence charSequence) {
        return new adcr(this.a.matcher(charSequence));
    }
    
    public final String toString() {
        return this.a.toString();
    }
}
