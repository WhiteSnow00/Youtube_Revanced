import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import android.text.TextUtils;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkt extends acwm
{
    public final arud a;
    private final SharedPreferences k;
    private final Context l;
    private long m;
    private String n;
    private final uyi o;
    private final jfi p;
    
    public jkt(final SharedPreferences k, final Context l, final arud a, final uyi o, final byte[] array, final byte[] array2) {
        k.getClass();
        this.k = k;
        this.l = l;
        this.a = a;
        this.o = o;
        this.m = 0L;
        this.n = "";
        this.p = new jfi();
    }
    
    public final String a() {
        if (TextUtils.equals((CharSequence)super.d, (CharSequence)"youtube-android-pb-shorts")) {
            return super.d;
        }
        final int be = tmy.be(this.l);
        if (be != 3 && be != 4) {
            return super.d;
        }
        return "youtube-android-pb-tablet";
    }
    
    public final String b() {
        final AtomicLong atomicLong = new AtomicLong();
        asjg.b((AtomicReference)this.o.n(45381744L).aw((Object)0L).Z((asix)new jcp(atomicLong, 11)));
        final long value = atomicLong.get();
        long m = this.m;
        if (m != value && value >= 0L) {
            String string;
            if (value <= 12L) {
                string = "";
            }
            else {
                final StringBuilder sb = new StringBuilder("ytabloattest");
                for (long n = 0L; n < -12L + value; ++n) {
                    sb.append('s');
                }
                string = sb.toString();
            }
            this.n = string;
            this.m = value;
            m = value;
        }
        if (m > 0L) {
            return this.n;
        }
        if (TextUtils.equals((CharSequence)super.d, (CharSequence)"youtube-android-pb-shorts")) {
            final AtomicReference atomicReference = new AtomicReference();
            asjg.b((AtomicReference)this.o.o(45369282L).aw((Object)"").Z((asix)new jcp(atomicReference, 12)));
            return (String)atomicReference.get();
        }
        anvk anvk;
        if ((anvk = this.a.f().n) == null) {
            anvk = anvk.a;
        }
        return anvk.b;
    }
    
    public final boolean c() {
        return !super.e && this.k.getBoolean("dogfood_suggest_send_visitor_id_signed_out", false);
    }
    
    public final boolean d() {
        return this.c() || super.g;
    }
    
    public final jfi e() {
        if (this.c()) {
            return this.p;
        }
        return null;
    }
}
