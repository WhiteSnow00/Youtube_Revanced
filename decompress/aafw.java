import java.util.Map;
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

public class aafw implements aafz
{
    static final amze c;
    public static final int h = 0;
    private final afgh a;
    private final CopyOnWriteArrayList b;
    protected final SharedPreferences d;
    public final afgh e;
    protected final arzb f;
    protected final abwe g;
    
    static {
        c = amze.c;
    }
    
    public aafw(final SharedPreferences d, final arzb f, final int n, final abwe g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = new CopyOnWriteArrayList();
        this.d = d;
        this.f = f;
        this.g = g;
        final ArrayList list = new ArrayList();
        for (final amze amze : aakx.g.keySet()) {
            if (aakx.a(amze, 0) <= n) {
                list.add(amze);
            }
        }
        final afgh o = afgh.o(list);
        this.a = o;
        final ArrayList list2 = new ArrayList();
        if (o.contains(amze.b)) {
            list2.add(amze.b);
        }
        if (o.contains(amze.c)) {
            list2.add(amze.c);
        }
        if (o.contains(amze.d)) {
            list2.add(amze.d);
        }
        this.e = afgh.o(list2);
    }
    
    public static void A(final Throwable t) {
        tut.d("[Offline] Failed to set hasTransfersForOffline.", t);
    }
    
    public static void B(final Throwable t) {
        tut.d("[Offline] Failed to set next auto offline time millis at.", t);
    }
    
    private static String a(final String s) {
        return tqf.aM("offline_auto_offline_interval_%s", s);
    }
    
    private static String g(final String s) {
        return tqf.aM("offline_resync_interval_%s", s);
    }
    
    @Override
    public final void C(final String s, final boolean b) {
        tfx.m(((tnz)this.g.a).b((afax)new fmw(s, b, 10)), (tfv)zvv.d);
    }
    
    @Override
    public final void D(final String s, final long n) {
        this.d.edit().putLong(tqf.aM("last_offline_video_playback_position_sync_timestamp_%s", s), n).apply();
    }
    
    @Override
    public final void E(final String s, final long n) {
        tfx.m(((tnz)this.g.b).b((afax)new fmx(s, n, 9)), (tfv)zvv.e);
    }
    
    @Override
    public final void F(final amze amze) {
        adme.K(amze != amze.a);
        final int a = aakx.a(amze, -1);
        if (a != -1) {
            this.d.edit().putString("offline_quality", Integer.toString(a)).apply();
        }
    }
    
    @Override
    public final void G(final String s, final long n) {
        this.d.edit().putLong(a(s), n).apply();
    }
    
    @Override
    public final void H(final String s, final long n) {
        this.d.edit().putLong(g(s), n).apply();
    }
    
