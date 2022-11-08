import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afnm extends aety
{
    public final /* synthetic */ Pattern b;
    
    public afnm(final Pattern b) {
        this.b = b;
    }
    
    public final String toString() {
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("first(\"");
        sb.append(string);
        sb.append("\", 0)");
        return sb.toString();
    }
}
