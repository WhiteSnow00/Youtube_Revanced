// 
// Decompiled by Procyon v0.6.0
// 

final class afal extends afak
{
    private final char a;
    private final char b;
    
    public afal(final char a, final char b) {
        adme.K(b >= a);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean b(final char c) {
        return this.a <= c && c <= this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CharMatcher.inRange('");
        sb.append(afar.g(this.a));
        sb.append("', '");
        sb.append(afar.g(this.b));
        sb.append("')");
        return sb.toString();
    }
}
