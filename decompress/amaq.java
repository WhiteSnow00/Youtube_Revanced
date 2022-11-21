// 
// Decompiled by Procyon v0.6.0
// 

public final class amaq
{
    public final amau a;
    private final vgx b;
    
    public amaq(final amau a, final vgx b) {
        this.a = a;
        this.b = b;
    }
    
    public final amcr a() {
        final amau a = this.a;
        String s;
        if (a.b == 3) {
            s = (String)a.c;
        }
        else {
            s = "";
        }
        final vgv c = this.b.c(s);
        boolean b = true;
        if (c != null) {
            b = (c instanceof amcr && b);
        }
        adme.U(b, "entityFromStore is not instance of MainVideoEntityModel, key=videoItem");
        return (amcr)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amaq && this.a.equals(((amaq)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ItemModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
