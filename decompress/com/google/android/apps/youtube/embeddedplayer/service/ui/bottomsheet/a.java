// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.view.View;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aa;
import android.view.View$OnClickListener;

public final class a implements View$OnClickListener
{
    public final Object a;
    private final int b;
    
    public a(final aeba a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final aa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final d a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final g a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.d a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final UncertifiedDeviceActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final FullscreenErrorView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final EditActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final mbb a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public a(final pxs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final pyj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final qbk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.b:I
        //     4: tableswitch {
        //                0: 1215
        //                1: 1192
        //                2: 1079
        //                3: 1063
        //                4: 1046
        //                5: 1030
        //                6: 1019
        //                7: 973
        //                8: 950
        //                9: 939
        //               10: 928
        //               11: 864
        //               12: 832
        //               13: 785
        //               14: 771
        //               15: 760
        //               16: 749
        //               17: 709
        //               18: 278
        //               19: 120
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   104: checkcast       Lcom/google/android/libraries/user/profile/photopicker/edit/EditActivity;
        //   107: astore_1       
        //   108: aload_1        
        //   109: aload_1        
        //   110: invokevirtual   com/google/android/libraries/user/profile/photopicker/edit/EditActivity.getIntent:()Landroid/content/Intent;
        //   113: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   116: invokevirtual   com/google/android/libraries/user/profile/photopicker/edit/EditActivity.e:(Landroid/net/Uri;)V
        //   119: return         
        //   120: aload_0        
        //   121: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   124: checkcast       Lcom/google/android/libraries/user/profile/photopicker/edit/EditActivity;
        //   127: astore          8
        //   129: aload           8
        //   131: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.i:Lcom/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView;
        //   134: astore_1       
        //   135: aload_1        
        //   136: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   139: astore          9
        //   141: aload           9
        //   143: ifnull          154
        //   146: aload           9
        //   148: invokevirtual   android/animation/ValueAnimator.isRunning:()Z
        //   151: ifne            261
        //   154: new             Landroid/graphics/Matrix;
        //   157: dup            
        //   158: aload_1        
        //   159: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.b:Landroid/graphics/Matrix;
        //   162: invokespecial   android/graphics/Matrix.<init>:(Landroid/graphics/Matrix;)V
        //   165: astore          9
        //   167: aload_1        
        //   168: iconst_2       
        //   169: newarray        F
        //   171: dup            
        //   172: iconst_0       
        //   173: fconst_0       
        //   174: fastore        
        //   175: dup            
        //   176: iconst_1       
        //   177: ldc             -90.0
        //   179: fastore        
        //   180: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   183: putfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   186: aload_1        
        //   187: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   190: new             Latu;
        //   193: dup            
        //   194: invokespecial   atu.<init>:()V
        //   197: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //   200: aload_1        
        //   201: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   204: new             Llez;
        //   207: dup            
        //   208: aload_1        
        //   209: aload           9
        //   211: iconst_4       
        //   212: invokespecial   lez.<init>:(Lcom/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView;Landroid/graphics/Matrix;I)V
        //   215: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   218: aload_1        
        //   219: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   222: new             Lqwa;
        //   225: dup            
        //   226: aload_1        
        //   227: aload           9
        //   229: invokespecial   qwa.<init>:(Lcom/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView;Landroid/graphics/Matrix;)V
        //   232: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   235: aload_1        
        //   236: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   239: getstatic       arug.a:Larug;
        //   242: invokevirtual   arug.c:()Laruh;
        //   245: invokeinterface aruh.e:()J
        //   250: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   253: pop            
        //   254: aload_1        
        //   255: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.m:Landroid/animation/ValueAnimator;
        //   258: invokevirtual   android/animation/ValueAnimator.start:()V
        //   261: aload           8
        //   263: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.d:Lpbq;
        //   266: invokestatic    pbp.a:()Lpbp;
        //   269: aload           8
        //   271: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.h:Landroid/support/v7/widget/AppCompatImageButton;
        //   274: invokevirtual   pbq.a:(Lpbp;Landroid/view/View;)V
        //   277: return         
        //   278: aload_0        
        //   279: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   282: checkcast       Lcom/google/android/libraries/user/profile/photopicker/edit/EditActivity;
        //   285: astore          8
        //   287: aload           8
        //   289: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.m:Lacye;
        //   292: astore          10
        //   294: aload           10
        //   296: getfield        acye.f:Ljava/lang/Object;
        //   299: astore_1       
        //   300: getstatic       aguo.a:Laguo;
        //   303: invokevirtual   ahcz.createBuilder:()Lahcr;
        //   306: astore          9
        //   308: aload           10
        //   310: getfield        acye.c:I
        //   313: istore          5
        //   315: aload           9
        //   317: invokevirtual   ahcr.copyOnWrite:()V
        //   320: aload           9
        //   322: getfield        ahcr.instance:Lahcz;
        //   325: checkcast       Laguo;
        //   328: astore          10
        //   330: aload           10
        //   332: iconst_5       
        //   333: putfield        aguo.c:I
        //   336: aload           10
        //   338: aload           10
        //   340: getfield        aguo.b:I
        //   343: iconst_1       
        //   344: ior            
        //   345: putfield        aguo.b:I
        //   348: aload           9
        //   350: invokevirtual   ahcr.build:()Lahcz;
        //   353: checkcast       Laguo;
        //   356: astore          9
        //   358: aload_1        
        //   359: checkcast       Lquv;
        //   362: aload           9
        //   364: invokevirtual   quv.e:(Laguo;)V
        //   367: aload           8
        //   369: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.f:Lqwh;
        //   372: astore          9
        //   374: aload           8
        //   376: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.i:Lcom/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView;
        //   379: astore          10
        //   381: aload           10
        //   383: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.a:Landroid/graphics/drawable/Drawable;
        //   386: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicHeight:()I
        //   389: i2f            
        //   390: fstore          4
        //   392: aload           10
        //   394: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.a:Landroid/graphics/drawable/Drawable;
        //   397: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //   400: i2f            
        //   401: fstore_3       
        //   402: aload           10
        //   404: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.c:Landroid/graphics/Rect;
        //   407: getfield        android/graphics/Rect.left:I
        //   410: ineg           
        //   411: istore          7
        //   413: aload           10
        //   415: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.c:Landroid/graphics/Rect;
        //   418: getfield        android/graphics/Rect.top:I
        //   421: ineg           
        //   422: istore          5
        //   424: aload           10
        //   426: invokevirtual   com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.b:()F
        //   429: fstore_2       
        //   430: fload_3        
        //   431: fload_2        
        //   432: fdiv           
        //   433: fload           4
        //   435: fload_2        
        //   436: fdiv           
        //   437: invokestatic    java/lang/Math.min:(FF)F
        //   440: fstore_2       
        //   441: fload_2        
        //   442: invokestatic    arug.b:()J
        //   445: l2f            
        //   446: fcmpl          
        //   447: ifle            468
        //   450: invokestatic    arug.b:()J
        //   453: l2i            
        //   454: invokestatic    arug.b:()J
        //   457: l2i            
        //   458: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   461: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   464: astore_1       
        //   465: goto            483
        //   468: fload_2        
        //   469: f2i            
        //   470: istore          6
        //   472: iload           6
        //   474: iload           6
        //   476: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   479: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   482: astore_1       
        //   483: new             Landroid/graphics/Canvas;
        //   486: dup            
        //   487: aload_1        
        //   488: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   491: astore          11
        //   493: new             Landroid/graphics/Matrix;
        //   496: dup            
        //   497: aload           10
        //   499: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.b:Landroid/graphics/Matrix;
        //   502: invokespecial   android/graphics/Matrix.<init>:(Landroid/graphics/Matrix;)V
        //   505: astore          12
        //   507: iload           7
        //   509: iload           5
        //   511: iadd           
        //   512: ifeq            527
        //   515: aload           12
        //   517: iload           7
        //   519: i2f            
        //   520: iload           5
        //   522: i2f            
        //   523: invokevirtual   android/graphics/Matrix.postTranslate:(FF)Z
        //   526: pop            
        //   527: aload           10
        //   529: invokevirtual   com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.a:()F
        //   532: fstore_3       
        //   533: fload_3        
        //   534: fconst_0       
        //   535: fcmpl          
        //   536: ifeq            551
        //   539: fconst_1       
        //   540: fload_3        
        //   541: fdiv           
        //   542: fstore_3       
        //   543: aload           12
        //   545: fload_3        
        //   546: fload_3        
        //   547: invokevirtual   android/graphics/Matrix.postScale:(FF)Z
        //   550: pop            
        //   551: fload_2        
        //   552: invokestatic    arug.b:()J
        //   555: l2f            
        //   556: fcmpl          
        //   557: ifle            578
        //   560: aload           12
        //   562: invokestatic    arug.b:()J
        //   565: l2f            
        //   566: fload_2        
        //   567: fdiv           
        //   568: invokestatic    arug.b:()J
        //   571: l2f            
        //   572: fload_2        
        //   573: fdiv           
        //   574: invokevirtual   android/graphics/Matrix.postScale:(FF)Z
        //   577: pop            
        //   578: aload           11
        //   580: aload           12
        //   582: invokevirtual   android/graphics/Canvas.concat:(Landroid/graphics/Matrix;)V
        //   585: aload           10
        //   587: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditablePhotoView.a:Landroid/graphics/drawable/Drawable;
        //   590: aload           11
        //   592: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   595: aload           9
        //   597: getfield        qwh.g:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   600: iconst_0       
        //   601: iconst_1       
        //   602: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        //   605: ifeq            692
        //   608: aload           9
        //   610: getfield        qwh.e:Lafce;
        //   613: astore          10
        //   615: aload           10
        //   617: invokevirtual   afce.e:()V
        //   620: aload           10
        //   622: invokevirtual   afce.f:()V
        //   625: aload           9
        //   627: getfield        qwh.f:Lauz;
        //   630: astore          11
        //   632: invokestatic    qwi.a:()Ladsj;
        //   635: astore          10
        //   637: aload           10
        //   639: iconst_2       
        //   640: putfield        adsj.a:I
        //   643: aload           11
        //   645: aload           10
        //   647: invokevirtual   adsj.d:()Lqwi;
        //   650: invokevirtual   auz.k:(Ljava/lang/Object;)V
        //   653: new             Lost;
        //   656: dup            
        //   657: aload           9
        //   659: aload_1        
        //   660: bipush          8
        //   662: invokespecial   ost.<init>:(Lqwh;Landroid/graphics/Bitmap;I)V
        //   665: aload           9
        //   667: getfield        qwh.c:Lafxj;
        //   670: invokestatic    afxr.p:(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   673: new             Lnqg;
        //   676: dup            
        //   677: aload           9
        //   679: bipush          12
        //   681: invokespecial   nqg.<init>:(Lqwh;I)V
        //   684: aload           9
        //   686: getfield        qwh.c:Lafxj;
        //   689: invokestatic    afxr.v:(Lcom/google/common/util/concurrent/ListenableFuture;Lafwr;Ljava/util/concurrent/Executor;)V
        //   692: aload           8
        //   694: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.d:Lpbq;
        //   697: invokestatic    pbp.a:()Lpbp;
        //   700: aload           8
        //   702: getfield        com/google/android/libraries/user/profile/photopicker/edit/EditActivity.g:Lcom/google/android/material/button/MaterialButton;
        //   705: invokevirtual   pbq.a:(Lpbp;Landroid/view/View;)V
        //   708: return         
        //   709: aload_0        
        //   710: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   713: checkcast       Lcom/google/android/libraries/user/profile/photopicker/common/view/error/FullscreenErrorView;
        //   716: astore_1       
        //   717: aload_1        
        //   718: getfield        com/google/android/libraries/user/profile/photopicker/common/view/error/FullscreenErrorView.d:Lpbq;
        //   721: invokestatic    pbp.a:()Lpbp;
        //   724: aload_1        
        //   725: getfield        com/google/android/libraries/user/profile/photopicker/common/view/error/FullscreenErrorView.g:Lcom/google/android/material/button/MaterialButton;
        //   728: invokevirtual   pbq.a:(Lpbp;Landroid/view/View;)V
        //   731: aload_1        
        //   732: invokevirtual   com/google/android/libraries/user/profile/photopicker/common/view/error/FullscreenErrorView.getContext:()Landroid/content/Context;
        //   735: new             Landroid/content/Intent;
        //   738: dup            
        //   739: ldc_w           "android.settings.SETTINGS"
        //   742: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   745: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
        //   748: return         
        //   749: aload_0        
        //   750: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   753: checkcast       Laeax;
        //   756: invokevirtual   aeax.d:()V
        //   759: return         
        //   760: aload_0        
        //   761: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   764: checkcast       Laeax;
        //   767: invokevirtual   aeax.d:()V
        //   770: return         
        //   771: aload_0        
        //   772: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   775: checkcast       Lqbk;
        //   778: invokevirtual   qbk.oa:()Lbu;
        //   781: invokevirtual   qu.onBackPressed:()V
        //   784: return         
        //   785: aload_0        
        //   786: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   789: checkcast       Lqbk;
        //   792: astore_1       
        //   793: aload_1        
        //   794: getfield        qbk.d:Landroid/view/View;
        //   797: iconst_0       
        //   798: invokevirtual   android/view/View.setVisibility:(I)V
        //   801: aload_1        
        //   802: getfield        qbk.e:Landroid/view/View;
        //   805: iconst_0       
        //   806: invokevirtual   android/view/View.setVisibility:(I)V
        //   809: aload_1        
        //   810: getfield        qbk.ae:Landroid/view/View;
        //   813: bipush          8
        //   815: invokevirtual   android/view/View.setVisibility:(I)V
        //   818: aload_1        
        //   819: getfield        qbk.c:Landroid/webkit/WebView;
        //   822: bipush          8
        //   824: invokevirtual   android/webkit/WebView.setVisibility:(I)V
        //   827: aload_1        
        //   828: invokevirtual   qbk.p:()V
        //   831: return         
        //   832: aload_0        
        //   833: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   836: checkcast       Lpyj;
        //   839: astore          8
        //   841: aload           8
        //   843: getfield        pyj.f:Lpyl;
        //   846: getfield        pyl.f:Lpzr;
        //   849: invokestatic    pbp.c:()Lpjr;
        //   852: aload_1        
        //   853: invokeinterface pzr.f:(Lpjr;Landroid/view/View;)V
        //   858: aload           8
        //   860: invokevirtual   pyj.c:()V
        //   863: return         
        //   864: aload_0        
        //   865: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   868: checkcast       Lpyj;
        //   871: astore          8
        //   873: aload           8
        //   875: getfield        pyj.f:Lpyl;
        //   878: getfield        pyl.f:Lpzr;
        //   881: invokestatic    pbp.c:()Lpjr;
        //   884: aload_1        
        //   885: invokeinterface pzr.f:(Lpjr;Landroid/view/View;)V
        //   890: aload           8
        //   892: getfield        pyj.b:Z
        //   895: ifeq            905
        //   898: getstatic       ahjd.S:Lahjd;
        //   901: astore_1       
        //   902: goto            909
        //   905: getstatic       ahjd.R:Lahjd;
        //   908: astore_1       
        //   909: aload           8
        //   911: aload_1        
        //   912: invokevirtual   pyj.i:(Lahjd;)V
        //   915: aload           8
        //   917: aload           8
        //   919: getfield        pyj.b:Z
        //   922: iconst_1       
        //   923: ixor           
        //   924: invokevirtual   pyj.m:(Z)V
        //   927: return         
        //   928: aload_0        
        //   929: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   932: checkcast       Lpxs;
        //   935: invokevirtual   pxs.aK:()V
        //   938: return         
        //   939: aload_0        
        //   940: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   943: checkcast       Lcom/google/android/gms/gmscompliance/ui/UncertifiedDeviceActivity;
        //   946: invokevirtual   com/google/android/gms/gmscompliance/ui/UncertifiedDeviceActivity.finish:()V
        //   949: return         
        //   950: aload_0        
        //   951: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   954: astore          8
        //   956: aload_1        
        //   957: invokevirtual   android/view/View.getId:()I
        //   960: istore          5
        //   962: aload           8
        //   964: checkcast       Lmbb;
        //   967: iload           5
        //   969: invokevirtual   mbb.d:(I)V
        //   972: return         
        //   973: aload_0        
        //   974: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //   977: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/ui/relatedvideos/remoteloaded/d;
        //   980: astore          8
        //   982: aload           8
        //   984: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/relatedvideos/remoteloaded/d.y:Ljava/lang/ref/WeakReference;
        //   987: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   990: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/uiregistrar/shared/c;
        //   993: astore_1       
        //   994: aload_1        
        //   995: ifnull          1018
        //   998: aload           8
        //  1000: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/relatedvideos/remoteloaded/d.u:Lcom/google/android/apps/youtube/embeddedplayer/service/model/SelectableItemKey;
        //  1003: astore          8
        //  1005: aload           8
        //  1007: ifnull          1018
        //  1010: aload_1        
        //  1011: aload           8
        //  1013: invokeinterface com/google/android/apps/youtube/embeddedplayer/service/uiregistrar/shared/c.a:(Lcom/google/android/apps/youtube/embeddedplayer/service/model/SelectableItemKey;)V
        //  1018: return         
        //  1019: aload_0        
        //  1020: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1023: checkcast       Labcq;
        //  1026: invokevirtual   abcq.mk:()V
        //  1029: return         
        //  1030: aload_0        
        //  1031: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1034: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/ui/overlays/adoverlay/remoteloaded/g;
        //  1037: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/overlays/adoverlay/remoteloaded/g.b:Lsmo;
        //  1040: invokeinterface smo.d:()V
        //  1045: return         
        //  1046: aload_0        
        //  1047: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1050: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/ui/overlays/adoverlay/remoteloaded/g;
        //  1053: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/overlays/adoverlay/remoteloaded/g.b:Lsmo;
        //  1056: aconst_null    
        //  1057: invokeinterface smo.a:(Landroid/os/Bundle;)V
        //  1062: return         
        //  1063: aload_0        
        //  1064: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1067: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/ui/overlays/adoverlay/remoteloaded/g;
        //  1070: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/overlays/adoverlay/remoteloaded/g.b:Lsmo;
        //  1073: invokeinterface smo.b:()V
        //  1078: return         
        //  1079: aload_0        
        //  1080: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1083: astore          9
        //  1085: aload           9
        //  1087: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a;
        //  1090: astore          10
        //  1092: aload           10
        //  1094: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.i:Ljava/lang/ref/WeakReference;
        //  1097: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //  1100: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/uiregistrar/shared/c;
        //  1103: astore          11
        //  1105: aload           11
        //  1107: ifnonnull       1113
        //  1110: goto            1191
        //  1113: aload_1        
        //  1114: aload           10
        //  1116: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.b:Landroid/widget/RelativeLayout;
        //  1119: if_acmpne       1132
        //  1122: aload           10
        //  1124: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.g:Lcom/google/android/apps/youtube/embeddedplayer/service/model/SelectableItemKey;
        //  1127: astore          8
        //  1129: goto            1158
        //  1132: aload_1        
        //  1133: aload           10
        //  1135: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.a:Lcom/google/android/libraries/youtube/common/ui/TouchImageView;
        //  1138: if_acmpne       1151
        //  1141: aload           10
        //  1143: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.h:Lcom/google/android/apps/youtube/embeddedplayer/service/model/SelectableItemKey;
        //  1146: astore          8
        //  1148: goto            1158
        //  1151: aload           10
        //  1153: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.f:Lcom/google/android/apps/youtube/embeddedplayer/service/model/SelectableItemKey;
        //  1156: astore          8
        //  1158: aload           8
        //  1160: ifnull          1191
        //  1163: aload           11
        //  1165: aload           8
        //  1167: invokeinterface com/google/android/apps/youtube/embeddedplayer/service/uiregistrar/shared/c.a:(Lcom/google/android/apps/youtube/embeddedplayer/service/model/SelectableItemKey;)V
        //  1172: aload           10
        //  1174: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/mutedautoplay/remoteloaded/a.d:Landroid/view/View$OnClickListener;
        //  1177: aload_1        
        //  1178: invokeinterface android/view/View$OnClickListener.onClick:(Landroid/view/View;)V
        //  1183: aload           9
        //  1185: checkcast       Labcq;
        //  1188: invokevirtual   abcq.X:()V
        //  1191: return         
        //  1192: aload_0        
        //  1193: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1196: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/jar/client/aa;
        //  1199: astore_1       
        //  1200: aload_1        
        //  1201: getfield        com/google/android/apps/youtube/embeddedplayer/service/jar/client/aa.s:Lcom/google/android/apps/youtube/embeddedplayer/service/ui/preview/remoteloaded/g;
        //  1204: invokevirtual   com/google/android/apps/youtube/embeddedplayer/service/ui/preview/remoteloaded/g.n:()V
        //  1207: aload_1        
        //  1208: getfield        com/google/android/apps/youtube/embeddedplayer/service/jar/client/aa.o:Lcom/google/android/apps/youtube/embeddedplayer/service/ui/overlays/controlsoverlay/remoteloaded/k;
        //  1211: invokevirtual   com/google/android/apps/youtube/embeddedplayer/service/ui/overlays/controlsoverlay/remoteloaded/k.oD:()V
        //  1214: return         
        //  1215: aload_0        
        //  1216: getfield        com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/a.a:Ljava/lang/Object;
        //  1219: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/d;
        //  1222: invokevirtual   com/google/android/apps/youtube/embeddedplayer/service/ui/bottomsheet/d.cancel:()V
        //  1225: return         
        //  1226: astore_1       
        //  1227: goto            1018
        //  1230: astore          8
        //  1232: goto            1172
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  1010   1018   1226   1230   Landroid/os/RemoteException;
        //  1163   1172   1230   1235   Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1172:
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
}
