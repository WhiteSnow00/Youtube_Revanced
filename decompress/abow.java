import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abow extends abos implements thj
{
    private final zoa a;
    private final atnb e;
    private final aefs f;
    
    public abow(final Context context, final abkq abkq, final zoa a, final atnb e, final aefs f, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, abkq);
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.f = f;
    }
    
    protected final void b(final akyz akyz, final tdg tdg, final String s) {
        final abou j = this.j();
        if (j != null && j.a() != null) {
            ((zoo)this.e.a()).b(j.a(), (byte[])null, (zom)new abov(this, akyz, tdg, s));
            return;
        }
        abot.a(tdg, h(akyz, s));
    }
    
    protected final void f() {
        if (this.a.t()) {
            this.f.al(this.a.c(), true);
        }
    }
    
    public final void g() {
        ListenableFuture b;
        if (this.a.t()) {
            b = this.f.ah(this.a.c());
        }
        else {
            b = afxr.l(false);
        }
        this.b = b;
        this.c = false;
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zop zop = (zop)o;
                this.g();
            }
            else {
                final zon zon = (zon)o;
                this.g();
            }
        }
        else {
            array = new Class[] { zon.class, zop.class };
        }
        return array;
    }
}
