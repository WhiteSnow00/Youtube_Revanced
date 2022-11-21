// 
// Decompiled by Procyon v0.6.0
// 

public final class aewe implements afwr
{
    final aevk a;
    final afwr b;
    
    public aewe(final aevk a, final afwr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Object o) {
        final aevk a = this.a;
        final afwr b = this.b;
        final aewo g = aewp.g();
        final aevk e = aewp.e(g, a);
        try {
            b.b(o);
            aewp.e(g, e);
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
    public final void rF(final Throwable t) {
        t.getClass();
        final aevk a = this.a;
        final afwr b = this.b;
        final aewo g = aewp.g();
        final aevk e = aewp.e(g, a);
        try {
            b.rF(t);
            aewp.e(g, e);
        }
        finally {
            try {
                aeua.a(t);
            }
            finally {
                aewp.e(g, e);
            }
        }
    }
}
