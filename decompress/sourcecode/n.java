// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class n
{
    @Deprecated
    public final m a;
    @Deprecated
    public final m b;
    
    @Deprecated
    public n(final m a, final m b) {
        if (a.b == b.b) {
            this.a = a;
            this.b = b;
            return;
        }
        final String string = a.toString();
        final String string2 = b.toString();
        final StringBuilder sb = new StringBuilder("Ranges must have the same number of visible decimals: ");
        sb.append(string);
        sb.append("~");
        sb.append(string2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Deprecated
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final m b = this.b;
        String concat;
        if (b == this.a) {
            concat = "";
        }
        else {
            concat = "~".concat(b.toString());
        }
        return string.concat(concat);
    }
}
