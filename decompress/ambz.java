// 
// Decompiled by Procyon v0.6.0
// 

public final class ambz
{
    public final amcd a;
    private final vgx b;
    
    public ambz(final amcd a, final vgx b) {
        this.a = a;
        this.b = b;
    }
    
    public final ambx a() {
        final amcd a = this.a;
        final int b = a.b;
        final boolean b2 = true;
        String s;
        if (b == 1) {
            s = (String)a.c;
        }
        else {
            s = "";
        }
        final vgv c = this.b.c(s);
        boolean b3 = b2;
        if (c != null) {
            b3 = (c instanceof ambx && b2);
        }
        adme.U(b3, "entityFromStore is not instance of MainRecommendedDownloadVideoEntityModel, key=video");
        return (ambx)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambz && this.a.equals(((ambz)o).a);
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
