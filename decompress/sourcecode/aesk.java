// 
// Decompiled by Procyon v0.6.0
// 

public final class aesk implements aexg
{
    final /* synthetic */ aerr a;
    final /* synthetic */ aexg b;
    
    public aesk(final aerr a, final aexg b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object apply(Object apply) {
        final aerr a = this.a;
        final aexg b = this.b;
        final aesv g = aesw.g();
        final aerr e = aesw.e(g, a);
        try {
            apply = b.apply(apply);
            aesw.e(g, e);
            return apply;
        }
        finally {
            try {
                final Throwable t;
                aeqg.a(t);
            }
            finally {
                aesw.e(g, e);
            }
        }
    }
    
    @Override
    public final String toString() {
        final aexg b = this.b;
        final StringBuilder sb = new StringBuilder("propagating=[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
