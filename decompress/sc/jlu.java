import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import android.text.TextUtils;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlu extends acyo
{
    public final arwh a;
    private final SharedPreferences k;
    private final Context l;
    private long m;
    private String n;
    private final vai o;
    private final jgk p;
    
    public jlu(final SharedPreferences k, final Context l, final arwh a, final vai o, final byte[] array, final byte[] array2) {
        k.getClass();
        this.k = k;
        this.l = l;
        this.a = a;
        this.o = o;
        this.m = 0L;
        this.n = "";
        this.p = new jgk();
    }
    
    public final String a() {
        if (TextUtils.equals((CharSequence)super.d, (CharSequence)"youtube-android-pb-shorts")) {
            return super.d;
        }
        final int be = tpe.be(this.l);
        if (be != 3 && be != 4) {
            return super.d;
        }
        return "youtube-android-pb-tablet";
    }
    
    public final String b() {
        final AtomicLong atomicLong = new AtomicLong();
        asjv.b((AtomicReference)this.o.n(45381744L).aC(0L).aa((asjm)new jdq(atomicLong, 13)));
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
            asjv.b((AtomicReference)this.o.o(45369282L).aC("").aa((asjm)new jdq(atomicReference, 14)));
            return (String)atomicReference.get();
        }
        anxo anxo;
        if ((anxo = this.a.f().n) == null) {
            anxo = anxo.a;
        }
        return anxo.b;
    }
    
    public final boolean c() {
        return !super.e && this.k.getBoolean("dogfood_suggest_send_visitor_id_signed_out", false);
    }
    
    public final boolean d() {
        return this.c() || super.g;
    }
    
    public final jgk e() {
        if (this.c()) {
            return this.p;
        }
        return null;
    }
}
