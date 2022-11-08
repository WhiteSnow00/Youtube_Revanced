import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwy extends tjr implements acvx
{
    public Map a;
    public boolean b;
    public wyo j;
    private final String k;
    
    public acwy(final String s, final tjq tjq, final String k) {
        super(1, s, tjq, (dbd)null);
        this.a = new HashMap();
        this.k = k;
    }
    
    public final wyo b() {
        return this.j;
    }
    
    public final alm c(final dba dba) {
        final byte[] b = dba.b;
        Object o = null;
        if (b == null) {
            return null;
        }
        final Map c = dba.c;
        this.a = c;
        if (this.b) {
            final Map c2 = dba.c;
            final int a = dba.a;
            return alm.n((Object)new acvt(b), cji.c(dba));
        }
        if (!c.containsKey("content-type")) {
            return null;
        }
        final String s = this.a.get("content-type");
        if (TextUtils.equals((CharSequence)s, (CharSequence)"application/x-protobuffer")) {
            final byte[] b2 = dba.b;
            final int a2 = dba.a;
            o = new acwh(b2, this.k, null);
        }
        else if (TextUtils.equals((CharSequence)s, (CharSequence)"application/json; charset=UTF-8")) {
            final byte[] b3 = dba.b;
            final Map a3 = this.a;
            final int a4 = dba.a;
            o = new acvv(b3, a3, this.k);
        }
        return alm.n(o, cji.c(dba));
    }
    
    public final Map f() {
        return this.a;
    }
    
    public final void u(final String s, final String s2) {
        this.a.put(s, s2);
    }
}
