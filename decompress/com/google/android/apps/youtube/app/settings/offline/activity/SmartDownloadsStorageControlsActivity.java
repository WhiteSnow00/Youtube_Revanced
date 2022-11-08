// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.offline.activity;

import android.view.MenuItem;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.graphics.PorterDuff$Mode;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class SmartDownloadsStorageControlsActivity extends jqa implements aemu, aenm
{
    private jqc b;
    private final aepy c;
    private boolean d;
    private Context e;
    private aun f;
    private boolean g;
    
    public SmartDownloadsStorageControlsActivity() {
        this.c = aepy.a((Activity)this);
        SystemClock.elapsedRealtime();
        this.addOnContextAvailableListener((rc)new jln(this, 4));
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        aety.b(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        aety.a(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity.b:Ljqc;
        //     4: ifnonnull       346
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity.d:Z
        //    11: ifeq            336
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity.isFinishing:()Z
        //    25: ifeq            31
        //    28: goto            41
        //    31: new             Ljava/lang/IllegalStateException;
        //    34: dup            
        //    35: ldc             "createPeer() called after destroyed."
        //    37: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    40: athrow         
        //    41: ldc             "CreateComponent"
        //    43: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    46: astore_1       
        //    47: aload_0        
        //    48: invokevirtual   jqa.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   aere.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    61: astore_2       
        //    62: aload_0        
        //    63: invokevirtual   jqa.aR:()Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload_3        
        //    68: checkcast       Lesm;
        //    71: getfield        esm.d:Latjj;
        //    74: invokeinterface atjj.a:()Ljava/lang/Object;
        //    79: checkcast       Landroid/app/Activity;
        //    82: astore          4
        //    84: aload           4
        //    86: instanceof      Lcom/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity;
        //    89: ifeq            209
        //    92: aload           4
        //    94: checkcast       Lcom/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity;
        //    97: astore          4
        //    99: aload           4
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload_3        
        //   106: checkcast       Lesm;
        //   109: getfield        esm.b:Leqv;
        //   112: getfield        eqv.iG:Latjj;
        //   115: invokeinterface atjj.a:()Ljava/lang/Object;
        //   120: checkcast       Lwwv;
        //   123: astore          5
        //   125: aload_3        
        //   126: checkcast       Lesm;
        //   129: getfield        esm.b:Leqv;
        //   132: getfield        eqv.fo:Latjj;
        //   135: invokeinterface atjj.a:()Ljava/lang/Object;
        //   140: checkcast       Lgko;
        //   143: astore_1       
        //   144: aload_3        
        //   145: checkcast       Lesm;
        //   148: getfield        esm.e:Latjj;
        //   151: invokeinterface atjj.a:()Ljava/lang/Object;
        //   156: checkcast       Laegi;
        //   159: astore          6
        //   161: aload_3        
        //   162: checkcast       Lesm;
        //   165: getfield        esm.b:Leqv;
        //   168: getfield        eqv.jV:Latjj;
        //   171: invokeinterface atjj.a:()Ljava/lang/Object;
        //   176: checkcast       Luyi;
        //   179: astore_3       
        //   180: new             Ljqc;
        //   183: astore          7
        //   185: aload           7
        //   187: aload           4
        //   189: aload           5
        //   191: aload_1        
        //   192: aload           6
        //   194: aload_3        
        //   195: invokespecial   jqc.<init>:(Lcom/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity;Lwwv;Lgko;Laegi;Luyi;)V
        //   198: aload_0        
        //   199: aload           7
        //   201: putfield        com/google/android/apps/youtube/app/settings/offline/activity/SmartDownloadsStorageControlsActivity.b:Ljqc;
        //   204: aload_2        
        //   205: invokevirtual   aere.close:()V
        //   208: return         
        //   209: new             Ljava/lang/IllegalStateException;
        //   212: astore_1       
        //   213: ldc             Ljqc;.class
        //   215: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   218: astore          6
        //   220: aload           4
        //   222: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   225: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   228: astore          5
        //   230: new             Ljava/lang/StringBuilder;
        //   233: astore          4
        //   235: aload           4
        //   237: ldc             "Attempt to inject a Activity wrapper of type "
        //   239: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   242: aload           4
        //   244: aload           6
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: pop            
        //   250: aload           4
        //   252: ldc             ", but the wrapper available is of type: "
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload           4
        //   260: aload           5
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   265: pop            
        //   266: aload           4
        //   268: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: pop            
        //   274: aload_1        
        //   275: aload           4
        //   277: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   280: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   283: aload_1        
        //   284: athrow         
        //   285: astore_1       
        //   286: goto            305
        //   289: astore          6
        //   291: new             Ljava/lang/IllegalStateException;
        //   294: astore_1       
        //   295: aload_1        
        //   296: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   298: aload           6
        //   300: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   303: aload_1        
        //   304: athrow         
        //   305: aload_2        
        //   306: invokevirtual   aere.close:()V
        //   309: goto            318
        //   312: astore_2       
        //   313: aload_1        
        //   314: aload_2        
        //   315: invokestatic    kgk.x:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   318: aload_1        
        //   319: athrow         
        //   320: astore_2       
        //   321: aload_1        
        //   322: invokevirtual   aere.close:()V
        //   325: goto            334
        //   328: astore_1       
        //   329: aload_2        
        //   330: aload_1        
        //   331: invokestatic    kgk.x:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   334: aload_2        
        //   335: athrow         
        //   336: new             Ljava/lang/IllegalStateException;
        //   339: dup            
        //   340: ldc             "createPeer() called outside of onCreate"
        //   342: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   345: athrow         
        //   346: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     320    336    Any
        //  62     67     289    305    Ljava/lang/ClassCastException;
        //  62     67     285    320    Any
        //  67     204    285    320    Any
        //  209    285    285    320    Any
        //  291    305    285    320    Any
        //  305    309    312    318    Any
        //  321    325    328    334    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0305:
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
        final aers b = this.c.b();
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
                kgk.x(t, t2);
            }
        }
    }
    
    public final auh getLifecycle() {
        if (this.f == null) {
            this.f = (aun)new aenn((bu)this);
        }
        return (auh)this.f;
    }
    
    public final void invalidateOptionsMenu() {
        final aers s = aesw.s();
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
                kgk.x(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aers q = this.c.q();
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
                kgk.x((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aers c = this.c.c();
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
                kgk.x(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aers r = this.c.r();
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
                kgk.x((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aers s = this.c.s();
        try {
            this.d = true;
            ((aenn)((dh)this).getLifecycle()).h(this.c);
            super.onCreate(bundle);
            this.d();
            final jqc b = this.b;
            b.b.setTitle(2132019255);
            b.b.setContentView(2131625072);
            final Toolbar supportActionBar = (Toolbar)b.b.findViewById(2131432122);
            final Drawable mutate = b.b.getResources().getDrawable(2131233636).mutate();
            tnw.e(mutate, tmy.ct((Context)b.b, 2130970924).orElse(0), PorterDuff$Mode.SRC_IN);
            supportActionBar.s(mutate);
            b.b.setSupportActionBar(supportActionBar);
            supportActionBar.t((View$OnClickListener)new jlq(b, 16));
            final ep supportActionBar2 = b.b.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.j(true);
            }
            b.c.b(wya.b(149969), (aioe)null, (alff)null);
            b.c.l(jqc.a);
            final SmartDownloadsStorageControlsActivity b2 = b.b;
            b2.getOnBackPressedDispatcher().b((aum)b2, (qw)new jqb(b));
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
                    kgk.x((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aers t = this.c.t();
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
                kgk.x((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aers d = this.c.d();
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
                kgk.x(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajo ajo) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aers e = this.c.e(intent);
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
                    kgk.x((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aers u = this.c.u();
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
                kgk.x((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aers f = this.c.f();
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
                    kgk.x(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aers v = this.c.v();
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
                kgk.x((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aers w = this.c.w();
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
                    kgk.x((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aers g = this.c.g();
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
                kgk.x(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aers s = aesw.s();
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
                kgk.x((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aers x = this.c.x();
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
                kgk.x((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aers h = this.c.h();
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
                    kgk.x(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aers y = this.c.y();
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
                    kgk.x((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aers i = this.c.i();
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
                    kgk.x(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aers j = this.c.j();
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
                    kgk.x(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aers k = this.c.k();
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
                kgk.x(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aers l = this.c.l();
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
                kgk.x(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
