import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abay implements abnq, tec
{
    private final AlertDialog$Builder a;
    
    public abay(final abno abno, final Context context, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3) {
        abno.getClass();
        context.getClass();
        Object af;
        if (aeby != null && aeby.ai()) {
            af = aeby.af(context);
        }
        else {
            af = new AlertDialog$Builder(context);
        }
        this.a = (AlertDialog$Builder)af;
        ((AlertDialog$Builder)af).setTitle((CharSequence)context.getString(2132019151)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)gxw.k);
    }
    
    public static final void a(final aaly aaly) {
        if (aaly.c() != abim.a) {
            aaly.c();
        }
        aaly.b();
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().a).j(aajj.t(abns.bN(), 65536L)).j(aajj.r(1)).am((asix)new aaze(9), (asix)aaze.j) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            a((aaly)o);
            array = null;
        }
        else {
            array = new Class[] { aaly.class };
        }
        return array;
    }
}
