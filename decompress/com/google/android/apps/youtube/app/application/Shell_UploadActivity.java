// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_UploadActivity extends evw implements aeqn, aerf
{
    private ewf m;
    private final aets n;
    private boolean o;
    private Context p;
    private auq q;
    private boolean r;
    
    public Shell_UploadActivity() {
        this.n = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final void n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_UploadActivity.m:Lewf;
        //     4: ifnonnull       306
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_UploadActivity.o:Z
        //    11: ifeq            296
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_UploadActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_UploadActivity.isFinishing:()Z
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
        //    66: astore          4
        //    68: aload           4
        //    70: checkcast       Lesr;
        //    73: getfield        esr.d:Latnb;
        //    76: invokeinterface atnb.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          5
        //    86: aload           5
        //    88: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_UploadActivity;
        //    91: ifeq            173
        //    94: aload           5
        //    96: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_UploadActivity;
        //    99: astore_3       
        //   100: aload_3        
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload           4
        //   107: checkcast       Lesr;
        //   110: getfield        esr.e:Latnb;
        //   113: invokeinterface atnb.a:()Ljava/lang/Object;
        //   118: checkcast       Laekc;
        //   121: astore_2       
        //   122: aload           4
        //   124: checkcast       Lesr;
        //   127: getfield        esr.b:Lera;
        //   130: getfield        era.a:Lerc;
        //   133: getfield        erc.cp:Latnb;
        //   136: invokeinterface atnb.a:()Ljava/lang/Object;
        //   141: checkcast       Lsaw;
        //   144: astore          5
        //   146: new             Lewf;
        //   149: astore          4
        //   151: aload           4
        //   153: aload_3        
        //   154: aload_2        
        //   155: aload           5
        //   157: aconst_null    
        //   158: aconst_null    
        //   159: invokespecial   ewf.<init>:(Lcom/google/android/apps/youtube/app/application/Shell_UploadActivity;Laekc;Lsaw;[B[B)V
        //   162: aload_0        
        //   163: aload           4
        //   165: putfield        com/google/android/apps/youtube/app/application/Shell_UploadActivity.m:Lewf;
        //   168: aload_1        
        //   169: invokevirtual   aeux.close:()V
        //   172: return         
        //   173: new             Ljava/lang/IllegalStateException;
        //   176: astore_3       
        //   177: ldc             Lewf;.class
        //   179: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   182: astore_2       
        //   183: aload           5
        //   185: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   188: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   191: astore          4
        //   193: new             Ljava/lang/StringBuilder;
        //   196: astore          5
        //   198: aload           5
        //   200: ldc             "Attempt to inject a Activity wrapper of type "
        //   202: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   205: aload           5
        //   207: aload_2        
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: pop            
        //   212: aload           5
        //   214: ldc             ", but the wrapper available is of type: "
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: pop            
        //   220: aload           5
        //   222: aload           4
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: pop            
        //   228: aload           5
        //   230: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   235: pop            
        //   236: aload_3        
        //   237: aload           5
        //   239: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   242: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   245: aload_3        
        //   246: athrow         
        //   247: astore_2       
        //   248: goto            265
        //   251: astore_3       
        //   252: new             Ljava/lang/IllegalStateException;
        //   255: astore_2       
        //   256: aload_2        
        //   257: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   259: aload_3        
        //   260: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   263: aload_2        
        //   264: athrow         
        //   265: aload_1        
        //   266: invokevirtual   aeux.close:()V
        //   269: goto            278
        //   272: astore_1       
        //   273: aload_2        
        //   274: aload_1        
        //   275: invokestatic    fao.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   278: aload_2        
        //   279: athrow         
        //   280: astore_1       
        //   281: aload_2        
        //   282: invokevirtual   aeux.close:()V
        //   285: goto            294
        //   288: astore_2       
        //   289: aload_1        
        //   290: aload_2        
        //   291: invokestatic    fao.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   294: aload_1        
        //   295: athrow         
        //   296: new             Ljava/lang/IllegalStateException;
        //   299: dup            
        //   300: ldc             "createPeer() called outside of onCreate"
        //   302: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   305: athrow         
        //   306: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     280    296    Any
        //  62     68     251    265    Ljava/lang/ClassCastException;
        //  62     68     247    280    Any
        //  68     168    247    280    Any
        //  173    247    247    280    Any
        //  252    265    247    280    Any
        //  265    269    272    278    Any
        //  281    285    288    294    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0265:
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
        final ewf m = this.m;
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
        this.n();
        return 67108865;
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
                fao.a(t, t2);
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
        this.n();
        return UploadActivity.class;
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
                fao.a(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
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
                fao.a((Throwable)intent, t);
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
                fao.a(t, t2);
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
                fao.a((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aevl t = this.n.t();
        try {
            this.o = true;
            this.n();
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
                    fao.a((Throwable)bundle, t2);
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
                fao.a((Throwable)menu, t);
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
                fao.a(t, t2);
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
                    fao.a((Throwable)intent, t);
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
                fao.a((Throwable)menuItem, t);
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
                    fao.a(t, t2);
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
                fao.a((Throwable)configuration, t);
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
                    fao.a((Throwable)bundle, t);
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
                fao.a(t, t2);
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
                fao.a((Throwable)menu, t);
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
                fao.a((Throwable)(Object)array, t);
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
                    fao.a(t, t2);
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
                    fao.a((Throwable)bundle, t);
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
                    fao.a(t, t2);
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
                    fao.a(t, t2);
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
                fao.a(t, t2);
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
                fao.a(t, t2);
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
