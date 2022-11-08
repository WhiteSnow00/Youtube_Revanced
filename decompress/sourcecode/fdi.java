import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdi implements znj
{
    public final /* synthetic */ fdj a;
    private final String b;
    private final List c;
    private final Object d;
    private final Optional e;
    
    public fdi(final fdj a, final String b, final List c, final Optional e, final Object d) {
        this.a = a;
        tsx.n(b);
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public final void a(final dbi dbi) {
        trn.d("Error editing the playlist", (Throwable)dbi);
        this.a.b.e((Throwable)dbi);
        this.e.ifPresent((Consumer)new eot(this, 7));
    }
}
