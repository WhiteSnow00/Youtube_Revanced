import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import android.util.Pair;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aafg extends aaek implements thj
{
    private final Context e;
    
    public aafg(final Context e, final aage aage, final String s) {
        super(aage, s);
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
        aaco aaco = null;
        final aaco aaco2 = null;
        if (!empty) {
            aaco b = aaco2;
            if (k.size() > 1) {
                b = aaco.b(k.size(), this.e.getString(2132019834), (String)null, (akfj)null);
            }
            aaco = b;
            emptyList = k;
        }
        return this.b(aaco, (List)emptyList);
    }
    
    public final boolean f() {
        return !TextUtils.isEmpty((CharSequence)super.b) && !this.g();
    }
    
    protected final boolean g() {
        return TextUtils.equals((CharSequence)"PPSV", (CharSequence)super.b);
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
                final aaag aaag = (aaag)o;
                if (this.g()) {
                    this.a();
                    return null;
                }
            }
            else {
                final zzy zzy = (zzy)o;
                if (this.g()) {
                    this.a();
                    return null;
                }
            }
        }
        else {
            array = new Class[] { zzy.class, aaag.class };
        }
        return array;
    }
}
