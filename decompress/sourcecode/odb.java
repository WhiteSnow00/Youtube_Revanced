// 
// Decompiled by Procyon v0.6.0
// 

final class odb
{
    Object a;
    int b;
    
    public odb(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("countOrWorkerId[");
        sb.append(b);
        sb.append("][");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
