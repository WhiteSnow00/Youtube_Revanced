// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.image;

import android.view.MenuItem;
import android.view.Menu;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectCommandOuterClass;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class ImageGalleryActivity extends sqh implements aeou, aepm
{
    private sql b;
    private final aerz c;
    private boolean d;
    private Context e;
    private auo f;
    private boolean g;
    
    public ImageGalleryActivity() {
        this.c = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new jmk(this, 18));
    }
    
    private final sql e() {
        this.d();
        return this.b;
    }
    
    public final /* bridge */ Object aN() {
        final sql b = this.b;
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
        //     1: getfield        com/google/android/libraries/youtube/comment/image/ImageGalleryActivity.b:Lsql;
        //     4: ifnonnull       406
        //     7: aload_0        
        //     8: getfield        com/google/android/libraries/youtube/comment/image/ImageGalleryActivity.d:Z
        //    11: ifeq            396
        //    14: aload_0        
        //    15: getfield        com/google/android/libraries/youtube/comment/image/ImageGalleryActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/libraries/youtube/comment/image/ImageGalleryActivity.isFinishing:()Z
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
        //    48: invokevirtual   sqh.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   sqh.aR:()Ljava/lang/Object;
        //    66: astore_2       
        //    67: aload_2        
        //    68: checkcast       Lesp;
        //    71: getfield        esp.gN:Lesp;
        //    74: getfield        esp.a:Lepu;
        //    77: astore          8
        //    79: aload           8
        //    81: getfield        epu.aC:Lesp;
        //    84: getfield        esp.d:Latke;
        //    87: invokeinterface atke.a:()Ljava/lang/Object;
        //    92: checkcast       Landroid/app/Activity;
        //    95: astore          4
        //    97: aload           4
        //    99: instanceof      Lcom/google/android/libraries/youtube/comment/image/ImageGalleryActivity;
        //   102: ifeq            273
        //   105: aload           4
        //   107: checkcast       Lcom/google/android/libraries/youtube/comment/image/ImageGalleryActivity;
        //   110: astore          6
        //   112: aload           6
        //   114: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   117: pop            
        //   118: aload           8
        //   120: getfield        epu.a:Leqy;
        //   123: getfield        eqy.a:Lera;
        //   126: getfield        era.cg:Latke;
        //   129: invokeinterface atke.a:()Ljava/lang/Object;
        //   134: checkcast       Lsva;
        //   137: astore_2       
        //   138: aload           8
        //   140: getfield        epu.a:Leqy;
        //   143: getfield        eqy.a:Lera;
        //   146: getfield        era.cf:Latke;
        //   149: invokeinterface atke.a:()Ljava/lang/Object;
        //   154: checkcast       Ltlc;
        //   157: astore          4
        //   159: aload           8
        //   161: getfield        epu.aC:Lesp;
        //   164: getfield        esp.F:Latke;
        //   167: invokeinterface atke.a:()Ljava/lang/Object;
        //   172: checkcast       Lvcy;
        //   175: astore          7
        //   177: aload           8
        //   179: getfield        epu.a:Leqy;
        //   182: getfield        eqy.aC:Latke;
        //   185: invokeinterface atke.a:()Ljava/lang/Object;
        //   190: checkcast       Lzmf;
        //   193: astore          5
        //   195: aload           8
        //   197: getfield        epu.a:Leqy;
        //   200: getfield        eqy.gy:Latke;
        //   203: invokeinterface atke.a:()Ljava/lang/Object;
        //   208: checkcast       Lzlv;
        //   211: astore_3       
        //   212: aload           8
        //   214: getfield        epu.a:Leqy;
        //   217: getfield        eqy.ka:Latke;
        //   220: invokeinterface atke.a:()Ljava/lang/Object;
        //   225: checkcast       Lvai;
        //   228: astore          9
        //   230: new             Lsql;
        //   233: astore          8
        //   235: aload           8
        //   237: aload           6
        //   239: aload_2        
        //   240: aload           4
        //   242: aload           7
        //   244: aload           5
        //   246: aload_3        
        //   247: aload           9
        //   249: aconst_null    
        //   250: aconst_null    
        //   251: invokespecial   sql.<init>:(Lcom/google/android/libraries/youtube/comment/image/ImageGalleryActivity;Lsva;Ltlc;Lvcy;Lzmf;Lzlv;Lvai;[B[B)V
        //   254: aload_0        
        //   255: aload           8
        //   257: putfield        com/google/android/libraries/youtube/comment/image/ImageGalleryActivity.b:Lsql;
        //   260: aload_1        
        //   261: invokevirtual   aetf.close:()V
        //   264: aload_0        
        //   265: getfield        com/google/android/libraries/youtube/comment/image/ImageGalleryActivity.b:Lsql;
        //   268: aload_0        
        //   269: putfield        sql.f:Lcom/google/android/libraries/youtube/comment/image/ImageGalleryActivity;
        //   272: return         
        //   273: new             Ljava/lang/IllegalStateException;
        //   276: astore_3       
        //   277: ldc             Lsql;.class
        //   279: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   282: astore_2       
        //   283: aload           4
        //   285: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   288: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   291: astore          5
        //   293: new             Ljava/lang/StringBuilder;
        //   296: astore          4
        //   298: aload           4
        //   300: ldc             "Attempt to inject a Activity wrapper of type "
        //   302: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   305: aload           4
        //   307: aload_2        
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: pop            
        //   312: aload           4
        //   314: ldc             ", but the wrapper available is of type: "
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: pop            
        //   320: aload           4
        //   322: aload           5
        //   324: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   327: pop            
        //   328: aload           4
        //   330: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: pop            
        //   336: aload_3        
        //   337: aload           4
        //   339: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   342: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   345: aload_3        
        //   346: athrow         
        //   347: astore_2       
        //   348: goto            365
        //   351: astore_2       
        //   352: new             Ljava/lang/IllegalStateException;
        //   355: astore_3       
        //   356: aload_3        
        //   357: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   359: aload_2        
        //   360: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   363: aload_3        
        //   364: athrow         
        //   365: aload_1        
        //   366: invokevirtual   aetf.close:()V
        //   369: goto            378
        //   372: astore_1       
        //   373: aload_2        
        //   374: aload_1        
        //   375: invokestatic    qdt.ab:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   378: aload_2        
        //   379: athrow         
        //   380: astore_1       
        //   381: aload_2        
        //   382: invokevirtual   aetf.close:()V
        //   385: goto            394
        //   388: astore_2       
        //   389: aload_1        
        //   390: aload_2        
        //   391: invokestatic    qdt.ab:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   394: aload_1        
        //   395: athrow         
        //   396: new             Ljava/lang/IllegalStateException;
        //   399: dup            
        //   400: ldc             "createPeer() called outside of onCreate"
        //   402: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   405: athrow         
        //   406: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     380    396    Any
        //  62     67     351    365    Ljava/lang/ClassCastException;
        //  62     67     347    380    Any
        //  67     260    347    380    Any
        //  273    347    347    380    Any
        //  352    365    347    380    Any
        //  365    369    372    378    Any
        //  381    385    388    394    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0365:
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
                qdt.ab(t, t2);
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
                qdt.ab(t, t2);
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
                qdt.ab((Throwable)intent, t);
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
                qdt.ab(t, t2);
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
                qdt.ab((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(Bundle extras) {
        final aett s = this.c.s();
        boolean b = true;
        try {
            this.d = true;
            ((aepn)((dh)this).getLifecycle()).h(this.c);
            final sql e = this.e();
            ((sqm)e).f.onCreate((Bundle)extras);
            e.e.b((sqx)e);
            if (e.d.aU()) {
                ((fa)e.a).setTheme(2132084287);
            }
            e.a.setRequestedOrientation(1);
            ((qt)e.a).setContentView(2131624535);
            extras = e.a.getIntent().getExtras();
            final aiqj aiqj = null;
            byte[] byteArray;
            if (extras != null) {
                byteArray = ((Bundle)extras).getByteArray("navigation_endpoint");
            }
            else {
                byteArray = null;
            }
            aiqj b2;
            if (byteArray != null) {
                b2 = vdb.b(byteArray);
            }
            else {
                b2 = null;
            }
            Label_0741: {
                if (b2 != null && ((ahbc)b2).ry((ahaq)ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand)) {
                    e.f((akdx)((ahbc)b2).rx((ahaq)ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand), false);
                }
                else if (b2 != null && ((ahbc)b2).ry((ahaq)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint)) {
                    final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint)((ahbc)b2).rx((ahaq)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint);
                    e.c = Optional.of((Object)backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
                    final ImageGalleryActivity a = e.a;
                    final String[] n = acuo.n((Context)a, acuq.p((Context)a, 4));
                    if (n.length == 0) {
                        e.e(b2);
                    }
                    else {
                        anuv anuv;
                        if ((anuv = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j) == null) {
                            anuv = anuv.a;
                        }
                        if (((ahbc)anuv).ry((ahaq)PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
                            anuv anuv2;
                            if ((anuv2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j) == null) {
                                anuv2 = anuv.a;
                            }
                            if (((anmb)((ahbc)anuv2).rx((ahaq)PostImagePickerRendererOuterClass.postImagePickerRenderer)).h.size() > 0) {
                                anuv anuv3;
                                if ((anuv3 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j) == null) {
                                    anuv3 = anuv.a;
                                }
                                aiqj aiqj2 = null;
                                Label_0576: {
                                    if (!((ahbc)anuv3).ry((ahaq)PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
                                        aiqj2 = aiqj;
                                    }
                                    else {
                                        anuv anuv4;
                                        if ((anuv4 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j) == null) {
                                            anuv4 = anuv.a;
                                        }
                                        final anmb anmb = (anmb)((ahbc)anuv4).rx((ahaq)PostImagePickerRendererOuterClass.postImagePickerRenderer);
                                        for (final aiqj aiqj3 : anmb.h) {
                                            if (((ahbc)aiqj3).ry((ahaq)CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint)) {
                                                final CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint)((ahbc)aiqj3).rx((ahaq)CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint);
                                                ajaf ajaf;
                                                if ((ajaf = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b) == null) {
                                                    ajaf = ajaf.a;
                                                }
                                                if (ajaf.b != 118523928) {
                                                    continue;
                                                }
                                                ajaf ajaf2;
                                                if ((ajaf2 = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b) == null) {
                                                    ajaf2 = ajaf.a;
                                                }
                                                ahzp a2;
                                                if (ajaf2.b == 118523928) {
                                                    a2 = (ahzp)ajaf2.c;
                                                }
                                                else {
                                                    a2 = ahzp.a;
                                                }
                                                ahzt ahzt;
                                                if ((ahzt = ahzt.b(a2.R)) == null) {
                                                    ahzt = ahzt.a;
                                                }
                                                if (ahzt == ahzt.b) {
                                                    aiqj2 = aiqj3;
                                                    break Label_0576;
                                                }
                                                continue;
                                            }
                                        }
                                        aiqj2 = aiqj;
                                        if ((anmb.b & 0x10) != 0x0 && (aiqj2 = anmb.g) == null) {
                                            aiqj2 = aiqj.a;
                                        }
                                    }
                                }
                                if (aiqj2 != null) {
                                    e.b.a(aiqj2);
                                }
                                break Label_0741;
                            }
                        }
                        final String string = ((fa)e.a).getResources().getString(2132018165);
                        final String string2 = ((fa)e.a).getResources().getString(2132018166);
                        if (n == null) {
                            b = false;
                        }
                        adkp.H(b);
                        string.getClass();
                        string2.getClass();
                        final acuo acuo = new acuo();
                        final Bundle bundle = new Bundle();
                        bundle.putStringArray("missing_permissions", n);
                        bundle.putCharSequence("allow_access_description", (CharSequence)string);
                        bundle.putCharSequence("open_settings_description", (CharSequence)string2);
                        acuo.ag(bundle);
                        acuo.d = new uix(e, b2);
                        e.d((br)acuo, false);
                    }
                }
                else {
                    ttr.b("BackstageImageUploadEndpoint is missing.");
                }
            }
            this.d = false;
            if (s != null) {
                s.close();
            }
        }
        finally {
            Label_0781: {
                if (s != null) {
                    try {
                        s.close();
                        break Label_0781;
                    }
                    finally {
                        final Throwable t;
                        qdt.ab((Throwable)extras, t);
                    }
                    break Label_0781;
                }
                break Label_0781;
            }
            while (true) {}
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
                qdt.ab((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aett d = this.c.d();
        try {
            super.onDestroy();
            final sql e = this.e();
            e.e.d((sqx)e);
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
                qdt.ab(t, t2);
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
                    qdt.ab((Throwable)intent, t);
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
                qdt.ab((Throwable)menuItem, t);
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
                    qdt.ab(t, t2);
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
                qdt.ab((Throwable)configuration, t);
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
                    qdt.ab((Throwable)bundle, t);
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
                qdt.ab(t, t2);
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
                qdt.ab((Throwable)menu, t);
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
                qdt.ab((Throwable)(Object)array, t);
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
                    qdt.ab(t, t2);
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
                    qdt.ab((Throwable)bundle, t);
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
                    qdt.ab(t, t2);
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
                    qdt.ab(t, t2);
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
                qdt.ab(t, t2);
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
                qdt.ab(t, t2);
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
