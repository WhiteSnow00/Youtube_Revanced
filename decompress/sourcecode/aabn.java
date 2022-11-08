import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import android.util.Pair;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aabn extends aaat implements tec
{
    private final Context e;
    
    public aabn(final Context e, final aack aack, final String s) {
        super(aack, s);
        e.getClass();
        this.e = e;
    }
    
    protected Pair a() {
        if (!this.g()) {
            return super.a();
        }
        List<Object> emptyList = Collections.emptyList();
        final List k = this.a.l().k();
        final boolean empty = k.isEmpty();
        zyx zyx = null;
        final zyx zyx2 = null;
        if (!empty) {
            zyx b = zyx2;
            if (k.size() > 1) {
                b = zyx.b(k.size(), this.e.getString(2132019830), (String)null, (akbf)null);
            }
            zyx = b;
            emptyList = k;
        }
        return this.b(zyx, (List)emptyList);
    }
    
    public final boolean f() {
        return !TextUtils.isEmpty((CharSequence)super.b) && !this.g();
    }
    
    protected final boolean g() {
        return TextUtils.equals((CharSequence)"PPSV", (CharSequence)super.b);
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
                final zwn zwn = (zwn)o;
                if (this.g()) {
                    this.a();
                    return null;
                }
            }
            else {
                final zwf zwf = (zwf)o;
                if (this.g()) {
                    this.a();
                    return null;
                }
            }
        }
        else {
            array = new Class[] { zwf.class, zwn.class };
        }
        return array;
    }
}
