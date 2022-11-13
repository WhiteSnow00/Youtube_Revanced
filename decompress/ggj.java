import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.content.Context;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggj
{
    public final boolean a;
    public final Object b;
    
    public ggj(final arwh b, final oby oby, final rpa rpa, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = (new Random(oby.c()).nextFloat() < rpa.a());
    }
    
    public ggj(final atke b, final xdx xdx) {
        this.b = b;
        this.a = xdx.b.equals("m");
    }
    
    public ggj(final ggi b, final vai vai) {
        this.b = b;
        this.a = vai.X();
    }
    
    public ggj(final jcg b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public ggj(final mza b) {
        this.b = b;
        this.a = (b != null);
    }
    
    public ggj(final oci b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public ggj(final uwb uwb, final vai vai) {
        this.a = vai.cT();
        this.b = uwb.A().L((asjr)new uxe(this, 0, (byte[])null, (byte[])null, (byte[])null)).W((Object)1);
    }
    
    public ggj(final boolean a, final afeq b) {
        this.a = a;
        this.b = b;
    }
    
    public static ahqb a(final String c, final ahpc ahpc, final int n, final boolean b) {
        final ahaz h = h(ahpc, n, (afft)afiq.a);
        if (b) {
            final ahaz builder = ((ahbh)ahqa.a).createBuilder();
            builder.copyOnWrite();
            final ahqa ahqa = (ahqa)builder.instance;
            c.getClass();
            ahqa.b |= 0x1;
            ahqa.c = c;
            final ahqa d = (ahqa)builder.build();
            h.copyOnWrite();
            final ahqb ahqb = (ahqb)h.instance;
            final ahqb a = ahqb.a;
            d.getClass();
            ahqb.d = d;
            ahqb.b |= 0x2;
        }
        return (ahqb)h.build();
    }
    
    public static ahqk b(final shm shm, final boolean d, final boolean b) {
        final ahaz m = m(shm.c(), shm.c, shm.d, shm.a());
        if (b) {
            final ahaz builder = ((ahbh)ahqj.a).createBuilder();
            final String a = shm.a;
            builder.copyOnWrite();
            final ahqj ahqj = (ahqj)builder.instance;
            ahqj.b |= 0x1;
            ahqj.c = a;
            final afeq d2 = shm.d;
            final int c = ((afih)d2).c;
            final int n = 0;
            if (c > 0) {
                final ahql c2 = c(((List<sif>)d2).get(0));
                builder.copyOnWrite();
                final ahqj ahqj2 = (ahqj)builder.instance;
                c2.getClass();
                ahqj2.e = c2;
                ahqj2.b |= 0x4;
            }
            final afeq e = shm.e;
            for (int c3 = ((afih)e).c, i = 0; i < c3; ++i) {
                final ahql c4 = c(((List<sif>)e).get(i));
                builder.copyOnWrite();
                final ahqj ahqj3 = (ahqj)builder.instance;
                c4.getClass();
                final ahbx f = ahqj3.f;
                if (!f.c()) {
                    ahqj3.f = ahbh.mutableCopy(f);
                }
                ahqj3.f.add((Object)c4);
            }
            final afeq f2 = shm.f;
            for (int c5 = ((afih)f2).c, j = n; j < c5; ++j) {
                final ahql c6 = c(((List<sif>)f2).get(j));
                builder.copyOnWrite();
                final ahqj ahqj4 = (ahqj)builder.instance;
                c6.getClass();
                final ahbx g = ahqj4.g;
                if (!g.c()) {
                    ahqj4.g = ahbh.mutableCopy(g);
                }
                ahqj4.g.add((Object)c6);
            }
            builder.copyOnWrite();
            final ahqj ahqj5 = (ahqj)builder.instance;
            ahqj5.b |= 0x2;
            ahqj5.d = d;
            final ahqj f3 = (ahqj)builder.build();
            m.copyOnWrite();
            final ahqk ahqk = (ahqk)m.instance;
            final ahqk a2 = ahqk.a;
            f3.getClass();
            ahqk.f = f3;
            ahqk.b |= 0x8;
        }
        return (ahqk)m.build();
    }
    
    public static ahql c(final sif sif) {
        return g(sif, ((ahbh)ahql.a).createBuilder());
    }
    
    public static ahqk f(final String c, final ahpf ahpf, final int n, final afeq afeq, final int n2, final boolean b) {
        final ahaz m = m(ahpf, n, afeq, n2);
        if (b) {
            final ahaz builder = ((ahbh)ahqj.a).createBuilder();
            builder.copyOnWrite();
            final ahqj ahqj = (ahqj)builder.instance;
            c.getClass();
            ahqj.b |= 0x1;
            ahqj.c = c;
            builder.copyOnWrite();
            final ahqj ahqj2 = (ahqj)builder.instance;
            ahqj2.b |= 0x2;
            ahqj2.d = false;
            final ahqj f = (ahqj)builder.build();
            m.copyOnWrite();
            final ahqk ahqk = (ahqk)m.instance;
            final ahqk a = ahqk.a;
            f.getClass();
            ahqk.f = f;
            ahqk.b |= 0x8;
        }
        return (ahqk)m.build();
    }
    
    public static ahql g(final sif sif, final ahaz ahaz) {
        final ahph a = sif.a();
        ahaz.copyOnWrite();
        final ahql ahql = (ahql)ahaz.instance;
        final ahql a2 = ahql.a;
        ahql.e = a.al;
        ahql.b |= 0x1;
        if (sif.d()) {
            ahaz.copyOnWrite();
            final ahql ahql2 = (ahql)ahaz.instance;
            ahql2.b |= 0x10;
            ahql2.g = true;
        }
        final boolean b = sif instanceof sfx;
        if (b || sif instanceof shn) {
            final ahaz builder = ((ahbh)ahqm.a).createBuilder();
            if (b) {
                final String e = ((sfx)sif).e();
                builder.copyOnWrite();
                final ahqm ahqm = (ahqm)builder.instance;
                ahqm.b = 2;
                ahqm.c = e;
            }
            if (sif instanceof shn) {
                final String c = ((shn)sif).c();
                builder.copyOnWrite();
                final ahqm ahqm2 = (ahqm)builder.instance;
                ahqm2.b = 1;
                ahqm2.c = c;
            }
            final ahqm d = (ahqm)builder.build();
            ahaz.copyOnWrite();
            final ahql ahql3 = (ahql)ahaz.instance;
            d.getClass();
            ahql3.d = d;
            ahql3.c = 4;
        }
        return (ahql)ahaz.build();
    }
    
    public static ahaz h(final ahpc ahpc, final int n, final afft afft) {
        final ahaz builder = ((ahbh)ahqb.a).createBuilder();
        ahpc a = ahpc;
        if (ahpc == null) {
            a = ahpc.a;
        }
        builder.copyOnWrite();
        final ahqb ahqb = (ahqb)builder.instance;
        ahqb.c = a.aP;
        ahqb.b |= 0x1;
        final ahpb ahpb = (ahpb)rzm.b.get((Object)n);
        builder.copyOnWrite();
        final ahqb ahqb2 = (ahqb)builder.instance;
        ahqb2.e = ahpb.f;
        ahqb2.b |= 0x4;
        final afke k = afft.k();
        while (k.hasNext()) {
            final ahph a2 = k.next().a();
            builder.copyOnWrite();
            final ahqb ahqb3 = (ahqb)builder.instance;
            final ahbp f = ahqb3.f;
            if (!f.c()) {
                ahqb3.f = ahbh.mutableCopy(f);
            }
            ahqb3.f.g(a2.al);
        }
        return builder;
    }
    
    public static ggj i(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       mxg.a:Lmxf;
        //     4: ldc_w           "com.google.android.gms.ads.dynamite"
        //     7: invokestatic    mxg.e:(Landroid/content/Context;Lmxf;Ljava/lang/String;)Lmxg;
        //    10: astore_2       
        //    11: aload_2        
        //    12: ldc_w           "com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"
        //    15: invokevirtual   mxg.d:(Ljava/lang/String;)Landroid/os/IBinder;
        //    18: astore_3       
        //    19: aload_3        
        //    20: ifnonnull       28
        //    23: aconst_null    
        //    24: astore_2       
        //    25: goto            62
        //    28: aload_3        
        //    29: ldc_w           "com.google.android.gms.gass.internal.clearcut.IGassClearcut"
        //    32: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    37: astore_2       
        //    38: aload_2        
        //    39: instanceof      Lmza;
        //    42: ifeq            53
        //    45: aload_2        
        //    46: checkcast       Lmza;
        //    49: astore_2       
        //    50: goto            62
        //    53: new             Lmyy;
        //    56: dup            
        //    57: aload_3        
        //    58: invokespecial   myy.<init>:(Landroid/os/IBinder;)V
        //    61: astore_2       
        //    62: aload_2        
        //    63: aload_0        
        //    64: invokestatic    mwr.a:(Ljava/lang/Object;)Lmws;
        //    67: aload_1        
        //    68: invokeinterface mza.i:(Lmws;Ljava/lang/String;)V
        //    73: new             Lggj;
        //    76: dup            
        //    77: aload_2        
        //    78: invokespecial   ggj.<init>:(Lmza;)V
        //    81: astore_0       
        //    82: aload_0        
        //    83: areturn        
        //    84: astore_0       
        //    85: new             Lmys;
        //    88: astore_1       
        //    89: aload_1        
        //    90: aload_0        
        //    91: invokespecial   mys.<init>:(Ljava/lang/Throwable;)V
        //    94: aload_1        
        //    95: athrow         
        //    96: astore_0       
        //    97: new             Lmys;
        //   100: astore_1       
        //   101: aload_1        
        //   102: aload_0        
        //   103: invokespecial   mys.<init>:(Ljava/lang/Throwable;)V
        //   106: aload_1        
        //   107: athrow         
        //   108: astore_0       
        //   109: new             Lggj;
        //   112: dup            
        //   113: new             Lmyz;
        //   116: dup            
        //   117: invokespecial   myz.<init>:()V
        //   120: invokespecial   ggj.<init>:(Lmza;)V
        //   123: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      11     84     96     Ljava/lang/Exception;
        //  11     19     96     108    Ljava/lang/Exception;
        //  28     50     96     108    Ljava/lang/Exception;
        //  53     62     96     108    Ljava/lang/Exception;
        //  62     82     108    124    Lmys;
        //  62     82     108    124    Landroid/os/RemoteException;
        //  62     82     108    124    Ljava/lang/NullPointerException;
        //  62     82     108    124    Ljava/lang/SecurityException;
        //  85     96     96     108    Ljava/lang/Exception;
        //  97     108    108    124    Lmys;
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
    
    private static ahaz m(final ahpf ahpf, final int n, final afeq afeq, final int e) {
        final ahaz builder = ((ahbh)ahqk.a).createBuilder();
        builder.copyOnWrite();
        final ahqk ahqk = (ahqk)builder.instance;
        ahqk.c = ahpf.t;
        ahqk.b |= 0x1;
        final ahpb ahpb = (ahpb)rzm.b.get((Object)n);
        builder.copyOnWrite();
        final ahqk ahqk2 = (ahqk)builder.instance;
        ahqk2.g = ahpb.f;
        ahqk2.b |= 0x20;
        if (!afeq.isEmpty()) {
            ahph ahph;
            if ((ahph = ahph.b(c((sif)afeq.get(0)).e)) == null) {
                ahph = ahph.a;
            }
            builder.copyOnWrite();
            final ahqk ahqk3 = (ahqk)builder.instance;
            ahqk3.d = ahph.al;
            ahqk3.b |= 0x2;
        }
        if (e != 1) {
            builder.copyOnWrite();
            final ahqk ahqk4 = (ahqk)builder.instance;
            ahqk4.b |= 0x4;
            ahqk4.e = e;
        }
        return builder;
    }
    
    public final algn d(final shm shm, final String s, final ahpc ahpc, final int n, final ahlp ahlp) {
        final boolean e = this.e();
        final ahaz builder = ((ahbh)algn.a).createBuilder();
        if (ahlp != null && (ahlp.b & 0x1) != 0x0) {
            final ahab c = ahlp.c;
            builder.copyOnWrite();
            final algn algn = (algn)builder.instance;
            c.getClass();
            algn.b |= 0x1000;
            algn.f = c;
        }
        final ahaz builder2 = ((ahbh)ahpi.a).createBuilder();
        final ahqk f = f(shm.a, shm.c(), shm.c, shm.d, shm.a(), e);
        builder2.copyOnWrite();
        final ahpi ahpi = (ahpi)builder2.instance;
        f.getClass();
        ahpi.d = f;
        ahpi.b |= 0x2;
        final ahqb a = a(s, ahpc, n, e);
        builder2.copyOnWrite();
        final ahpi ahpi2 = (ahpi)builder2.instance;
        a.getClass();
        ahpi2.e = a;
        ahpi2.b |= 0x4;
        final ahpi e2 = (ahpi)builder2.build();
        builder.copyOnWrite();
        final algn algn2 = (algn)builder.instance;
        e2.getClass();
        algn2.e = e2;
        algn2.b |= 0x800;
        return (algn)builder.build();
    }
    
    public final boolean e() {
        if (!this.a) {
            final ahqv y = qdw.y((arwh)this.b);
            if (y == null || !y.c) {
                return false;
            }
        }
        return true;
    }
    
    public final ListenableFuture j(final Callable callable, final Executor executor) {
        return (ListenableFuture)new aful((afeh)this.b, this.a, executor, callable);
    }
    
    public final ListenableFuture k(final afty afty, final Executor executor) {
        return (ListenableFuture)new aful((afeh)this.b, this.a, executor, afty);
    }
    
    public final ListenableFuture l(final Runnable runnable, final Executor executor) {
        return this.j((Callable)new ctz(runnable, 6), executor);
    }
}
