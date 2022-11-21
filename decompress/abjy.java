// 
// Decompiled by Procyon v0.6.0
// 

public class abjy
{
    public static final abjy a;
    private final zfd b;
    
    static {
        a = new abjy(null);
    }
    
    public abjy(final zfd b) {
        this.b = b;
    }
    
    public zfd a() {
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
