import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxn
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    public oxn(final String a, final String b, final String c, final String d, final String e) {
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
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final oxn oxn = (oxn)o;
                if (Objects.equals((Object)this.a, (Object)oxn.a) && Objects.equals((Object)this.b, (Object)oxn.b) && Objects.equals((Object)this.c, (Object)oxn.c) && Objects.equals((Object)this.d, (Object)oxn.d) && Objects.equals((Object)this.e, (Object)oxn.e)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e });
    }
}
