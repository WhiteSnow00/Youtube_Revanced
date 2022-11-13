import android.content.res.Resources;
import java.util.function.Function;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvu implements Callable
{
    public final Object a;
    private final int b;
    
    public hvu(final hqo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvu(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvu(final hyi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvu(final hzj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvu(final idl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvu(final igp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvu(final ihe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object call() {
        final int b = this.b;
        final boolean b2 = false;
        boolean b3 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                tbi.e();
                ajvo a2;
                try {
                    a2 = (ajvo)ahbh.parseFrom((ahbh)ajvo.a, ((ihe)a).a.getResources().openRawResource(2131951656), ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final IOException ex) {
                    ttr.d("Could not load persisted framework update transport", (Throwable)ex);
                    a2 = ajvo.a;
                }
                return a2;
            }
            case 19: {
                return igx.d((apys)((igp)this.a).b());
            }
            case 18: {
                return igx.d((apys)((igp)this.a).b());
            }
            case 17: {
                return igx.d((apys)((igp)this.a).b());
            }
            case 16: {
                return igx.d((apys)((igp)this.a).b());
            }
            case 15: {
                return igw.d((amar)((igp)this.a).b());
            }
            case 14: {
                return igw.e((amar)((igp)this.a).b());
            }
            case 13: {
                return igw.d((amar)((igp)this.a).b());
            }
            case 12: {
                return igw.e((amar)((igp)this.a).b());
            }
            case 11: {
                return igw.e((amar)((igp)this.a).b());
            }
            case 10: {
                return igw.d((amar)((igp)this.a).b());
            }
            case 9: {
                return igw.e((amar)((igp)this.a).b());
            }
            case 8: {
                return igw.d((amar)((igp)this.a).b());
            }
            case 7: {
                return ((idl)this.a).g();
            }
            case 6: {
                final hzj hzj = (hzj)this.a;
                AccountIdentity accountIdentity;
                if (hzj.e.c() instanceof AccountIdentity) {
                    accountIdentity = (AccountIdentity)hzj.e.c();
                }
                else {
                    accountIdentity = null;
                }
                final boolean b4 = quc.e((zme)accountIdentity) && accountIdentity.l() == 3;
                final vqx a3 = hzj.a;
                final vqw vqw = new vqw(a3.c, ((zmf)a3.e).c(), a3.d, ((exi)((arkg)hzj.o.d).a()).j(), ((exi)((arkg)hzj.o.d).a()).l(), b4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vkk)vqw).s(2);
                return vdh.aZ(((vmo)hzj.a.f).g((vls)vqw, hzj.l));
            }
            case 5: {
                final Resources d = ((hzj)this.a).d;
                final ahaz builder = ((ahbh)akrh.a).createBuilder();
                final ahaz builder2 = ((ahbh)akri.a).createBuilder();
                final ahaz builder3 = anbr.a.createBuilder();
                builder3.bv(hzj.c("FEwhat_to_watch", d.getString(2132018160), akdh.jy));
                builder3.bv(hzj.c("FEshorts", d.getString(2132019694), akdh.bq));
                builder3.bv(hzj.c("FEsubscriptions", d.getString(2132019898), akdh.jC));
                builder3.bv(hzj.c("FElibrary", d.getString(2132018355), akdh.jE));
                builder2.copyOnWrite();
                final akri akri = (akri)builder2.instance;
                final anbr c = (anbr)builder3.build();
                c.getClass();
                akri.c = c;
                akri.b = 117866661;
                final akri akri2 = (akri)builder2.build();
                builder.copyOnWrite();
                final akrh akrh = (akrh)builder.instance;
                akri2.getClass();
                final ahbx d2 = akrh.d;
                if (!d2.c()) {
                    akrh.d = ahbh.mutableCopy(d2);
                }
                akrh.d.add((Object)akri2);
                return new vqu((akrh)builder.build());
            }
            case 4: {
                return aezp.j((Object)((hzj)this.a).c.a().c());
            }
            case 3: {
                final hyi hyi = (hyi)this.a;
                return hyi.a.aH((asjm)new hsf(hyi, 15));
            }
            case 2: {
                final hwl hwl = (hwl)this.a;
                gak gak;
                if (hwl.bR()) {
                    gak = gak.b;
                }
                else {
                    gak = gak.a;
                }
                gaj gaj;
                if (hwl.bR()) {
                    gaj = gaj.b;
                }
                else {
                    gaj = gaj.a;
                }
                final aiqj ak = hwl.ak;
                if (ak == null || !((aicj)((ahbc)ak).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEvideo_picker")) {
                    b3 = true;
                }
                final adqw a4 = gai.a();
                a4.g(b3);
                a4.i(gaj);
                final adqw adqw = new hvp(b3, gak).apply(a4);
                adqw.getClass();
                return adqw.f();
            }
            case 1: {
                final hqo hqo = (hqo)this.a;
                return hqo.l.co().aH((asjm)new hom(hqo, 17));
            }
            case 0: {
                final hwl hwl2 = (hwl)this.a;
                final String f = vxg.f(hwl2.aL());
                boolean b5 = b2;
                if (!fwc.m(f)) {
                    if (f != null && f.equals("FEproduct_details")) {
                        b5 = b2;
                        if (((ghb)hwl2.cx.a).j().map((Function)new hra((Class)hpo.class, 1)).orElse((Object)false)) {
                            return b5;
                        }
                    }
                    b5 = true;
                }
                return b5;
            }
        }
    }
}
