import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Arrays;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hua implements ashe
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public hua(final LiveCreationActivity a, final alvk b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hua(final ftg a, final alcw b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hua(final ftg a, final apga b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hua(final huc a, final alvk b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hua(final String b, final aeea a, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hua(final vyo a, final annu b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hua(final vyo a, final apjj b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final aslr aslr) {
        switch (this.c) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final vyo vyo = (vyo)a;
                final Object b2 = vyo.b;
                final apjj apjj = (apjj)b;
                aldl aldl;
                if ((aldl = apjj.c) == null) {
                    aldl = aldl.a;
                }
                final zme c = ((zmf)vyo.a).c();
                final afum a2 = afum.a;
                final adfq adfq = (adfq)b2;
                final Object d = adfq.d;
                final adfw adfw = new adfw(adfq.c, c, aldl.toBuilder(), null, null, null, null, null, null);
                ((vkk)adfw).i();
                teu.k(((vml)d).b((vls)adfw, (Executor)a2), (Executor)afum.a, (tes)new wyh(aslr, 11), (tet)new vcd(vyo, apjj, aslr, 17, (byte[])null));
                return;
            }
            case 6: {
                final Object a3 = this.a;
                final Object b3 = this.b;
                final ftg ftg = (ftg)a3;
                final Object a4 = ftg.a;
                final zme c2 = ((zmf)ftg.b).c();
                final alcw alcw = (alcw)b3;
                ((adfu)a4).a(alcw, c2, false, (zpf)new gna(aslr, alcw, 11));
                return;
            }
            case 5: {
                final Object a5 = this.a;
                final Object b4 = this.b;
                final ftg ftg2 = (ftg)a5;
                final Object b5 = ftg2.b;
                alcb alcb;
                if ((alcb = ((apga)b4).c) == null) {
                    alcb = alcb.a;
                }
                final ahaz builder = alcb.toBuilder();
                final adfs adfs = (adfs)b5;
                final adfr adfr = new adfr(adfs.c, ((zmf)adfs.d).c(), builder, null, null, null, null, null, null);
                ((vkk)adfr).i();
                final ListenableFuture b6 = ((vml)adfs.f).b((vls)adfr, (Executor)adfs.e);
                b6.addListener((Runnable)new yrd(b6, aslr, 14), (Executor)ftg2.a);
                return;
            }
            case 4: {
                final Object a6 = this.a;
                final Object b7 = this.b;
                final vyo vyo2 = (vyo)a6;
                final Object a7 = vyo2.a;
                final ahaz builder2 = ((ahbh)akqu.a).createBuilder();
                final ahaz builder3 = ((ahbh)amhd.a).createBuilder();
                final annu annu = (annu)b7;
                final String d2 = annu.d;
                builder3.copyOnWrite();
                final amhd amhd = (amhd)builder3.instance;
                d2.getClass();
                amhd.b |= 0x1;
                amhd.c = d2;
                builder2.copyOnWrite();
                final akqu akqu = (akqu)builder2.instance;
                final amhd f = (amhd)builder3.build();
                f.getClass();
                akqu.f = f;
                akqu.b |= 0x80;
                teu.k(((adfs)a7).d(builder2), (Executor)vyo2.b, (tes)new wyh(aslr, 6), (tet)new vcd(vyo2, annu, aslr, 10, (byte[])null));
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final Object b8 = this.b;
                final LiveCreationActivity liveCreationActivity = (LiveCreationActivity)a8;
                final zfw w = liveCreationActivity.W;
                final wqg v = liveCreationActivity.V;
                final aslr b9 = v.b;
                if (b9 != null && !b9.tA()) {
                    v.b.a();
                }
                v.b = aslr;
                v.a = (alvk)b8;
                zfw ap;
                if ((ap = w) == null) {
                    ap = liveCreationActivity.aq.ap((zfv)liveCreationActivity.findViewById(2131429690), (zft)liveCreationActivity.V, false);
                }
                ap.a();
                liveCreationActivity.W = ap;
                liveCreationActivity.findViewById(2131431794).setVisibility(4);
                liveCreationActivity.findViewById(2131432381).setVisibility(4);
                liveCreationActivity.findViewById(2131431775).setVisibility(4);
                liveCreationActivity.findViewById(2131429499).setVisibility(8);
                liveCreationActivity.S.setVisibility(0);
                return;
            }
            case 2: {
                final Object b10 = this.b;
                final aeea aeea = (aeea)this.a;
                final aqtv aqtv = new aqtv((String)b10, aslr, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                asjv.d((AtomicReference)aslr, asfn.d((asjg)new gcw(aeea, aqtv, 18, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null)));
                ((tov)aeea.a).g.cI((Object)aqtv);
                return;
            }
            case 1: {
                final Object a9 = this.a;
                final Object b11 = this.b;
                final huc huc = (huc)a9;
                final wqg af = huc.af;
                final aslr b12 = af.b;
                if (b12 != null && !b12.tA()) {
                    af.b.a();
                }
                af.b = aslr;
                af.a = (alvk)b11;
                final zfw y = huc.Y;
                final LocationSearchView locationSearchView = (LocationSearchView)((fa)a9).findViewById(2131429690);
                zfw ap2;
                if ((ap2 = y) == null) {
                    ap2 = huc.ai.ap((zfv)locationSearchView, (zft)huc.af, (boolean)huc.ah.ak());
                }
                huc.l().setVisibility(8);
                huc.m().setInAnimation(AnimationUtils.loadAnimation(locationSearchView.getContext(), 2130772103));
                huc.m().b(2131429690);
                huc.m().setInAnimation((Animation)null);
                ap2.a();
                huc.Y = ap2;
                return;
            }
            case 0: {
                final Object a10 = this.a;
                final Object b13 = this.b;
                final acut d3 = acut.d((bu)a10);
                final wyw pf = ((faq)a10).pF();
                final List<PermissionDescriptor> list = Arrays.asList(new PermissionDescriptor(3, xaa.c(33980), xaa.c(33981)));
                final alvk alvk = (alvk)b13;
                final huc huc2 = (huc)a10;
                (huc2.Z = new acuu(d3, pf, (List)list, 2132019109, 2132019110, (Runnable)new gpd(huc2, alvk, aslr, 12), (Runnable)new hol(aslr, 13), huc2.W)).a();
            }
        }
    }
}
