// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.gaming.thirdpartylinking;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import java.util.concurrent.atomic.AtomicReference;
import android.net.Uri;
import android.util.AttributeSet;
import android.content.Context;
import android.app.Activity;
import androidx.preference.Preference;

public class ThirdPartyAccountPreference extends Preference
{
    public final ajzf a;
    public final veh b;
    private final vey c;
    private asln d;
    
    public ThirdPartyAccountPreference(final Activity activity, final veh b, final acig acig, final vey c, final ajzf a) {
        final ajws ajws = null;
        super((Context)activity, (AttributeSet)null);
        this.b = b;
        this.a = a;
        this.c = c;
        ajws ajws2 = ajws;
        if ((a.b & 0x1) != 0x0 && (ajws2 = a.c) == null) {
            ajws2 = ajws.a;
        }
        this.N((CharSequence)acbu.b(ajws2));
        this.k((uzu)new uzt(this, 1));
        super.o = (ceq)new jpq(this, 11);
        final int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131170144);
        aowb aowb;
        if ((aowb = a.f) == null) {
            aowb = aowb.a;
        }
        final Uri p5 = aamz.P(aowb, dimensionPixelSize);
        if (p5 != null) {
            this.H(agy.a((Context)activity, 2131233374));
            acig.k(p5, (tdg)new kcf(this, activity, 5));
        }
        if ((a.b & 0x200) != 0x0) {
            this.d = c.b().i(a.j, false).af(aslh.a()).aI((asmi)new uzc(this, 8), (asmi)uzs.a);
        }
    }
    
    protected final void C() {
        super.Q();
        final asln d = this.d;
        if (d != null) {
            asmr.b((AtomicReference)d);
            this.d = null;
        }
    }
    
    public final void k(final uzu uzu) {
        final ajzf a = this.a;
        final int b = a.b;
        String s;
        if ((b & 0x200) != 0x0) {
            s = a.j;
        }
        else {
            String s2;
            if ((b & 0x400) != 0x0) {
                s2 = a.k;
            }
            else {
                aisc aisc;
                if ((aisc = a.h) == null) {
                    aisc = aisc.a;
                }
                anxb anxb;
                if ((anxb = ((GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand)((ahcu)aisc).rx((ahci)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand)).c) == null) {
                    anxb = anxb.a;
                }
                s2 = ((ajyj)((ahcu)anxb).rx((ahci)GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer)).h;
            }
            s = vht.f(122, s2);
        }
        this.c.b().g(s).E(aslh.a()).s((asmi)new uzc(uzu, 7)).p((asmc)new sqx(this, uzu, 11)).ab();
    }
    
    public final void l(final boolean b) {
        final ajws ajws = null;
        ajws ajws2 = null;
        Spanned spanned;
        if (b) {
            final ajzf a = this.a;
            if ((a.b & 0x2) != 0x0 && (ajws2 = a.d) == null) {
                ajws2 = ajws.a;
            }
            spanned = acbu.b(ajws2);
        }
        else {
            final ajzf a2 = this.a;
            ajws ajws3 = ajws;
            if ((a2.b & 0x4) != 0x0 && (ajws3 = a2.e) == null) {
                ajws3 = ajws.a;
            }
            spanned = acbu.b(ajws3);
        }
        this.n((CharSequence)spanned);
    }
}
