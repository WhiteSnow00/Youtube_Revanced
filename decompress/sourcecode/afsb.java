import android.database.Cursor;
import java.util.concurrent.Executor;
import java.io.Closeable;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afsb implements afry
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public afsb(final aerr b, final afry a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afsb(final afsf a, final afsc b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afsb(final afsf a, final xfc b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final ListenableFuture a(final Object o) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                final afsd b = ((afsf)this.a).b;
                final Object b2 = this.b;
                final afsd afsd = new afsd();
                try {
                    final afsf a = ((afsc)b2).a(afsd.a, o);
                    a.d(afsd);
                    return (ListenableFuture)a.c;
                }
                finally {
                    b.a((Closeable)afsd, (Executor)afsl.a);
                }
            }
            final Object b3 = this.b;
            final Object a2 = this.a;
            final aesv g = aesw.g();
            final aerr e = aesw.e(g, (aerr)b3);
            try {
                final ListenableFuture a3 = ((afry)a2).a(o);
                aesw.e(g, e);
                a3.getClass();
                return a3;
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
        final afsd b4 = ((afsf)this.a).b;
        final Object b5 = this.b;
        final afsd afsd2 = new afsd();
        try {
            return afva.m(((zhb)((xfc)b5).b).K((Cursor)o, (String)((xfc)b5).a));
        }
        finally {
            b4.a((Closeable)afsd2, (Executor)afsl.a);
        }
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        if (c == 0) {
            return ((xfc)this.b).toString();
        }
        if (c != 1) {
            return this.b.toString();
        }
        final Object a = this.a;
        final StringBuilder sb = new StringBuilder("propagating=[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
