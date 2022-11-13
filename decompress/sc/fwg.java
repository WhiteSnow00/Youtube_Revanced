import java.util.List;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class fwg implements zpf
{
    final fwi a;
    private final aiqj b;
    private final Map c;
    private final zri d;
    private final fex e;
    
    public fwg(final fwi a, final aiqj b, final fex e, final Map c, final zri d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbj dbj) {
        ttr.d("Error rating", (Throwable)dbj);
        this.a.b.e((Throwable)dbj);
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint)((ahbc)this.b).rx((ahaq)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g.size() > 0) {
            ((vcy)this.a.a.a()).e((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g, (Object)this.d);
        }
        this.e.e();
    }
    
    public final void mX(final Object o) {
        final akvc akvc = (akvc)o;
        final Map c = this.c;
        aomw a = null;
        if (c != null && (akvc.b & 0x80) != 0x0) {
            final wyw wyw = (wyw)tpe.O(c, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wyw.class);
            if (wyw != null) {
                wyw.D((wzz)new wyt(akvc.i.I()));
                wyw.t((wzz)new wyt(akvc.i.I()), (alhi)null);
            }
        }
        ((vcy)this.a.a.a()).d((List)akvc.d, this.c);
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint)((ahbc)this.b).rx((ahaq)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((vcy)this.a.a.a()).d((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.e, this.c);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.f.size() > 0) {
            ((vcy)this.a.a.a()).e((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.f, (Object)this.d);
        }
        aida aida;
        if ((aida = akvc.e) == null) {
            aida = aida.a;
        }
        aidi g;
        if ((aida.b & 0x2) != 0x0) {
            aida aida2;
            if ((aida2 = akvc.e) == null) {
                aida2 = aida.a;
            }
            if ((g = aida2.d) == null) {
                g = aidi.a;
            }
        }
        else {
            g = null;
        }
        akuw akuw;
        if ((akuw = akvc.f) == null) {
            akuw = akuw.a;
        }
        aona a2;
        if (akuw.b == 119226798) {
            akuw akuw2;
            if ((akuw2 = akvc.f) == null) {
                akuw2 = akuw.a;
            }
            if (akuw2.b == 119226798) {
                a2 = (aona)akuw2.c;
            }
            else {
                a2 = aona.a;
            }
        }
        else {
            a2 = null;
        }
        final akuw f = akvc.f;
        akuw a3;
        if (f == null) {
            a3 = akuw.a;
        }
        else {
            a3 = f;
        }
        if (a3.b == 136076983) {
            akuw a4;
            if ((a4 = f) == null) {
                a4 = akuw.a;
            }
            if (a4.b == 136076983) {
                a = (aomw)a4.c;
            }
            else {
                a = aomw.a;
            }
        }
        if (!akvc.g.isEmpty()) {
            final htf c2 = htg.c(akvc.g);
            c2.g = g;
            c2.f = a2;
            c2.e = a;
            final boolean b = true;
            c2.e(true);
            c2.d(akvc.h);
            final htg a5 = c2.a();
            this.a.c.c(a5.b, (acjb)a5);
            final hti hti = (hti)this.a.c.b(hti.b(akvc.g, true));
            if (hti != null) {
                hti hti2;
                int n;
                if (a2 != null) {
                    final ahaz builder = ((ahbh)hti.a).toBuilder();
                    int size = ((aiht)builder.instance).m.size();
                    while (--size >= 0) {
                        if ((builder.aD(size).b & 0x4) != 0x0) {
                            final ahaz builder2 = aihq.a.createBuilder();
                            builder2.copyOnWrite();
                            final aihq aihq = (aihq)builder2.instance;
                            aihq.e = a2;
                            aihq.b |= 0x4;
                            builder.aE(size, builder2);
                            break;
                        }
                    }
                    hti.c(builder);
                    hti2 = new hti((aiht)builder.build(), hti.c);
                    n = (b ? 1 : 0);
                }
                else if (a != null) {
                    final ahaz builder3 = ((ahbh)hti.a).toBuilder();
                    int size2 = ((aiht)builder3.instance).m.size();
                    while (--size2 >= 0) {
                        if ((builder3.aD(size2).b & 0x8) != 0x0) {
                            final ahaz builder4 = aihq.a.createBuilder();
                            builder4.copyOnWrite();
                            final aihq aihq2 = (aihq)builder4.instance;
                            aihq2.f = a;
                            aihq2.b |= 0x8;
                            builder3.aE(size2, builder4);
                            break;
                        }
                    }
                    hti.c(builder3);
                    hti2 = new hti((aiht)builder3.build(), hti.c);
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                    hti2 = hti;
                }
                if (n != 0) {
                    this.a.c.c(hti2.b, (acjb)hti2);
                }
            }
        }
        this.e.f(g);
    }
    
    public final void mY() {
    }
}
