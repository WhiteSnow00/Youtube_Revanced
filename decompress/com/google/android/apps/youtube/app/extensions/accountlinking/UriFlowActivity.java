// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.accountlinking;

import com.google.common.util.concurrent.ListenableFuture;
import android.net.Uri;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class UriFlowActivity extends gqg implements aemu, aenm
{
    private gqo b;
    private final aepy c;
    private boolean d;
    private Context e;
    private aun f;
    private boolean g;
    
    public UriFlowActivity() {
        this.c = aepy.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final gqo d() {
        this.e();
        return this.b;
    }
    
    private final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.b:Lgqo;
        //     4: ifnonnull       268
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.d:Z
        //    11: ifeq            258
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.isFinishing:()Z
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
        //    48: invokevirtual   gqg.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   aere.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    61: astore_2       
        //    62: aload_0        
        //    63: invokevirtual   gqg.aR:()Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload_3        
        //    68: checkcast       Lesm;
        //    71: invokevirtual   esm.y:()Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;
        //    74: astore          4
        //    76: aload_3        
        //    77: checkcast       Lesm;
        //    80: getfield        esm.b:Leqv;
        //    83: getfield        eqv.a:Leqx;
        //    86: getfield        eqx.cS:Latjj;
        //    89: invokeinterface atjj.a:()Ljava/lang/Object;
        //    94: checkcast       Lgqn;
        //    97: astore          5
        //    99: aload_3        
        //   100: checkcast       Lesm;
        //   103: getfield        esm.e:Latjj;
        //   106: invokeinterface atjj.a:()Ljava/lang/Object;
        //   111: checkcast       Laegi;
        //   114: astore_1       
        //   115: aload_3        
        //   116: checkcast       Lesm;
        //   119: invokevirtual   esm.y:()Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;
        //   122: astore          6
        //   124: aload_3        
        //   125: checkcast       Lesm;
        //   128: getfield        esm.b:Leqv;
        //   131: getfield        eqv.a:Leqx;
        //   134: getfield        eqx.cn:Latjj;
        //   137: invokeinterface atjj.a:()Ljava/lang/Object;
        //   142: checkcast       Lrxr;
        //   145: astore          7
        //   147: aload_3        
        //   148: checkcast       Lesm;
        //   151: getfield        esm.b:Leqv;
        //   154: getfield        eqv.dj:Latjj;
        //   157: invokeinterface atjj.a:()Ljava/lang/Object;
        //   162: checkcast       Ltox;
        //   165: astore          8
        //   167: new             Lgqo;
        //   170: astore_3       
        //   171: aload_3        
        //   172: aload           4
        //   174: aload           5
        //   176: aload_1        
        //   177: aload           6
        //   179: aload           7
        //   181: aload           8
        //   183: aconst_null    
        //   184: aconst_null    
        //   185: invokespecial   gqo.<init>:(Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;Lgqn;Laegi;Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;Lrxr;Ltox;[B[B)V
        //   188: aload_0        
        //   189: aload_3        
        //   190: putfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.b:Lgqo;
        //   193: aload_2        
        //   194: invokevirtual   aere.close:()V
        //   197: aload_0        
        //   198: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.b:Lgqo;
        //   201: aload_0        
        //   202: putfield        gqo.e:Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;
        //   205: return         
        //   206: astore_1       
        //   207: goto            227
        //   210: astore_1       
        //   211: new             Ljava/lang/IllegalStateException;
        //   214: astore          5
        //   216: aload           5
        //   218: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   220: aload_1        
        //   221: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   224: aload           5
        //   226: athrow         
        //   227: aload_2        
        //   228: invokevirtual   aere.close:()V
        //   231: goto            240
        //   234: astore_2       
        //   235: aload_1        
        //   236: aload_2        
        //   237: invokestatic    guc.g:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   240: aload_1        
        //   241: athrow         
        //   242: astore_2       
        //   243: aload_1        
        //   244: invokevirtual   aere.close:()V
        //   247: goto            256
        //   250: astore_1       
        //   251: aload_2        
        //   252: aload_1        
        //   253: invokestatic    guc.g:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   256: aload_2        
        //   257: athrow         
        //   258: new             Ljava/lang/IllegalStateException;
        //   261: dup            
        //   262: ldc             "createPeer() called outside of onCreate"
        //   264: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   267: athrow         
        //   268: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     242    258    Any
        //  62     67     210    227    Ljava/lang/ClassCastException;
        //  62     67     206    242    Any
        //  67     193    206    242    Any
        //  211    227    206    242    Any
        //  227    231    234    240    Any
        //  243    247    250    256    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0227:
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
                guc.g(t, t2);
            }
        }
    }
    
    public final auh getLifecycle() {
        if (this.f == null) {
            this.f = new aenn((bu)this);
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
                guc.g(t, t2);
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
                guc.g((Throwable)intent, t);
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
                guc.g(t, t2);
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
                guc.g((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aers s = this.c.s();
        try {
            this.d = true;
            this.e();
            ((aenn)((dh)this).getLifecycle()).h(this.c);
            ((aenr)this.aR()).xM().i();
            super.onCreate(bundle);
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
                    guc.g((Throwable)bundle, t);
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
                guc.g((Throwable)menu, t2);
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
                guc.g(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajo ajo) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aers e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            final gqo d = this.d();
            if (d.d != 3) {
                trn.b("Unexpected intent received.");
                d.e();
            }
            else {
                d.g(d.b.e(intent));
            }
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
                    guc.g((Throwable)intent, t);
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
                guc.g((Throwable)menuItem, t);
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
                    guc.g(t, t2);
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
                guc.g((Throwable)configuration, t);
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
                    guc.g((Throwable)bundle, t);
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
                guc.g(t, t2);
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
                guc.g((Throwable)menu, t);
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
                guc.g((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aers h = this.c.h();
        try {
            super.onResume();
            final gqo d = this.d();
            if (d.d == 3) {
                d.e();
            }
            final tox c = d.c;
            if (c != null) {
                c.b();
            }
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
                    guc.g(t, t2);
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
                    guc.g((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aers i = this.c.i();
        try {
            super.onStart();
            final gqo d = this.d();
            Label_0187: {
                if (d.d == 1) {
                    final Intent intent = d.a.getIntent();
                    final Uri data = intent.getData();
                    while (true) {
                        Label_0168: {
                            if (data == null) {
                                break Label_0168;
                            }
                            final gqn b = d.b;
                            Label_0124: {
                                if (b.b != null) {
                                    final boolean b2 = b.c(data);
                                    break Label_0124;
                                }
                                final ListenableFuture e = afrp.e(b.g.b(), (aexg)new gkq(b, 8), (Executor)afsl.a);
                                try {
                                    final boolean b2 = (boolean)e.get();
                                    if (!b2) {
                                        break Label_0168;
                                    }
                                    if (d.b.e(intent) == 2) {
                                        d.g(2);
                                        break Label_0187;
                                    }
                                    d.f();
                                    break Label_0187;
                                }
                                catch (final InterruptedException intent) {}
                                catch (final ExecutionException ex) {}
                            }
                            trn.b(((Throwable)intent).getMessage());
                        }
                        if (!d.b.d((Activity)d.a)) {
                            continue;
                        }
                        break;
                    }
                    d.d = 2;
                }
            }
            if (i != null) {
                i.close();
            }
        }
        finally {
            Label_0218: {
                if (i != null) {
                    try {
                        i.close();
                        break Label_0218;
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        guc.g(t, t2);
                    }
                    break Label_0218;
                }
                break Label_0218;
            }
            while (true) {}
        }
    }
    
    protected final void onStop() {
        final aers j = this.c.j();
        try {
            super.onStop();
            final gqo d = this.d();
            if (d.d == 2) {
                d.d = 3;
            }
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
                    guc.g(t, t2);
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
                guc.g(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aers l = this.c.l();
        try {
            final gqo d = this.d();
            final tox c = d.c;
            if (c != null) {
                c.b();
            }
            d.e.onUserInteraction();
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                guc.g(t, t2);
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
