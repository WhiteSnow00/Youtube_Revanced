// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.posts.creation;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class PostsCreationActivity extends gui implements aeou, aepm
{
    private guk b;
    private final aerz c;
    private boolean d;
    private Context e;
    private auo f;
    private boolean g;
    
    public PostsCreationActivity() {
        this.c = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 16));
    }
    
    public final /* bridge */ Object aN() {
        final guk b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.g) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        aeuz.c(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        aeuz.b(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final arku b() {
        return (arku)aeps.a((Activity)this);
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity.b:Lguk;
        //     4: ifnonnull       352
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity.d:Z
        //    11: ifeq            342
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity.isFinishing:()Z
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
        //    48: invokevirtual   gui.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   gui.aR:()Ljava/lang/Object;
        //    66: astore          6
        //    68: aload           6
        //    70: checkcast       Lesp;
        //    73: getfield        esp.d:Latke;
        //    76: invokeinterface atke.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity;
        //    91: ifeq            219
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity;
        //    99: astore          4
        //   101: aload           4
        //   103: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   106: pop            
        //   107: aload           6
        //   109: checkcast       Lesp;
        //   112: getfield        esp.e:Latke;
        //   115: invokeinterface atke.a:()Ljava/lang/Object;
        //   120: checkcast       Laeij;
        //   123: astore_3       
        //   124: aload           6
        //   126: checkcast       Lesp;
        //   129: invokevirtual   esp.yB:()Lsqq;
        //   132: astore          5
        //   134: aload           6
        //   136: checkcast       Lesp;
        //   139: getfield        esp.b:Leqy;
        //   142: getfield        eqy.a:Lera;
        //   145: getfield        era.co:Latke;
        //   148: invokeinterface atke.a:()Ljava/lang/Object;
        //   153: checkcast       Lrzv;
        //   156: astore_2       
        //   157: aload           6
        //   159: checkcast       Lesp;
        //   162: getfield        esp.b:Leqy;
        //   165: getfield        eqy.ka:Latke;
        //   168: invokeinterface atke.a:()Ljava/lang/Object;
        //   173: checkcast       Lvai;
        //   176: astore          7
        //   178: new             Lguk;
        //   181: astore          6
        //   183: aload           6
        //   185: aload           4
        //   187: aload_3        
        //   188: aload           5
        //   190: aload_2        
        //   191: aload           7
        //   193: aconst_null    
        //   194: aconst_null    
        //   195: aconst_null    
        //   196: aconst_null    
        //   197: invokespecial   guk.<init>:(Lcom/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity;Laeij;Lsqq;Lrzv;Lvai;[B[B[B[B)V
        //   200: aload_0        
        //   201: aload           6
        //   203: putfield        com/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity.b:Lguk;
        //   206: aload_1        
        //   207: invokevirtual   aetf.close:()V
        //   210: aload_0        
        //   211: getfield        com/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity.b:Lguk;
        //   214: aload_0        
        //   215: putfield        guk.e:Lcom/google/android/apps/youtube/app/extensions/posts/creation/PostsCreationActivity;
        //   218: return         
        //   219: new             Ljava/lang/IllegalStateException;
        //   222: astore_2       
        //   223: ldc             Lguk;.class
        //   225: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   228: astore_3       
        //   229: aload           4
        //   231: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   234: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   237: astore          5
        //   239: new             Ljava/lang/StringBuilder;
        //   242: astore          4
        //   244: aload           4
        //   246: ldc             "Attempt to inject a Activity wrapper of type "
        //   248: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   251: aload           4
        //   253: aload_3        
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload           4
        //   260: ldc             ", but the wrapper available is of type: "
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   265: pop            
        //   266: aload           4
        //   268: aload           5
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: pop            
        //   274: aload           4
        //   276: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: pop            
        //   282: aload_2        
        //   283: aload           4
        //   285: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   288: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   291: aload_2        
        //   292: athrow         
        //   293: astore_2       
        //   294: goto            311
        //   297: astore_3       
        //   298: new             Ljava/lang/IllegalStateException;
        //   301: astore_2       
        //   302: aload_2        
        //   303: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   305: aload_3        
        //   306: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   309: aload_2        
        //   310: athrow         
        //   311: aload_1        
        //   312: invokevirtual   aetf.close:()V
        //   315: goto            324
        //   318: astore_1       
        //   319: aload_2        
        //   320: aload_1        
        //   321: invokestatic    iaj.c:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   324: aload_2        
        //   325: athrow         
        //   326: astore_1       
        //   327: aload_2        
        //   328: invokevirtual   aetf.close:()V
        //   331: goto            340
        //   334: astore_2       
        //   335: aload_1        
        //   336: aload_2        
        //   337: invokestatic    iaj.c:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   340: aload_1        
        //   341: athrow         
        //   342: new             Ljava/lang/IllegalStateException;
        //   345: dup            
        //   346: ldc             "createPeer() called outside of onCreate"
        //   348: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   351: athrow         
        //   352: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     326    342    Any
        //  62     68     297    311    Ljava/lang/ClassCastException;
        //  62     68     293    326    Any
        //  68     206    293    326    Any
        //  219    293    293    326    Any
        //  298    311    293    326    Any
        //  311    315    318    324    Any
        //  327    331    334    340    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0311:
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
    
    public final void finish() {
        final aett b = this.c.b();
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
                iaj.c(t, t2);
            }
        }
    }
    
    public final aui getLifecycle() {
        if (this.f == null) {
            this.f = (auo)new aepn((bu)this);
        }
        return this.f;
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
                iaj.c(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aett q = this.c.q();
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
                iaj.c((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aett c = this.c.c();
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
                iaj.c(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aett r = this.c.r();
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
                iaj.c((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aett s = this.c.s();
        try {
            this.d = true;
            ((aepn)((dh)this).getLifecycle()).h(this.c);
            super.onCreate(bundle);
            this.d();
            final guk b = this.b;
            glb.c((Context)b.a);
            if (b.b.aU()) {
                ((fa)b.a).setTheme(2132083492);
            }
            ((qt)b.a).setContentView(2131625065);
            this.d = false;
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
                    iaj.c((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aett t = this.c.t();
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
                iaj.c((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aett d = this.c.d();
        try {
            super.onDestroy();
            this.g = true;
            d.close();
        }
        finally {
            try {
                d.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                iaj.c(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajp ajp) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aett e = this.c.e(intent);
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
                    iaj.c((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aett u = this.c.u();
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
                iaj.c((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aett f = this.c.f();
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
                    iaj.c(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aett v = this.c.v();
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
                iaj.c((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aett w = this.c.w();
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
                    iaj.c((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aett g = this.c.g();
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
                iaj.c(t, t2);
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
                iaj.c((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aett x = this.c.x();
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
                iaj.c((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aett h = this.c.h();
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
                    iaj.c(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aett y = this.c.y();
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
                    iaj.c((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aett i = this.c.i();
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
                    iaj.c(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aett j = this.c.j();
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
                    iaj.c(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aett k = this.c.k();
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
                iaj.c(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aett l = this.c.l();
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
                iaj.c(t, t2);
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
