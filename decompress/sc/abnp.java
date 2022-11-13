import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnp extends abnl implements tgg
{
    private final zmf a;
    private final atke e;
    private final aeea f;
    
    public abnp(final Context context, final abjj abjj, final zmf a, final atke e, final aeea f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, abjj);
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected final void b(final akwz akwz, final tcc tcc, final String s) {
        final abnn j = this.j();
        if (j != null && j.a() != null) {
            ((zmt)this.e.a()).b(j.a(), (byte[])null, (zmr)new abno(this, akwz, tcc, s));
            return;
        }
        abnm.a(tcc, abnl.h(akwz, s));
    }
    
    @Override
    protected final void f() {
        if (this.a.t()) {
            this.f.aB(this.a.c(), true);
        }
    }
    
    public final void g() {
        ListenableFuture b;
        if (this.a.t()) {
            b = this.f.ax(this.a.c());
        }
        else {
            b = afwm.m((Object)false);
        }
        this.b = b;
        this.c = false;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zmu zmu = (zmu)o;
                this.g();
            }
            else {
                final zms zms = (zms)o;
                this.g();
            }
        }
        else {
            array = new Class[] { zms.class, zmu.class };
        }
        return array;
    }
}
