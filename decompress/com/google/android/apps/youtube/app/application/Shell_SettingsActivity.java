// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_SettingsActivity extends evv implements aeqn, aerf
{
    private ewe m;
    private final aets n;
    private boolean o;
    private Context p;
    private auq q;
    private boolean r;
    
    public Shell_SettingsActivity() {
        this.n = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewe n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.m:Lewe;
        //     4: ifnonnull       336
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.o:Z
        //    11: ifeq            326
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_SettingsActivity.isFinishing:()Z
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
        //    66: astore          6
        //    68: aload           6
        //    70: checkcast       Lesr;
        //    73: getfield        esr.b:Lera;
        //    76: getfield        era.a:Lerc;
        //    79: invokevirtual   erc.L:()Ljava/lang/Object;
        //    82: astore_2       
        //    83: aload           6
        //    85: checkcast       Lesr;
        //    88: getfield        esr.d:Latnb;
        //    91: invokeinterface atnb.a:()Ljava/lang/Object;
        //    96: checkcast       Landroid/app/Activity;
        //    99: astore_3       
        //   100: aload_3        
        //   101: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_SettingsActivity;
        //   104: ifeq            208
        //   107: aload_3        
        //   108: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_SettingsActivity;
        //   111: astore          4
        //   113: aload           4
        //   115: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   118: pop            
        //   119: aload           6
        //   121: checkcast       Lesr;
        //   124: getfield        esr.e:Latnb;
        //   127: invokeinterface atnb.a:()Ljava/lang/Object;
        //   132: checkcast       Laekc;
        //   135: astore          5
        //   137: aload           6
        //   139: checkcast       Lesr;
        //   142: getfield        esr.b:Lera;
        //   145: getfield        era.a:Lerc;
        //   148: getfield        erc.cp:Latnb;
        //   151: invokeinterface atnb.a:()Ljava/lang/Object;
        //   156: checkcast       Lsaw;
        //   159: astore_3       
        //   160: aload           6
        //   162: checkcast       Lesr;
        //   165: invokevirtual   esr.yJ:()Lsrr;
        //   168: astore          6
        //   170: new             Lewe;
        //   173: astore          7
        //   175: aload           7
        //   177: aload_2        
        //   178: checkcast       Lbx;
        //   181: aload           4
        //   183: aload           5
        //   185: aload_3        
        //   186: aload           6
        //   188: aconst_null    
        //   189: aconst_null    
        //   190: aconst_null    
        //   191: aconst_null    
        //   192: aconst_null    
        //   193: aconst_null    
        //   194: invokespecial   ewe.<init>:(Lbx;Lcom/google/android/apps/youtube/app/application/Shell_SettingsActivity;Laekc;Lsaw;Lsrr;[B[B[B[B[B[B)V
        //   197: aload_0        
        //   198: aload           7
        //   200: putfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.m:Lewe;
        //   203: aload_1        
        //   204: invokevirtual   aeux.close:()V
        //   207: return         
        //   208: new             Ljava/lang/IllegalStateException;
        //   211: astore          4
        //   213: ldc             Lewe;.class
        //   215: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   218: astore_2       
        //   219: aload_3        
        //   220: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   223: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   226: astore          5
        //   228: new             Ljava/lang/StringBuilder;
        //   231: astore_3       
        //   232: aload_3        
        //   233: ldc             "Attempt to inject a Activity wrapper of type "
        //   235: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   238: aload_3        
        //   239: aload_2        
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: pop            
        //   244: aload_3        
        //   245: ldc             ", but the wrapper available is of type: "
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   250: pop            
        //   251: aload_3        
        //   252: aload           5
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload_3        
        //   259: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: pop            
        //   265: aload           4
        //   267: aload_3        
        //   268: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   271: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   274: aload           4
        //   276: athrow         
        //   277: astore_2       
        //   278: goto            295
        //   281: astore_3       
        //   282: new             Ljava/lang/IllegalStateException;
        //   285: astore_2       
        //   286: aload_2        
        //   287: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   289: aload_3        
        //   290: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   293: aload_2        
        //   294: athrow         
        //   295: aload_1        
        //   296: invokevirtual   aeux.close:()V
        //   299: goto            308
        //   302: astore_1       
        //   303: aload_2        
        //   304: aload_1        
        //   305: invokestatic    gag.k:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   308: aload_2        
        //   309: athrow         
        //   310: astore_1       
        //   311: aload_2        
        //   312: invokevirtual   aeux.close:()V
        //   315: goto            324
        //   318: astore_2       
        //   319: aload_1        
        //   320: aload_2        
        //   321: invokestatic    gag.k:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   324: aload_1        
        //   325: athrow         
        //   326: new             Ljava/lang/IllegalStateException;
        //   329: dup            
        //   330: ldc             "createPeer() called outside of onCreate"
        //   332: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   335: athrow         
        //   336: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     310    326    Any
        //  62     68     281    295    Ljava/lang/ClassCastException;
        //  62     68     277    310    Any
        //  68     203    277    310    Any
        //  208    277    277    310    Any
        //  282    295    277    310    Any
        //  295    299    302    308    Any
        //  311    315    318    324    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0295:
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
        final ewe m = this.m;
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
        return 9;
    }
    
    protected final int f() {
        return 536870912;
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
                gag.k(t, t2);
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
        final bx a = this.n().a;
        return SettingsActivity.class;
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
                gag.k(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        this.n();
        return false;
    }
    
    public final boolean m() {
        this.n();
        return false;
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
                gag.k((Throwable)intent, t);
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
                gag.k(t, t2);
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
                gag.k((Throwable)configuration, t);
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
                    gag.k((Throwable)bundle, t2);
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
                gag.k((Throwable)menu, t);
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
                gag.k(t, t2);
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
                    gag.k((Throwable)intent, t);
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
                gag.k((Throwable)menuItem, t);
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
                    gag.k(t, t2);
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
                gag.k((Throwable)configuration, t);
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
                    gag.k((Throwable)bundle, t);
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
                gag.k(t, t2);
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
                gag.k((Throwable)menu, t);
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
                gag.k((Throwable)(Object)array, t);
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
                    gag.k(t, t2);
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
                    gag.k((Throwable)bundle, t);
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
                    gag.k(t, t2);
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
                    gag.k(t, t2);
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
                gag.k(t, t2);
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
                gag.k(t, t2);
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
