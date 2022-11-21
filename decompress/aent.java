import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aent extends afvd
{
    private aenv a;
    private final int b;
    
    public aent(final aenv a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void b() {
        final aenv a = this.a;
        this.a = null;
        if (a == null) {
            return;
        }
        long value;
        int n;
        int n2;
        boolean b;
        do {
            value = a.a.get();
            n2 = (int)value;
            final int a2 = aenv.a(value);
            if (n2 == Integer.MIN_VALUE) {
                final StringBuilder sb = new StringBuilder("Refcount is: ");
                sb.append(value);
                throw new AssertionError((Object)sb.toString());
            }
            b = (n2 == -2147483647);
            n = a2;
            if (!b) {
                continue;
            }
            n = a2 + 1;
        } while (!a.a.compareAndSet(value, aenv.b(n, n2 - 1)));
        if (b) {
        Label_0094:
            while (true) {
                final aenu aenu = a.b.get();
                if (aenu != null && aenu.a <= this.b) {
                    aenu.cancel(true);
                    final AtomicReference b2 = a.b;
                    while (!b2.compareAndSet(aenu, null)) {
                        if (b2.get() != aenu) {
                            continue Label_0094;
                        }
                    }
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    protected final String np() {
        final aenv a = this.a;
        if (a == null) {
            return null;
        }
        final Object a2 = a.d.a;
        if (a2 == null) {
            return null;
        }
        final String string = a2.toString();
        final StringBuilder sb = new StringBuilder("callable=[");
        sb.append(string);
        sb.append("]");
        final String string2 = sb.toString();
        final aenu aenu = this.a.b.get();
        if (aenu != null) {
            final String string3 = aenu.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(", trial=[");
            sb2.append(string3);
            sb2.append("]");
            return sb2.toString();
        }
        return string2;
    }
    
    @Override
    public final boolean setFuture(final ListenableFuture future) {
        return super.setFuture(future);
    }
}
