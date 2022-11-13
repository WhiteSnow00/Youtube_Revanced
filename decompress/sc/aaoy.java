import com.google.protobuf.MessageLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaoy extends abvy
{
    private final Set a;
    private final aqau b;
    private final RuntimeStreamWriter c;
    
    public aaoy(final aqau b, final Set a, final RuntimeStreamWriter c) {
        super(b.b, b.c, 1, 1, (String)null);
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    private final boolean e(final aqax aqax) {
        return this.a.isEmpty() || this.a.contains(aqax);
    }
    
    public final void a() {
        if (!this.e(aqax.c)) {
            return;
        }
        final RuntimeStreamWriter c = this.c;
        final aqav a = aqaw.a();
        final aqau b = this.b;
        ((ahaz)a).copyOnWrite();
        aqaw.d((aqaw)a.instance, b);
        final aqax c2 = aqax.c;
        ((ahaz)a).copyOnWrite();
        aqaw.c((aqaw)a.instance, c2);
        c.c((MessageLite)((ahaz)a).build());
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        if (!this.e(aqax.b)) {
            return;
        }
        final RuntimeStreamWriter c = this.c;
        final aqav a = aqaw.a();
        final aqau b4 = this.b;
        ((ahaz)a).copyOnWrite();
        aqaw.d((aqaw)a.instance, b4);
        final aqax b5 = aqax.b;
        ((ahaz)a).copyOnWrite();
        aqaw.c((aqaw)a.instance, b5);
        c.c((MessageLite)((ahaz)a).build());
    }
}
