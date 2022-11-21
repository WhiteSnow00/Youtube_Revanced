import java.util.Map;
import java.util.HashMap;
import androidx.preference.Preference;
import android.content.Context;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import androidx.preference.SwitchPreference;

// 
// Decompiled by Procyon v0.6.0
// 

public class adbj implements cep
{
    protected final SwitchPreference a;
    protected final aocc b;
    protected final adbk c;
    final zrb d;
    public boolean e;
    public boolean f;
    protected final aheu g;
    
    public adbj(final SwitchPreference a, final adbk c, final aheu g, final aocc b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = (zrb)new wdr(this, 7);
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
    }
    
    private final void c(final boolean b, final aizd aizd) {
        aisc aisc;
        if ((aisc = aizd.s) == null) {
            aisc = aisc.a;
        }
        final boolean e = ((ahcu)aisc).ry((ahci)FeedbackEndpointOuterClass.feedbackEndpoint) ^ true;
        this.e = e;
        final adbk c = this.c;
        final Context c2 = c.c;
        final veh d = c.d;
        final xab e2 = c.e;
        final adbi adbi = new adbi(this, b, 0);
        Object o;
        if (e) {
            o = b;
        }
        else {
            o = this.d;
        }
        acch.g(c2, aizd, d, e2, (accg)adbi, o, this.c.i);
    }
    
    @Override
    public boolean a(final Preference preference, final Object o) {
        final SwitchPreference a = this.a;
        if (preference != a) {
            throw new IllegalArgumentException("SwitchPreferenceChangeListener must be attached to the same SwitchPreference as was used for construction.");
        }
        final boolean a2 = a.a;
        final Boolean b = (Boolean)o;
        if (a2 == b) {
            return true;
        }
        this.c.g.o(adbk.b(this.b).cu);
        final boolean booleanValue = b;
        if (booleanValue) {
            final aocc b2 = this.b;
            if ((b2.b & 0x8000) != 0x0) {
                aoch aoch;
                if ((aoch = b2.m) == null) {
                    aoch = aoch.a;
                }
                aizd a3;
                if (aoch.b == 64099105) {
                    a3 = (aizd)aoch.c;
                }
                else {
                    a3 = aizd.a;
                }
                this.c(true, a3);
                return false;
            }
        }
        if (!booleanValue) {
            final aocc b3 = this.b;
            if ((b3.b & 0x10000) != 0x0) {
                aoch aoch2;
                if ((aoch2 = b3.n) == null) {
                    aoch2 = aoch.a;
                }
                aizd a4;
                if (aoch2.b == 64099105) {
                    a4 = (aizd)aoch2.c;
                }
                else {
                    a4 = aizd.a;
                }
                this.c(false, a4);
                return false;
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
        final ajws ajws = null;
        final ajws ajws2 = null;
        if (booleanValue) {
            final veh d = this.c.d;
            aisc aisc;
            if ((aisc = this.b.i) == null) {
                aisc = aisc.a;
            }
            d.c(aisc, (Map)hashMap);
            final aocc b4 = this.b;
            ajws ajws3 = ajws2;
            if ((b4.b & 0x20) != 0x0 && (ajws3 = b4.e) == null) {
                ajws3 = ajws.a;
            }
            preference.n((CharSequence)acbu.b(ajws3));
        }
        else {
            final veh d2 = this.c.d;
            aisc aisc2;
            if ((aisc2 = this.b.j) == null) {
                aisc2 = aisc.a;
            }
            d2.c(aisc2, (Map)hashMap);
            final aocc b5 = this.b;
            final int n = b5.b & 0x2000;
            if (n != 0) {
                ajws ajws4 = ajws;
                if (n != 0 && (ajws4 = b5.k) == null) {
                    ajws4 = ajws.a;
                }
                preference.n((CharSequence)acbu.b(ajws4));
            }
        }
        this.g.F(this.b, booleanValue);
        return true;
    }
    
    public final void b(final boolean b) {
        final SwitchPreference a = this.a;
        final aocc b2 = this.b;
        ajws ajws;
        if ((b2.b & 0x20) != 0x0) {
            if ((ajws = b2.e) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        ((Preference)a).n((CharSequence)acbu.b(ajws));
        this.g.F(this.b, b);
        this.a.k(b);
    }
}
