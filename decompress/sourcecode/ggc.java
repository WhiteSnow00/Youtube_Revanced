import java.util.Iterator;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.content.Context;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggc
{
    public final boolean a;
    public final Object b;
    
    public ggc(final arud b, final oas oas, final rmw rmw, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = (new Random(oas.c()).nextFloat() < rmw.a());
    }
    
    public ggc(final atjj b, final xbz xbz) {
        this.b = b;
        this.a = xbz.b.equals("m");
    }
    
    public ggc(final ggb b, final uyi uyi) {
        this.b = b;
        this.a = uyi.W();
    }
    
    public ggc(final jbh b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public ggc(final mxv b) {
        this.b = b;
        this.a = (b != null);
    }
    
    public ggc(final obc b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public ggc(final uug uug, final uyi uyi) {
        this.a = uyi.cP();
        this.b = uug.A().L((asjc)new uvm(this, 1, (byte[])null, (byte[])null, (byte[])null)).W((Object)1);
    }
    
    public ggc(final boolean a, final afcr b) {
        this.a = a;
        this.b = b;
    }
    
    public static ahod a(final String c, final ahne ahne, final int n, final boolean b) {
        final agza h = h(ahne, n, (afdu)afgq.a);
        if (b) {
            final agza builder = ((agzi)ahoc.a).createBuilder();
            builder.copyOnWrite();
            final ahoc ahoc = (ahoc)builder.instance;
            c.getClass();
            ahoc.b |= 0x1;
            ahoc.c = c;
            final ahoc d = (ahoc)builder.build();
            h.copyOnWrite();
            final ahod ahod = (ahod)h.instance;
            final ahod a = ahod.a;
            d.getClass();
            ahod.d = d;
            ahod.b |= 0x2;
        }
        return (ahod)h.build();
    }
    
    public static ahom b(final sfh sfh, final boolean d, final boolean b) {
        final agza m = m(sfh.c(), sfh.c, sfh.d, sfh.a());
        if (b) {
            final agza builder = ((agzi)ahol.a).createBuilder();
            final String a = sfh.a;
            builder.copyOnWrite();
            final ahol ahol = (ahol)builder.instance;
            ahol.b |= 0x1;
            ahol.c = a;
            final afcr d2 = sfh.d;
            final int c = ((afgh)d2).c;
            final int n = 0;
            if (c > 0) {
                final ahon c2 = c(((List<sga>)d2).get(0));
                builder.copyOnWrite();
                final ahol ahol2 = (ahol)builder.instance;
                c2.getClass();
                ahol2.e = c2;
                ahol2.b |= 0x4;
            }
            final afcr e = sfh.e;
            for (int c3 = ((afgh)e).c, i = 0; i < c3; ++i) {
                final ahon c4 = c(((List<sga>)e).get(i));
                builder.copyOnWrite();
                final ahol ahol3 = (ahol)builder.instance;
                c4.getClass();
                final agzy f = ahol3.f;
                if (!f.c()) {
                    ahol3.f = agzi.mutableCopy(f);
                }
                ahol3.f.add(c4);
            }
            final afcr f2 = sfh.f;
            for (int c5 = ((afgh)f2).c, j = n; j < c5; ++j) {
                final ahon c6 = c(((List<sga>)f2).get(j));
                builder.copyOnWrite();
                final ahol ahol4 = (ahol)builder.instance;
                c6.getClass();
                final agzy g = ahol4.g;
                if (!g.c()) {
                    ahol4.g = agzi.mutableCopy(g);
                }
                ahol4.g.add(c6);
            }
            builder.copyOnWrite();
            final ahol ahol5 = (ahol)builder.instance;
            ahol5.b |= 0x2;
            ahol5.d = d;
            final ahol f3 = (ahol)builder.build();
            m.copyOnWrite();
            final ahom ahom = (ahom)m.instance;
            final ahom a2 = ahom.a;
            f3.getClass();
            ahom.f = f3;
            ahom.b |= 0x8;
        }
        return (ahom)m.build();
    }
    
    public static ahon c(final sga sga) {
        return g(sga, ((agzi)ahon.a).createBuilder());
    }
    
    public static ahom f(final String c, final ahnh ahnh, final int n, final afcr afcr, final int n2, final boolean b) {
        final agza m = m(ahnh, n, afcr, n2);
        if (b) {
            final agza builder = ((agzi)ahol.a).createBuilder();
            builder.copyOnWrite();
            final ahol ahol = (ahol)builder.instance;
            c.getClass();
            ahol.b |= 0x1;
            ahol.c = c;
            builder.copyOnWrite();
            final ahol ahol2 = (ahol)builder.instance;
            ahol2.b |= 0x2;
            ahol2.d = false;
            final ahol f = (ahol)builder.build();
            m.copyOnWrite();
            final ahom ahom = (ahom)m.instance;
            final ahom a = ahom.a;
            f.getClass();
            ahom.f = f;
            ahom.b |= 0x8;
        }
        return (ahom)m.build();
    }
    
    public static ahon g(final sga sga, final agza agza) {
        final ahnj a = sga.a();
        agza.copyOnWrite();
        final ahon ahon = (ahon)agza.instance;
        final ahon a2 = ahon.a;
        ahon.e = a.al;
        ahon.b |= 0x1;
        if (sga.d()) {
            agza.copyOnWrite();
            final ahon ahon2 = (ahon)agza.instance;
            ahon2.b |= 0x10;
            ahon2.g = true;
        }
        final boolean b = sga instanceof sds;
        if (b || sga instanceof sfi) {
            final agza builder = ((agzi)ahoo.a).createBuilder();
            if (b) {
                final String e = ((sds)sga).e();
                builder.copyOnWrite();
                final ahoo ahoo = (ahoo)builder.instance;
                ahoo.b = 2;
                ahoo.c = e;
            }
            if (sga instanceof sfi) {
                final String c = ((sfi)sga).c();
                builder.copyOnWrite();
                final ahoo ahoo2 = (ahoo)builder.instance;
                ahoo2.b = 1;
                ahoo2.c = c;
            }
            final ahoo d = (ahoo)builder.build();
            agza.copyOnWrite();
            final ahon ahon3 = (ahon)agza.instance;
            d.getClass();
            ahon3.d = d;
            ahon3.c = 4;
        }
        return (ahon)agza.build();
    }
    
    public static agza h(final ahne ahne, final int n, final afdu afdu) {
        final agza builder = ((agzi)ahod.a).createBuilder();
        ahne a = ahne;
        if (ahne == null) {
            a = ahne.a;
        }
        builder.copyOnWrite();
        final ahod ahod = (ahod)builder.instance;
        ahod.c = a.aO;
        ahod.b |= 0x1;
        final ahnd ahnd = (ahnd)rxh.b.get((Object)n);
        builder.copyOnWrite();
        final ahod ahod2 = (ahod)builder.instance;
        ahod2.e = ahnd.f;
        ahod2.b |= 0x4;
        final afie k = afdu.k();
        while (((Iterator)k).hasNext()) {
            final ahnj a2 = ((sga)((Iterator)k).next()).a();
            builder.copyOnWrite();
            final ahod ahod3 = (ahod)builder.instance;
            final agzq f = ahod3.f;
            if (!f.c()) {
                ahod3.f = agzi.mutableCopy(f);
            }
            ahod3.f.g(a2.al);
        }
        return builder;
    }
    
    public static ggc i(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       mwb.a:Lmwa;
        //     4: ldc_w           "com.google.android.gms.ads.dynamite"
        //     7: invokestatic    mwb.e:(Landroid/content/Context;Lmwa;Ljava/lang/String;)Lmwb;
        //    10: astore_2       
        //    11: aload_2        
        //    12: ldc_w           "com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"
        //    15: invokevirtual   mwb.d:(Ljava/lang/String;)Landroid/os/IBinder;
        //    18: astore_2       
        //    19: aload_2        
        //    20: ifnonnull       28
        //    23: aconst_null    
        //    24: astore_2       
        //    25: goto            62
        //    28: aload_2        
        //    29: ldc_w           "com.google.android.gms.gass.internal.clearcut.IGassClearcut"
        //    32: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    37: astore_3       
        //    38: aload_3        
        //    39: instanceof      Lmxv;
        //    42: ifeq            53
        //    45: aload_3        
        //    46: checkcast       Lmxv;
        //    49: astore_2       
        //    50: goto            62
        //    53: new             Lmxt;
        //    56: dup            
        //    57: aload_2        
        //    58: invokespecial   mxt.<init>:(Landroid/os/IBinder;)V
        //    61: astore_2       
        //    62: aload_2        
        //    63: aload_0        
        //    64: invokestatic    mvm.a:(Ljava/lang/Object;)Lmvn;
        //    67: aload_1        
        //    68: invokeinterface mxv.i:(Lmvn;Ljava/lang/String;)V
        //    73: new             Lggc;
        //    76: dup            
        //    77: aload_2        
        //    78: invokespecial   ggc.<init>:(Lmxv;)V
        //    81: astore_0       
        //    82: aload_0        
        //    83: areturn        
        //    84: astore_1       
        //    85: new             Lmxn;
        //    88: astore_0       
        //    89: aload_0        
        //    90: aload_1        
        //    91: invokespecial   mxn.<init>:(Ljava/lang/Throwable;)V
        //    94: aload_0        
        //    95: athrow         
        //    96: astore_0       
        //    97: new             Lmxn;
        //   100: astore_1       
        //   101: aload_1        
        //   102: aload_0        
        //   103: invokespecial   mxn.<init>:(Ljava/lang/Throwable;)V
        //   106: aload_1        
        //   107: athrow         
        //   108: astore_0       
        //   109: new             Lggc;
        //   112: dup            
        //   113: new             Lmxu;
        //   116: dup            
        //   117: invokespecial   mxu.<init>:()V
        //   120: invokespecial   ggc.<init>:(Lmxv;)V
        //   123: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      11     84     96     Ljava/lang/Exception;
        //  11     19     96     108    Ljava/lang/Exception;
        //  28     50     96     108    Ljava/lang/Exception;
        //  53     62     96     108    Ljava/lang/Exception;
        //  62     82     108    124    Lmxn;
        //  62     82     108    124    Landroid/os/RemoteException;
        //  62     82     108    124    Ljava/lang/NullPointerException;
        //  62     82     108    124    Ljava/lang/SecurityException;
        //  85     96     96     108    Ljava/lang/Exception;
        //  97     108    108    124    Lmxn;
        //  97     108    108    124    Landroid/os/RemoteException;
        //  97     108    108    124    Ljava/lang/NullPointerException;
        //  97     108    108    124    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 66, Size: 66
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static agza m(final ahnh ahnh, final int n, final afcr afcr, final int e) {
        final agza builder = ((agzi)ahom.a).createBuilder();
        builder.copyOnWrite();
        final ahom ahom = (ahom)builder.instance;
        ahom.c = ahnh.t;
        ahom.b |= 0x1;
        final ahnd ahnd = (ahnd)rxh.b.get((Object)n);
        builder.copyOnWrite();
        final ahom ahom2 = (ahom)builder.instance;
        ahom2.g = ahnd.f;
        ahom2.b |= 0x20;
        if (!afcr.isEmpty()) {
            ahnj ahnj;
            if ((ahnj = ahnj.b(c((sga)afcr.get(0)).e)) == null) {
                ahnj = ahnj.a;
            }
            builder.copyOnWrite();
            final ahom ahom3 = (ahom)builder.instance;
            ahom3.d = ahnj.al;
            ahom3.b |= 0x2;
        }
        if (e != 1) {
            builder.copyOnWrite();
            final ahom ahom4 = (ahom)builder.instance;
            ahom4.b |= 0x4;
            ahom4.e = e;
        }
        return builder;
    }
    
    public final alek d(final sfh sfh, final String s, final ahne ahne, final int n, final ahjr ahjr) {
        final boolean e = this.e();
        final agza builder = ((agzi)alek.a).createBuilder();
        if (ahjr != null && (ahjr.b & 0x1) != 0x0) {
            final agyc c = ahjr.c;
            builder.copyOnWrite();
            final alek alek = (alek)builder.instance;
            c.getClass();
            alek.b |= 0x1000;
            alek.f = c;
        }
        final agza builder2 = ((agzi)ahnk.a).createBuilder();
        final ahom f = f(sfh.a, sfh.c(), sfh.c, sfh.d, sfh.a(), e);
        builder2.copyOnWrite();
        final ahnk ahnk = (ahnk)builder2.instance;
        f.getClass();
        ahnk.d = f;
        ahnk.b |= 0x2;
        final ahod a = a(s, ahne, n, e);
        builder2.copyOnWrite();
        final ahnk ahnk2 = (ahnk)builder2.instance;
        a.getClass();
        ahnk2.e = a;
        ahnk2.b |= 0x4;
        final ahnk e2 = (ahnk)builder2.build();
        builder.copyOnWrite();
        final alek alek2 = (alek)builder.instance;
        e2.getClass();
        alek2.e = e2;
        alek2.b |= 0x800;
        return (alek)builder.build();
    }
    
    public final boolean e() {
        if (!this.a) {
            final ahox c = qcv.C((arud)this.b);
            if (c == null || !c.c) {
                return false;
            }
        }
        return true;
    }
    
    public final ListenableFuture j(final Callable callable, final Executor executor) {
        return (ListenableFuture)new afsk((afci)this.b, this.a, executor, callable);
    }
    
    public final ListenableFuture k(final afrx afrx, final Executor executor) {
        return (ListenableFuture)new afsk((afci)this.b, this.a, executor, afrx);
    }
    
    public final ListenableFuture l(final Runnable runnable, final Executor executor) {
        return this.j((Callable)new cty(runnable, 6), executor);
    }
}
