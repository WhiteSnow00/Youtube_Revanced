import java.util.concurrent.Executor;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrr implements zkf
{
    static final int a;
    public static final alwf[] b;
    public final abrn c;
    public final ajdf d;
    public alwj e;
    private final zmf f;
    private zja g;
    private final atke h;
    private final oby i;
    private final adfu j;
    
    static {
        a = (int)TimeUnit.DAYS.toHours(30L);
        b = new alwf[] { alwf.b, alwf.c, alwf.d };
    }
    
    public abrr(final zmf f, final adfu j, final abrn c, final vaf vaf, final oby i, final atke h, final byte[] array, final byte[] array2, final byte[] array3) {
        f.getClass();
        this.f = f;
        j.getClass();
        this.j = j;
        this.c = c;
        vaf.getClass();
        this.d = abrm.e(vaf);
        this.i = i;
        this.h = h;
    }
    
    public static void e(final Throwable t) {
        ttr.d("Request failed for attestation challenge", t);
    }
    
    public final zja a() {
        if (this.g == null) {
            final ahaz builder = ajdi.a.createBuilder();
            final ajdf d = this.d;
            if (d != null && (d.b & 0x8) != 0x0) {
                ajdi ajdi;
                if ((ajdi = d.e) == null) {
                    ajdi = ajdi.a;
                }
                final int c = ajdi.c;
                builder.copyOnWrite();
                final ajdi ajdi2 = (ajdi)builder.instance;
                ajdi2.b |= 0x1;
                ajdi2.c = c;
                ajdi ajdi3;
                if ((ajdi3 = this.d.e) == null) {
                    ajdi3 = ajdi.a;
                }
                final int d2 = ajdi3.d;
                builder.copyOnWrite();
                final ajdi ajdi4 = (ajdi)builder.instance;
                ajdi4.b |= 0x2;
                ajdi4.d = d2;
            }
            else {
                final int a = abrr.a;
                builder.copyOnWrite();
                final ajdi ajdi5 = (ajdi)builder.instance;
                ajdi5.b |= 0x1;
                ajdi5.c = a;
                builder.copyOnWrite();
                final ajdi ajdi6 = (ajdi)builder.instance;
                ajdi6.b |= 0x2;
                ajdi6.d = 30;
            }
            this.g = (zja)new abrq(builder);
        }
        return this.g;
    }
    
    public final ajdo b() {
        return ajdo.g;
    }
    
    public final String c() {
        return "attestation";
    }
    
    public final void d(String o, zjt b, List iterator) {
        if ((o = this.f.d((String)o)) == null) {
            o = zmd.a;
            ttr.l("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.");
        }
        final zli a = b.a;
        b = (zjt)this.j.b((zme)o, a.a, a.b);
        ((vnl)b).b = 2;
        iterator = ((List)iterator).iterator();
        while (iterator.hasNext()) {
            final ahaz ahaz = (ahaz)iterator.next();
            final ahaz builder = ((ahbh)ahwa.a).createBuilder();
            try {
                ((agzj)builder).mergeFrom(((lqw)ahaz.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                ((vnl)b).a.add(builder.build());
            }
            catch (final ahca ahca) {
                zlm.b(zll.b, zlk.l, "AttestationDelayedEventDispatcher.dispatchEvents() could not deserialize AttestationObjectId");
            }
        }
        if (((vnl)b).w()) {
            return;
        }
        teu.k(this.j.d((vnl)b, (Executor)afum.a), (Executor)afum.a, (tes)zsa.q, (tet)new xor(this, (zme)o, 5));
    }
    
    public final void f() {
    }
    
    public final void g() {
    }
    
    public final zkr h(final ahaz ahaz) {
        final zme d = this.f.d(((lqw)ahaz.instance).g);
        if (d == null) {
            return null;
        }
        final lqw lqw = (lqw)ahaz.instance;
        final zli zli = new zli(lqw.j, lqw.k);
        final adem a = zla.a();
        final ahaz builder = ((ahbh)ajqs.a).createBuilder();
        builder.copyOnWrite();
        ajqs.b((ajqs)builder.instance);
        a.c((ajqs)builder.build(), (fon)this.h.a());
        return new abrp(this.i.c(), a.a(), d, zli, ahaz);
    }
    
    public final void i() {
        zxf.x();
    }
}
