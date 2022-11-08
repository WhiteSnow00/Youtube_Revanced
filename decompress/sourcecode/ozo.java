import java.util.Set;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozo
{
    public static final ozk c;
    public pac a;
    public int b;
    public final agzc d;
    public final php e;
    private final ozk f;
    
    static {
        c = ozk.a;
    }
    
    public ozo(final agzc d, final ozk f, final php e, final byte[] array, final byte[] array2) {
        this.b = -1;
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    public final ozr a() {
        return (ozr)this.d.build();
    }
    
    public final void b(final ozo ozo) {
        final pac a = ozo.a;
        final boolean b = false;
        agot.D(a == null);
        agot.D(this.c() ^ true);
        boolean b2 = b;
        if (this.f == ozo.f) {
            b2 = true;
        }
        agot.D(b2);
        final boolean n = this.a.n();
        if (n) {
            this.e.f((Object)this);
        }
        this.d.clear();
        this.d.mergeFrom((agzi)ozo.d.build());
        if (n) {
            this.e.e((Object)this);
        }
    }
    
    public final boolean c() {
        afpc afpc;
        if ((afpc = ((ozr)this.d.instance).d) == null) {
            afpc = afpc.a;
        }
        return (afpc.b & 0x8) != 0x0;
    }
    
    public final boolean d() {
        afpc afpc;
        if ((afpc = ((ozr)this.d.instance).d) == null) {
            afpc = afpc.a;
        }
        return (afpc.b & 0x800) != 0x0;
    }
    
    public final void e() {
        final php e = this.e;
        if (!((Set)e.a).isEmpty()) {
            final Iterator<Object> iterator = ((Set<Object>)e.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this);
            }
        }
        final agzc d = this.d;
        afpc afpc;
        if ((afpc = ((ozr)d.instance).d) == null) {
            afpc = afpc.a;
        }
        final agza builder = ((agzi)afpc).toBuilder();
        builder.copyOnWrite();
        final afpc afpc2 = (afpc)builder.instance;
        afpc2.e = null;
        afpc2.b &= 0xFFFFF7FF;
        builder.copyOnWrite();
        final afpc afpc3 = (afpc)builder.instance;
        afpc3.b &= 0xFFFFFFFE;
        afpc3.c = -1;
        final afpc d2 = (afpc)builder.build();
        d.copyOnWrite();
        final ozr ozr = (ozr)d.instance;
        d2.getClass();
        ozr.d = d2;
        ozr.b |= 0x1;
    }
    
    public final int f() {
        return this.a.s();
    }
    
    public final void g(final int n) {
        int n2 = n;
        if (n != 1) {
            n2 = 2;
        }
        agot.v(true, (Object)"Repressed visibility is not yet supported.");
        this.a.t(n2);
    }
    
    @Override
    public final String toString() {
        final pac a = this.a;
        String concat;
        if (a != null) {
            concat = ".".concat(String.valueOf(a.getClass().getSimpleName()));
        }
        else {
            concat = "";
        }
        afpc afpc;
        if ((afpc = ((ozr)this.d.instance).d) == null) {
            afpc = afpc.a;
        }
        final int d = afpc.d;
        final String hexString = Integer.toHexString(this.hashCode());
        final StringBuilder sb = new StringBuilder("CVE");
        sb.append(concat);
        sb.append("#");
        sb.append(d);
        sb.append(" [");
        sb.append(hexString);
        sb.append("]");
        return sb.toString();
    }
}
