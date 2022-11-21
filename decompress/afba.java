import java.util.regex.Pattern;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afba extends afat implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final Pattern a;
    
    public afba(final Pattern a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final adgg a(final CharSequence charSequence) {
        return new adgg(this.a.matcher(charSequence));
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
