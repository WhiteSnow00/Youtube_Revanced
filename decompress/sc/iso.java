import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemControllerImpl;
import com.google.android.apps.youtube.app.player.controls.NextPaddleMenuItemControllerImpl;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iso implements isr
{
    final Object a;
    private final int b;
    
    public iso(final MusicDeeplinkMenuItemController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final NextPaddleMenuItemControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final SingleLoopMenuItemControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final gpy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final isq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final isu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final isw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final isx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final itd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final itg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final itj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final itj a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final itk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iso(final uyy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        switch (this.b) {
            default: {
                ((itk)this.a).a.J(3, (wzz)new wyt(xaa.c(47948)), (alhi)null);
                final aavj b = ((itk)this.a).b;
                if (b != null) {
                    b.c();
                    return;
                }
                break;
            }
            case 12: {
                ((itj)this.a).d();
                return;
            }
            case 11: {
                final itj itj = (itj)this.a;
                itj.b.c(itj.a);
                return;
            }
            case 10: {
                ((itg)this.a).d();
                return;
            }
            case 9: {
                final SingleLoopMenuItemControllerImpl singleLoopMenuItemControllerImpl = (SingleLoopMenuItemControllerImpl)this.a;
                singleLoopMenuItemControllerImpl.b.J(3, (wzz)new wyt(xaa.c(123601)), (alhi)null);
                final abpl m = singleLoopMenuItemControllerImpl.a.m();
                int n;
                if (!singleLoopMenuItemControllerImpl.e) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                m.j(n);
                return;
            }
            case 8: {
                ((itd)this.a).f();
                return;
            }
            case 7: {
                final NextPaddleMenuItemControllerImpl nextPaddleMenuItemControllerImpl = (NextPaddleMenuItemControllerImpl)this.a;
                if (nextPaddleMenuItemControllerImpl.e != null) {
                    nextPaddleMenuItemControllerImpl.c.J(3, (wzz)new wyt(xaa.c(138460)), (alhi)null);
                    final amgp e = ((NextPaddleMenuItemControllerImpl)this.a).e;
                    e.getClass();
                    final aiqj d = vyg.d(e);
                    if (d != null) {
                        ((NextPaddleMenuItemControllerImpl)this.a).j();
                        ((NextPaddleMenuItemControllerImpl)this.a).b.a(d);
                    }
                }
                return;
            }
            case 6: {
                ((isx)this.a).d();
                return;
            }
            case 5: {
                final amgp b2 = ((MusicDeeplinkMenuItemController)this.a).b;
                if (b2 != null) {
                    final aiqj d2 = vyg.d(b2);
                    if (d2 != null) {
                        ((MusicDeeplinkMenuItemController)this.a).a.a(d2);
                    }
                }
                return;
            }
            case 4: {
                final Object a = this.a;
                final ahaz builder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                builder.copyOnWrite();
                final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)builder.instance;
                showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = "listen-first";
                final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)builder.build();
                final vcy a2 = ((isw)a).a;
                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                ahbb.e((ahaq)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, (Object)showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                a2.a((aiqj)((ahaz)ahbb).build());
                return;
            }
            case 3: {
                ((uyy)this.a).f();
                return;
            }
            case 2: {
                final isu isu = (isu)this.a;
                isu.b.r(isu.a, "yt_android_watch");
                return;
            }
            case 1: {
                final gpy gpy = (gpy)this.a;
                final ahja ahja = (ahja)((Optional)gpy.b.b).get();
                final acba al = gpy.c.al((Context)gpy.a);
                ajut ajut;
                if ((ajut = ahja.d) == null) {
                    ajut = ajut.a;
                }
                final AlertDialog$Builder setTitle = ((AlertDialog$Builder)al).setTitle((CharSequence)acak.b(ajut));
                ajut ajut2;
                if ((ajut2 = ahja.c) == null) {
                    ajut2 = ajut.a;
                }
                final AlertDialog$Builder setMessage = setTitle.setMessage((CharSequence)acak.b(ajut2));
                ajut ajut3;
                if ((ajut3 = ahja.e) == null) {
                    ajut3 = ajut.a;
                }
                final AlertDialog create = setMessage.setPositiveButton((CharSequence)acak.b(ajut3), (DialogInterface$OnClickListener)null).setCancelable(true).create();
                create.setCanceledOnTouchOutside(true);
                create.show();
                return;
            }
            case 0: {
                final isq isq = (isq)this.a;
                isq.b.c(isq.a);
                break;
            }
        }
    }
}
