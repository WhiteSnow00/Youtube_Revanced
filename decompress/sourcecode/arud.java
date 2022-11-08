import android.content.Context;
import android.os.Process;
import java.io.InputStream;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arud
{
    public final Object a;
    public volatile Object b;
    private final Object c;
    
    public arud(final adgw a, final atjj c) {
        this.a = a;
        this.c = c;
    }
    
    public arud(final arua c, final Object a) {
        this.c = c;
        this.a = a;
    }
    
    public arud(final ashe c, final uyk a) {
        this.c = c;
        this.a = a;
        c.aB((asix)new uyj(this, 2, (byte[])null, (byte[])null));
    }
    
    public static arua a(final arub arub) {
        arua cast;
        if (arua.class.isInstance(arub.c)) {
            cast = arua.class.cast(arub.c);
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
        return ((arua)this.c).a(this.a);
    }
    
    final byte[] c() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = arug.h(this.b());
                }
            }
        }
        return (byte[])this.b;
    }
    
    public final ahst d(final String f, final Throwable t, final String c) {
        final agza builder = atxr.a.createBuilder();
        builder.copyOnWrite();
        atxr.a((atxr)builder.instance);
        int n = 4;
        try {
            final agza builder2 = atxn.a.createBuilder();
            final agza builder3 = atxm.a.createBuilder();
            final long elapsedCpuTime = Process.getElapsedCpuTime();
            builder3.copyOnWrite();
            final atxm atxm = (atxm)builder3.instance;
            atxm.b |= 0x1;
            atxm.c = elapsedCpuTime;
            final boolean b = ((adfc)((atjj)this.c).a()).b();
            builder3.copyOnWrite();
            final atxm atxm2 = (atxm)builder3.instance;
            atxm2.b |= 0x2;
            atxm2.d = b;
            final int activeCount = Thread.activeCount();
            builder3.copyOnWrite();
            final atxm atxm3 = (atxm)builder3.instance;
            atxm3.b |= 0x4;
            atxm3.e = activeCount;
            final atxm c2 = (atxm)builder3.build();
            builder2.copyOnWrite();
            final atxn atxn = (atxn)builder2.instance;
            c2.getClass();
            atxn.c = c2;
            atxn.b |= 0x1;
            builder.copyOnWrite();
            final atxr atxr = (atxr)builder.instance;
            final atxn d = (atxn)builder2.build();
            d.getClass();
            atxr.d = d;
            atxr.b |= 0x2;
        }
        catch (final RuntimeException ex) {
            ex.toString();
        }
        String h = t.getClass().getName();
        for (Throwable t2 = t.getCause(); t2 != null && t2 != t2.getCause(); t2 = t2.getCause()) {
            h = t2.getClass().getName();
        }
        builder.copyOnWrite();
        final atxr atxr2 = (atxr)builder.instance;
        f.getClass();
        atxr2.b |= 0x8;
        atxr2.f = f;
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
        final atxr atxr3 = (atxr)builder.instance;
        atxr3.g = n - 1;
        final int b2 = atxr3.b;
        int n2 = 16;
        atxr3.b = (b2 | 0x10);
        builder.copyOnWrite();
        final atxr atxr4 = (atxr)builder.instance;
        h.getClass();
        atxr4.b |= 0x80;
        atxr4.h = h;
        final agza c3 = afqg.c(t);
        builder.copyOnWrite();
        final atxr atxr5 = (atxr)builder.instance;
        final afpk i = (afpk)c3.build();
        i.getClass();
        atxr5.i = i;
        atxr5.b |= 0x100;
        final atxr h2 = (atxr)builder.build();
        final agza builder4 = atyg.a.createBuilder();
        builder4.copyOnWrite();
        final atyg atyg = (atyg)builder4.instance;
        h2.getClass();
        atyg.h = h2;
        atyg.b |= 0x40;
        final String packageName = ((Context)((adgw)this.a).c).getPackageName();
        final String d2 = tsi.d((Context)((adgw)this.a).c);
        final String b3 = qaq.b((Context)((adgw)this.a).c);
        final agza builder5 = atxp.a.createBuilder();
        if (packageName != null) {
            builder5.copyOnWrite();
            final atxp atxp = (atxp)builder5.instance;
            atxp.b |= 0x1;
            atxp.c = packageName;
            builder5.copyOnWrite();
            final atxp atxp2 = (atxp)builder5.instance;
            d2.getClass();
            atxp2.b |= 0x2;
            atxp2.d = d2;
        }
        if (b3 != null) {
            builder5.copyOnWrite();
            final atxp atxp3 = (atxp)builder5.instance;
            atxp3.b |= 0x10;
            atxp3.g = b3;
        }
        builder4.copyOnWrite();
        final atyg atyg2 = (atyg)builder4.instance;
        final atxp q = (atxp)builder5.build();
        q.getClass();
        atyg2.q = q;
        atyg2.b |= 0x1000000;
        final atyg atyg3 = (atyg)builder4.build();
        final agza builder6 = ((agzi)aooh.a).createBuilder();
        final agza builder7 = ((agzi)aoob.a).createBuilder();
        final long c4 = ((oas)((adgw)this.a).d).c();
        builder7.copyOnWrite();
        final aoob aoob = (aoob)builder7.instance;
        aoob.b |= 0x8;
        aoob.e = c4;
        if (c != null) {
            builder7.copyOnWrite();
            final aoob aoob2 = (aoob)builder7.instance;
            aoob2.b |= 0x1;
            aoob2.c = c;
        }
        final int b4 = ((aoob)builder7.instance).b;
        Label_1042: {
            if ((b4 & 0x1) == 0x0) {
                if ((b4 & 0x2) == 0x0) {
                    break Label_1042;
                }
            }
            builder6.copyOnWrite();
            final aooh aooh = (aooh)builder6.instance;
            final aoob g = (aoob)builder7.build();
            g.getClass();
            aooh.g = g;
            aooh.b |= 0x40;
        }
        final adfc adfc = (adfc)((atjj)this.c).a();
        adfc.e(builder6);
        adfc.d(builder6);
        final agyc byteString = atyg3.toByteString();
        builder6.copyOnWrite();
        final aooh aooh2 = (aooh)builder6.instance;
        aooh2.b |= 0x8;
        aooh2.f = byteString;
        final aooh e = (aooh)builder6.build();
        final agza builder8 = ahst.a.createBuilder();
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
        final ahst ahst = (ahst)builder8.instance;
        ahst.c = n2 - 1;
        ahst.b |= 0x1;
        final String d3 = tsi.d((Context)((adgw)this.a).c);
        builder8.copyOnWrite();
        final ahst ahst2 = (ahst)builder8.instance;
        d3.getClass();
        ahst2.b |= 0x2;
        ahst2.d = d3;
        builder8.copyOnWrite();
        final ahst ahst3 = (ahst)builder8.instance;
        e.getClass();
        ahst3.e = e;
        ahst3.b |= 0x8;
        return (ahst)builder8.build();
    }
    
    public final akak f() {
        Object b;
        if (this.b == null) {
            b = ((ashe)this.c).aH((Object)akak.a);
        }
        else {
            b = this.b;
        }
        return (akak)b;
    }
    
    public final ashe g(final asjc asjc) {
        return ((ashe)this.c).W(asjc).z();
    }
    
    @Deprecated
    public final ashe h() {
        return ((ashe)this.c).S();
    }
}
