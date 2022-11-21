// 
// Decompiled by Procyon v0.6.0
// 

final class afam extends afak
{
    private final char a;
    
    public afam(final char a) {
        this.a = a;
    }
    
    @Override
    public final boolean b(final char c) {
        return c == this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CharMatcher.is('");
        sb.append(afar.g(this.a));
        sb.append("')");
        return sb.toString();
    }
}
