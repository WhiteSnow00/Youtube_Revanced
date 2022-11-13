import android.text.Spanned;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import android.view.ViewStub;
import android.view.View;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.Map;
import com.google.protos.youtube.api.innertube.CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gng implements asjm
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public gng(final fck a, final CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public gng(final gni a, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public gng(final gzu b, final ShortsVideoTrimView2 c, final View a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public gng(final ihd a, final String c, final Runnable b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public gng(final ilj a, final aabf b, final ackm c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public gng(final kja a, final amco c, final aujg b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(Object o) {
        final int d = this.d;
        int r = 0;
        boolean b = false;
        switch (d) {
            default: {
                final Object a = this.a;
                final Object b2 = this.b;
                final Object c = this.c;
                if (o) {
                    final ilj ilj = (ilj)a;
                    final TextView e = ilj.e;
                    if (e != null && b2 != null) {
                        e.setText((CharSequence)((aabf)b2).m(ilj.a));
                    }
                    ilj.b((aabf)null);
                    return;
                }
                if (b2 != null) {
                    final ilj ilj2 = (ilj)a;
                    final TextView e2 = ilj2.e;
                    if (e2 != null) {
                        e2.setText((CharSequence)((aabf)b2).m(ilj2.a));
                    }
                    ilj2.d((aabf)b2);
                }
                else {
                    final ilj ilj3 = (ilj)a;
                    final TextView e3 = ilj3.e;
                    final aaba i = ilj3.i;
                    i.getClass();
                    e3.setText((CharSequence)i.j());
                }
                final ilj ilj4 = (ilj)a;
                final ilc j = ilj4.j;
                if (j != null) {
                    j.b((ackm)c);
                }
                if (ilj4.g != null) {
                    if (b2 != null) {
                        final aabf aabf = (aabf)b2;
                        r = jgk.r(aabf.g(), aabf.h);
                    }
                    final ahaz builder = ((ahbh)aotb.a).createBuilder();
                    builder.copyOnWrite();
                    final aotb aotb = (aotb)builder.instance;
                    aotb.b |= 0x1;
                    aotb.c = r;
                    final aotb aotb2 = (aotb)builder.build();
                    if (ilj4.k == null) {
                        ilj4.k = new glh((ViewStub)ilj4.g);
                    }
                    ilj4.k.a(aotb2);
                    ilj4.l = ilj4.f.findViewById(2131431189);
                }
                ilj4.b((aabf)b2);
                return;
            }
            case 6: {
                final Object a2 = this.a;
                final Object c2 = this.c;
                final Object b3 = this.b;
                final aezp aezp = (aezp)o;
                ((ihd)a2).b((String)c2, (Runnable)b3);
                return;
            }
            case 5: {
                final Object a3 = this.a;
                final Object c3 = this.c;
                final Object b4 = this.b;
                if (((aosg)o).c.equals(c3)) {
                    ((ihd)a3).b((String)c3, (Runnable)b4);
                }
                return;
            }
            case 4: {
                final Object a4 = this.a;
                final Object c4 = this.c;
                final Object b5 = this.b;
                final aotj aotj = (aotj)o;
                if (aotj != null) {
                    final int ordinal = aotj.ordinal();
                    if (ordinal == 1) {
                        ((atjm)((kja)a4).d).tx();
                        ((aujg)b5).an(kja.c((amco)c4, 0));
                        return;
                    }
                    if (ordinal == 2) {
                        ((atjm)((kja)a4).d).tx();
                        ((aujg)b5).an(kja.c((amco)c4, 1));
                        return;
                    }
                    if (ordinal == 3) {
                        ((atjm)((kja)a4).d).tx();
                        ((aujg)b5).an(kja.c((amco)c4, 2));
                        return;
                    }
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            ((kja)a4).d((amco)c4, (aujg)b5);
                            return;
                        }
                        final kja kja = (kja)a4;
                        ((atjm)kja.d).tx();
                        ((aujg)b5).ao(((zhk)kja.b).a());
                    }
                    else {
                        final amco amco = (amco)c4;
                        if ((amco.b & 0x400) != 0x0) {
                            ((atjm)((kja)a4).d).tx();
                            aotp aotp;
                            if ((aotp = amco.m) == null) {
                                aotp = aotp.a;
                            }
                            ((aujg)b5).an(aotp);
                        }
                    }
                }
                return;
            }
            case 3: {
                final Object b6 = this.b;
                final Object c5 = this.c;
                final Object a5 = this.a;
                final Long n = (Long)o;
                final txz txz = (txz)((gzu)b6).a.a();
                if (!txz.ah()) {
                    return;
                }
                gzu.d((ShortsVideoTrimView2)c5, (View)a5, txz.J());
                return;
            }
            case 2: {
                final Object a6 = this.a;
                final Object b7 = this.b;
                final Object c6 = this.c;
                final Throwable t = (Throwable)o;
                ((gni)a6).c((List)afeq.q(), (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint)b7, (Map)c6);
                return;
            }
            case 1: {
                final Object a7 = this.a;
                final Object b8 = this.b;
                final Object c7 = this.c;
                final aips aips = (aips)o;
                if (aips == null) {
                    aiqj aiqj;
                    if ((aiqj = ((CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand)b8).c) == null) {
                        aiqj = aiqj.a;
                    }
                    ((fck)a7).b(aiqj, (Map)c7);
                    return;
                }
                final CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand = (CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand)b8;
                apsh apsh;
                if ((apsh = coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.d) == null) {
                    apsh = apsh.a;
                }
                final int al = aevy.aL(apsh.b);
                Label_0819: {
                    Label_0800: {
                        if (al != 0) {
                            if (al != 2) {
                                apsh apsh2;
                                if ((apsh2 = coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.d) == null) {
                                    apsh2 = apsh.a;
                                }
                                final int al2 = aevy.aL(apsh2.b);
                                if (al2 != 0) {
                                    if (al2 == 3) {
                                        break Label_0800;
                                    }
                                }
                                o = new vo((fck)a7, coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand, (Map)c7, 12);
                                break Label_0819;
                            }
                        }
                    }
                    o = new vo((fck)a7, coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand, (Map)c7, 11);
                }
                final gmk gmk = (gmk)((fck)a7).b.a();
                gmk.c();
                if (!gmk.m) {
                    gmk.g = LayoutInflater.from(gmk.d).inflate(2131624195, (ViewGroup)null);
                    gmk.h = (ImageView)gmk.g.findViewById(2131429270);
                    gmk.i = (TextView)gmk.g.findViewById(2131432095);
                    gmk.j = (TextView)gmk.g.findViewById(2131427816);
                    gmk.k = (TextView)gmk.g.findViewById(2131430519);
                    gmk.l = (TextView)gmk.g.findViewById(2131430035);
                    final TextView k = gmk.k;
                    acvc.d((View)k, 0, k.getBackground());
                    final TextView l = gmk.l;
                    acvc.d((View)l, 0, l.getBackground());
                    gmk.l.setOnClickListener((View$OnClickListener)new fup(gmk, 9));
                    gmk.m = true;
                }
                if (gmk.g != null && gmk.h != null && gmk.i != null && gmk.j != null && gmk.k != null) {
                    if (gmk.l != null) {
                        final acpk e4 = gmk.e;
                        akdh akdh;
                        if ((akdh = akdh.b(aips.getIcon().c)) == null) {
                            akdh = akdh.a;
                        }
                        final int a8 = e4.a(akdh);
                        if (a8 != 0) {
                            gmk.h.setImageResource(a8);
                        }
                        final ImageView h = gmk.h;
                        if (a8 != 0) {
                            b = true;
                        }
                        tpe.v((View)h, b);
                        final Spanned b9 = acak.b(aips.getTitle());
                        gmk.i.setText((CharSequence)b9);
                        gmk.i.setContentDescription((CharSequence)b9);
                        final Spanned c8 = acak.c(aips.getBody(), gmk.f);
                        gmk.j.setText((CharSequence)c8);
                        gmk.j.setContentDescription((CharSequence)c8);
                        final Spanned b10 = acak.b(aips.getConfirmText());
                        gmk.k.setText((CharSequence)b10);
                        gmk.k.setContentDescription((CharSequence)b10);
                        gmk.k.setOnClickListener((View$OnClickListener)new gcd(gmk, (Runnable)o, 4));
                        final Spanned b11 = acak.b(aips.getCancelText());
                        gmk.l.setText((CharSequence)b11);
                        gmk.l.setContentDescription((CharSequence)b11);
                        gmk.f();
                    }
                }
                return;
            }
            case 0: {
                ((gni)this.a).c(((amlt)o).getSelectedVideoIds(), (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint)this.b, (Map)this.c);
            }
        }
    }
}
