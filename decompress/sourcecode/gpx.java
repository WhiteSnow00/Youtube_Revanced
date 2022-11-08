import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.LiveChatBannerRendererOuterClass;
import com.google.protos.youtube.api.innertube.AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand;
import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpx implements vau
{
    public final rgh a;
    public final vxi b;
    public final vbq c;
    public final adfy d;
    public final asho e;
    public final vax f;
    public asic g;
    public final cya h;
    private final bu i;
    private final vcf j;
    private final PlayBilling k;
    private final arhr l;
    
    public gpx(final bu i, final vxi b, final cya h, final rgh a, final vcf j, final vbq c, final PlayBilling k, final adfy d, final asho e, final vax f, final arhr l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.g = (asic)asjh.a;
        this.i = i;
        this.b = b;
        this.h = h;
        this.a = a;
        this.j = j;
        this.c = c;
        this.k = k;
        this.d = d;
        this.e = e;
        this.f = f;
        this.l = l;
    }
    
    public final void b(final String s, final alnl alnl, final String b, final String s2, final String s3, final String s4, final boolean b2, final boolean b3) {
        final ArrayList c = new ArrayList((Collection<? extends E>)afcr.r((Object)s2));
        final dai dai = new dai();
        dai.a = "inapp";
        dai.c = c;
        dai.b = b;
        final bu i = this.i;
        final PlayBilling k = this.k;
        tcp.n((aum)i, afrp.f((ListenableFuture)aftj.m(k.g()), (afry)new idv(k, dai, 1), k.b), (trb)new gnx(this, 2), (trb)new gpt(this, dai, s, b2, alnl, b, s2, s3, s4, b3));
    }
    
    public final void mE(aioe aioe, final Map map) {
        final AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand = (AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand)((agzd)aioe).rr((agyr)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.addIapBannerToLiveChatCommand);
        if (addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.c.size() != 0) {
            final ahms ahms = addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.c.get(0);
            ahmr a;
            if (ahms.b == 2) {
                a = (ahmr)ahms.c;
            }
            else {
                a = ahmr.a;
            }
            anss anss;
            if ((anss = addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.d) == null) {
                anss = anss.a;
            }
            final alnl alnl = (alnl)((agzd)anss).rr((agyr)LiveChatBannerRendererOuterClass.liveChatBannerRenderer);
            final String b = a.b;
            final String c = a.c;
            final String f = addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.f;
            final String g = addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.g;
            final String d = ahms.d;
            final vce a2 = this.j.a(this.a.c());
            ((vdo)a2).f(d).E(this.e).s((asix)new gpu(this, d, alnl, b, c, f, g, addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand)).p((asir)new gpv(this, d, alnl, b, c, f, g, addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand)).ab();
            if ((addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.b & 0x2) != 0x0) {
                this.b.a((vya)new gpw(this, addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand));
            }
            if ((addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.b & 0x20) != 0x0) {
                if ((aioe = addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.i) == null) {
                    aioe = aioe.a;
                }
                agyo agyo;
                if ((agyo = addIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.j) == null) {
                    agyo = agyo.a;
                }
                this.g = ((jdt)this.l.a()).H().am((asix)new fdo(this, this.e.c((Runnable)new tu(this, (vdo)a2, d, aioe, 17), agyo.b, TimeUnit.SECONDS), 5), (asix)gpa.f);
            }
            return;
        }
        trn.l("No products found in AddIapBannerToLiveChatCommand");
        this.d.b("ADD_IAP_BANNER_NO_PRODUCTS");
    }
}
