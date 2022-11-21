// 
// Decompiled by Procyon v0.6.0
// 

public final class aewd implements afax
{
    final aevk a;
    final afax b;
    
    public aewd(final aevk a, final afax b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object apply(Object apply) {
        final aevk a = this.a;
        final afax b = this.b;
        final aewo g = aewp.g();
        final aevk e = aewp.e(g, a);
        try {
            apply = b.apply(apply);
            aewp.e(g, e);
            return apply;
        }
        finally {
            try {
                final Throwable t;
                aeua.a(t);
            }
            finally {
                aewp.e(g, e);
            }
        }
    }
    
    @Override
    public final String toString() {
        final afax b = this.b;
        final StringBuilder sb = new StringBuilder("propagating=[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
