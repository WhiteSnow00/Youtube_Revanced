import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acza extends tlv implements acxz
{
    public Map a;
    public boolean b;
    public xao j;
    private final String k;
    
    public acza(final String s, final tlu tlu, final String k) {
        super(1, s, tlu, (dbe)null);
        this.a = new HashMap();
        this.k = k;
    }
    
    public final xao b() {
        return this.j;
    }
    
    public final aln c(final dbb dbb) {
        final byte[] b = dbb.b;
        Object o = null;
        if (b == null) {
            return null;
        }
        final Map c = dbb.c;
        this.a = c;
        if (this.b) {
            final Map c2 = dbb.c;
            final int a = dbb.a;
            return aln.n((Object)new acxv(b), cjj.c(dbb));
        }
        if (!c.containsKey("content-type")) {
            return null;
        }
        final String s = this.a.get("content-type");
        if (TextUtils.equals((CharSequence)s, (CharSequence)"application/x-protobuffer")) {
            final byte[] b2 = dbb.b;
            final int a2 = dbb.a;
            o = new acyj(b2, this.k, (byte[])null);
        }
        else if (TextUtils.equals((CharSequence)s, (CharSequence)"application/json; charset=UTF-8")) {
            final byte[] b3 = dbb.b;
            final Map a3 = this.a;
            final int a4 = dbb.a;
            o = new acxx(b3, a3, this.k);
        }
        return aln.n(o, cjj.c(dbb));
    }
    
    public final Map f() {
        return this.a;
    }
    
    public final /* bridge */ void rL(final Object o) {
        final acyk acyk = (acyk)o;
    }
    
    public final void u(final String s, final String s2) {
        this.a.put(s, s2);
    }
}