    @Override
    public final void I(final boolean b) {
        this.d.edit().putBoolean("offline_use_sd_card", b).apply();
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((aafy)iterator.next()).l();
        }
    }
    
    @Override
    public final void J(final String s, final boolean b) {
        this.d.edit().putBoolean(tqf.aM("should_record_offline_playback_last_position_%s", s), b).apply();
    }
    
    @Override
    public final boolean K() {
        return this.e.size() > 1;
    }
    
    @Override
    public final boolean L(final String s) {
        final aqtw aqtw = (aqtw)((tnz)this.g.a).c();
        aqtu a = aqtu.a;
        final ahej d = aqtw.d;
        if (((Map)d).containsKey(s)) {
            a = (aqtu)((Map)d).get(s);
        }
        return a.d;
    }
    
    @Override
    public final boolean M(final String s) {
        return this.d.getBoolean(tqf.aM("should_record_offline_playback_last_position_%s", s), true);
    }
    
    @Override
    public final boolean N() {
        return this.g.G();
    }
    
    @Override
    public final boolean O(String am, final String s) {
        am = tqf.aM("offline_identity_nonce_mapping_%s", am);
        if (!this.d.edit().putString(am, s).commit()) {
            this.d.edit().remove(am).apply();
            return false;
        }
        return true;
    }
    
    protected final boolean P(final amzj amzj) {
        if (!this.K()) {
            return false;
        }
        final amze v = this.v(amze.a);
        return v == amze.a || !aack.d(amzj).containsKey(v);
    }
    
    @Override
    public final boolean Q() {
        return this.d.getBoolean("offline_playlist_warning", true);
    }
    
    @Override
    public final boolean R() {
        return this.d.getBoolean("offline_use_sd_card", true);
    }
    
    @Override
    public final void S(final aafy aafy) {
        this.b.remove(aafy);
    }
    
    @Override
    public final void T() {
        this.d.edit().putBoolean("offline_playlist_warning", false).apply();
    }
    
    @Override
    public final int U(final amze amze) {
        amwj amwj;
        if ((amwj = this.f.f().g) == null) {
            amwj = amwj.a;
        }
        if (amwj.m) {
            final amze a = amze.a;
            switch (amze.ordinal()) {
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
    
    @Override
    public final void V() {
    }
    
    @Override
    public final void W() {
    }
    
    @Override
    public afbk b() {
        return aafv.a;
    }
    
    @Override
    public afbk c() {
        return aafv.c;
    }
    
    @Override
    public afgh d() {
        return this.e;
    }
    
    @Override
    public Comparator e() {
        return aakx.e;
    }
    
    @Override
    public Comparator f() {
        return aakx.c;
    }
    
    @Override
    public boolean l() {
        return this.d.getBoolean("offline_policy", false);
    }
    
    @Override
    public boolean m(final amzj amzj, final amvg amvg) {
        return this.P(amzj);
    }
    
    @Override
    public boolean n() {
        return false;
    }
    
    @Override
    public final long o(final String s) {
        return this.d.getLong(tqf.aM("last_offline_video_playback_position_sync_timestamp_%s", s), 0L);
    }
    
    @Override
    public final long p(final String s) {
        final aqtw aqtw = (aqtw)((tnz)this.g.b).c();
        aqtu a = aqtu.a;
        final ahej d = aqtw.d;
        if (((Map)d).containsKey(s)) {
            a = (aqtu)((Map)d).get(s);
        }
        return a.c;
    }
    
    @Override
    public final long q(final String s) {
        return this.d.getLong(a(s), 0L);
    }
    
    @Override
    public final long r(final String s) {
        return this.d.getLong(g(s), 0L);
    }
    
    @Override
    public final afgh s() {
        return this.a;
    }
    
    @Override
    public final ListenableFuture t(final aqtt aqtt) {
        return ((tnz)this.g.a).b((afax)new zue(aqtt, 14));
    }
    
    @Override
    public final amze u() {
        return this.v(aafw.c);
    }
    
    public final amze v(final amze amze) {
        final String string = this.d.getString("offline_quality", (String)null);
        if (string == null) {
            return amze;
        }
        try {
            final int int1 = Integer.parseInt(string);
            final aflv d = this.a.D();
            while (((Iterator)d).hasNext()) {
                final amze amze2 = (amze)((Iterator)d).next();
                if (aakx.a(amze2, -1) == int1) {
                    return amze2;
                }
            }
            return amze;
        }
        catch (final NumberFormatException ex) {
            return amze;
        }
    }
    
    @Override
    public final aqtt w() {
        aqtt aqtt2;
        if (this.g.G()) {
            aqtt aqtt;
            if ((aqtt = aqtt.b(((aqtw)((tnz)this.g.a).c()).c)) == null) {
                aqtt = aqtt.a;
            }
            if ((aqtt2 = aqtt) == aqtt.a) {
                return aqtt.c;
            }
        }
        else if (this.l()) {
            aqtt2 = aqtt.c;
        }
        else {
            aqtt2 = aqtt.d;
        }
        return aqtt2;
    }
    
    @Override
    public final String x(final String s) {
        return this.d.getString(tqf.aM("offline_identity_nonce_mapping_%s", s), s);
    }
    
    @Override
    public final String y(final top top) {
        return this.d.getString("video_storage_location_on_sdcard", top.e(top.c()));
    }
    
    @Override
    public final void z(final aafy aafy) {
        this.b.add(aafy);
    }
}
