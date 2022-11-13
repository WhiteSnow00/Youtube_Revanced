import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcs implements abps, tgg
{
    private final AlertDialog$Builder a;
    
    public abcs(final abpq abpq, final Context context, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3) {
        abpq.getClass();
        context.getClass();
        Object al;
        if (aeea != null && aeea.ao()) {
            al = aeea.al(context);
        }
        else {
            al = new AlertDialog$Builder(context);
        }
        this.a = (AlertDialog$Builder)al;
        ((AlertDialog$Builder)al).setTitle((CharSequence)context.getString(2132019152)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)gyl.k);
    }
    
    public static final void a(final aans aans) {
        if (aans.c() != abke.a) {
            aans.c();
        }
        aans.b();
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 65536L)).j(aale.q(1)).an(new abba(9), abba.j) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            a((aans)o);
            array = null;
        }
        else {
            array = new Class[] { aans.class };
        }
        return array;
    }
}
