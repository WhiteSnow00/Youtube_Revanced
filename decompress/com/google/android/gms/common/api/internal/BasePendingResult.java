// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.lang.ref.WeakReference;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public abstract class BasePendingResult extends mpy
{
    public static final ThreadLocal e;
    private final CountDownLatch a;
    private final ArrayList b;
    private mqc c;
    private final AtomicReference d;
    public final Object f;
    protected final mqv g;
    public mqb h;
    public boolean i;
    public mtl j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private mqw mResultGuardian;
    private boolean n;
    private volatile mqd o;
    
    static {
        e = (ThreadLocal)new mqu();
    }
    
    @Deprecated
    BasePendingResult() {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new mqv(Looper.getMainLooper());
        new WeakReference(null);
    }
    
    @Deprecated
    protected BasePendingResult(final Looper looper) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new mqv(looper);
        new WeakReference(null);
    }
    
    protected BasePendingResult(final mpv mpv) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        Looper looper;
        if (mpv != null) {
            looper = ((mrh)mpv).a.A;
        }
        else {
            looper = Looper.getMainLooper();
        }
        this.g = new mqv(looper);
        new WeakReference(mpv);
    }
    
    private final void c(final mqb h) {
        this.h = h;
        this.k = h.a();
        this.j = null;
        this.a.countDown();
        if (this.m) {
            this.c = null;
        }
        else {
            final mqc c = this.c;
            if (c == null) {
                if (this.h instanceof mpz) {
                    this.mResultGuardian = new mqw(this);
                }
            }
            else {
                this.g.removeMessages(2);
                this.g.a(c, this.q());
            }
        }
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            ((mpx)b.get(i)).a(this.k);
        }
        this.b.clear();
    }
    
    public static void m(final mqb mqb) {
        if (mqb instanceof mpz) {
            try {
                ((mpz)mqb).b();
            }
            catch (final RuntimeException ex) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(mqb))), (Throwable)ex);
            }
        }
    }
    
    private final mqb q() {
        Object f = this.f;
        synchronized (f) {
            kgk.aU(this.l ^ true, (Object)"Result has already been consumed.");
            kgk.aU(this.p(), (Object)"Result is not ready.");
            final mqb h = this.h;
            this.h = null;
            this.c = null;
            this.l = true;
            monitorexit(f);
            f = this.d.getAndSet(null);
            if (f != null) {
                ((msg)f).a();
            }
            kgk.aL((Object)h);
            return h;
        }
    }
    
    protected abstract mqb a(final Status p0);
    
    @Override
    public final void e(final mpx mpx) {
        kgk.aN(mpx != null, (Object)"Callback cannot be null.");
        synchronized (this.f) {
            if (this.p()) {
                mpx.a(this.k);
            }
            else {
                this.b.add(mpx);
            }
        }
    }
    
    @Override
    public final void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/common/api/internal/BasePendingResult.f:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/api/internal/BasePendingResult.m:Z
        //    11: ifne            68
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/internal/BasePendingResult.l:Z
        //    18: ifeq            24
        //    21: goto            68
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/common/api/internal/BasePendingResult.j:Lmtl;
        //    28: astore_2       
        //    29: aload_2        
        //    30: ifnull          42
        //    33: aload_2        
        //    34: iconst_2       
        //    35: aload_2        
        //    36: invokevirtual   eny.qQ:()Landroid/os/Parcel;
        //    39: invokevirtual   eny.qT:(ILandroid/os/Parcel;)V
        //    42: aload_0        
        //    43: getfield        com/google/android/gms/common/api/internal/BasePendingResult.h:Lmqb;
        //    46: invokestatic    com/google/android/gms/common/api/internal/BasePendingResult.m:(Lmqb;)V
        //    49: aload_0        
        //    50: iconst_1       
        //    51: putfield        com/google/android/gms/common/api/internal/BasePendingResult.m:Z
        //    54: aload_0        
        //    55: aload_0        
        //    56: getstatic       com/google/android/gms/common/api/Status.e:Lcom/google/android/gms/common/api/Status;
        //    59: invokevirtual   com/google/android/gms/common/api/internal/BasePendingResult.a:(Lcom/google/android/gms/common/api/Status;)Lmqb;
        //    62: invokespecial   com/google/android/gms/common/api/internal/BasePendingResult.c:(Lmqb;)V
        //    65: aload_1        
        //    66: monitorexit    
        //    67: return         
        //    68: aload_1        
        //    69: monitorexit    
        //    70: return         
        //    71: astore_2       
        //    72: aload_1        
        //    73: monitorexit    
        //    74: aload_2        
        //    75: athrow         
        //    76: astore_2       
        //    77: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      21     71     76     Any
        //  24     29     71     76     Any
        //  33     42     76     80     Landroid/os/RemoteException;
        //  33     42     71     76     Any
        //  42     67     71     76     Any
        //  68     70     71     76     Any
        //  72     74     71     76     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    @Override
    public final void g(final mqc c) {
        final Object f = this.f;
        monitorenter(f);
        Label_0019: {
            if (c != null) {
                break Label_0019;
            }
            try {
                this.c = null;
                return;
                kgk.aU(this.l ^ true, (Object)"Result has already been consumed.");
                kgk.aU(true, (Object)"Cannot set callbacks if then() has been called.");
                iftrue(Label_0046:)(!this.o());
                return;
                while (true) {
                    this.g.a(c, this.q());
                    return;
                    Label_0046: {
                        iftrue(Label_0068:)(!this.p());
                    }
                    continue;
                }
                Label_0068: {
                    this.c = c;
                }
            }
            finally {
                monitorexit(f);
            }
        }
    }
    
    @Override
    public final mqb h(final TimeUnit timeUnit) {
        kgk.aU(this.l ^ true, (Object)"Result has already been consumed.");
        kgk.aU(true, (Object)"Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                this.l(Status.d);
            }
        }
        catch (final InterruptedException ex) {
            this.l(Status.b);
        }
        kgk.aU(this.p(), (Object)"Result is not ready.");
        return this.q();
    }
    
    @Override
    public final void i(final mqc c, final TimeUnit timeUnit) {
        synchronized (this.f) {
            kgk.aU(this.l ^ true, (Object)"Result has already been consumed.");
            kgk.aU(true, (Object)"Cannot set callbacks if then() has been called.");
            if (this.o()) {
                return;
            }
            if (this.p()) {
                this.g.a(c, this.q());
            }
            else {
                this.c = c;
                final mqv g = this.g;
                g.sendMessageDelayed(g.obtainMessage(2, (Object)this), timeUnit.toMillis(3L));
            }
        }
    }
    
    @Deprecated
    public final void l(final Status status) {
        synchronized (this.f) {
            if (!this.p()) {
                this.n(this.a(status));
                this.n = true;
            }
        }
    }
    
    public final void n(final mqb mqb) {
        synchronized (this.f) {
            if (!this.n && !this.m) {
                this.p();
                kgk.aU(this.p() ^ true, (Object)"Results have already been set");
                kgk.aU(this.l ^ true, (Object)"Result has already been consumed");
                this.c(mqb);
                return;
            }
            m(mqb);
        }
    }
    
    public final boolean o() {
        synchronized (this.f) {
            return this.m;
        }
    }
    
    public final boolean p() {
        return this.a.getCount() == 0L;
    }
}
