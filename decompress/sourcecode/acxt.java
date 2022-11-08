import androidx.preference.TwoStatePreference;
import java.util.Map;
import java.util.HashMap;
import androidx.preference.Preference;
import android.content.Context;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import androidx.preference.SwitchPreference;

// 
// Decompiled by Procyon v0.6.0
// 

public class acxt implements cel
{
    protected final SwitchPreference a;
    protected final anxs b;
    protected final acxu c;
    final znj d;
    public boolean e;
    public boolean f;
    protected final aeim g;
    
    public acxt(final SwitchPreference a, final acxu c, final aeim g, final anxs b, final byte[] array, final byte[] array2) {
        this.d = (znj)new waj(this, 5);
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
    }
    
    private final void c(final boolean b, final aiva aiva) {
        aioe aioe;
        if ((aioe = aiva.s) == null) {
            aioe = aioe.a;
        }
        final boolean e = ((agzd)aioe).rs((agyr)FeedbackEndpointOuterClass.feedbackEndpoint) ^ true;
        this.e = e;
        final acxu c = this.c;
        final Context c2 = c.c;
        final vax d = c.d;
        final wwv e2 = c.e;
        final acxs acxs = new acxs(this, b, 0);
        Object o;
        if (e) {
            o = b;
        }
        else {
            o = this.d;
        }
        abyv.g(c2, aiva, d, e2, (abyu)acxs, o, this.c.i);
    }
    
    public boolean a(final Preference preference, final Object o) {
        final SwitchPreference a = this.a;
        if (preference != a) {
            throw new IllegalArgumentException("SwitchPreferenceChangeListener must be attached to the same SwitchPreference as was used for construction.");
        }
        final boolean a2 = ((TwoStatePreference)a).a;
        final Boolean b = (Boolean)o;
        if (a2 == b) {
            return true;
        }
        this.c.h.o(acxu.b(this.b).ct);
        final boolean booleanValue = b;
        if (booleanValue) {
            final anxs b2 = this.b;
            if ((b2.b & 0x8000) != 0x0) {
                anxx anxx;
                if ((anxx = b2.m) == null) {
                    anxx = anxx.a;
                }
                aiva a3;
                if (anxx.b == 64099105) {
                    a3 = (aiva)anxx.c;
                }
                else {
                    a3 = aiva.a;
                }
                this.c(true, a3);
                return false;
            }
        }
        if (!booleanValue) {
            final anxs b3 = this.b;
            if ((b3.b & 0x10000) != 0x0) {
                anxx anxx2;
                if ((anxx2 = b3.n) == null) {
                    anxx2 = anxx.a;
                }
                aiva a4;
                if (anxx2.b == 64099105) {
                    a4 = (aiva)anxx2.c;
                }
                else {
                    a4 = aiva.a;
                }
                this.c(false, a4);
                return false;
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
        final ajsq ajsq = null;
        final ajsq ajsq2 = null;
        if (booleanValue) {
            final vax d = this.c.d;
            aioe aioe;
            if ((aioe = this.b.i) == null) {
                aioe = aioe.a;
            }
            d.c(aioe, (Map)hashMap);
            final anxs b4 = this.b;
            ajsq ajsq3 = ajsq2;
            if ((b4.b & 0x20) != 0x0 && (ajsq3 = b4.e) == null) {
                ajsq3 = ajsq.a;
            }
            preference.n((CharSequence)abyh.b(ajsq3));
        }
        else {
            final vax d2 = this.c.d;
            aioe aioe2;
            if ((aioe2 = this.b.j) == null) {
                aioe2 = aioe.a;
            }
            d2.c(aioe2, (Map)hashMap);
            final anxs b5 = this.b;
            final int n = b5.b & 0x2000;
            if (n != 0) {
                ajsq ajsq4 = ajsq;
                if (n != 0 && (ajsq4 = b5.k) == null) {
                    ajsq4 = ajsq.a;
                }
                preference.n((CharSequence)abyh.b(ajsq4));
            }
        }
        this.g.x(this.b, booleanValue);
        return true;
    }
    
    public final void b(final boolean b) {
        final SwitchPreference a = this.a;
        final anxs b2 = this.b;
        ajsq ajsq;
        if ((b2.b & 0x20) != 0x0) {
            if ((ajsq = b2.e) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        ((Preference)a).n((CharSequence)abyh.b(ajsq));
        this.g.x(this.b, b);
        ((TwoStatePreference)this.a).k(b);
    }
}
