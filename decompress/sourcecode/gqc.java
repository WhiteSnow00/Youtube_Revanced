import android.text.Spanned;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import java.util.List;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqc implements vau
{
    private final Context a;
    private final vax b;
    private final wwv c;
    private final acng d;
    private final aceo e;
    private final aeby f;
    private final aeby g;
    
    public gqc(final Context a, final aceo e, final vax b, final wwv c, final acng d, final aeby g, final aeby f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        aioe.getClass();
        final gqe gqe = new gqe(this.b, this.c, this.d, this.e, this.g, this.f, null, null, null, null);
        final GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand = (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand)((agzd)aioe).rr((agyr)GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.gamingAccountLinkConfirmDialogCommand);
        ajue ajue;
        if (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand != null && (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.b & 0x1) != 0x0) {
            anss anss;
            if ((anss = gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.c) == null) {
                anss = anss.a;
            }
            ajue = (ajue)((agzd)anss).rr((agyr)GamingAccountLinkConfirmDialogRendererOuterClass.gamingAccountLinkConfirmDialogRenderer);
        }
        else {
            ajue = null;
        }
        if (ajue != null) {
            this.c.b(wya.b(57204), aioe, (alff)null);
            final Context a = this.a;
            aibc aibc;
            if ((aibc = ajue.j) == null) {
                aibc = aibc.a;
            }
            aibb e;
            if ((e = aibc.c) == null) {
                e = aibb.a;
            }
            gqe.e = e;
            aibc aibc2;
            if ((aibc2 = ajue.i) == null) {
                aibc2 = aibc.a;
            }
            aibb d;
            if ((d = aibc2.c) == null) {
                d = aibb.a;
            }
            gqe.d = d;
            gqe.f = map;
            ajsq ajsq;
            if ((ajsq = ajue.c) == null) {
                ajsq = ajsq.a;
            }
            final Spanned b = abyh.b(ajsq);
            final agzy h = ajue.h;
            aorm aorm2;
            if ((ajue.b & 0x2) != 0x0) {
                aorm aorm;
                if ((aorm = ajue.d) == null) {
                    aorm = aorm.a;
                }
                aorm2 = aorm;
            }
            else {
                aorm2 = null;
            }
            aorm aorm4;
            if ((ajue.b & 0x8) != 0x0) {
                aorm aorm3;
                if ((aorm3 = ajue.f) == null) {
                    aorm3 = aorm.a;
                }
                aorm4 = aorm3;
            }
            else {
                aorm4 = null;
            }
            aorm aorm6;
            if ((ajue.b & 0x4) != 0x0) {
                aorm aorm5;
                if ((aorm5 = ajue.e) == null) {
                    aorm5 = aorm.a;
                }
                aorm6 = aorm5;
            }
            else {
                aorm6 = null;
            }
            akbf akbf;
            if ((ajue.b & 0x10) != 0x0) {
                if ((akbf = ajue.g) == null) {
                    akbf = akbf.a;
                }
            }
            else {
                akbf = null;
            }
            gqe.h(a, 2131624677, b, h, aorm2, aorm4, aorm6, akbf, false);
            return;
        }
        final GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand = (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand)((agzd)aioe).rr((agyr)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand);
        ajuf ajuf;
        if (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand != null && (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.b & 0x1) != 0x0) {
            anss anss2;
            if ((anss2 = gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.c) == null) {
                anss2 = anss.a;
            }
            ajuf = (ajuf)((agzd)anss2).rr((agyr)GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer);
        }
        else {
            ajuf = null;
        }
        if (ajuf != null) {
            final Context a2 = this.a;
            aibc aibc3;
            if ((aibc3 = ajuf.k) == null) {
                aibc3 = aibc.a;
            }
            aibb e2;
            if ((e2 = aibc3.c) == null) {
                e2 = aibb.a;
            }
            gqe.e = e2;
            aibc aibc4;
            if ((aibc4 = ajuf.e) == null) {
                aibc4 = aibc.a;
            }
            aibb d2;
            if ((d2 = aibc4.c) == null) {
                d2 = aibb.a;
            }
            gqe.d = d2;
            gqe.f = map;
            ajsq ajsq2;
            if ((ajsq2 = ajuf.f) == null) {
                ajsq2 = ajsq.a;
            }
            final Spanned b2 = abyh.b(ajsq2);
            final agzy g = ajuf.g;
            aorm aorm8;
            if ((ajuf.b & 0x4000) != 0x0) {
                aorm aorm7;
                if ((aorm7 = ajuf.i) == null) {
                    aorm7 = aorm.a;
                }
                aorm8 = aorm7;
            }
            else {
                aorm8 = null;
            }
            aorm aorm10;
            if ((ajuf.b & 0x8) != 0x0) {
                aorm aorm9;
                if ((aorm9 = ajuf.d) == null) {
                    aorm9 = aorm.a;
                }
                aorm10 = aorm9;
            }
            else {
                aorm10 = null;
            }
            aorm aorm12;
            if ((ajuf.b & 0x4) != 0x0) {
                aorm aorm11;
                if ((aorm11 = ajuf.c) == null) {
                    aorm11 = aorm.a;
                }
                aorm12 = aorm11;
            }
            else {
                aorm12 = null;
            }
            akbf akbf2;
            if ((ajuf.b & 0x8000) != 0x0) {
                if ((akbf2 = ajuf.j) == null) {
                    akbf2 = akbf.a;
                }
            }
            else {
                akbf2 = null;
            }
            gqe.h(a2, 2131624678, b2, g, aorm8, aorm10, aorm12, akbf2, true);
            this.c.b(wya.b(57203), aioe, (alff)null);
        }
    }
}
