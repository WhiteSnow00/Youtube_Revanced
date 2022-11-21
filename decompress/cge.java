import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cge
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    
    public cge(final String a, final String b, final String c, final List d, final List e) {
        d.getClass();
        e.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cge)) {
            return false;
        }
        final String a = this.a;
        final cge cge = (cge)o;
        return atqz.c(a, cge.a) && atqz.c(this.b, cge.b) && atqz.c(this.c, cge.c) && atqz.c(this.d, cge.d) && atqz.c(this.e, cge.e);
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.a);
        sb.append("', onDelete='");
        sb.append(this.b);
        sb.append(" +', onUpdate='");
        sb.append(this.c);
        sb.append("', columnNames=");
        sb.append(this.d);
        sb.append(", referenceColumnNames=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
