// 
// Decompiled by Procyon v0.6.0
// 

public final class alzz
{
    public final amad a;
    private final vfp b;
    
    public alzz(final amad a, final vfp b) {
        this.a = a;
        this.b = b;
    }
    
    public final alzx a() {
        final amad a = this.a;
        final int b = a.b;
        final boolean b2 = true;
        String s;
        if (b == 1) {
            s = (String)a.c;
        }
        else {
            s = "";
        }
        final vfn b3 = this.b.b(s);
        boolean b4 = b2;
        if (b3 != null) {
            b4 = (b3 instanceof alzx && b2);
        }
        adkp.R(b4, "entityFromStore is not instance of MainRecommendedDownloadVideoEntityModel, key=video");
        return (alzx)b3;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof alzz && ((ahbh)this.a).equals((Object)((alzz)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
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
