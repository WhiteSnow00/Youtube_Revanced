import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.ArrayList;
import android.app.Activity;
import android.accounts.Account;
import java.util.function.Function;
import j$.util.Optional;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingEntityController;
import com.google.android.apps.youtube.app.player.overlay.transientoverlay.DefaultTransientOverlayController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbe implements asjr
{
    public final Object a;
    private final int b;
    
    public jbe(final aabf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final acgb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final ashi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final DefaultTransientOverlayController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final DataSavingEntityController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final DataSavingPrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jbd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jbh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jby a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jcd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jcg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jdk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jmv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jqk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jtr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final jxu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbe(final mcb a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final int b = this.b;
        int r = 0;
        final boolean b2 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final Optional optional = (Optional)o;
                final Object b3 = ((mcb)a).b;
                b3.getClass();
                return optional.map((Function)new hra((afhd)b3, 19, null, null)).orElse((Object)asht.I());
            }
            case 19: {
                return ((jxu)this.a).a((Optional)o);
            }
            case 18: {
                return ((acga)this.a).a((byte[])o);
            }
            case 17: {
                final Object a2 = this.a;
                final afft afft = (afft)o;
                boolean b4 = b2;
                if (a2 != null) {
                    b4 = b2;
                    if (afft.contains((Object)((aabf)a2).a())) {
                        b4 = true;
                    }
                }
                return b4;
            }
            case 16: {
                final Object a3 = this.a;
                final vfn vfn = (vfn)o;
                final ashn b5 = ashn.B(vfn.e());
                final heo d = ((jtr)a3).d;
                igp igp;
                if (vfn instanceof apys) {
                    igp = fex.x((apys)vfn);
                }
                else {
                    igp = fex.w((amar)vfn);
                }
                return b5.U(tpe.cn(d.r(igp)), (asji)ivm.p);
            }
            case 15: {
                final Object a4 = this.a;
                asht asht;
                if (o) {
                    asht = ((exi)((atke)a4).a()).g();
                }
                else {
                    asht = asht.I();
                }
                return asht;
            }
            case 14: {
                return ((jqk)this.a).a((jqf)o);
            }
            case 13: {
                final Object a5 = this.a;
                final jqf jqf = (jqf)o;
                if (!jqf.g && !jqf.h && !jqf.j && !jqf.k && !jqf.l) {
                    final ProtoDataStoreSwitchPreference c = ((DataSavingPrefsFragment)a5).c;
                    if (((TwoStatePreference)c).a) {
                        ((TwoStatePreference)c).k(false);
                    }
                }
                return jqf;
            }
            case 12: {
                final Object a6 = this.a;
                final jqf jqf2 = (jqf)o;
                final DataSavingEntityController dataSavingEntityController = (DataSavingEntityController)a6;
                return jzg.C(dataSavingEntityController.d, dataSavingEntityController.e, jqf2);
            }
            case 11: {
                return jzg.z((aqql)o, ((DataSavingEntityController)this.a).b);
            }
            case 10: {
                final Object a7 = this.a;
                final aezq aezq = (aezq)o;
                final jmv jmv = (jmv)a7;
                return zmb.a((Activity)jmv.od(), (Account)aezq.b, (String)aezq.a).L(jmv.c).E(jmv.d).K(aezq.a);
            }
            case 9: {
                final Object a8 = this.a;
                final Account account = (Account)o;
                tvb.n((String)a8);
                return aezq.a(a8, (Object)account);
            }
            case 8: {
                final Object a9 = this.a;
                final ArrayList list = new ArrayList(((amlt)o).getSelectedVideoIds());
                if (list.contains(a9)) {
                    list.remove(a9);
                }
                else {
                    list.add(a9);
                }
                return list;
            }
            case 7: {
                final Object a10 = this.a;
                final jdl jdl = (jdl)o;
                final Optional a11 = jdl.a;
                final jdm b6 = jdl.b;
                ashi ashi;
                if (a11.isPresent() && b6.equals((Object)jdm.a)) {
                    final jdk jdk = (jdk)a11.get();
                    final long b7 = jdk.b;
                    final long a12 = jdk.a;
                    final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                    final DefaultTransientOverlayController defaultTransientOverlayController = (DefaultTransientOverlayController)a10;
                    ashi = ashi.ae(b7 + a12, milliseconds, defaultTransientOverlayController.b).x((asjm)new jce(jdk, 19)).P(defaultTransientOverlayController.c).u((asjg)new gcw(defaultTransientOverlayController, jdk, 8)).t((asjg)new jcc(jdk, 6)).v((asjm)new jce(jdk, 17));
                }
                else {
                    ashi = ashi.K(0L);
                }
                return ashi;
            }
            case 6: {
                final Object a13 = this.a;
                ashi ashi2;
                if (((jdm)o).equals((Object)jdm.c)) {
                    ashi2 = ashi.z();
                }
                else {
                    ashi2 = ((ashi)a13).B((asjs)iva.j).L((asjr)jdi.e);
                }
                return ashi2;
            }
            case 5: {
                return new fwv((jdk)this.a, (boolean)o);
            }
            case 4: {
                return new ggj((jcg)this.a, (boolean)o);
            }
            case 3: {
                final Object a14 = this.a;
                ashc ashc;
                if (o) {
                    final jcd jcd = (jcd)a14;
                    ashc = ashc.J(jcd.b, TimeUnit.MILLISECONDS, jcd.a);
                }
                else {
                    ashc = ashc.f();
                }
                return ashc;
            }
            case 2: {
                final Object a15 = this.a;
                Object o2;
                if (o) {
                    o2 = ((jby)a15).a;
                }
                else {
                    o2 = ashi.z();
                }
                return o2;
            }
            case 1: {
                final Object a16 = this.a;
                if (((fkr)o).c()) {
                    r = ((jbd)a16).r;
                }
                return r;
            }
            case 0: {
                return aei.u((float)o / ((jbh)this.a).e, 1.0f);
            }
        }
    }
}
