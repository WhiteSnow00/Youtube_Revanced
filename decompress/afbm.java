// 
// Decompiled by Procyon v0.6.0
// 

public enum afbm implements afbk
{
    a("ALWAYS_TRUE", 0), 
    b("ALWAYS_FALSE", 1), 
    c("IS_NULL", 2), 
    d("NOT_NULL", 3);
    
    private static final afbm[] e;
    
    private afbm(final String s, final int n) {
    }
    
    @Override
    public final boolean a(final Object o) {
        final int ordinal = this.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return o != null;
                    }
                    throw null;
                }
                else if (o == null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final String toString() {
        final int ordinal = this.ordinal();
        if (ordinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (ordinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (ordinal == 2) {
            return "Predicates.isNull()";
        }
        if (ordinal != 3) {
            return super.toString();
        }
        return "Predicates.notNull()";
    }
}
