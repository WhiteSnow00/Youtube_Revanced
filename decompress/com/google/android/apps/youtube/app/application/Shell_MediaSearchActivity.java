// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_MediaSearchActivity extends evr implements aeou, aepm
{
    private ewa m;
    private final aerz n;
    private boolean o;
    private Context p;
    private auo q;
    private boolean r;
    
    public Shell_MediaSearchActivity() {
        this.n = aerz.a((Activity)this);
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
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_MediaSearchActivity.m:Lewa;
        //     4: ifnonnull       330
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_MediaSearchActivity.o:Z
        //    11: ifeq            320
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_MediaSearchActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_MediaSearchActivity.isFinishing:()Z
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
        //    66: astore          5
        //    68: aload           5
        //    70: checkcast       Lesp;
        //    73: getfield        esp.b:Leqy;
        //    76: getfield        eqy.kz:Latke;
        //    79: invokeinterface atke.a:()Ljava/lang/Object;
        //    84: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;
        //    87: astore_2       
        //    88: aload           5
        //    90: checkcast       Lesp;
        //    93: getfield        esp.d:Latke;
        //    96: invokeinterface atke.a:()Ljava/lang/Object;
        //   101: checkcast       Landroid/app/Activity;
        //   104: astore          4
        //   106: aload           4
        //   108: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_MediaSearchActivity;
        //   111: ifeq            197
        //   114: aload           4
        //   116: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_MediaSearchActivity;
        //   119: astore_3       
        //   120: aload_3        
        //   121: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   124: pop            
        //   125: aload           5
        //   127: checkcast       Lesp;
        //   130: getfield        esp.e:Latke;
        //   133: invokeinterface atke.a:()Ljava/lang/Object;
        //   138: checkcast       Laeij;
        //   141: astore          4
        //   143: aload           5
        //   145: checkcast       Lesp;
        //   148: getfield        esp.b:Leqy;
        //   151: getfield        eqy.a:Lera;
        //   154: getfield        era.co:Latke;
        //   157: invokeinterface atke.a:()Ljava/lang/Object;
        //   162: checkcast       Lrzv;
        //   165: astore          5
        //   167: new             Lewa;
        //   170: astore          6
        //   172: aload           6
        //   174: aload_2        
        //   175: aload_3        
        //   176: aload           4
        //   178: aload           5
        //   180: aconst_null    
        //   181: aconst_null    
        //   182: aconst_null    
        //   183: invokespecial   ewa.<init>:(Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;Lcom/google/android/apps/youtube/app/application/Shell_MediaSearchActivity;Laeij;Lrzv;[B[B[B)V
        //   186: aload_0        
        //   187: aload           6
        //   189: putfield        com/google/android/apps/youtube/app/application/Shell_MediaSearchActivity.m:Lewa;
        //   192: aload_1        
        //   193: invokevirtual   aetf.close:()V
        //   196: return         
        //   197: new             Ljava/lang/IllegalStateException;
        //   200: astore_3       
        //   201: ldc             Lewa;.class
        //   203: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   206: astore_2       
        //   207: aload           4
        //   209: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   212: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   215: astore          4
        //   217: new             Ljava/lang/StringBuilder;
        //   220: astore          5
        //   222: aload           5
        //   224: ldc             "Attempt to inject a Activity wrapper of type "
        //   226: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   229: aload           5
        //   231: aload_2        
        //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   235: pop            
        //   236: aload           5
        //   238: ldc             ", but the wrapper available is of type: "
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: pop            
        //   244: aload           5
        //   246: aload           4
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: pop            
        //   252: aload           5
        //   254: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: pop            
        //   260: aload_3        
        //   261: aload           5
        //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   266: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   269: aload_3        
        //   270: athrow         
        //   271: astore_2       
        //   272: goto            289
        //   275: astore_2       
        //   276: new             Ljava/lang/IllegalStateException;
        //   279: astore_3       
        //   280: aload_3        
        //   281: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   283: aload_2        
        //   284: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   287: aload_3        
        //   288: athrow         
        //   289: aload_1        
        //   290: invokevirtual   aetf.close:()V
        //   293: goto            302
        //   296: astore_1       
        //   297: aload_2        
        //   298: aload_1        
        //   299: invokestatic    ezt.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   302: aload_2        
        //   303: athrow         
        //   304: astore_1       
        //   305: aload_2        
        //   306: invokevirtual   aetf.close:()V
        //   309: goto            318
        //   312: astore_2       
        //   313: aload_1        
        //   314: aload_2        
        //   315: invokestatic    ezt.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   318: aload_1        
        //   319: athrow         
        //   320: new             Ljava/lang/IllegalStateException;
        //   323: dup            
        //   324: ldc             "createPeer() called outside of onCreate"
        //   326: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   329: athrow         
        //   330: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     304    320    Any
        //  62     68     275    289    Ljava/lang/ClassCastException;
        //  62     68     271    304    Any
        //  68     192    271    304    Any
        //  197    271    271    304    Any
        //  276    289    271    304    Any
        //  289    293    296    302    Any
        //  305    309    312    318    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0289:
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
                ezt.a(t, t2);
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
        final c a = this.n().a;
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
                ezt.a(t, t2);
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
                ezt.a((Throwable)intent, t);
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
                ezt.a(t, t2);
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
                ezt.a((Throwable)configuration, t);
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
                    ezt.a((Throwable)bundle, t);
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
                ezt.a((Throwable)menu, t2);
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
                ezt.a(t, t2);
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
                    ezt.a((Throwable)intent, t);
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
                ezt.a((Throwable)menuItem, t);
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
                    ezt.a(t, t2);
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
                ezt.a((Throwable)configuration, t);
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
                    ezt.a((Throwable)bundle, t);
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
                ezt.a(t, t2);
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
                ezt.a((Throwable)menu, t);
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
                ezt.a((Throwable)(Object)array, t);
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
                    ezt.a(t, t2);
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
                    ezt.a((Throwable)bundle, t);
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
                    ezt.a(t, t2);
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
                    ezt.a(t, t2);
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
                ezt.a(t, t2);
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
                ezt.a(t, t2);
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
