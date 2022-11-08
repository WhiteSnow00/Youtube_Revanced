// 
// Decompiled by Procyon v0.6.0
// 

public class abgy
{
    public static final abgy a;
    private final zbp b;
    
    static {
        a = new abgy(null);
    }
    
    public abgy(final zbp b) {
        this.b = b;
    }
    
    public zbp a() {
        return this.b;
    }
    
    @Override
    public String toString() {
        final String string = super.toString();
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(", view: ");
        sb.append(value);
        return sb.toString();
    }
}
