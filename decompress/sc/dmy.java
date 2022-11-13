// 
// Decompiled by Procyon v0.6.0
// 

final class dmy implements dmr
{
    final Object a;
    private final int b;
    
    public dmy(final dmn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dmy(final dmz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final String toString() {
        if (this.b != 0) {
            final String string = super.toString();
            final String string2 = this.a.toString();
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("{fragment=");
            sb.append(string2);
            sb.append("}");
            return sb.toString();
        }
        final String string3 = super.toString();
        final String string4 = this.a.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string3);
        sb2.append("{fragment=");
        sb2.append(string4);
        sb2.append("}");
        return sb2.toString();
    }
}
