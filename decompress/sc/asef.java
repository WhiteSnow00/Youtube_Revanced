import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asef extends arvu
{
    public final arvn b;
    private arvr c;
    
    public asef(final arvn b) {
        this.b = b;
    }
    
    public final void a(final Status status) {
        final arvr c = this.c;
        if (c != null) {
            c.d();
            this.c = null;
        }
        this.b.d(aruk.c, (arvs)new asec(arvo.b(status)));
    }
    
    public final void c() {
        final arvr c = this.c;
        if (c != null) {
            c.d();
        }
    }
    
    public final boolean d(final arvq arvq) {
        final List a = arvq.a;
        if (a.isEmpty()) {
            final Status l = Status.l;
            final String value = String.valueOf(arvq.a);
            final String string = arvq.b.toString();
            final StringBuilder sb = new StringBuilder("NameResolver returned no usable address. addrs=");
            sb.append(value);
            sb.append(", attrs=");
            sb.append(string);
            this.a(l.withDescription(sb.toString()));
            return false;
        }
        final arvr c = this.c;
        if (c == null) {
            final arvn b = this.b;
            final artu a2 = artu.a;
            final Object[][] array = new Object[0][2];
            adkp.I(a.isEmpty() ^ true, (Object)"addrs is empty");
            final arvr b2 = b.b(arva.a((List)Collections.unmodifiableList((List<?>)new ArrayList<Object>(a)), a2, array));
            b2.e((arvt)new asgr(this, b2, 1));
            this.c = b2;
            this.b.d(aruk.a, (arvs)new asec(arvo.c(b2)));
            b2.c();
        }
        else {
            c.f(a);
        }
        return true;
    }
}
