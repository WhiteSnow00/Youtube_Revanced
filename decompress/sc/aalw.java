// 
// Decompiled by Procyon v0.6.0
// 

public class aalw
{
    private final yph a;
    private final String b;
    
    public aalw(final yph a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public yph a() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final String b = this.b;
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MediaCuePointEvent cpn=");
        sb.append(b);
        sb.append(", cuepoint=");
        sb.append(value);
        return sb.toString();
    }
}
