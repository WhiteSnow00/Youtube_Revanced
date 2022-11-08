import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import android.content.SharedPreferences;
import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class aacd implements aacf
{
    static final amuv c;
    private final afcr a;
    private final CopyOnWriteArrayList b;
    protected final SharedPreferences d;
    public final afcr e;
    protected final arud f;
    protected final aamd g;
    
    static {
        c = amuv.c;
    }
    
    public aacd(final SharedPreferences d, final arud f, final int n, final aamd g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new CopyOnWriteArrayList();
        this.d = d;
        this.f = f;
        this.g = g;
        final ArrayList list = new ArrayList();
        for (final amuv amuv : aahf.g.keySet()) {
            if (aahf.a(amuv, 0) <= n) {
                list.add(amuv);
            }
        }
        final afcr o = afcr.o((Collection)list);
        this.a = o;
        final ArrayList list2 = new ArrayList();
        if (((List)o).contains(amuv.b)) {
            list2.add(amuv.b);
        }
        if (((List)o).contains(amuv.c)) {
            list2.add(amuv.c);
        }
        if (((List)o).contains(amuv.d)) {
            list2.add(amuv.d);
        }
        this.e = afcr.o((Collection)list2);
    }
    
    private static String a(final String s) {
        return tmy.aM("offline_auto_offline_interval_%s", s);
    }
    
    private static String g(final String s) {
        return tmy.aM("offline_resync_interval_%s", s);
    }
    
    public final void C(final String s, final boolean b) {
        tcp.m(((tku)this.g.b).b((aexg)new fmn(s, b, 10)), (tcn)zqg.f);
    }
    
    public final void D(final String s, final long n) {
        this.d.edit().putLong(tmy.aM("last_offline_video_playback_position_sync_timestamp_%s", s), n).apply();
    }
    
    public final void E(final String s, final long n) {
        tcp.m(((tku)this.g.a).b((aexg)new fmo(s, n, 9)), (tcn)zqg.g);
    }
    
    public final void F(final amuv amuv) {
        agot.u(amuv != amuv.a);
        final int a = aahf.a(amuv, -1);
        if (a != -1) {
            this.d.edit().putString("offline_quality", Integer.toString(a)).apply();
        }
    }
    
    public final void G(final String s, final long n) {
        this.d.edit().putLong(a(s), n).apply();
    }
    
    public final void H(final String s, final long n) {
        this.d.edit().putLong(g(s), n).apply();
    }
    
    public final void I(final boolean b) {
        this.d.edit().putBoolean("offline_use_sd_card", b).apply();
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((aace)iterator.next()).l();
        }
    }
    
    public final void J(final String s, final boolean b) {
        this.d.edit().putBoolean(tmy.aM("should_record_offline_playback_last_position_%s", s), b).apply();
    }
    
    public final boolean K() {
        return this.e.size() > 1;
    }
    
    public final boolean L(final String s) {
        final aqor aqor = (aqor)((tku)this.g.b).c();
        aqop a = aqop.a;
        final ahas d = aqor.d;
        if (d.containsKey(s)) {
            a = (aqop)d.get(s);
        }
        return a.d;
    }
    
    public final boolean M(final String s) {
        return this.d.getBoolean(tmy.aM("should_record_offline_playback_last_position_%s", s), true);
    }
    
    public final boolean N() {
        return this.g.B();
    }
    
    public final boolean O(String am, final String s) {
        am = tmy.aM("offline_identity_nonce_mapping_%s", am);
        if (!this.d.edit().putString(am, s).commit()) {
            this.d.edit().remove(am).apply();
            return false;
        }
        return true;
    }
    
    protected final boolean P(final amva amva) {
        if (!this.K()) {
            return false;
        }
        final amuv v = this.v(amuv.a);
        return v == amuv.a || !zyt.d(amva).containsKey(v);
    }
    
    public final boolean Q() {
        return this.d.getBoolean("offline_playlist_warning", true);
    }
    
    public final boolean R() {
        return this.d.getBoolean("offline_use_sd_card", true);
    }
    
    public final void S(final aace aace) {
        this.b.remove(aace);
    }
    
    public final void T() {
        this.d.edit().putBoolean("offline_playlist_warning", false).apply();
    }
    
    public final int U(final amuv amuv) {
        amrz amrz;
        if ((amrz = this.f.f().g) == null) {
            amrz = amrz.a;
        }
        if (amrz.m) {
            final amuv a = amuv.a;
            switch (amuv.ordinal()) {
                case 3:
                case 7:
                case 8:
                case 9: {
                    return 4;
                }
                case 2:
                case 6: {
                    return 3;
                }
                case 1:
                case 5: {
                    return 2;
                }
            }
        }
        return 1;
    }
    
    public final void V() {
    }
    
    public final void W() {
    }
    
    public aext b() {
        return aacc.a;
    }
    
    public aext c() {
        return aacc.c;
    }
    
    public afcr d() {
        return this.e;
    }
    
    public Comparator e() {
        return aahf.e;
    }
    
    public Comparator f() {
        return aahf.c;
    }
    
    public boolean l() {
        return this.d.getBoolean("offline_policy", false);
    }
    
    public boolean m(final amva amva, final amqx amqx) {
        return this.P(amva);
    }
    
    public boolean n() {
        return false;
    }
    
    public final long o(final String s) {
        return this.d.getLong(tmy.aM("last_offline_video_playback_position_sync_timestamp_%s", s), 0L);
    }
    
    public final long p(final String s) {
        final aqor aqor = (aqor)((tku)this.g.a).c();
        aqop a = aqop.a;
        final ahas d = aqor.d;
        if (d.containsKey(s)) {
            a = (aqop)d.get(s);
        }
        return a.c;
    }
    
    public final long q(final String s) {
        return this.d.getLong(a(s), 0L);
    }
    
    public final long r(final String s) {
        return this.d.getLong(g(s), 0L);
    }
    
    public final afcr s() {
        return this.a;
    }
    
    public final ListenableFuture t(final aqoo aqoo) {
        return ((tku)this.g.b).b((aexg)new zqp(aqoo, 12));
    }
    
    public final amuv u() {
        return this.v(aacd.c);
    }
    
    public final amuv v(final amuv amuv) {
        final String string = this.d.getString("offline_quality", (String)null);
        if (string == null) {
            return amuv;
        }
        try {
            final int int1 = Integer.parseInt(string);
            final afif d = this.a.D();
            while (((Iterator)d).hasNext()) {
                final amuv amuv2 = (amuv)((Iterator)d).next();
                if (aahf.a(amuv2, -1) == int1) {
                    return amuv2;
                }
            }
            return amuv;
        }
        catch (final NumberFormatException ex) {
            return amuv;
        }
    }
    
    public final aqoo w() {
        aqoo aqoo2;
        if (this.g.B()) {
            aqoo aqoo;
            if ((aqoo = aqoo.b(((aqor)((tku)this.g.b).c()).c)) == null) {
                aqoo = aqoo.a;
            }
            if ((aqoo2 = aqoo) == aqoo.a) {
                return aqoo.c;
            }
        }
        else if (this.l()) {
            aqoo2 = aqoo.c;
        }
        else {
            aqoo2 = aqoo.d;
        }
        return aqoo2;
    }
    
    public final String x(final String s) {
        return this.d.getString(tmy.aM("offline_identity_nonce_mapping_%s", s), s);
    }
    
    public final String y(final tlk tlk) {
        return this.d.getString("video_storage_location_on_sdcard", tlk.e(tlk.c()));
    }
    
    public final void z(final aace aace) {
        this.b.add(aace);
    }
}
