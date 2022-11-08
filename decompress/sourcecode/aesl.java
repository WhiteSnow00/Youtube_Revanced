// 
// Decompiled by Procyon v0.6.0
// 

public final class aesl implements afsz
{
    final /* synthetic */ aerr a;
    final /* synthetic */ afsz b;
    
    public aesl(final aerr a, final afsz b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Object o) {
        final aerr a = this.a;
        final afsz b = this.b;
        final aesv g = aesw.g();
        final aerr e = aesw.e(g, a);
        try {
            b.b(o);
            aesw.e(g, e);
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
    
    public final void rz(final Throwable t) {
        t.getClass();
        final aerr a = this.a;
        final afsz b = this.b;
        final aesv g = aesw.g();
        final aerr e = aesw.e(g, a);
        try {
            b.rz(t);
            aesw.e(g, e);
        }
        finally {
            try {
                aeqg.a(t);
            }
            finally {
                aesw.e(g, e);
            }
        }
    }
}
