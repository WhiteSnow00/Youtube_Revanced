// 
// Decompiled by Procyon v0.6.0
// 

final class aewc implements afvu
{
    final aevk a;
    final afvu b;
    
    public aewc(final aevk a, final afvu b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final afvx a(final adgg adgg, final Object o) {
        adgg.getClass();
        final aevk a = this.a;
        final afvu b = this.b;
        final aewo g = aewp.g();
        final aevk e = aewp.e(g, a);
        try {
            final afvx a2 = b.a(adgg, o);
            aewp.e(g, e);
            return a2;
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
}
