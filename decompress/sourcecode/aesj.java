// 
// Decompiled by Procyon v0.6.0
// 

final class aesj implements afsc
{
    final /* synthetic */ aerr a;
    final /* synthetic */ afsc b;
    
    public aesj(final aerr a, final afsc b) {
        this.a = a;
        this.b = b;
    }
    
    public final afsf a(final adcr adcr, final Object o) {
        adcr.getClass();
        final aerr a = this.a;
        final afsc b = this.b;
        final aesv g = aesw.g();
        final aerr e = aesw.e(g, a);
        try {
            final afsf a2 = b.a(adcr, o);
            aesw.e(g, e);
            return a2;
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
}
