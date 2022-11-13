// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtj extends RuntimeException
{
    public aqtj() {
        super("error parsing regexp: trailing backslash at end of expression");
    }
    
    public aqtj(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder("error parsing regexp: ");
        sb.append(s);
        sb.append(": `");
        sb.append(s2);
        sb.append("`");
        super(sb.toString());
    }
}
