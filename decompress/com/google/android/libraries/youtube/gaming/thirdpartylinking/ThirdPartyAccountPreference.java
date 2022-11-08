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
    public ajvb a;
    public final vax b;
    private final vbq c;
    private asic d;
    
    public ThirdPartyAccountPreference(final Activity activity, final vax b, final aceo aceo, final vbq c, final ajvb a) {
        final ajsq ajsq = null;
        super((Context)activity, (AttributeSet)null);
        this.b = b;
        this.a = a;
        this.c = c;
        ajsq ajsq2 = ajsq;
        if ((a.b & 0x1) != 0x0 && (ajsq2 = a.c) == null) {
            ajsq2 = ajsq.a;
        }
        this.N((CharSequence)abyh.b(ajsq2));
        this.k((uwr)new uwq(this, 1));
        super.o = (cem)new joe(this, 10);
        final int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131170104);
        aorm aorm;
        if ((aorm = a.f) == null) {
            aorm = aorm.a;
        }
        final Uri f = actc.F(aorm, dimensionPixelSize);
        if (f != null) {
            this.H(agw.a((Context)activity, 2131233373));
            aceo.k(f, (szx)new kau(this, activity, 5));
        }
        if ((a.b & 0x200) != 0x0) {
            this.d = c.b().h(a.j, false).aa(ashw.a()).aC((asix)new uvl(this, 20), (asix)uwh.b);
        }
    }
    
    protected final void C() {
        super.Q();
        final asic d = this.d;
        if (d != null) {
            asjg.b((AtomicReference)d);
            this.d = null;
        }
    }
    
    public final void k(final uwr uwr) {
        final ajvb a = this.a;
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
                aioe aioe;
                if ((aioe = a.h) == null) {
                    aioe = aioe.a;
                }
                anss anss;
                if ((anss = ((GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand)((agzd)aioe).rr((agyr)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand)).c) == null) {
                    anss = anss.a;
                }
                s2 = ((ajuf)((agzd)anss).rr((agyr)GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer)).h;
            }
            s = vek.f(122, s2);
        }
        this.c.b().f(s).E(ashw.a()).s((asix)new uvl(uwr, 19)).p((asir)new snt(this, uwr, 11)).ab();
    }
    
    public final void l(final boolean b) {
        final ajsq ajsq = null;
        ajsq ajsq2 = null;
        Spanned spanned;
        if (b) {
            final ajvb a = this.a;
            if ((a.b & 0x2) != 0x0 && (ajsq2 = a.d) == null) {
                ajsq2 = ajsq.a;
            }
            spanned = abyh.b(ajsq2);
        }
        else {
            final ajvb a2 = this.a;
            ajsq ajsq3 = ajsq;
            if ((a2.b & 0x4) != 0x0 && (ajsq3 = a2.e) == null) {
                ajsq3 = ajsq.a;
            }
            spanned = abyh.b(ajsq3);
        }
        this.n((CharSequence)spanned);
    }
}
