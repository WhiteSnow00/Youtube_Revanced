import android.text.Spanned;
import com.google.android.apps.youtube.app.settings.UpdatePlaybackAreaPreference;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;
import android.app.Activity;
import com.google.android.apps.youtube.app.settings.QuietHoursNotificationPreference;
import com.google.android.apps.youtube.app.settings.DigestNotificationPreference;
import androidx.preference.Preference;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnc extends rip
{
    private final van j;
    private final e k;
    private final alm l;
    private final alm m;
    
    public jnc(final Context context, final vax vax, final wwv wwv, final blt blt, final aeim aeim, final alm m, final alm l, final van j, final ria ria, final rhz rhz, final e k, final zki zki, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(context, vax, wwv, blt, aeim, ria, rhz, zki, aeby, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.m = m;
        this.l = l;
        this.j = j;
        this.k = k;
    }
    
    public final Preference a(final anxu anxu, final String s) {
        anxs anxs;
        if ((anxs = anxu.e) == null) {
            anxs = anxs.a;
        }
        final int c = anxs.c;
        final int bz = aqql.bz(c);
        final ajsq ajsq = null;
        final ajsq ajsq2 = null;
        final ajsq ajsq3 = null;
        if (bz != 0) {
            if (bz == 271) {
                final alm m = this.m;
                final Context context = (Context)((atjj)m.b).a();
                final jqj jqj = (jqj)((atjj)m.c).a();
                final wwu wwu = (wwu)((atjj)m.a).a();
                anxs.getClass();
                final DigestNotificationPreference digestNotificationPreference = new DigestNotificationPreference(context, jqj, wwu, anxs);
                if ((anxs.b & 0x10) != 0x0) {
                    ajsq ajsq4;
                    if ((ajsq4 = anxs.d) == null) {
                        ajsq4 = ajsq.a;
                    }
                    ((Preference)digestNotificationPreference).N((CharSequence)abyh.b(ajsq4));
                }
                Spanned spanned;
                if (anxs.g && (anxs.b & 0x4000) != 0x0) {
                    ajsq ajsq5;
                    if ((ajsq5 = anxs.l) == null) {
                        ajsq5 = ajsq.a;
                    }
                    spanned = abyh.b(ajsq5);
                }
                else if (!anxs.f && (anxs.b & 0x2000) != 0x0) {
                    ajsq ajsq6;
                    if ((ajsq6 = anxs.k) == null) {
                        ajsq6 = ajsq.a;
                    }
                    spanned = abyh.b(ajsq6);
                }
                else {
                    ajsq ajsq7 = ajsq3;
                    if ((anxs.b & 0x20) != 0x0 && (ajsq7 = anxs.e) == null) {
                        ajsq7 = ajsq.a;
                    }
                    spanned = abyh.b(ajsq7);
                }
                ((Preference)digestNotificationPreference).n((CharSequence)spanned);
                ((Preference)digestNotificationPreference).aa();
                return (Preference)digestNotificationPreference;
            }
        }
        final int bz2 = aqql.bz(c);
        if (bz2 != 0) {
            if (bz2 == 274) {
                final alm l = this.l;
                final Context context2 = (Context)((atjj)l.b).a();
                final jqn jqn = (jqn)((atjj)l.c).a();
                final wwu wwu2 = (wwu)((atjj)l.a).a();
                anxs.getClass();
                final QuietHoursNotificationPreference quietHoursNotificationPreference = new QuietHoursNotificationPreference(context2, jqn, wwu2, anxs);
                if ((anxs.b & 0x10) != 0x0) {
                    ajsq ajsq8;
                    if ((ajsq8 = anxs.d) == null) {
                        ajsq8 = ajsq.a;
                    }
                    ((Preference)quietHoursNotificationPreference).N((CharSequence)abyh.b(ajsq8));
                }
                Spanned spanned2;
                if (anxs.g && (anxs.b & 0x4000) != 0x0) {
                    ajsq ajsq9;
                    if ((ajsq9 = anxs.l) == null) {
                        ajsq9 = ajsq.a;
                    }
                    spanned2 = abyh.b(ajsq9);
                }
                else if (!anxs.f && (anxs.b & 0x2000) != 0x0) {
                    ajsq ajsq10;
                    if ((ajsq10 = anxs.k) == null) {
                        ajsq10 = ajsq.a;
                    }
                    spanned2 = abyh.b(ajsq10);
                }
                else {
                    ajsq ajsq11 = ajsq;
                    if ((anxs.b & 0x20) != 0x0 && (ajsq11 = anxs.e) == null) {
                        ajsq11 = ajsq.a;
                    }
                    spanned2 = abyh.b(ajsq11);
                }
                ((Preference)quietHoursNotificationPreference).n((CharSequence)spanned2);
                ((Preference)quietHoursNotificationPreference).aa();
                return (Preference)quietHoursNotificationPreference;
            }
        }
        if ((anxu.b & 0x2000) != 0x0) {
            final van j = this.j;
            ajvb ajvb;
            if ((ajvb = anxu.q) == null) {
                ajvb = ajvb.a;
            }
            final Activity activity = (Activity)((atjj)j.b).a();
            final vax vax = (vax)((atjj)j.d).a();
            vax.getClass();
            final aceo aceo = (aceo)((atjj)j.c).a();
            aceo.getClass();
            final vbq vbq = (vbq)((atjj)j.a).a();
            vbq.getClass();
            ajvb.getClass();
            final ThirdPartyAccountPreference thirdPartyAccountPreference = new ThirdPartyAccountPreference(activity, vax, aceo, vbq, ajvb);
            thirdPartyAccountPreference.aa();
            return thirdPartyAccountPreference;
        }
        anxr anxr;
        if ((anxr = anxu.d) == null) {
            anxr = anxr.a;
        }
        final int bz3 = aqql.bz(anxr.c);
        if (bz3 != 0) {
            if (bz3 == 380) {
                anxr anxr2;
                if ((anxr2 = anxu.d) == null) {
                    anxr2 = anxr.a;
                }
                final e k = this.k;
                final Context context3 = (Context)((atjj)k.a).a();
                final wwu wwu3 = (wwu)((atjj)k.b).a();
                final aaal aaal = (aaal)((atjj)k.d).a();
                aaal.getClass();
                final asho asho = (asho)((atjj)k.c).a();
                asho.getClass();
                anxr2.getClass();
                final UpdatePlaybackAreaPreference updatePlaybackAreaPreference = new UpdatePlaybackAreaPreference(context3, wwu3, aaal, asho, anxr2, (byte[])null);
                ((Preference)updatePlaybackAreaPreference).I("playback_area_setting");
                ((Preference)updatePlaybackAreaPreference).B = 2131625667;
                ajsq ajsq12 = ajsq2;
                if ((anxr2.b & 0x2) != 0x0 && (ajsq12 = anxr2.d) == null) {
                    ajsq12 = ajsq.a;
                }
                ((Preference)updatePlaybackAreaPreference).N((CharSequence)abyh.b(ajsq12));
                if ((anxr2.b & 0x4) != 0x0) {
                    ajsq ajsq13;
                    if ((ajsq13 = anxr2.e) == null) {
                        ajsq13 = ajsq.a;
                    }
                    ((Preference)updatePlaybackAreaPreference).n((CharSequence)abyh.b(ajsq13));
                }
                final jpr jpr = new jpr(this, anxr2, 1);
                if ((updatePlaybackAreaPreference.a.b & 0x10) != 0x0) {
                    updatePlaybackAreaPreference.c = (cem)jpr;
                }
                else {
                    ((Preference)updatePlaybackAreaPreference).o = (cem)jpr;
                }
                ((Preference)updatePlaybackAreaPreference).aa();
                return (Preference)updatePlaybackAreaPreference;
            }
        }
        return super.a(anxu, s);
    }
}
