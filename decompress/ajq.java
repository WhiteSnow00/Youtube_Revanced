import android.os.LocaleList;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajq
{
    public static final ajq a;
    public final ajr b;
    
    static {
        a = b(new Locale[0]);
    }
    
    private ajq(final ajr b) {
        this.b = b;
    }
    
    public static ajq b(final Locale... array) {
        return e(ajp.a(array));
    }
    
    public static ajq c(final String s) {
        if (s != null && !s.isEmpty()) {
            final String[] split = s.split(",", -1);
            final int length = split.length;
            final Locale[] array = new Locale[length];
            for (int i = 0; i < length; ++i) {
                array[i] = ajo.a(split[i]);
            }
            return b(array);
        }
        return ajq.a;
    }
    
    public static ajq d() {
        return e(ajp.c());
    }
    
    public static ajq e(final LocaleList list) {
        return new ajq(new ajr(list));
    }
    
    public final int a() {
        return this.b.a.size();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajq && this.b.equals(((ajq)o).b);
    }
    
    public final String f() {
        return this.b.a.toLanguageTags();
    }
    
    public final Locale g(final int n) {
        return this.b.a.get(n);
    }
    
    public final boolean h() {
        return this.b.a.isEmpty();
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
