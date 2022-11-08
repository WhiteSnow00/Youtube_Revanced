// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity;

import android.view.MenuItem;
import android.view.Menu;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View;
import android.os.Bundle;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import android.content.Intent;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class ShortsCreationActivity extends gvc implements aemu, aenm
{
    private gvf b;
    private final aepy c;
    private boolean d;
    private Context e;
    private aun f;
    private boolean g;
    
    public ShortsCreationActivity() {
        this.c = aepy.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 16));
    }
    
    private final gvf j() {
        this.e();
        return this.b;
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
    
    public final gvf d() {
        final gvf b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.g) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.b:Lgvf;
        //     4: ifnonnull       419
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.d:Z
        //    11: ifeq            409
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.isFinishing:()Z
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
        //    48: invokevirtual   gvc.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   aere.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    61: astore_2       
        //    62: aload_0        
        //    63: invokevirtual   gvc.aR:()Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload_3        
        //    68: checkcast       Lesm;
        //    71: invokevirtual   esm.D:()Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity;
        //    74: astore          4
        //    76: aload_3        
        //    77: checkcast       Lesm;
        //    80: getfield        esm.eZ:Latjj;
        //    83: invokeinterface atjj.a:()Ljava/lang/Object;
        //    88: checkcast       Lucs;
        //    91: astore          5
        //    93: aload_3        
        //    94: checkcast       Lesm;
        //    97: getfield        esm.b:Leqv;
        //   100: getfield        eqv.e:Latjj;
        //   103: invokeinterface atjj.a:()Ljava/lang/Object;
        //   108: checkcast       Loas;
        //   111: astore_1       
        //   112: aload_3        
        //   113: checkcast       Lesm;
        //   116: getfield        esm.b:Leqv;
        //   119: getfield        eqv.a:Leqx;
        //   122: getfield        eqx.aw:Latjj;
        //   125: invokeinterface atjj.a:()Ljava/lang/Object;
        //   130: checkcast       Lphq;
        //   133: astore          6
        //   135: aload_3        
        //   136: checkcast       Lesm;
        //   139: getfield        esm.b:Leqv;
        //   142: getfield        eqv.a:Leqx;
        //   145: getfield        eqx.ax:Latjj;
        //   148: invokeinterface atjj.a:()Ljava/lang/Object;
        //   153: checkcast       Lozv;
        //   156: astore          6
        //   158: aload_3        
        //   159: checkcast       Lesm;
        //   162: getfield        esm.b:Leqv;
        //   165: getfield        eqv.a:Leqx;
        //   168: getfield        eqx.aq:Latjj;
        //   171: invokeinterface atjj.a:()Ljava/lang/Object;
        //   176: checkcast       Lauip;
        //   179: astore          7
        //   181: aload_3        
        //   182: checkcast       Lesm;
        //   185: getfield        esm.e:Latjj;
        //   188: invokeinterface atjj.a:()Ljava/lang/Object;
        //   193: checkcast       Laegi;
        //   196: astore          8
        //   198: aload_3        
        //   199: checkcast       Lesm;
        //   202: invokevirtual   esm.zI:()Ltdg;
        //   205: astore          9
        //   207: aload_3        
        //   208: checkcast       Lesm;
        //   211: getfield        esm.b:Leqv;
        //   214: getfield        eqv.dj:Latjj;
        //   217: invokeinterface atjj.a:()Ljava/lang/Object;
        //   222: checkcast       Ltox;
        //   225: astore          10
        //   227: aload_3        
        //   228: checkcast       Lesm;
        //   231: getfield        esm.b:Leqv;
        //   234: getfield        eqv.a:Leqx;
        //   237: getfield        eqx.cn:Latjj;
        //   240: invokeinterface atjj.a:()Ljava/lang/Object;
        //   245: checkcast       Lrxr;
        //   248: astore          11
        //   250: aload_3        
        //   251: checkcast       Lesm;
        //   254: getfield        esm.aQ:Latjj;
        //   257: invokeinterface atjj.a:()Ljava/lang/Object;
        //   262: checkcast       Lgau;
        //   265: astore          12
        //   267: aload_3        
        //   268: checkcast       Lesm;
        //   271: getfield        esm.fb:Latjj;
        //   274: invokeinterface atjj.a:()Ljava/lang/Object;
        //   279: checkcast       Landroid/view/ViewGroup;
        //   282: astore          6
        //   284: aload_3        
        //   285: checkcast       Lesm;
        //   288: getfield        esm.b:Leqv;
        //   291: getfield        eqv.jV:Latjj;
        //   294: invokeinterface atjj.a:()Ljava/lang/Object;
        //   299: checkcast       Luyi;
        //   302: astore_3       
        //   303: new             Lgvf;
        //   306: astore          13
        //   308: aload           13
        //   310: aload           4
        //   312: aload           5
        //   314: aload_1        
        //   315: aload           7
        //   317: aload           8
        //   319: aload           9
        //   321: aload           10
        //   323: aload           11
        //   325: aload           12
        //   327: aload           6
        //   329: aload_3        
        //   330: aconst_null    
        //   331: aconst_null    
        //   332: aconst_null    
        //   333: aconst_null    
        //   334: aconst_null    
        //   335: aconst_null    
        //   336: invokespecial   gvf.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity;Lucs;Loas;Lauip;Laegi;Ltdg;Ltox;Lrxr;Lgau;Landroid/view/ViewGroup;Luyi;[B[B[B[B[B[B)V
        //   339: aload_0        
        //   340: aload           13
        //   342: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.b:Lgvf;
        //   345: aload_2        
        //   346: invokevirtual   aere.close:()V
        //   349: aload_0        
        //   350: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.b:Lgvf;
        //   353: aload_0        
        //   354: putfield        gvf.l:Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity;
        //   357: return         
        //   358: astore_1       
        //   359: goto            378
        //   362: astore          4
        //   364: new             Ljava/lang/IllegalStateException;
        //   367: astore_1       
        //   368: aload_1        
        //   369: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   371: aload           4
        //   373: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   376: aload_1        
        //   377: athrow         
        //   378: aload_2        
        //   379: invokevirtual   aere.close:()V
        //   382: goto            391
        //   385: astore_2       
        //   386: aload_1        
        //   387: aload_2        
        //   388: invokestatic    hgd.s:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   391: aload_1        
        //   392: athrow         
        //   393: astore_2       
        //   394: aload_1        
        //   395: invokevirtual   aere.close:()V
        //   398: goto            407
        //   401: astore_1       
        //   402: aload_2        
        //   403: aload_1        
        //   404: invokestatic    hgd.s:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   407: aload_2        
        //   408: athrow         
        //   409: new             Ljava/lang/IllegalStateException;
        //   412: dup            
        //   413: ldc             "createPeer() called outside of onCreate"
        //   415: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   418: athrow         
        //   419: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     393    409    Any
        //  62     67     362    378    Ljava/lang/ClassCastException;
        //  62     67     358    393    Any
        //  67     345    358    393    Any
        //  364    378    358    393    Any
        //  378    382    385    391    Any
        //  394    398    401    407    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0378:
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
    
    public final void f() {
        super.onBackPressed();
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
                hgd.s(t, t2);
            }
        }
    }
    
    public final boolean g(final int n, final KeyEvent keyEvent) {
        return super.onKeyDown(n, keyEvent);
    }
    
    public final auh getLifecycle() {
        if (this.f == null) {
            this.f = new aenn((bu)this);
        }
        return (auh)this.f;
    }
    
    public final boolean h(final int n, final KeyEvent keyEvent) {
        return super.onKeyLongPress(n, keyEvent);
    }
    
    public final boolean i(final int n, final KeyEvent keyEvent) {
        return super.onKeyUp(n, keyEvent);
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
                hgd.s(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aers q = this.c.q();
        try {
            final gvf j = this.j();
            if (intent != null && intent.getBooleanExtra("close_gallery_on_successful_upload", false) && n2 == -1) {
                j.b.setResult(-1, intent);
                j.b.finish();
            }
            else {
                j.l.onActivityResult(n, n2, intent);
            }
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                hgd.s((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aers c = this.c.c();
        try {
            final gvf j = this.j();
            j.f().map((Function)gnq.t).filter((Predicate)fqf.r).ifPresent((Consumer)new gft(j, 16));
            c.close();
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hgd.s(t, t2);
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
                hgd.s((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aers s = this.c.s();
        try {
            this.d = true;
            ((aenn)((dh)this).getLifecycle()).h(this.c);
            final gvf j = this.j();
            j.f.c((aeho)j);
            fah.m((Context)j.b);
            j.l.onCreate(bundle);
            j.e = 0L;
            if (bundle == null) {
                j.e = j.d.c();
            }
            if (j.j.aT()) {
                ((fa)j.b).setTheme(2132083492);
            }
            j.c.m(bundle, j.e());
            ((qt)j.b).setContentView((View)j.i);
            if (bundle != null) {
                final cl supportFragmentManager = ((bu)j.b).getSupportFragmentManager();
                final ct i = supportFragmentManager.i();
                final br f = supportFragmentManager.f("ReelBrowseFragmentTag");
                final br f2 = supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG");
                if (f != null) {
                    i.n(f);
                }
                if (f2 != null) {
                    i.n(f2);
                }
                if (!i.j()) {
                    i.d();
                }
            }
            final auip k = j.k;
            j.h.f((BottomUiContainer)((fa)j.b).findViewById(2131427886));
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
                    hgd.s((Throwable)bundle, t);
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
                hgd.s((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aers d = this.c.d();
        try {
            super.onDestroy();
            final gvf j = this.j();
            if (j.b.isFinishing() && !j.a) {
                j.c.b();
            }
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
                hgd.s(t, t2);
            }
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final gvf j = this.j();
        return (boolean)j.f().map((Function)new gve(j, n, keyEvent, 2)).orElse((Object)true);
    }
    
    public final boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        final gvf j = this.j();
        return (boolean)j.f().map((Function)new gve(j, n, keyEvent, 0)).orElse((Object)true);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final gvf j = this.j();
        return (boolean)j.f().map((Function)new gve(j, n, keyEvent, 1)).orElse((Object)true);
    }
    
    protected final void onLocalesChanged(final ajo ajo) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aers e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            this.j();
            trn.l("ShortsCreationActivity: Ignoring onNewIntent()");
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
                    hgd.s((Throwable)intent, t);
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
                hgd.s((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aers f = this.c.f();
        try {
            final gvf j = this.j();
            if (j.b.isFinishing()) {
                j.b.setRequestedOrientation(-1);
            }
            j.l.onPause();
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
                    hgd.s(t, t2);
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
                hgd.s((Throwable)configuration, t);
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
                    hgd.s((Throwable)bundle, t);
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
                hgd.s(t, t2);
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
                hgd.s((Throwable)menu, t);
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
                hgd.s((Throwable)(Object)array, t);
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
                    hgd.s(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aers y = this.c.y();
        try {
            super.onSaveInstanceState(bundle);
            this.j().c.o(bundle);
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
                    hgd.s((Throwable)bundle, t);
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
                    hgd.s(t, t2);
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
                    hgd.s(t, t2);
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
                hgd.s(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aers l = this.c.l();
        try {
            final gvf j = this.j();
            final tox g = j.g;
            if (g != null) {
                g.b();
            }
            j.l.onUserInteraction();
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hgd.s(t, t2);
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
