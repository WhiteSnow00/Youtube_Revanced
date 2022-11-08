import android.text.TextUtils;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lds implements aczj
{
    public final vax a;
    public Map b;
    public String c;
    private final daw d;
    private String e;
    
    public lds(final vax a, final daw d) {
        this.a = a;
        this.d = d;
    }
    
    public final void a() {
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            this.d.e(this.e);
            this.e = null;
        }
    }
    
    @Override
    public final void b(final String s) {
        if (TextUtils.equals((CharSequence)this.c, (CharSequence)s)) {
            this.c = null;
        }
    }
    
    @Override
    public final void c(final String s, final String e) {
        if (TextUtils.equals((CharSequence)this.c, (CharSequence)s)) {
            this.a();
            this.e = e;
        }
    }
}
