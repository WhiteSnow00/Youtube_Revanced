import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ashb extends aryo
{
    public final aryh b;
    private aryl c;
    
    public ashb(final aryh b) {
        this.b = b;
    }
    
    @Override
    public final void a(final Status status) {
        final aryl c = this.c;
        if (c != null) {
            c.d();
            this.c = null;
        }
        this.b.d(arxe.c, new asgy(aryi.b(status)));
    }
    
    @Override
    public final void b() {
        final aryl c = this.c;
        if (c != null) {
            c.d();
        }
    }
    
    @Override
    public final boolean c(final aryk aryk) {
        final List a = aryk.a;
        if (a.isEmpty()) {
            final Status l = Status.l;
            final String value = String.valueOf(aryk.a);
            final String string = aryk.b.toString();
            final StringBuilder sb = new StringBuilder("NameResolver returned no usable address. addrs=");
            sb.append(value);
            sb.append(", attrs=");
            sb.append(string);
            this.a(l.withDescription(sb.toString()));
            return false;
        }
        final aryl c = this.c;
        if (c == null) {
            final aryh b = this.b;
            final arwo a2 = arwo.a;
            final Object[][] array = new Object[0][2];
            adme.L(a.isEmpty() ^ true, "addrs is empty");
            final aryl b2 = b.b(arxu.f(Collections.unmodifiableList((List<?>)new ArrayList<Object>(a)), a2, array));
            b2.e(new asjn(this, b2, 1));
            this.c = b2;
            this.b.d(arxe.a, new asgy(aryi.c(b2)));
            b2.c();
        }
        else {
            c.f(a);
        }
        return true;
    }
}
