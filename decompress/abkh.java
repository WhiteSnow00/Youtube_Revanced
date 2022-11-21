import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkh implements asmi
{
    public final Object a;
    private final int b;
    
    public abkh(final ablu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final abna a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final abnd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final abok a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final abpo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final aefs a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final AtomicBoolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkh(final xbt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final Object o2 = null;
        switch (b) {
            default: {
                final Object a = this.a;
                final aaps aaps = (aaps)o;
                final abpo abpo = (abpo)a;
                abpo.a.h(aaps.a());
                final WatchNextResponseModel a2 = aaps.a();
                if (a2 == null) {
                    break;
                }
                final anli g = a2.g;
                if (g != null) {
                    abpo.i(g.m);
                    return;
                }
                break;
            }
            case 19: {
                final Object a3 = this.a;
                final aams aams = (aams)o;
                final wzy wzy = new wzy(xbf.c(74726));
                final abok abok = (abok)a3;
                abok.a.l((xbe)wzy);
                abok.a.J(3, (xbe)wzy, (alji)null);
                return;
            }
            case 18: {
                ((abok)this.a).b = ((aaoz)o).b();
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final alcc alcc = (alcc)o;
                if (a4 != null) {
                    ((xbt)a4).c("sw_r");
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final alcc alcc2 = (alcc)o;
                ((thg)((abnd)a5).a).d((Object)new aaou());
                return;
            }
            case 15: {
                ((abna)this.a).d((PlayerResponseModel)o);
                return;
            }
            case 14: {
                final Object a6 = this.a;
                final PlayerResponseModel playerResponseModel = (PlayerResponseModel)o;
                final byte[] a7 = abmg.a;
                if (a6 != null) {
                    ((xbt)a6).c("ps_r");
                }
                return;
            }
            case 13: {
                final Object a8 = this.a;
                final aapx aapx = (aapx)o;
                if (aapx.a().a() == 0) {
                    final String aa = aapx.a().aa();
                    final ablu ablu = (ablu)a8;
                    if (aa.equals(ablu.a)) {
                        ablu.b = null;
                    }
                }
                return;
            }
            case 12: {
                final Object a9 = this.a;
                final aaoz aaoz = (aaoz)o;
                final akyz y = aaoz.a().y();
                Object p = o2;
                if (y != null) {
                    p = y.p;
                }
                final ablu ablu2 = (ablu)a9;
                ablu2.b = p;
                ablu2.a = aaoz.b();
                return;
            }
            case 11: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 10: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 9: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 8: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 7: {
                ((aefs)this.a).ap(o);
                return;
            }
            case 6: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 5: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 4: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 3: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 2: {
                ((aefs)this.a).ap(o);
                return;
            }
            case 1: {
                ((aefs)this.a).aq(o);
                return;
            }
            case 0: {
                ((aefs)this.a).ap(o);
                break;
            }
        }
    }
}
