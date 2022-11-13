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

public final class UriFlowActivity extends gqm implements aeou, aepm
{
    private gqt b;
    private final aerz c;
    private boolean d;
    private Context e;
    private auo f;
    private boolean g;
    
    public UriFlowActivity() {
        this.c = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final gqt d() {
        this.e();
        return this.b;
    }
    
    private final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.b:Lgqt;
        //     4: ifnonnull       273
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.d:Z
        //    11: ifeq            263
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
        //    43: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   gqm.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   gqm.aR:()Ljava/lang/Object;
        //    66: astore          7
        //    68: aload           7
        //    70: checkcast       Lesp;
        //    73: invokevirtual   esp.y:()Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;
        //    76: astore          4
        //    78: aload           7
        //    80: checkcast       Lesp;
        //    83: getfield        esp.b:Leqy;
        //    86: getfield        eqy.a:Lera;
        //    89: getfield        era.cT:Latke;
        //    92: invokeinterface atke.a:()Ljava/lang/Object;
        //    97: checkcast       Lgqs;
        //   100: astore_3       
        //   101: aload           7
        //   103: checkcast       Lesp;
        //   106: getfield        esp.e:Latke;
        //   109: invokeinterface atke.a:()Ljava/lang/Object;
        //   114: checkcast       Laeij;
        //   117: astore          6
        //   119: aload           7
        //   121: checkcast       Lesp;
        //   124: invokevirtual   esp.y:()Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;
        //   127: astore          5
        //   129: aload           7
        //   131: checkcast       Lesp;
        //   134: getfield        esp.b:Leqy;
        //   137: getfield        eqy.a:Lera;
        //   140: getfield        era.co:Latke;
        //   143: invokeinterface atke.a:()Ljava/lang/Object;
        //   148: checkcast       Lrzv;
        //   151: astore_2       
        //   152: aload           7
        //   154: checkcast       Lesp;
        //   157: getfield        esp.b:Leqy;
        //   160: getfield        eqy.dj:Latke;
        //   163: invokeinterface atke.a:()Ljava/lang/Object;
        //   168: checkcast       Ltrc;
        //   171: astore          7
        //   173: new             Lgqt;
        //   176: astore          8
        //   178: aload           8
        //   180: aload           4
        //   182: aload_3        
        //   183: aload           6
        //   185: aload           5
        //   187: aload_2        
        //   188: aload           7
        //   190: aconst_null    
        //   191: aconst_null    
        //   192: invokespecial   gqt.<init>:(Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;Lgqs;Laeij;Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;Lrzv;Ltrc;[B[B)V
        //   195: aload_0        
        //   196: aload           8
        //   198: putfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.b:Lgqt;
        //   201: aload_1        
        //   202: invokevirtual   aetf.close:()V
        //   205: aload_0        
        //   206: getfield        com/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity.b:Lgqt;
        //   209: aload_0        
        //   210: putfield        gqt.e:Lcom/google/android/apps/youtube/app/extensions/accountlinking/UriFlowActivity;
        //   213: return         
        //   214: astore_2       
        //   215: goto            232
        //   218: astore_3       
        //   219: new             Ljava/lang/IllegalStateException;
        //   222: astore_2       
        //   223: aload_2        
        //   224: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   226: aload_3        
        //   227: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   230: aload_2        
        //   231: athrow         
        //   232: aload_1        
        //   233: invokevirtual   aetf.close:()V
        //   236: goto            245
        //   239: astore_1       
        //   240: aload_2        
        //   241: aload_1        
        //   242: invokestatic    hko.Q:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   245: aload_2        
        //   246: athrow         
        //   247: astore_1       
        //   248: aload_2        
        //   249: invokevirtual   aetf.close:()V
        //   252: goto            261
        //   255: astore_2       
        //   256: aload_1        
        //   257: aload_2        
        //   258: invokestatic    hko.Q:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   261: aload_1        
        //   262: athrow         
        //   263: new             Ljava/lang/IllegalStateException;
        //   266: dup            
        //   267: ldc             "createPeer() called outside of onCreate"
        //   269: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   272: athrow         
        //   273: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     247    263    Any
        //  62     68     218    232    Ljava/lang/ClassCastException;
        //  62     68     214    247    Any
        //  68     201    214    247    Any
        //  219    232    214    247    Any
        //  232    236    239    245    Any
        //  248    252    255    261    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0232:
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
        final gqt b = this.b;
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
                hko.Q(t, t2);
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
                hko.Q(t, t2);
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
                hko.Q((Throwable)intent, t);
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
                hko.Q(t, t2);
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
                hko.Q((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aett s = this.c.s();
        try {
            this.d = true;
            this.e();
            ((aepn)((dh)this).getLifecycle()).h(this.c);
            ((aepr)this.aR()).xU().i();
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
                    hko.Q((Throwable)bundle, t);
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
                hko.Q((Throwable)menu, t2);
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
                hko.Q(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajp ajp) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aett e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            final gqt d = this.d();
            if (d.d != 3) {
                ttr.b("Unexpected intent received.");
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
                    hko.Q((Throwable)intent, t);
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
                hko.Q((Throwable)menuItem, t);
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
                    hko.Q(t, t2);
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
                hko.Q((Throwable)configuration, t);
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
                    hko.Q((Throwable)bundle, t);
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
                hko.Q(t, t2);
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
                hko.Q((Throwable)menu, t);
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
                hko.Q((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aett h = this.c.h();
        try {
            super.onResume();
            final gqt d = this.d();
            if (d.d == 3) {
                d.e();
            }
            final trc c = d.c;
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
                    hko.Q(t, t2);
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
                    hko.Q((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aett i = this.c.i();
        try {
            super.onStart();
            final gqt d = this.d();
            Label_0194: {
                if (d.d == 1) {
                    final Intent intent = d.a.getIntent();
                    final Uri data = intent.getData();
                    while (true) {
                        Label_0172: {
                            if (data == null) {
                                break Label_0172;
                            }
                            final gqs b = d.b;
                            Label_0126: {
                                if (b.b != null) {
                                    final boolean b2 = b.c(data);
                                    break Label_0126;
                                }
                                final ListenableFuture e = aftq.e(b.g.a(), (aezf)new ggp(b, 9), (Executor)afum.a);
                                try {
                                    final boolean b2 = (boolean)e.get();
                                    if (!b2) {
                                        break Label_0172;
                                    }
                                    if (d.b.e(intent) == 2) {
                                        d.g(2);
                                        break Label_0194;
                                    }
                                    d.f();
                                    break Label_0194;
                                }
                                catch (final InterruptedException intent) {}
                                catch (final ExecutionException ex) {}
                            }
                            ttr.b(((Throwable)intent).getMessage());
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
            Label_0225: {
                if (i != null) {
                    try {
                        i.close();
                        break Label_0225;
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        hko.Q(t, t2);
                    }
                    break Label_0225;
                }
                break Label_0225;
            }
            while (true) {}
        }
    }
    
    protected final void onStop() {
        final aett j = this.c.j();
        try {
            super.onStop();
            final gqt d = this.d();
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
                    hko.Q(t, t2);
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
                hko.Q(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aett l = this.c.l();
        try {
            final gqt d = this.d();
            final trc c = d.c;
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
                hko.Q(t, t2);
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
