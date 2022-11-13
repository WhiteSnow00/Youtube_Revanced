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

public final class Shell_HomeActivity extends evp implements aeou, aepm
{
    private evy m;
    private final aerz n;
    private boolean o;
    private Context p;
    private auo q;
    private boolean r;
    
    public Shell_HomeActivity() {
        this.n = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final evy n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_HomeActivity.m:Levy;
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
        //    43: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   evo.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   evo.aR:()Ljava/lang/Object;
        //    66: astore          9
        //    68: aload           9
        //    70: checkcast       Lesp;
        //    73: getfield        esp.b:Leqy;
        //    76: getfield        eqy.F:Latke;
        //    79: invokeinterface atke.a:()Ljava/lang/Object;
        //    84: checkcast       Ljava/util/concurrent/Executor;
        //    87: astore_3       
        //    88: aload           9
        //    90: checkcast       Lesp;
        //    93: getfield        esp.b:Leqy;
        //    96: getfield        eqy.w:Latke;
        //    99: invokeinterface atke.a:()Ljava/lang/Object;
        //   104: checkcast       Lvaf;
        //   107: astore_2       
        //   108: aload           9
        //   110: checkcast       Lesp;
        //   113: getfield        esp.d:Latke;
        //   116: invokeinterface atke.a:()Ljava/lang/Object;
        //   121: checkcast       Landroid/app/Activity;
        //   124: astore          4
        //   126: aload           4
        //   128: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_HomeActivity;
        //   131: ifeq            253
        //   134: aload           4
        //   136: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_HomeActivity;
        //   139: astore          8
        //   141: aload           8
        //   143: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   146: pop            
        //   147: aload           9
        //   149: checkcast       Lesp;
        //   152: getfield        esp.e:Latke;
        //   155: invokeinterface atke.a:()Ljava/lang/Object;
        //   160: checkcast       Laeij;
        //   163: astore          5
        //   165: aload           9
        //   167: checkcast       Lesp;
        //   170: getfield        esp.b:Leqy;
        //   173: astore          10
        //   175: aload           10
        //   177: getfield        eqy.lG:Latke;
        //   180: astore          6
        //   182: aload           10
        //   184: getfield        eqy.P:Latke;
        //   187: astore          4
        //   189: aload           10
        //   191: getfield        eqy.kz:Latke;
        //   194: astore          7
        //   196: aload           9
        //   198: checkcast       Lesp;
        //   201: getfield        esp.f:Latke;
        //   204: astore          9
        //   206: aload           10
        //   208: getfield        eqy.a:Lera;
        //   211: getfield        era.co:Latke;
        //   214: astore          11
        //   216: new             Levy;
        //   219: astore          10
        //   221: aload           10
        //   223: aload_3        
        //   224: aload_2        
        //   225: aload           8
        //   227: aload           5
        //   229: aload           6
        //   231: aload           4
        //   233: aload           7
        //   235: aload           9
        //   237: aload           11
        //   239: invokespecial   evy.<init>:(Ljava/util/concurrent/Executor;Lvaf;Lcom/google/android/apps/youtube/app/application/Shell_HomeActivity;Laeij;Latke;Latke;Latke;Latke;Latke;)V
        //   242: aload_0        
        //   243: aload           10
        //   245: putfield        com/google/android/apps/youtube/app/application/Shell_HomeActivity.m:Levy;
        //   248: aload_1        
        //   249: invokevirtual   aetf.close:()V
        //   252: return         
        //   253: new             Ljava/lang/IllegalStateException;
        //   256: astore_2       
        //   257: ldc             Levy;.class
        //   259: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   262: astore_3       
        //   263: aload           4
        //   265: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   268: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   271: astore          5
        //   273: new             Ljava/lang/StringBuilder;
        //   276: astore          4
        //   278: aload           4
        //   280: ldc             "Attempt to inject a Activity wrapper of type "
        //   282: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   285: aload           4
        //   287: aload_3        
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: aload           4
        //   294: ldc             ", but the wrapper available is of type: "
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: aload           4
        //   302: aload           5
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: pop            
        //   308: aload           4
        //   310: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: aload_2        
        //   317: aload           4
        //   319: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   322: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   325: aload_2        
        //   326: athrow         
        //   327: astore_2       
        //   328: goto            345
        //   331: astore_3       
        //   332: new             Ljava/lang/IllegalStateException;
        //   335: astore_2       
        //   336: aload_2        
        //   337: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   339: aload_3        
        //   340: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   343: aload_2        
        //   344: athrow         
        //   345: aload_1        
        //   346: invokevirtual   aetf.close:()V
        //   349: goto            358
        //   352: astore_1       
        //   353: aload_2        
        //   354: aload_1        
        //   355: invokestatic    fmy.h:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   358: aload_2        
        //   359: athrow         
        //   360: astore_1       
        //   361: aload_2        
        //   362: invokevirtual   aetf.close:()V
        //   365: goto            374
        //   368: astore_2       
        //   369: aload_1        
        //   370: aload_2        
        //   371: invokestatic    fmy.h:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
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
        final evy m = this.m;
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
        aeuz.c(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context p) {
        aeuz.b(this.p = p);
        super.attachBaseContext(p);
        this.p = null;
    }
    
    public final arku b() {
        return (arku)aeps.a((Activity)this);
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
        final aett b = this.n.b();
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
                fmy.h(t, t2);
            }
        }
    }
    
    public final int g() {
        return 0;
    }
    
    public final aui getLifecycle() {
        if (this.q == null) {
            this.q = (auo)new aepn((bu)this);
        }
        return (aui)this.q;
    }
    
    protected final Class i() {
        final c c = (c)this.n().d.a();
        return WatchWhileActivity.class;
    }
    
    public final void invalidateOptionsMenu() {
        final aett s = aeux.s();
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
                fmy.h(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        final evy n = this.n();
        if (!b) {
            final ajb ajb = (ajb)n.e.a();
            ((tgd)ajb.b).f((Object)new fgk());
            ((toj)ajb.a).s(16);
            ((ffe)ajb.c).a();
        }
        n.a.execute(new esl(n, 14));
        return true;
    }
    
    public final boolean m() {
        return true;
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aett q = this.n.q();
        try {
            super.onActivityResult(n, n2, intent);
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                fmy.h((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aett c = this.n.c();
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
                fmy.h(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aett r = this.n.r();
        try {
            super.onConfigurationChanged(configuration);
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t;
                fmy.h((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aett s = this.n.s();
        try {
            this.o = true;
            this.o();
            ((aepn)((dh)this).getLifecycle()).h(this.n);
            ((aepr)((evo)this).aR()).xU().i();
            super.onCreate(bundle);
            this.o = false;
            if (s != null) {
                s.close();
            }
        }
        finally {
            if (s != null) {
                try {
                    s.close();
                }
                finally {
                    final Throwable t;
                    fmy.h((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aett t = this.n.t();
        try {
            super.onCreatePanelMenu(n, menu);
            t.close();
            return true;
        }
        finally {
            try {
                t.close();
            }
            finally {
                final Throwable t2;
                fmy.h((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aett d = this.n.d();
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
                fmy.h(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajp ajp) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aett e = this.n.e(intent);
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
                    fmy.h((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aett u = this.n.u();
        try {
            final boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            u.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                fmy.h((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aett f = this.n.f();
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
                    fmy.h(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aett v = this.n.v();
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            v.close();
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                fmy.h((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aett w = this.n.w();
        try {
            super.onPostCreate(bundle);
            if (w != null) {
                w.close();
            }
        }
        finally {
            if (w != null) {
                try {
                    w.close();
                }
                finally {
                    final Throwable t;
                    fmy.h((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aett g = this.n.g();
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
                fmy.h(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aett s = aeux.s();
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
                fmy.h((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aett x = this.n.x();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            x.close();
        }
        finally {
            try {
                x.close();
            }
            finally {
                final Throwable t;
                fmy.h((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aett h = this.n.h();
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
                    fmy.h(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aett y = this.n.y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
            }
        }
        finally {
            if (y != null) {
                try {
                    y.close();
                }
                finally {
                    final Throwable t;
                    fmy.h((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aett i = this.n.i();
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
                    fmy.h(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aett j = this.n.j();
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
                    fmy.h(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aett k = this.n.k();
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
                fmy.h(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aett l = this.n.l();
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
                fmy.h(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (aefb.P(intent, this.getApplicationContext())) {
            aeun.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (aefb.P(intent, this.getApplicationContext())) {
            aeun.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
