import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewb implements afvp
{
    final Object a;
    final Object b;
    private final int c;
    
    public aewb(final aevk a, final afvp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aewb(final afvp a, final ListenableFuture b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aewb(final afwj b, final afvp a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a() {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                ListenableFuture listenableFuture;
                if (!((afwj)this.b).compareAndSet(afwi.a, afwi.c)) {
                    listenableFuture = afxr.j();
                }
                else {
                    listenableFuture = ((afvp)this.a).a();
                }
                return listenableFuture;
            }
            return ((afvp)this.a).a();
        }
        else {
            final Object a = this.a;
            final Object b = this.b;
            final aewo g = aewp.g();
            final aevk e = aewp.e(g, (aevk)a);
            try {
                final ListenableFuture a2 = ((afvp)b).a();
                aewp.e(g, e);
                a2.getClass();
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
