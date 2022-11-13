import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvb implements tgg
{
    static final String a;
    public final arkg b;
    public final atke c;
    public final atke d;
    private final vdr e;
    private final zmf f;
    private final Executor g;
    
    static {
        a = vgl.h(antt.b.a(), "SHORTS_SEEDLESS_ENDPOINT");
    }
    
    public gvb(final vdr e, final zmf f, final arkg b, final Executor g, final atke c, final atke d) {
        this.e = e;
        this.f = f;
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        this.e.a(this.f.c()).h(gvb.a, true).af(atjj.b(this.g)).aI((asjm)new gsa(this, 13), (asjm)gpg.l);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zms zms = (zms)o;
            this.a();
            array = null;
        }
        else {
            array = new Class[] { zms.class };
        }
        return array;
    }
}
