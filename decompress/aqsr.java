// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsr
{
    private final aqss a;
    
    public aqsr(final aqss a) {
        this.a = a;
    }
    
    public static aeea b(final aqss aqss) {
        return new aeea(aqss.toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        aqsw aqsw;
        if ((aqsw = this.a.c) == null) {
            aqsw = aqsw.a;
        }
        final aqsv aqsv = new aqsv((aqsw)aqsw.toBuilder().build());
        final affr affr2 = new affr();
        aqsu aqsu;
        if ((aqsu = aqsv.a.c) == null) {
            aqsu = aqsu.a;
        }
        final aqsu aqsu2 = (aqsu)((ahaz)((ahbh)aqsu).toBuilder()).build();
        affr2.j((Iterable)new affr().g());
        affr.j((Iterable)affr2.g());
        aqso aqso;
        if ((aqso = this.a.d) == null) {
            aqso = aqso.a;
        }
        final aqso aqso2 = (aqso)((ahaz)((ahbh)aqso).toBuilder()).build();
        affr.j((Iterable)new affr().g());
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqsr && this.a.equals((Object)((aqsr)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("FocusVisibilityLoggingCriteriaModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
