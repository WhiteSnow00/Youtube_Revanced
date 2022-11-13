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

public final class Shell_SettingsActivity extends evt implements aeou, aepm
{
    private ewc m;
    private final aerz n;
    private boolean o;
    private Context p;
    private auo q;
    private boolean r;
    
    public Shell_SettingsActivity() {
        this.n = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewc n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.m:Lewc;
        //     4: ifnonnull       334
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.o:Z
        //    11: ifeq            324
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
        //    66: astore          6
        //    68: aload           6
        //    70: checkcast       Lesp;
        //    73: getfield        esp.b:Leqy;
        //    76: getfield        eqy.a:Lera;
        //    79: invokevirtual   era.K:()Ljava/lang/Object;
        //    82: astore_2       
        //    83: aload           6
        //    85: checkcast       Lesp;
        //    88: getfield        esp.d:Latke;
        //    91: invokeinterface atke.a:()Ljava/lang/Object;
        //    96: checkcast       Landroid/app/Activity;
        //    99: astore_3       
        //   100: aload_3        
        //   101: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_SettingsActivity;
        //   104: ifeq            207
        //   107: aload_3        
        //   108: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_SettingsActivity;
        //   111: astore_3       
        //   112: aload_3        
        //   113: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   116: pop            
        //   117: aload           6
        //   119: checkcast       Lesp;
        //   122: getfield        esp.e:Latke;
        //   125: invokeinterface atke.a:()Ljava/lang/Object;
        //   130: checkcast       Laeij;
        //   133: astore          5
        //   135: aload           6
        //   137: checkcast       Lesp;
        //   140: getfield        esp.b:Leqy;
        //   143: getfield        eqy.a:Lera;
        //   146: getfield        era.co:Latke;
        //   149: invokeinterface atke.a:()Ljava/lang/Object;
        //   154: checkcast       Lrzv;
        //   157: astore          4
        //   159: aload           6
        //   161: checkcast       Lesp;
        //   164: invokevirtual   esp.yB:()Lsqq;
        //   167: astore          7
        //   169: new             Lewc;
        //   172: astore          6
        //   174: aload           6
        //   176: aload_2        
        //   177: checkcast       Lbx;
        //   180: aload_3        
        //   181: aload           5
        //   183: aload           4
        //   185: aload           7
        //   187: aconst_null    
        //   188: aconst_null    
        //   189: aconst_null    
        //   190: aconst_null    
        //   191: aconst_null    
        //   192: aconst_null    
        //   193: invokespecial   ewc.<init>:(Lbx;Lcom/google/android/apps/youtube/app/application/Shell_SettingsActivity;Laeij;Lrzv;Lsqq;[B[B[B[B[B[B)V
        //   196: aload_0        
        //   197: aload           6
        //   199: putfield        com/google/android/apps/youtube/app/application/Shell_SettingsActivity.m:Lewc;
        //   202: aload_1        
        //   203: invokevirtual   aetf.close:()V
        //   206: return         
        //   207: new             Ljava/lang/IllegalStateException;
        //   210: astore_2       
        //   211: ldc             Lewc;.class
        //   213: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   216: astore          4
        //   218: aload_3        
        //   219: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   222: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   225: astore          5
        //   227: new             Ljava/lang/StringBuilder;
        //   230: astore_3       
        //   231: aload_3        
        //   232: ldc             "Attempt to inject a Activity wrapper of type "
        //   234: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   237: aload_3        
        //   238: aload           4
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
        //   265: aload_2        
        //   266: aload_3        
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   273: aload_2        
        //   274: athrow         
        //   275: astore_2       
        //   276: goto            293
        //   279: astore_2       
        //   280: new             Ljava/lang/IllegalStateException;
        //   283: astore_3       
        //   284: aload_3        
        //   285: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   287: aload_2        
        //   288: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   291: aload_3        
        //   292: athrow         
        //   293: aload_1        
        //   294: invokevirtual   aetf.close:()V
        //   297: goto            306
        //   300: astore_1       
        //   301: aload_2        
        //   302: aload_1        
        //   303: invokestatic    fal.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   306: aload_2        
        //   307: athrow         
        //   308: astore_1       
        //   309: aload_2        
        //   310: invokevirtual   aetf.close:()V
        //   313: goto            322
        //   316: astore_2       
        //   317: aload_1        
        //   318: aload_2        
        //   319: invokestatic    fal.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   322: aload_1        
        //   323: athrow         
        //   324: new             Ljava/lang/IllegalStateException;
        //   327: dup            
        //   328: ldc             "createPeer() called outside of onCreate"
        //   330: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   333: athrow         
        //   334: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     308    324    Any
        //  62     68     279    293    Ljava/lang/ClassCastException;
        //  62     68     275    308    Any
        //  68     202    275    308    Any
        //  207    275    275    308    Any
        //  280    293    275    308    Any
        //  293    297    300    306    Any
        //  309    313    316    322    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0293:
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
        final ewc m = this.m;
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
        return 9;
    }
    
    protected final int f() {
        return 536870912;
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
                fal.a(t, t2);
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
        final bx a = this.n().a;
        return SettingsActivity.class;
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
                fal.a(t, t2);
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
                fal.a((Throwable)intent, t);
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
                fal.a(t, t2);
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
                fal.a((Throwable)configuration, t);
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
                    fal.a((Throwable)bundle, t);
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
                fal.a((Throwable)menu, t2);
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
                fal.a(t, t2);
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
                    fal.a((Throwable)intent, t);
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
                fal.a((Throwable)menuItem, t);
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
                    fal.a(t, t2);
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
                fal.a((Throwable)configuration, t);
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
                    fal.a((Throwable)bundle, t);
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
                fal.a(t, t2);
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
                fal.a((Throwable)menu, t);
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
                fal.a((Throwable)(Object)array, t);
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
                    fal.a(t, t2);
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
                    fal.a((Throwable)bundle, t);
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
                    fal.a(t, t2);
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
                    fal.a(t, t2);
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
                fal.a(t, t2);
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
                fal.a(t, t2);
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
