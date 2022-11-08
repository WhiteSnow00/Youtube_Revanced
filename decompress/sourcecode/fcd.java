import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.Iterator;
import java.util.Map;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.content.Context;
import java.util.List;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.a;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcd implements znj
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public fcd(final atdw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final ceg a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final UploadActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final eyv a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final eyv a, final int b, final char[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final eyv a, final int b, final short[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final fch a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final gtx a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final hts a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final hwk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final jem a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final rjh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final rkz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final urx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final vpp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fcd(final znj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final dbi dbi) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                if (a != null) {
                    ((vpp)a).f(true);
                    return;
                }
                break;
            }
            case 19: {
                ((znj)this.a).a(dbi);
            }
            case 18: {
                return;
            }
            case 17: {
                trn.f("PhoneVerificationResolver", "Getting phone verification form failed.", (Throwable)dbi);
                ((rly)((rkz)this.a).c.a()).i();
                return;
            }
            case 16: {
                ((rjh)this.a).b((Exception)dbi);
                return;
            }
            case 15: {
                com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a.c((com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a)this.a);
                zjp.c(zjo.a, zjn.d, "Edit playlist error.", (Throwable)dbi);
                return;
            }
            case 14: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a a2 = (com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a)this.a;
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a)this.a).c.z(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a.a(a2.b(a2.b.d)));
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a.e((com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a)this.a);
                return;
            }
            case 13: {
                final a a3 = (a)this.a;
                a3.c(a3.a());
                final a a4 = (a)this.a;
                aojz aojz;
                if ((aojz = a4.b.p) == null) {
                    aojz = aojz.a;
                }
                aokt a5;
                if (aojz.b == 136076983) {
                    a5 = (aokt)aojz.c;
                }
                else {
                    a5 = aokt.a;
                }
                a4.d(a5);
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.a.e((a)this.a);
                zjp.c(zjo.a, zjn.d, "Unsubscribe error.", (Throwable)dbi);
                return;
            }
            case 12: {
                final a a6 = (a)this.a;
                a6.c(a6.a());
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.a.e((a)this.a);
                zjp.c(zjo.a, zjn.d, "Subscribe error.", (Throwable)dbi);
                return;
            }
            case 11: {
                trn.d("Error creating playlist", (Throwable)dbi);
                ((jem)this.a).ag.e((Throwable)dbi);
                return;
            }
            case 10: {
                ((hwk)this.a).a.c.e((Throwable)dbi);
                return;
            }
            case 9: {
                ((hwl)((ceg)this.a).a).c.e((Throwable)dbi);
                return;
            }
            case 8: {
                trn.d("Cannot retrieve PhoneVerificationIntroRenderer.", (Throwable)dbi);
                ((hts)this.a).w(8);
                return;
            }
            case 7: {
                trn.d("Cannot load GetUploadVideoFormResponse from InnerTube.", (Throwable)dbi);
                return;
            }
            case 6: {
                if (((atdw)this.a).tx()) {
                    return;
                }
                ((atdw)this.a).a((Throwable)dbi);
                return;
            }
            case 5: {
                return;
            }
            case 4: {
                trn.d("Error flagging", (Throwable)dbi);
                ((tny)((gtx)this.a).b).e((Throwable)dbi);
                return;
            }
            case 3: {
                trn.d("Error creating playlist", (Throwable)dbi);
                ((tny)((gtx)this.a).b).e((Throwable)dbi);
                return;
            }
            case 2: {
                final Object c = ((eyv)this.a).c;
                ((tny)c).d(((tny)c).b((Throwable)dbi));
                return;
            }
            case 1: {
                final Object c2 = ((eyv)this.a).c;
                ((tny)c2).d(((tny)c2).b((Throwable)dbi));
                return;
            }
            case 0: {
                ((tny)((eyv)this.a).a).e((Throwable)dbi);
                break;
            }
        }
    }
}
