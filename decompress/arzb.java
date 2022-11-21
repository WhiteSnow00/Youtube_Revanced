import android.content.Context;
import android.os.Process;
import java.io.InputStream;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzb
{
    public final Object a;
    public volatile Object b;
    private final Object c;
    
    public arzb(final adkp a, final atnb c) {
        this.a = a;
        this.c = c;
    }
    
    public arzb(final aryy c, final Object a) {
        this.c = c;
        this.a = a;
    }
    
    public arzb(final askp c, final vbt a) {
        this.c = c;
        this.a = a;
        c.aH((asmi)new uzc(this, 11, (byte[])null, (byte[])null));
    }
    
    public static aryy a(final aryz aryz) {
        aryy cast;
        if (aryy.class.isInstance(aryz.c)) {
            cast = aryy.class.cast(aryz.c);
        }
        else {
            cast = null;
        }
        return cast;
    }
    
    public static String e(final Throwable t) {
        return Log.getStackTraceString(t).replace(String.valueOf(t.getMessage()).concat("\n"), "\n");
    }
    
    final InputStream b() {
        return ((aryy)this.c).a(this.a);
    }
    
    final byte[] c() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = arze.h(this.b());
                }
            }
        }
        return (byte[])this.b;
    }
    
    public final ahwk d(final String f, final Throwable t, final String c) {
        final ahcr builder = aubl.a.createBuilder();
        builder.copyOnWrite();
        aubl.a((aubl)builder.instance);
        int n = 4;
        try {
            final ahcr builder2 = ((ahcz)aubg.a).createBuilder();
            final ahcr builder3 = ((ahcz)aubf.a).createBuilder();
            final long elapsedCpuTime = Process.getElapsedCpuTime();
            builder3.copyOnWrite();
            final aubf aubf = (aubf)builder3.instance;
            aubf.b |= 0x1;
            aubf.c = elapsedCpuTime;
            final boolean b = ((adiu)((atnb)this.c).a()).b();
            builder3.copyOnWrite();
            final aubf aubf2 = (aubf)builder3.instance;
            aubf2.b |= 0x2;
            aubf2.d = b;
            final int activeCount = Thread.activeCount();
            builder3.copyOnWrite();
            final aubf aubf3 = (aubf)builder3.instance;
            aubf3.b |= 0x4;
            aubf3.e = activeCount;
            final aubf c2 = (aubf)builder3.build();
            builder2.copyOnWrite();
            final aubg aubg = (aubg)builder2.instance;
            c2.getClass();
            aubg.c = c2;
            aubg.b |= 0x1;
            builder.copyOnWrite();
            final aubl aubl = (aubl)builder.instance;
            final aubg d = (aubg)builder2.build();
            d.getClass();
            aubl.d = d;
            aubl.b |= 0x2;
        }
        catch (final RuntimeException ex) {
            ex.toString();
        }
        String h = t.getClass().getName();
        for (Throwable t2 = t.getCause(); t2 != null && t2 != t2.getCause(); t2 = t2.getCause()) {
            h = t2.getClass().getName();
        }
        builder.copyOnWrite();
        final aubl aubl2 = (aubl)builder.instance;
        f.getClass();
        aubl2.b |= 0x8;
        aubl2.f = f;
        final Class<? extends Throwable> class1 = t.getClass();
        if (class1 == OutOfMemoryError.class) {
            n = 3;
        }
        else if (NullPointerException.class.isAssignableFrom(class1)) {
            n = 2;
        }
        else if (!RuntimeException.class.isAssignableFrom(class1)) {
            if (Error.class.isAssignableFrom(class1)) {
                n = 5;
            }
            else {
                n = 1;
            }
        }
        builder.copyOnWrite();
        final aubl aubl3 = (aubl)builder.instance;
        aubl3.g = n - 1;
        final int b2 = aubl3.b;
        int n2 = 16;
        aubl3.b = (b2 | 0x10);
        builder.copyOnWrite();
        final aubl aubl4 = (aubl)builder.instance;
        h.getClass();
        aubl4.b |= 0x80;
        aubl4.h = h;
        final ahcr s = aftz.s(t);
        builder.copyOnWrite();
        final aubl aubl5 = (aubl)builder.instance;
        final afta i = (afta)s.build();
        i.getClass();
        aubl5.i = i;
        aubl5.b |= 0x100;
        final aubl h2 = (aubl)builder.build();
        final ahcr builder4 = aubz.a.createBuilder();
        builder4.copyOnWrite();
        final aubz aubz = (aubz)builder4.instance;
        h2.getClass();
        aubz.h = h2;
        aubz.b |= 0x40;
        final String packageName = ((Context)((adkp)this.a).c).getPackageName();
        final String c3 = tvo.c((Context)((adkp)this.a).c);
        final String b3 = qct.b((Context)((adkp)this.a).c);
        final ahcr builder5 = aubi.a.createBuilder();
        if (packageName != null) {
            builder5.copyOnWrite();
            final aubi aubi = (aubi)builder5.instance;
            aubi.b |= 0x1;
            aubi.c = packageName;
            builder5.copyOnWrite();
            final aubi aubi2 = (aubi)builder5.instance;
            c3.getClass();
            aubi2.b |= 0x2;
            aubi2.d = c3;
        }
        if (b3 != null) {
            builder5.copyOnWrite();
            final aubi aubi3 = (aubi)builder5.instance;
            aubi3.b |= 0x10;
            aubi3.g = b3;
        }
        builder4.copyOnWrite();
        final aubz aubz2 = (aubz)builder4.instance;
        final aubi q = (aubi)builder5.build();
        q.getClass();
        aubz2.q = q;
        aubz2.b |= 0x1000000;
        final aubz aubz3 = (aubz)builder4.build();
        final ahcr builder6 = ((ahcz)aosv.a).createBuilder();
        final ahcr builder7 = ((ahcz)aoso.a).createBuilder();
        final long c4 = ((oco)((adkp)this.a).d).c();
        builder7.copyOnWrite();
        final aoso aoso = (aoso)builder7.instance;
        aoso.b |= 0x8;
        aoso.e = c4;
        if (c != null) {
            builder7.copyOnWrite();
            final aoso aoso2 = (aoso)builder7.instance;
            aoso2.b |= 0x1;
            aoso2.c = c;
        }
        final int b4 = ((aoso)builder7.instance).b;
        Label_1042: {
            if ((b4 & 0x1) == 0x0) {
                if ((b4 & 0x2) == 0x0) {
                    break Label_1042;
                }
            }
            builder6.copyOnWrite();
            final aosv aosv = (aosv)builder6.instance;
            final aoso g = (aoso)builder7.build();
            g.getClass();
            aosv.g = g;
            aosv.b |= 0x40;
        }
        final adiu adiu = (adiu)((atnb)this.c).a();
        adiu.e(builder6);
        adiu.d(builder6);
        final ahbt byteString = aubz3.toByteString();
        builder6.copyOnWrite();
        final aosv aosv2 = (aosv)builder6.instance;
        aosv2.b |= 0x8;
        aosv2.f = byteString;
        final aosv e = (aosv)builder6.build();
        final ahcr builder8 = ((ahcz)ahwk.a).createBuilder();
        final Class<? extends Throwable> class2 = t.getClass();
        if (class2 == OutOfMemoryError.class) {
            n2 = 14;
        }
        else if (NullPointerException.class.isAssignableFrom(class2)) {
            n2 = 13;
        }
        else if (RuntimeException.class.isAssignableFrom(class2)) {
            n2 = 15;
        }
        else if (!Error.class.isAssignableFrom(class2)) {
            n2 = 1;
        }
        builder8.copyOnWrite();
        final ahwk ahwk = (ahwk)builder8.instance;
        ahwk.c = n2 - 1;
        ahwk.b |= 0x1;
        final String c5 = tvo.c((Context)((adkp)this.a).c);
        builder8.copyOnWrite();
        final ahwk ahwk2 = (ahwk)builder8.instance;
        c5.getClass();
        ahwk2.b |= 0x2;
        ahwk2.d = c5;
        builder8.copyOnWrite();
        final ahwk ahwk3 = (ahwk)builder8.instance;
        e.getClass();
        ahwk3.e = e;
        ahwk3.b |= 0x8;
        return (ahwk)builder8.build();
    }
    
    public final akeo f() {
        Object b;
        if (this.b == null) {
            b = ((askp)this.c).aN(akeo.a);
        }
        else {
            b = this.b;
        }
        return (akeo)b;
    }
    
    public final askp g(final asmn asmn) {
        return ((askp)this.c).Z(asmn).A();
    }
    
    @Deprecated
    public final askp h() {
        return ((askp)this.c).V();
    }
}
