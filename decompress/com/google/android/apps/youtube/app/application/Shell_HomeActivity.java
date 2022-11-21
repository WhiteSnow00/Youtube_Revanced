// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_HomeActivity extends evr implements aeqn, aerf
{
    private ewa m;
    private final aets n;
    private boolean o;
    private Context p;
    private auq q;
    private boolean r;
    
    public Shell_HomeActivity() {
        this.n = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewa n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_HomeActivity.m:Lewa;
        //     4: ifnonnull       386
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_HomeActivity.o:Z
        //    11: ifeq            376
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_HomeActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_HomeActivity.isFinishing:()Z
        //    25: ifeq            31
        //    28: goto            41
        //    31: new             Ljava/lang/IllegalStateException;
        //    34: dup            
        //    35: ldc             "createPeer() called after destroyed."
        //    37: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    40: athrow         
        //    41: ldc             "CreateComponent"
        //    43: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   evq.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aeux.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   evq.aR:()Ljava/lang/Object;
        //    66: astore          9
        //    68: aload           9
        //    70: checkcast       Lesr;
        //    73: getfield        esr.b:Lera;
        //    76: getfield        era.F:Latnb;
        //    79: invokeinterface atnb.a:()Ljava/lang/Object;
        //    84: checkcast       Ljava/util/concurrent/Executor;
        //    87: astore_2       
        //    88: aload           9
        //    90: checkcast       Lesr;
        //    93: getfield        esr.b:Lera;
        //    96: getfield        era.w:Latnb;
        //    99: invokeinterface atnb.a:()Ljava/lang/Object;
        //   104: checkcast       Lvbo;
        //   107: astore_3       
        //   108: aload           9
        //   110: checkcast       Lesr;
        //   113: getfield        esr.d:Latnb;
        //   116: invokeinterface atnb.a:()Ljava/lang/Object;
        //   121: checkcast       Landroid/app/Activity;
        //   124: astore          4
        //   126: aload           4
        //   128: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_HomeActivity;
        //   131: ifeq            253
        //   134: aload           4
        //   136: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_HomeActivity;
        //   139: astore          4
        //   141: aload           4
        //   143: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   146: pop            
        //   147: aload           9
        //   149: checkcast       Lesr;
        //   152: getfield        esr.e:Latnb;
        //   155: invokeinterface atnb.a:()Ljava/lang/Object;
        //   160: checkcast       Laekc;
        //   163: astore          6
        //   165: aload           9
        //   167: checkcast       Lesr;
        //   170: getfield        esr.b:Lera;
        //   173: astore          10
        //   175: aload           10
        //   177: getfield        era.kX:Latnb;
        //   180: astore          7
        //   182: aload           10
        //   184: getfield        era.P:Latnb;
        //   187: astore          8
        //   189: aload           10
        //   191: getfield        era.jR:Latnb;
        //   194: astore          5
        //   196: aload           9
        //   198: checkcast       Lesr;
        //   201: getfield        esr.f:Latnb;
        //   204: astore          9
        //   206: aload           10
        //   208: getfield        era.a:Lerc;
        //   211: getfield        erc.cp:Latnb;
        //   214: astore          11
        //   216: new             Lewa;
        //   219: astore          10
        //   221: aload           10
        //   223: aload_2        
        //   224: aload_3        
        //   225: aload           4
        //   227: aload           6
        //   229: aload           7
        //   231: aload           8
        //   233: aload           5
        //   235: aload           9
        //   237: aload           11
        //   239: invokespecial   ewa.<init>:(Ljava/util/concurrent/Executor;Lvbo;Lcom/google/android/apps/youtube/app/application/Shell_HomeActivity;Laekc;Latnb;Latnb;Latnb;Latnb;Latnb;)V
        //   242: aload_0        
        //   243: aload           10
        //   245: putfield        com/google/android/apps/youtube/app/application/Shell_HomeActivity.m:Lewa;
        //   248: aload_1        
        //   249: invokevirtual   aeux.close:()V
        //   252: return         
        //   253: new             Ljava/lang/IllegalStateException;
        //   256: astore_3       
        //   257: ldc             Lewa;.class
        //   259: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   262: astore_2       
        //   263: aload           4
        //   265: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   268: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   271: astore          4
        //   273: new             Ljava/lang/StringBuilder;
        //   276: astore          5
        //   278: aload           5
        //   280: ldc             "Attempt to inject a Activity wrapper of type "
        //   282: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   285: aload           5
        //   287: aload_2        
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: aload           5
        //   294: ldc             ", but the wrapper available is of type: "
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: aload           5
        //   302: aload           4
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: pop            
        //   308: aload           5
        //   310: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: aload_3        
        //   317: aload           5
        //   319: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   322: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   325: aload_3        
        //   326: athrow         
        //   327: astore_2       
        //   328: goto            345
        //   331: astore_2       
        //   332: new             Ljava/lang/IllegalStateException;
        //   335: astore_3       
        //   336: aload_3        
        //   337: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   339: aload_2        
        //   340: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   343: aload_3        
        //   344: athrow         
        //   345: aload_1        
        //   346: invokevirtual   aeux.close:()V
        //   349: goto            358
        //   352: astore_1       
        //   353: aload_2        
        //   354: aload_1        
        //   355: invokestatic    glg.x:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   358: aload_2        
        //   359: athrow         
        //   360: astore_1       
        //   361: aload_2        
        //   362: invokevirtual   aeux.close:()V
        //   365: goto            374
        //   368: astore_2       
        //   369: aload_1        
        //   370: aload_2        
        //   371: invokestatic    glg.x:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   374: aload_1        
        //   375: athrow         
        //   376: new             Ljava/lang/IllegalStateException;
        //   379: dup            
        //   380: ldc             "createPeer() called outside of onCreate"
        //   382: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   385: athrow         
        //   386: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     360    376    Any
        //  62     68     331    345    Ljava/lang/ClassCastException;
        //  62     68     327    360    Any
        //  68     248    327    360    Any
        //  253    327    327    360    Any
        //  332    345    327    360    Any
        //  345    349    352    358    Any
        //  361    365    368    374    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0345:
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
    
    public final /* bridge */ Object aN() {
        final ewa m = this.m;
        if (m == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.r) {
            return m;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.p;
        }
        agsk.ag(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context p) {
        agsk.af(this.p = p);
        super.attachBaseContext(p);
        this.p = null;
    }
    
    public final arno b() {
        return aerl.a((Activity)this);
    }
    
    public final int e() {
        this.n();
        return 3;
    }
    
    protected final int f() {
        this.n();
        return 67108864;
    }
    
    public final void finish() {
        final aevl b = this.n.b();
        try {
            super.finish();
            b.close();
        }
        finally {
            try {
                b.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    public final int g() {
        return 0;
    }
    
    public final auk getLifecycle() {
        if (this.q == null) {
            this.q = new aerg((bu)this);
        }
        return (auk)this.q;
    }
    
    protected final Class i() {
        final c c = (c)this.n().d.a();
        return WatchWhileActivity.class;
    }
    
    public final void invalidateOptionsMenu() {
        final aevl s = aewp.s();
        try {
            super.invalidateOptionsMenu();
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        final ewa n = this.n();
        if (!b) {
            final ajc ajc = (ajc)n.e.a();
            ((thg)ajc.b).f((Object)new fgn());
            ((tpj)ajc.a).s(16);
            ((ffh)ajc.c).a();
        }
        n.a.execute((Runnable)new esn(n, 14));
        return true;
    }
    
    public final boolean m() {
        return true;
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aevl r = this.n.r();
        try {
            super.onActivityResult(n, n2, intent);
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aevl c = this.n.c();
        try {
            super.onBackPressed();
            c.close();
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aevl s = this.n.s();
        try {
            super.onConfigurationChanged(configuration);
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aevl t = this.n.t();
        try {
            this.o = true;
            this.o();
            ((aerg)((dh)this).getLifecycle()).h(this.n);
            ((aerk)((evq)this).aR()).xT().i();
            super.onCreate(bundle);
            this.o = false;
            if (t != null) {
                t.close();
            }
        }
        finally {
            if (t != null) {
                try {
                    t.close();
                }
                finally {
                    final Throwable t2;
                    glg.x((Throwable)bundle, t2);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aevl u = this.n.u();
        try {
            super.onCreatePanelMenu(n, menu);
            u.close();
            return true;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)menu, t);
            }
        }
    }
    
    protected final void onDestroy() {
        final aevl d = this.n.d();
        try {
            super.onDestroy();
            this.r = true;
            d.close();
        }
        finally {
            try {
                d.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajq ajq) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aevl e = this.n.e(intent);
        try {
            super.onNewIntent(intent);
            if (e != null) {
                e.close();
            }
        }
        finally {
            if (e != null) {
                try {
                    e.close();
                }
                finally {
                    final Throwable t;
                    glg.x((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aevl v = this.n.v();
        try {
            final boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            v.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aevl f = this.n.f();
        try {
            super.onPause();
            if (f != null) {
                f.close();
            }
        }
        finally {
            if (f != null) {
                try {
                    f.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    glg.x(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aevl w = this.n.w();
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            w.close();
        }
        finally {
            try {
                w.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aevl x = this.n.x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                x.close();
            }
        }
        finally {
            if (x != null) {
                try {
                    x.close();
                }
                finally {
                    final Throwable t;
                    glg.x((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aevl g = this.n.g();
        try {
            super.onPostResume();
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aevl s = aewp.s();
        try {
            final boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            s.close();
            return onPrepareOptionsMenu;
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aevl y = this.n.y();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            y.close();
        }
        finally {
            try {
                y.close();
            }
            finally {
                final Throwable t;
                glg.x((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aevl h = this.n.h();
        try {
            super.onResume();
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    glg.x(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aevl z = this.n.z();
        try {
            super.onSaveInstanceState(bundle);
            if (z != null) {
                z.close();
            }
        }
        finally {
            if (z != null) {
                try {
                    z.close();
                }
                finally {
                    final Throwable t;
                    glg.x((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aevl i = this.n.i();
        try {
            super.onStart();
            if (i != null) {
                i.close();
            }
        }
        finally {
            if (i != null) {
                try {
                    i.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    glg.x(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aevl j = this.n.j();
        try {
            super.onStop();
            if (j != null) {
                j.close();
            }
        }
        finally {
            if (j != null) {
                try {
                    j.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    glg.x(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aevl k = this.n.k();
        try {
            final boolean onSupportNavigateUp = super.onSupportNavigateUp();
            k.close();
            return onSupportNavigateUp;
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aevl l = this.n.l();
        try {
            super.onUserInteraction();
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                glg.x(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (adme.ah(intent, this.getApplicationContext())) {
            aewf.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (adme.ah(intent, this.getApplicationContext())) {
            aewf.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
