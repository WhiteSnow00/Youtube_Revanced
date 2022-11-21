import android.database.Cursor;
import java.util.concurrent.Executor;
import java.io.Closeable;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvt implements afvq
{
    final Object a;
    final Object b;
    private final int c;
    
    public afvt(final aevk b, final afvq a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afvt(final afvx a, final afvu b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afvt(final afvx a, final xil b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ListenableFuture a(final Object o) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                final afvv b = ((afvx)this.a).b;
                final Object b2 = this.b;
                final afvv afvv = new afvv();
                try {
                    final afvx a = ((afvu)b2).a(afvv.a, o);
                    a.d(afvv);
                    return (ListenableFuture)a.c;
                }
                finally {
                    b.a(afvv, afwd.a);
                }
            }
            final Object b3 = this.b;
            final Object a2 = this.a;
            final aewo g = aewp.g();
            final aevk e = aewp.e(g, (aevk)b3);
            try {
                final ListenableFuture a3 = ((afvq)a2).a(o);
                aewp.e(g, e);
                a3.getClass();
                return a3;
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
        final afvv b4 = ((afvx)this.a).b;
        final Object b5 = this.b;
        final afvv afvv2 = new afvv();
        try {
            return afxr.l(((zkt)((xil)b5).b).E((Cursor)o, (String)((xil)b5).a));
        }
        finally {
            b4.a(afvv2, afwd.a);
        }
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        if (c == 0) {
            return ((xil)this.b).toString();
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
