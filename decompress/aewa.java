// 
// Decompiled by Procyon v0.6.0
// 

public final class aewa implements Runnable
{
    final aevl a;
    final Runnable b;
    
    public aewa(final aevl a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final aevl a = this.a;
        final Runnable b = this.b;
        final aewo g = aewp.g();
        final aevk e = aewp.e(g, (aevk)a);
        try {
            b.run();
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
    public final String toString() {
        final Runnable b = this.b;
        final StringBuilder sb = new StringBuilder("propagating=[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
