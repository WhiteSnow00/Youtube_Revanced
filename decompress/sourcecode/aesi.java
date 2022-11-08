import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesi implements afrx
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public aesi(final aerr a, final afrx b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aesi(final afrx a, final ListenableFuture b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aesi(final afsr b, final afrx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final ListenableFuture a() {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                ListenableFuture listenableFuture;
                if (!((afsr)this.b).compareAndSet((Object)afsq.a, (Object)afsq.c)) {
                    listenableFuture = afva.k();
                }
                else {
                    listenableFuture = ((afrx)this.a).a();
                }
                return listenableFuture;
            }
            return ((afrx)this.a).a();
        }
        else {
            final Object a = this.a;
            final Object b = this.b;
            final aesv g = aesw.g();
            final aerr e = aesw.e(g, (aerr)a);
            try {
                final ListenableFuture a2 = ((afrx)b).a();
                aesw.e(g, e);
                a2.getClass();
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
    
    @Override
    public final String toString() {
        final int c = this.c;
        if (c == 0) {
            final Object b = this.b;
            final StringBuilder sb = new StringBuilder("propagating=[");
            sb.append(b);
            sb.append("]");
            return sb.toString();
        }
        if (c != 1) {
            return this.a.toString();
        }
        final String string = this.a.toString();
        final String value = String.valueOf(this.b);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(", input=[");
        sb2.append(value);
        sb2.append("]");
        return sb2.toString();
    }
}
