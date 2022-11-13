import android.app.AlertDialog$Builder;
import java.util.concurrent.CancellationException;
import java.io.IOException;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import java.util.Arrays;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import android.content.DialogInterface$OnClickListener;
import android.os.Bundle;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import java.util.ArrayList;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hun implements rod, adkg
{
    public UploadFrontendIdMapHelper A;
    public final List B;
    public final adkb C;
    public final adlp D;
    public final adjx E;
    public final atjm F;
    public final hts G;
    public long H;
    public boolean I;
    public boolean J;
    public ListenableFuture K;
    ListenableFuture L;
    public ListenableFuture M;
    final List N;
    public int O;
    public boolean P;
    public List Q;
    public boolean R;
    public boolean S;
    public final String T;
    public aphs U;
    public boolean V;
    public Boolean W;
    public final ucs X;
    public final adkp Y;
    public final arwh Z;
    public final UploadActivity a;
    public final adet aa;
    public final adlp ab;
    public final aujg ac;
    public final ziy ad;
    private final afvs ae;
    private final SharedPreferences af;
    private final zmf ag;
    private final acuq ah;
    private final atke ai;
    private final zhk aj;
    private int ak;
    private final adfq al;
    private final aeea am;
    public final aldf b;
    public final uqb c;
    public final wyw d;
    public final adia e;
    public final gbc f;
    public final gbu g;
    public boolean h;
    public rob i;
    public boolean j;
    public long k;
    public long l;
    public zgm m;
    public zgu n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public hum r;
    public final adqh s;
    public ViewAnimatorHelper t;
    public NestedScrollView u;
    public ImageView v;
    public ImageView w;
    public TextView x;
    public usu y;
    public AlertDialog z;
    
    public hun(final UploadActivity a, final afvs ae, final tjm tjm, final ziy ad, final aldf b, final arwh z, final adfq al, final adkp y, final uqb c, final adia e, final adkb c2, final adlp d, final adjx e2, final gbc f, final gbu g, final zmf ag, final aujg ac, final adet aa, final acuq ah, final atke ai, final atjm f2, final hts g2, final zhk aj, final ucs x, final aeea am, final wyw d2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        final boolean b2 = true;
        this.ak = 1;
        this.N = new ArrayList();
        this.O = 0;
        this.P = false;
        this.U = aphs.a;
        this.V = false;
        this.a = a;
        this.ae = ae;
        this.ad = ad;
        this.b = b;
        this.al = al;
        this.Z = z;
        this.Y = y;
        this.c = c;
        this.e = e;
        this.C = c2;
        this.D = d;
        this.E = e2;
        this.f = f;
        this.g = g;
        this.ag = ag;
        this.ac = ac;
        this.aa = aa;
        this.ah = ah;
        this.ai = ai;
        this.F = f2;
        this.G = g2;
        this.aj = aj;
        this.X = x;
        this.am = am;
        this.d = d2;
        this.j();
        final Intent intent = a.getIntent();
        String stringExtra;
        if (intent != null) {
            stringExtra = intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id");
        }
        else {
            stringExtra = null;
        }
        this.T = stringExtra;
        final SharedPreferences sharedPreferences = a.getSharedPreferences("youtube", 0);
        this.af = sharedPreferences;
        final boolean o = sharedPreferences.getBoolean("enable_upload_video_editing", false) || b.p;
        this.o = o;
        this.p = ((sharedPreferences.getBoolean("enable_upload_filters", false) || b.r) && o);
        boolean q = b2;
        if (!b.u) {
            a.getApplicationContext();
            q = false;
        }
        this.q = q;
        this.ab = new adlp((Context)a, sharedPreferences, tjm, new pvh(this), am, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.B = new ArrayList();
        this.s = new adqh((Context)a);
        x.d(false);
    }
    
    private static void A(final ListenableFuture listenableFuture) {
        if (listenableFuture != null && !listenableFuture.isDone()) {
            listenableFuture.cancel(true);
        }
    }
    
    private final void B(final boolean p) {
        this.P = p;
        this.a.runOnUiThread((Runnable)new dmv(this, p, 16));
    }
    
    public final void a(final String s) {
        this.a.runOnUiThread((Runnable)new hir(this, s, 16));
    }
    
    public final void b(final String s) {
    }
    
    public final alhi c() {
        return adkp.c(this.B, this.T);
    }
    
    public final void d() {
        ((huc)this.a).C();
    }
    
    public final void e() {
        synchronized (this) {
            if (this.ak != 1) {
                this.w(7);
            }
        }
    }
    
    public final void f() {
        this.d.J(3, (wzz)new wyt(xaa.c(152818)), adkp.c(this.B, this.T));
        final ucs x = this.X;
        if (x.b && x.f != ucn.c) {
            x.a = true;
            x.c();
            if (x.b && !x.e()) {
                final String h = x.h;
                if (h != null) {
                    x.m.E(h, apht.aW);
                }
            }
            return;
        }
        if (!this.B.isEmpty() && this.z == null && this.a.I != null) {
            if (this.P) {
                final Iterator iterator = this.B.iterator();
                EditableVideo bs;
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    bs = null;
                    if (!hasNext) {
                        break;
                    }
                    final adop adop = (adop)iterator.next();
                    this.D.d(adop.c(), (String)null, apht.aK, adop.b());
                }
                this.B(false);
                final usu y = this.y;
                if (y != null) {
                    bs = y.bs();
                }
                if (bs != null) {
                    this.k = bs.k() - bs.m();
                }
                else {
                    final Uri a = adjx.a(this.a.getIntent());
                    if (!a.equals((Object)Uri.EMPTY)) {
                        final Long i = utj.i(a);
                        if (i != null) {
                            this.k = i;
                        }
                        else {
                            final Iterator iterator2 = this.B.iterator();
                            while (iterator2.hasNext()) {
                                final Object j = ((adop)iterator2.next()).j;
                                if (j != null) {
                                    final admo admo = (admo)j;
                                    if ((admo.b & 0x2) == 0x0) {
                                        continue;
                                    }
                                    final long d = admo.d;
                                    if (d <= this.k) {
                                        continue;
                                    }
                                    this.k = d;
                                }
                            }
                        }
                    }
                }
                if (this.j && TimeUnit.MILLISECONDS.toSeconds(this.k) >= this.l) {
                    this.al.x((zpf)new fch(this, 8), 2);
                    return;
                }
                this.w(8);
            }
        }
    }
    
    public final void g(final int n, final alhi alhi) {
        final wyt wyt = new wyt(xaa.c(n));
        this.d.D((wzz)wyt);
        this.d.w((wzz)wyt, alhi);
    }
    
    public final void h() {
        this.d.b(xaa.b(9729), (aiqj)null, adkp.c(this.B, this.T));
        final cl supportFragmentManager = this.a.getSupportFragmentManager();
        this.i = (rob)supportFragmentManager.f("verificationFragmentTag");
        final ct i = supportFragmentManager.i();
        i.n((br)this.i);
        i.a();
        supportFragmentManager.ab();
        this.t.b(2131431410);
        this.B(true);
    }
    
    public final void i() {
        this.d.b(xaa.b(9729), (aiqj)null, adkp.c(this.B, this.T));
        this.w(8);
    }
    
    public final void j() {
        this.ak = 1;
        this.J = false;
        this.z = null;
        A(this.K);
        A(this.L);
        A(this.M);
        final Iterator iterator = this.N.iterator();
        while (iterator.hasNext()) {
            A((ListenableFuture)iterator.next());
        }
        this.N.clear();
        this.B(false);
    }
    
    public final void k(final Bundle bundle) {
        final cl supportFragmentManager = this.a.getSupportFragmentManager();
        final br g = supportFragmentManager.g(bundle, "verification_fragment_key");
        if (g != null) {
            this.i = (rob)g;
        }
        this.m = (zgm)supportFragmentManager.g(bundle, "thumbnail_fragment_key");
        this.n = (zgu)supportFragmentManager.g(bundle, "image_picker_fragment_key");
    }
    
    public final void l() {
        this.a.runOnUiThread((Runnable)new hol(this, 17));
    }
    
    protected final void m(final faq faq, final Context context, final String message) {
        if (this.S && !faq.isDestroyed()) {
            if (!faq.isFinishing()) {
                (this.z = ((AlertDialog$Builder)this.am.al(context)).setTitle(2132019987).setMessage((CharSequence)message).setPositiveButton(2132018939, (DialogInterface$OnClickListener)new ceh(this, 11)).setCancelable(false).create()).show();
            }
        }
    }
    
    public final void n() {
        final cl supportFragmentManager = this.a.getSupportFragmentManager();
        final br f = supportFragmentManager.f("edit_thumbnails_fragment");
        if (f != null) {
            this.t.b(2131428799);
            final ct i = supportFragmentManager.i();
            i.o(f);
            i.d();
        }
    }
    
    public final void o() {
        final UploadActivity a = this.a;
        this.m((faq)a, (Context)a, a.getResources().getQuantityString(2131886113, this.O + this.B.size()));
    }
    
    public final void p() {
        new acuu(acut.d((bu)this.a), this.d, (List)Arrays.asList(new PermissionDescriptor(0, xaa.c(18642), xaa.c(18643))), 2132020062, 0, (Runnable)tg.d, (Runnable)tg.e, this.ah).a();
    }
    
    public final void q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: getstatic       admy.a:Ladmy;
        //     5: astore          8
        //     7: aload_0        
        //     8: getfield        hun.ak:I
        //    11: istore_2       
        //    12: iload_2        
        //    13: iconst_1       
        //    14: isub           
        //    15: istore_3       
        //    16: iload_2        
        //    17: ifeq            3351
        //    20: iload_3        
        //    21: ifeq            3262
        //    24: iload_3        
        //    25: iconst_1       
        //    26: if_icmpeq       3148
        //    29: iload_3        
        //    30: iconst_2       
        //    31: if_icmpeq       3055
        //    34: iload_3        
        //    35: iconst_3       
        //    36: if_icmpeq       2870
        //    39: iload_3        
        //    40: iconst_4       
        //    41: if_icmpeq       2733
        //    44: iload_3        
        //    45: bipush          6
        //    47: if_icmpeq       2604
        //    50: iload_3        
        //    51: bipush          7
        //    53: if_icmpeq       59
        //    56: goto            3259
        //    59: aload_0        
        //    60: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //    63: getfield        com/google/android/apps/youtube/app/extensions/upload/UploadActivity.I:Lakui;
        //    66: astore          14
        //    68: aload_0        
        //    69: getfield        hun.y:Lusu;
        //    72: astore          8
        //    74: aload           8
        //    76: ifnull          89
        //    79: aload           8
        //    81: invokevirtual   usu.bs:()Lcom/google/android/libraries/video/editablevideo/EditableVideo;
        //    84: astore          11
        //    86: goto            92
        //    89: aconst_null    
        //    90: astore          11
        //    92: aload_0        
        //    93: getfield        hun.B:Ljava/util/List;
        //    96: invokeinterface java/util/List.size:()I
        //   101: anewarray       Ljava/lang/String;
        //   104: astore          16
        //   106: aload_0        
        //   107: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //   110: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //   113: invokestatic    adjx.a:(Landroid/content/Intent;)Landroid/net/Uri;
        //   116: astore          17
        //   118: aload_0        
        //   119: getfield        hun.B:Ljava/util/List;
        //   122: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   127: astore          18
        //   129: iconst_0       
        //   130: istore_3       
        //   131: aconst_null    
        //   132: astore          10
        //   134: aload           18
        //   136: invokeinterface java/util/Iterator.hasNext:()Z
        //   141: ifeq            1143
        //   144: aload           18
        //   146: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   151: checkcast       Ladop;
        //   154: astore          19
        //   156: getstatic       android/net/Uri.EMPTY:Landroid/net/Uri;
        //   159: aload           17
        //   161: invokevirtual   android/net/Uri.equals:(Ljava/lang/Object;)Z
        //   164: ifne            193
        //   167: aload_0        
        //   168: getfield        hun.C:Ladkb;
        //   171: aload           19
        //   173: invokevirtual   adop.c:()Ljava/lang/String;
        //   176: aload           17
        //   178: invokeinterface adkb.q:(Ljava/lang/String;Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   183: pop            
        //   184: aload           17
        //   186: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   189: pop            
        //   190: goto            235
        //   193: aload           11
        //   195: ifnull          235
        //   198: aload           11
        //   200: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.K:()Z
        //   203: ifne            235
        //   206: aload           11
        //   208: invokestatic    utj.e:(Lcom/google/android/libraries/video/editablevideo/EditableVideo;)Landroid/net/Uri;
        //   211: astore          8
        //   213: aload           8
        //   215: ifnull          235
        //   218: aload_0        
        //   219: getfield        hun.C:Ladkb;
        //   222: aload           19
        //   224: invokevirtual   adop.c:()Ljava/lang/String;
        //   227: aload           8
        //   229: invokeinterface adkb.q:(Ljava/lang/String;Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   234: pop            
        //   235: aload           14
        //   237: getfield        akui.g:Lakud;
        //   240: astore          9
        //   242: aload           9
        //   244: astore          8
        //   246: aload           9
        //   248: ifnonnull       256
        //   251: getstatic       akud.a:Lakud;
        //   254: astore          8
        //   256: aload           8
        //   258: getfield        akud.c:Ljava/lang/String;
        //   261: astore          8
        //   263: aload           8
        //   265: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   268: ifeq            297
        //   271: new             Ljava/util/Date;
        //   274: astore          8
        //   276: aload           8
        //   278: invokespecial   java/util/Date.<init>:()V
        //   281: iconst_1       
        //   282: invokestatic    java/text/DateFormat.getDateInstance:(I)Ljava/text/DateFormat;
        //   285: aload           8
        //   287: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //   290: astore          8
        //   292: iconst_1       
        //   293: istore_2       
        //   294: goto            299
        //   297: iconst_0       
        //   298: istore_2       
        //   299: aload           14
        //   301: getfield        akui.g:Lakud;
        //   304: astore          12
        //   306: aload           12
        //   308: ifnonnull       319
        //   311: getstatic       akud.a:Lakud;
        //   314: astore          13
        //   316: goto            323
        //   319: aload           12
        //   321: astore          13
        //   323: aload           8
        //   325: astore          9
        //   327: aload           13
        //   329: getfield        akud.b:I
        //   332: iconst_4       
        //   333: iand           
        //   334: ifeq            394
        //   337: aload           12
        //   339: astore          13
        //   341: aload           12
        //   343: ifnonnull       351
        //   346: getstatic       akud.a:Lakud;
        //   349: astore          13
        //   351: aload           8
        //   353: astore          9
        //   355: aload           13
        //   357: getfield        akud.d:Ljava/lang/String;
        //   360: invokevirtual   java/lang/String.isEmpty:()Z
        //   363: ifne            394
        //   366: aload           14
        //   368: getfield        akui.g:Lakud;
        //   371: astore          9
        //   373: aload           9
        //   375: astore          8
        //   377: aload           9
        //   379: ifnonnull       387
        //   382: getstatic       akud.a:Lakud;
        //   385: astore          8
        //   387: aload           8
        //   389: getfield        akud.d:Ljava/lang/String;
        //   392: astore          9
        //   394: aload           9
        //   396: astore          8
        //   398: aload_0        
        //   399: getfield        hun.B:Ljava/util/List;
        //   402: invokeinterface java/util/List.size:()I
        //   407: iconst_1       
        //   408: if_icmple       465
        //   411: new             Ljava/lang/StringBuilder;
        //   414: astore          8
        //   416: aload           8
        //   418: invokespecial   java/lang/StringBuilder.<init>:()V
        //   421: aload           8
        //   423: aload           9
        //   425: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   428: pop            
        //   429: aload           8
        //   431: ldc_w           "("
        //   434: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   437: pop            
        //   438: aload           8
        //   440: iload_3        
        //   441: iconst_1       
        //   442: iadd           
        //   443: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   446: pop            
        //   447: aload           8
        //   449: ldc_w           ")"
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: pop            
        //   456: aload           8
        //   458: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   461: astore          8
        //   463: iconst_1       
        //   464: istore_2       
        //   465: iload_2        
        //   466: ifeq            588
        //   469: aload           14
        //   471: invokevirtual   ahbh.toBuilder:()Lahaz;
        //   474: astore          9
        //   476: getstatic       akud.a:Lakud;
        //   479: invokevirtual   ahbh.createBuilder:()Lahaz;
        //   482: astore          12
        //   484: aload           12
        //   486: invokevirtual   ahaz.copyOnWrite:()V
        //   489: aload           12
        //   491: getfield        ahaz.instance:Lahbh;
        //   494: checkcast       Lakud;
        //   497: astore          13
        //   499: aload           8
        //   501: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   504: pop            
        //   505: aload           13
        //   507: aload           13
        //   509: getfield        akud.b:I
        //   512: iconst_1       
        //   513: ior            
        //   514: putfield        akud.b:I
        //   517: aload           13
        //   519: aload           8
        //   521: putfield        akud.c:Ljava/lang/String;
        //   524: aload           9
        //   526: invokevirtual   ahaz.copyOnWrite:()V
        //   529: aload           9
        //   531: getfield        ahaz.instance:Lahbh;
        //   534: checkcast       Lakui;
        //   537: astore          8
        //   539: aload           12
        //   541: invokevirtual   ahaz.build:()Lahbh;
        //   544: checkcast       Lakud;
        //   547: astore          12
        //   549: aload           12
        //   551: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   554: pop            
        //   555: aload           8
        //   557: aload           12
        //   559: putfield        akui.g:Lakud;
        //   562: aload           8
        //   564: aload           8
        //   566: getfield        akui.b:I
        //   569: bipush          64
        //   571: ior            
        //   572: putfield        akui.b:I
        //   575: aload           9
        //   577: invokevirtual   ahaz.build:()Lahbh;
        //   580: checkcast       Lakui;
        //   583: astore          9
        //   585: goto            592
        //   588: aload           14
        //   590: astore          9
        //   592: aload_0        
        //   593: getfield        hun.C:Ladkb;
        //   596: aload           19
        //   598: invokevirtual   adop.c:()Ljava/lang/String;
        //   601: aload           9
        //   603: invokeinterface adkb.Q:(Ljava/lang/String;Lakui;)V
        //   608: aload           9
        //   610: getfield        akui.g:Lakud;
        //   613: astore          8
        //   615: aload           8
        //   617: ifnonnull       628
        //   620: getstatic       akud.a:Lakud;
        //   623: astore          12
        //   625: goto            632
        //   628: aload           8
        //   630: astore          12
        //   632: aload           12
        //   634: getfield        akud.c:Ljava/lang/String;
        //   637: astore          15
        //   639: aload           8
        //   641: ifnonnull       652
        //   644: getstatic       akud.a:Lakud;
        //   647: astore          13
        //   649: goto            656
        //   652: aload           8
        //   654: astore          13
        //   656: aload           15
        //   658: astore          12
        //   660: aload           13
        //   662: getfield        akud.b:I
        //   665: iconst_4       
        //   666: iand           
        //   667: ifeq            727
        //   670: aload           8
        //   672: astore          13
        //   674: aload           8
        //   676: ifnonnull       684
        //   679: getstatic       akud.a:Lakud;
        //   682: astore          13
        //   684: aload           15
        //   686: astore          12
        //   688: aload           13
        //   690: getfield        akud.d:Ljava/lang/String;
        //   693: invokevirtual   java/lang/String.isEmpty:()Z
        //   696: ifne            727
        //   699: aload           9
        //   701: getfield        akui.g:Lakud;
        //   704: astore          12
        //   706: aload           12
        //   708: astore          8
        //   710: aload           12
        //   712: ifnonnull       720
        //   715: getstatic       akud.a:Lakud;
        //   718: astore          8
        //   720: aload           8
        //   722: getfield        akud.d:Ljava/lang/String;
        //   725: astore          12
        //   727: aload           9
        //   729: getfield        akui.j:Laktx;
        //   732: astore          9
        //   734: aload           9
        //   736: astore          8
        //   738: aload           9
        //   740: ifnonnull       748
        //   743: getstatic       aktx.a:Laktx;
        //   746: astore          8
        //   748: aload           8
        //   750: getfield        aktx.c:I
        //   753: invokestatic    aqsx.cu:(I)I
        //   756: istore          4
        //   758: iload           4
        //   760: istore_2       
        //   761: iload           4
        //   763: ifne            768
        //   766: iconst_1       
        //   767: istore_2       
        //   768: iinc            2, -1
        //   771: iload_2        
        //   772: iconst_1       
        //   773: if_icmpeq       797
        //   776: iload_2        
        //   777: iconst_2       
        //   778: if_icmpeq       789
        //   781: getstatic       admy.a:Ladmy;
        //   784: astore          8
        //   786: goto            802
        //   789: getstatic       admy.c:Ladmy;
        //   792: astore          8
        //   794: goto            802
        //   797: getstatic       admy.b:Ladmy;
        //   800: astore          8
        //   802: getstatic       admz.a:Ladmz;
        //   805: invokevirtual   ahbh.createBuilder:()Lahaz;
        //   808: astore          9
        //   810: aload           9
        //   812: invokevirtual   ahaz.copyOnWrite:()V
        //   815: aload           9
        //   817: getfield        ahaz.instance:Lahbh;
        //   820: checkcast       Ladmz;
        //   823: astore          13
        //   825: aload           12
        //   827: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   830: pop            
        //   831: aload           13
        //   833: aload           13
        //   835: getfield        admz.b:I
        //   838: iconst_1       
        //   839: ior            
        //   840: putfield        admz.b:I
        //   843: aload           13
        //   845: aload           12
        //   847: putfield        admz.c:Ljava/lang/String;
        //   850: aload           8
        //   852: ifnull          892
        //   855: aload           9
        //   857: invokevirtual   ahaz.copyOnWrite:()V
        //   860: aload           9
        //   862: getfield        ahaz.instance:Lahbh;
        //   865: checkcast       Ladmz;
        //   868: astore          12
        //   870: aload           12
        //   872: aload           8
        //   874: getfield        admy.d:I
        //   877: putfield        admz.e:I
        //   880: aload           12
        //   882: aload           12
        //   884: getfield        admz.b:I
        //   887: iconst_4       
        //   888: ior            
        //   889: putfield        admz.b:I
        //   892: aload           9
        //   894: invokevirtual   ahaz.build:()Lahbh;
        //   897: checkcast       Ladmz;
        //   900: astore          9
        //   902: aload_0        
        //   903: getfield        hun.C:Ladkb;
        //   906: aload           19
        //   908: invokevirtual   adop.c:()Ljava/lang/String;
        //   911: aload           9
        //   913: invokeinterface adkb.S:(Ljava/lang/String;Ladmz;)V
        //   918: aload           10
        //   920: astore          8
        //   922: aload           10
        //   924: ifnonnull       999
        //   927: aload           9
        //   929: getfield        admz.e:I
        //   932: invokestatic    admy.a:(I)Ladmy;
        //   935: astore          9
        //   937: aload           9
        //   939: astore          8
        //   941: aload           9
        //   943: ifnonnull       951
        //   946: getstatic       admy.a:Ladmy;
        //   949: astore          8
        //   951: aload           8
        //   953: invokevirtual   admy.ordinal:()I
        //   956: istore_2       
        //   957: iload_2        
        //   958: ifeq            994
        //   961: iload_2        
        //   962: iconst_1       
        //   963: if_icmpeq       986
        //   966: iload_2        
        //   967: iconst_2       
        //   968: if_icmpeq       978
        //   971: aload           10
        //   973: astore          8
        //   975: goto            999
        //   978: getstatic       glx.b:Lglx;
        //   981: astore          8
        //   983: goto            999
        //   986: getstatic       glx.a:Lglx;
        //   989: astore          8
        //   991: goto            999
        //   994: getstatic       glx.c:Lglx;
        //   997: astore          8
        //   999: aload           19
        //  1001: invokevirtual   adop.c:()Ljava/lang/String;
        //  1004: astore          9
        //  1006: aload           19
        //  1008: invokevirtual   adop.d:()Z
        //  1011: istore          5
        //  1013: aload_0        
        //  1014: getfield        hun.aj:Lzhk;
        //  1017: invokeinterface zhk.a:()Laezp;
        //  1022: astore          10
        //  1024: aload           10
        //  1026: invokevirtual   aezp.h:()Z
        //  1029: ifeq            1101
        //  1032: aload_0        
        //  1033: getfield        hun.C:Ladkb;
        //  1036: aload           9
        //  1038: getstatic       apht.aY:Lapht;
        //  1041: invokeinterface adkb.E:(Ljava/lang/String;Lapht;)V
        //  1046: aload_0        
        //  1047: getfield        hun.C:Ladkb;
        //  1050: aload           9
        //  1052: aload           10
        //  1054: invokevirtual   aezp.c:()Ljava/lang/Object;
        //  1057: checkcast       Landroid/graphics/Bitmap;
        //  1060: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //  1063: invokestatic    j$/util/Optional.empty:()Lj$/util/Optional;
        //  1066: invokestatic    adkp.m:(Lj$/util/Optional;Lj$/util/Optional;)Ladka;
        //  1069: invokeinterface adkb.r:(Ljava/lang/String;Landroid/graphics/Bitmap;Ladka;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  1074: astore          12
        //  1076: new             Letf;
        //  1079: astore          10
        //  1081: aload           10
        //  1083: aload_0        
        //  1084: aload           9
        //  1086: bipush          7
        //  1088: invokespecial   etf.<init>:(Lhun;Ljava/lang/String;I)V
        //  1091: aload           12
        //  1093: aload           10
        //  1095: invokestatic    teu.m:(Lcom/google/common/util/concurrent/ListenableFuture;Ltes;)V
        //  1098: goto            1101
        //  1101: aload_0        
        //  1102: getfield        hun.C:Ladkb;
        //  1105: aload           9
        //  1107: aload_0        
        //  1108: getfield        hun.ag:Lzmf;
        //  1111: invokeinterface zmf.c:()Lzme;
        //  1116: aload_0        
        //  1117: getfield        hun.U:Laphs;
        //  1120: iload           5
        //  1122: invokeinterface adkb.O:(Ljava/lang/String;Lzme;Laphs;Z)V
        //  1127: aload           16
        //  1129: iload_3        
        //  1130: aload           9
        //  1132: aastore        
        //  1133: iinc            3, 1
        //  1136: aload           8
        //  1138: astore          10
        //  1140: goto            134
        //  1143: aload_0        
        //  1144: getfield        hun.ai:Latke;
        //  1147: invokeinterface atke.a:()Ljava/lang/Object;
        //  1152: checkcast       Ljava/util/Set;
        //  1155: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1160: astore          9
        //  1162: aload           9
        //  1164: invokeinterface java/util/Iterator.hasNext:()Z
        //  1169: ifeq            1387
        //  1172: aload           9
        //  1174: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1179: checkcast       Lcyb;
        //  1182: astore          14
        //  1184: aload_0        
        //  1185: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  1188: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //  1191: astore          8
        //  1193: new             Ljava/util/ArrayList;
        //  1196: astore          13
        //  1198: aload           13
        //  1200: invokespecial   java/util/ArrayList.<init>:()V
        //  1203: aload           8
        //  1205: ldc_w           "com.google.android.libraries.youtube.upload.extra_upload_creation_surfaces"
        //  1208: invokevirtual   android/content/Intent.getIntArrayExtra:(Ljava/lang/String;)[I
        //  1211: astore          12
        //  1213: aload           12
        //  1215: ifnull          1248
        //  1218: iconst_0       
        //  1219: istore_2       
        //  1220: iload_2        
        //  1221: aload           12
        //  1223: arraylength    
        //  1224: if_icmpge       1248
        //  1227: aload           13
        //  1229: aload           12
        //  1231: iload_2        
        //  1232: iaload         
        //  1233: invokestatic    aoeu.b:(I)Laoeu;
        //  1236: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1241: pop            
        //  1242: iinc            2, 1
        //  1245: goto            1220
        //  1248: aload           8
        //  1250: ldc_w           "com.google.android.libraries.youtube.upload.extra_upload_flow_logging_nonce"
        //  1253: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1256: astore          12
        //  1258: aload           12
        //  1260: ifnull          1304
        //  1263: aload           8
        //  1265: ldc_w           "com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor"
        //  1268: iconst_1       
        //  1269: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1272: bipush          6
        //  1274: if_icmpne       1304
        //  1277: aload           14
        //  1279: getfield        cyb.a:Ljava/lang/Object;
        //  1282: astore          14
        //  1284: aload           13
        //  1286: invokestatic    afeq.o:(Ljava/util/Collection;)Lafeq;
        //  1289: astore          13
        //  1291: aload           14
        //  1293: checkcast       Lubu;
        //  1296: iconst_4       
        //  1297: aload           12
        //  1299: aload           13
        //  1301: invokevirtual   ubu.k:(ILjava/lang/String;Lafeq;)V
        //  1304: aload           8
        //  1306: ifnonnull       1315
        //  1309: aconst_null    
        //  1310: astore          8
        //  1312: goto            1325
        //  1315: aload           8
        //  1317: ldc_w           "com.google.android.libraries.youtube.upload.extra_upload_activity_shorts_project_path"
        //  1320: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1323: astore          8
        //  1325: aload           8
        //  1327: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1330: ifne            1162
        //  1333: new             Ljava/io/File;
        //  1336: astore          12
        //  1338: aload           12
        //  1340: aload           8
        //  1342: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1345: aload           12
        //  1347: invokestatic    cyb.k:(Ljava/io/File;)Z
        //  1350: ifne            1162
        //  1353: ldc_w           "Failed to delete Shorts project directory: "
        //  1356: aload           8
        //  1358: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1361: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1364: invokestatic    ttr.b:(Ljava/lang/String;)V
        //  1367: goto            1162
        //  1370: astore          8
        //  1372: aload_0        
        //  1373: getfield        hun.aa:Ladet;
        //  1376: ldc_w           "Upload confirmation handler failed in upload finalized"
        //  1379: aload           8
        //  1381: invokevirtual   adet.h:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1384: goto            1162
        //  1387: aload_0        
        //  1388: getfield        hun.d:Lwyw;
        //  1391: astore          12
        //  1393: new             Lwyt;
        //  1396: astore          9
        //  1398: aload           9
        //  1400: sipush          9701
        //  1403: invokestatic    xaa.c:(I)Lxab;
        //  1406: invokespecial   wyt.<init>:(Lxab;)V
        //  1409: aload_0        
        //  1410: getfield        hun.B:Ljava/util/List;
        //  1413: astore          8
        //  1415: aload_0        
        //  1416: getfield        hun.T:Ljava/lang/String;
        //  1419: astore          14
        //  1421: aload_0        
        //  1422: getfield        hun.ab:Ladlp;
        //  1425: astore          13
        //  1427: aload           13
        //  1429: getfield        adlp.e:Ljava/lang/Object;
        //  1432: invokeinterface tjm.n:()Z
        //  1437: ifeq            1457
        //  1440: aload           13
        //  1442: invokevirtual   adlp.I:()Z
        //  1445: ifeq            1451
        //  1448: goto            1457
        //  1451: iconst_0       
        //  1452: istore          5
        //  1454: goto            1460
        //  1457: iconst_1       
        //  1458: istore          5
        //  1460: aload           8
        //  1462: aload           14
        //  1464: invokestatic    adkp.c:(Ljava/util/List;Ljava/lang/String;)Lalhi;
        //  1467: invokevirtual   ahbh.toBuilder:()Lahaz;
        //  1470: astore          13
        //  1472: aload           11
        //  1474: ifnonnull       1488
        //  1477: aload           17
        //  1479: getstatic       android/net/Uri.EMPTY:Landroid/net/Uri;
        //  1482: invokevirtual   android/net/Uri.equals:(Ljava/lang/Object;)Z
        //  1485: ifne            2531
        //  1488: aload           8
        //  1490: invokeinterface java/util/List.isEmpty:()Z
        //  1495: ifne            2531
        //  1498: getstatic       alio.a:Lalio;
        //  1501: invokevirtual   ahbh.createBuilder:()Lahaz;
        //  1504: astore          14
        //  1506: aload           11
        //  1508: ifnull          1829
        //  1511: aload           11
        //  1513: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.L:()Z
        //  1516: ifeq            1618
        //  1519: aload           14
        //  1521: invokevirtual   ahaz.copyOnWrite:()V
        //  1524: aload           14
        //  1526: getfield        ahaz.instance:Lahbh;
        //  1529: checkcast       Lalio;
        //  1532: invokestatic    alio.a:(Lalio;)V
        //  1535: aload           11
        //  1537: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.n:()J
        //  1540: lstore          6
        //  1542: aload           14
        //  1544: invokevirtual   ahaz.copyOnWrite:()V
        //  1547: aload           14
        //  1549: getfield        ahaz.instance:Lahbh;
        //  1552: checkcast       Lalio;
        //  1555: astore          8
        //  1557: aload           8
        //  1559: iconst_4       
        //  1560: aload           8
        //  1562: getfield        alio.b:I
        //  1565: ior            
        //  1566: putfield        alio.b:I
        //  1569: aload           8
        //  1571: lload           6
        //  1573: putfield        alio.c:J
        //  1576: aload           11
        //  1578: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.l:()J
        //  1581: lstore          6
        //  1583: aload           14
        //  1585: invokevirtual   ahaz.copyOnWrite:()V
        //  1588: aload           14
        //  1590: getfield        ahaz.instance:Lahbh;
        //  1593: checkcast       Lalio;
        //  1596: astore          8
        //  1598: aload           8
        //  1600: aload           8
        //  1602: getfield        alio.b:I
        //  1605: bipush          8
        //  1607: ior            
        //  1608: putfield        alio.b:I
        //  1611: aload           8
        //  1613: lload           6
        //  1615: putfield        alio.d:J
        //  1618: aload           11
        //  1620: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.H:()Z
        //  1623: ifeq            1775
        //  1626: aload           14
        //  1628: invokevirtual   ahaz.copyOnWrite:()V
        //  1631: aload           14
        //  1633: getfield        ahaz.instance:Lahbh;
        //  1636: checkcast       Lalio;
        //  1639: invokestatic    alio.b:(Lalio;)V
        //  1642: aload           11
        //  1644: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.o:()Landroid/net/Uri;
        //  1647: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1650: astore          8
        //  1652: aload           14
        //  1654: invokevirtual   ahaz.copyOnWrite:()V
        //  1657: aload           14
        //  1659: getfield        ahaz.instance:Lahbh;
        //  1662: checkcast       Lalio;
        //  1665: astore          15
        //  1667: aload           8
        //  1669: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1672: pop            
        //  1673: aload           15
        //  1675: aload           15
        //  1677: getfield        alio.b:I
        //  1680: bipush          16
        //  1682: ior            
        //  1683: putfield        alio.b:I
        //  1686: aload           15
        //  1688: aload           8
        //  1690: putfield        alio.e:Ljava/lang/String;
        //  1693: aload           11
        //  1695: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.g:()J
        //  1698: lstore          6
        //  1700: aload           14
        //  1702: invokevirtual   ahaz.copyOnWrite:()V
        //  1705: aload           14
        //  1707: getfield        ahaz.instance:Lahbh;
        //  1710: checkcast       Lalio;
        //  1713: astore          8
        //  1715: aload           8
        //  1717: aload           8
        //  1719: getfield        alio.b:I
        //  1722: bipush          64
        //  1724: ior            
        //  1725: putfield        alio.b:I
        //  1728: aload           8
        //  1730: lload           6
        //  1732: putfield        alio.g:J
        //  1735: aload           11
        //  1737: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.e:()F
        //  1740: fstore_1       
        //  1741: aload           14
        //  1743: invokevirtual   ahaz.copyOnWrite:()V
        //  1746: aload           14
        //  1748: getfield        ahaz.instance:Lahbh;
        //  1751: checkcast       Lalio;
        //  1754: astore          8
        //  1756: aload           8
        //  1758: aload           8
        //  1760: getfield        alio.b:I
        //  1763: bipush          32
        //  1765: ior            
        //  1766: putfield        alio.b:I
        //  1769: aload           8
        //  1771: fload_1        
        //  1772: putfield        alio.f:F
        //  1775: aload           11
        //  1777: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.J:()Z
        //  1780: ifeq            2391
        //  1783: aload           11
        //  1785: invokevirtual   com/google/android/libraries/video/editablevideo/EditableVideo.p:()Ljava/lang/String;
        //  1788: astore          8
        //  1790: aload           14
        //  1792: invokevirtual   ahaz.copyOnWrite:()V
        //  1795: aload           14
        //  1797: getfield        ahaz.instance:Lahbh;
        //  1800: checkcast       Lalio;
        //  1803: astore          11
        //  1805: aload           11
        //  1807: aload           11
        //  1809: getfield        alio.b:I
        //  1812: sipush          256
        //  1815: ior            
        //  1816: putfield        alio.b:I
        //  1819: aload           11
        //  1821: aload           8
        //  1823: putfield        alio.h:Ljava/lang/String;
        //  1826: goto            2391
        //  1829: aload           17
        //  1831: getstatic       android/net/Uri.EMPTY:Landroid/net/Uri;
        //  1834: invokevirtual   android/net/Uri.equals:(Ljava/lang/Object;)Z
        //  1837: ifne            2391
        //  1840: aload           17
        //  1842: ldc_w           "trimStartUs"
        //  1845: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1848: ifnull          2003
        //  1851: aload           17
        //  1853: ldc_w           "trimEndUs"
        //  1856: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1859: ifnull          2003
        //  1862: aload           14
        //  1864: invokevirtual   ahaz.copyOnWrite:()V
        //  1867: aload           14
        //  1869: getfield        ahaz.instance:Lahbh;
        //  1872: checkcast       Lalio;
        //  1875: invokestatic    alio.a:(Lalio;)V
        //  1878: aload           17
        //  1880: ldc_w           "trimStartUs"
        //  1883: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1886: astore          8
        //  1888: aload           8
        //  1890: ifnonnull       1899
        //  1893: lconst_0       
        //  1894: lstore          6
        //  1896: goto            1906
        //  1899: aload           8
        //  1901: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1904: lstore          6
        //  1906: aload           14
        //  1908: invokevirtual   ahaz.copyOnWrite:()V
        //  1911: aload           14
        //  1913: getfield        ahaz.instance:Lahbh;
        //  1916: checkcast       Lalio;
        //  1919: astore          8
        //  1921: aload           8
        //  1923: iconst_4       
        //  1924: aload           8
        //  1926: getfield        alio.b:I
        //  1929: ior            
        //  1930: putfield        alio.b:I
        //  1933: aload           8
        //  1935: lload           6
        //  1937: putfield        alio.c:J
        //  1940: aload           17
        //  1942: ldc_w           "trimEndUs"
        //  1945: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1948: astore          8
        //  1950: aload           8
        //  1952: ifnonnull       1961
        //  1955: lconst_0       
        //  1956: lstore          6
        //  1958: goto            1968
        //  1961: aload           8
        //  1963: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1966: lstore          6
        //  1968: aload           14
        //  1970: invokevirtual   ahaz.copyOnWrite:()V
        //  1973: aload           14
        //  1975: getfield        ahaz.instance:Lahbh;
        //  1978: checkcast       Lalio;
        //  1981: astore          8
        //  1983: aload           8
        //  1985: aload           8
        //  1987: getfield        alio.b:I
        //  1990: bipush          8
        //  1992: ior            
        //  1993: putfield        alio.b:I
        //  1996: aload           8
        //  1998: lload           6
        //  2000: putfield        alio.d:J
        //  2003: aload           17
        //  2005: ldc_w           "audioSwapSourceUri"
        //  2008: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2011: ifnull          2211
        //  2014: aload           17
        //  2016: invokestatic    adkp.a:(Landroid/net/Uri;)F
        //  2019: fconst_0       
        //  2020: fcmpl          
        //  2021: ifle            2211
        //  2024: aload           14
        //  2026: invokevirtual   ahaz.copyOnWrite:()V
        //  2029: aload           14
        //  2031: getfield        ahaz.instance:Lahbh;
        //  2034: checkcast       Lalio;
        //  2037: invokestatic    alio.b:(Lalio;)V
        //  2040: aload           17
        //  2042: ldc_w           "audioSwapVideoId"
        //  2045: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2048: astore          8
        //  2050: aload           8
        //  2052: ifnonnull       2063
        //  2055: ldc_w           ""
        //  2058: astore          8
        //  2060: goto            2073
        //  2063: ldc_w           "https://www.youtube.com/watch?v="
        //  2066: aload           8
        //  2068: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2071: astore          8
        //  2073: aload           14
        //  2075: invokevirtual   ahaz.copyOnWrite:()V
        //  2078: aload           14
        //  2080: getfield        ahaz.instance:Lahbh;
        //  2083: checkcast       Lalio;
        //  2086: astore          11
        //  2088: aload           11
        //  2090: aload           11
        //  2092: getfield        alio.b:I
        //  2095: bipush          16
        //  2097: ior            
        //  2098: putfield        alio.b:I
        //  2101: aload           11
        //  2103: aload           8
        //  2105: putfield        alio.e:Ljava/lang/String;
        //  2108: aload           17
        //  2110: ldc_w           "audioSwapOffsetUs"
        //  2113: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2116: astore          8
        //  2118: aload           8
        //  2120: ifnonnull       2129
        //  2123: lconst_0       
        //  2124: lstore          6
        //  2126: goto            2136
        //  2129: aload           8
        //  2131: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  2134: lstore          6
        //  2136: aload           14
        //  2138: invokevirtual   ahaz.copyOnWrite:()V
        //  2141: aload           14
        //  2143: getfield        ahaz.instance:Lahbh;
        //  2146: checkcast       Lalio;
        //  2149: astore          8
        //  2151: aload           8
        //  2153: aload           8
        //  2155: getfield        alio.b:I
        //  2158: bipush          64
        //  2160: ior            
        //  2161: putfield        alio.b:I
        //  2164: aload           8
        //  2166: lload           6
        //  2168: putfield        alio.g:J
        //  2171: aload           17
        //  2173: invokestatic    adkp.a:(Landroid/net/Uri;)F
        //  2176: fstore_1       
        //  2177: aload           14
        //  2179: invokevirtual   ahaz.copyOnWrite:()V
        //  2182: aload           14
        //  2184: getfield        ahaz.instance:Lahbh;
        //  2187: checkcast       Lalio;
        //  2190: astore          8
        //  2192: aload           8
        //  2194: aload           8
        //  2196: getfield        alio.b:I
        //  2199: bipush          32
        //  2201: ior            
        //  2202: putfield        alio.b:I
        //  2205: aload           8
        //  2207: fload_1        
        //  2208: putfield        alio.f:F
        //  2211: aload           17
        //  2213: ldc_w           "editTextPosLayerUsed"
        //  2216: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2219: ifnull          2271
        //  2222: aload           17
        //  2224: ldc_w           "editTextPosLayerUsed"
        //  2227: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2230: invokestatic    java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        //  2233: ifeq            2271
        //  2236: aload           14
        //  2238: invokevirtual   ahaz.copyOnWrite:()V
        //  2241: aload           14
        //  2243: getfield        ahaz.instance:Lahbh;
        //  2246: checkcast       Lalio;
        //  2249: astore          8
        //  2251: aload           8
        //  2253: aload           8
        //  2255: getfield        alio.b:I
        //  2258: sipush          2048
        //  2261: ior            
        //  2262: putfield        alio.b:I
        //  2265: aload           8
        //  2267: iconst_1       
        //  2268: putfield        alio.j:Z
        //  2271: aload           17
        //  2273: ldc_w           "camera_filter"
        //  2276: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2279: astore          11
        //  2281: aload           11
        //  2283: invokestatic    aezr.f:(Ljava/lang/String;)Z
        //  2286: ifne            2331
        //  2289: aload           14
        //  2291: invokevirtual   ahaz.copyOnWrite:()V
        //  2294: aload           14
        //  2296: getfield        ahaz.instance:Lahbh;
        //  2299: checkcast       Lalio;
        //  2302: astore          8
        //  2304: aload           11
        //  2306: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2309: pop            
        //  2310: aload           8
        //  2312: aload           8
        //  2314: getfield        alio.b:I
        //  2317: sipush          8192
        //  2320: ior            
        //  2321: putfield        alio.b:I
        //  2324: aload           8
        //  2326: aload           11
        //  2328: putfield        alio.l:Ljava/lang/String;
        //  2331: aload           17
        //  2333: ldc_w           "filter"
        //  2336: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2339: astore          11
        //  2341: aload           11
        //  2343: invokestatic    aezr.f:(Ljava/lang/String;)Z
        //  2346: ifne            2391
        //  2349: aload           14
        //  2351: invokevirtual   ahaz.copyOnWrite:()V
        //  2354: aload           14
        //  2356: getfield        ahaz.instance:Lahbh;
        //  2359: checkcast       Lalio;
        //  2362: astore          8
        //  2364: aload           11
        //  2366: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2369: pop            
        //  2370: aload           8
        //  2372: aload           8
        //  2374: getfield        alio.b:I
        //  2377: sipush          256
        //  2380: ior            
        //  2381: putfield        alio.b:I
        //  2384: aload           8
        //  2386: aload           11
        //  2388: putfield        alio.h:Ljava/lang/String;
        //  2391: aload           14
        //  2393: invokevirtual   ahaz.copyOnWrite:()V
        //  2396: aload           14
        //  2398: getfield        ahaz.instance:Lahbh;
        //  2401: checkcast       Lalio;
        //  2404: astore          8
        //  2406: aload           8
        //  2408: aload           8
        //  2410: getfield        alio.b:I
        //  2413: sipush          1024
        //  2416: ior            
        //  2417: putfield        alio.b:I
        //  2420: aload           8
        //  2422: iload           5
        //  2424: putfield        alio.i:Z
        //  2427: aload           13
        //  2429: getfield        ahaz.instance:Lahbh;
        //  2432: checkcast       Lalhi;
        //  2435: getfield        alhi.g:Lahbx;
        //  2438: iconst_0       
        //  2439: invokeinterface ahbx.get:(I)Ljava/lang/Object;
        //  2444: checkcast       Lalip;
        //  2447: invokevirtual   ahbh.toBuilder:()Lahaz;
        //  2450: astore          8
        //  2452: aload           8
        //  2454: invokevirtual   ahaz.copyOnWrite:()V
        //  2457: aload           8
        //  2459: getfield        ahaz.instance:Lahbh;
        //  2462: checkcast       Lalip;
        //  2465: astore          11
        //  2467: aload           14
        //  2469: invokevirtual   ahaz.build:()Lahbh;
        //  2472: checkcast       Lalio;
        //  2475: astore          14
        //  2477: aload           14
        //  2479: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2482: pop            
        //  2483: aload           11
        //  2485: aload           14
        //  2487: putfield        alip.e:Lalio;
        //  2490: aload           11
        //  2492: aload           11
        //  2494: getfield        alip.b:I
        //  2497: bipush          8
        //  2499: ior            
        //  2500: putfield        alip.b:I
        //  2503: aload           8
        //  2505: invokevirtual   ahaz.build:()Lahbh;
        //  2508: checkcast       Lalip;
        //  2511: astore          8
        //  2513: aload           13
        //  2515: invokevirtual   ahaz.copyOnWrite:()V
        //  2518: aload           13
        //  2520: getfield        ahaz.instance:Lahbh;
        //  2523: checkcast       Lalhi;
        //  2526: aload           8
        //  2528: invokestatic    alhi.b:(Lalhi;Lalip;)V
        //  2531: aload           12
        //  2533: iconst_3       
        //  2534: aload           9
        //  2536: aload           13
        //  2538: invokevirtual   ahaz.build:()Lahbh;
        //  2541: checkcast       Lalhi;
        //  2544: invokeinterface wyw.J:(ILwzz;Lalhi;)V
        //  2549: aload           10
        //  2551: ifnull          2581
        //  2554: aload_0        
        //  2555: getfield        hun.af:Landroid/content/SharedPreferences;
        //  2558: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  2563: ldc_w           "upload_privacy"
        //  2566: aload           10
        //  2568: invokevirtual   glx.name:()Ljava/lang/String;
        //  2571: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  2576: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //  2581: aload_0        
        //  2582: getfield        hun.r:Lhum;
        //  2585: astore          8
        //  2587: aload           8
        //  2589: ifnull          3259
        //  2592: aload           8
        //  2594: aload           16
        //  2596: invokeinterface hum.z:([Ljava/lang/String;)V
        //  2601: aload_0        
        //  2602: monitorexit    
        //  2603: return         
        //  2604: aload_0        
        //  2605: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2608: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //  2611: ldc_w           "should_upload_immediately"
        //  2614: iconst_0       
        //  2615: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  2618: ifeq            2633
        //  2621: aload_0        
        //  2622: iconst_1       
        //  2623: invokespecial   hun.B:(Z)V
        //  2626: aload_0        
        //  2627: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2630: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.q:()V
        //  2633: aload_0        
        //  2634: invokevirtual   hun.u:()Z
        //  2637: ifeq            2676
        //  2640: aload_0        
        //  2641: getfield        hun.t:Lcom/google/android/libraries/youtube/edit/ui/ViewAnimatorHelper;
        //  2644: ldc_w           2131432292
        //  2647: invokevirtual   com/google/android/libraries/youtube/edit/ui/ViewAnimatorHelper.b:(I)V
        //  2650: aload_0        
        //  2651: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2654: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getSupportFragmentManager:()Lcl;
        //  2657: invokevirtual   cl.i:()Lct;
        //  2660: astore          8
        //  2662: aload           8
        //  2664: aload_0        
        //  2665: getfield        hun.i:Lrob;
        //  2668: invokevirtual   ct.o:(Lbr;)V
        //  2671: aload           8
        //  2673: invokevirtual   ct.d:()V
        //  2676: aload_0        
        //  2677: invokevirtual   hun.s:()Z
        //  2680: ifeq            2719
        //  2683: aload_0        
        //  2684: getfield        hun.t:Lcom/google/android/libraries/youtube/edit/ui/ViewAnimatorHelper;
        //  2687: ldc_w           2131429315
        //  2690: invokevirtual   com/google/android/libraries/youtube/edit/ui/ViewAnimatorHelper.b:(I)V
        //  2693: aload_0        
        //  2694: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2697: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getSupportFragmentManager:()Lcl;
        //  2700: invokevirtual   cl.i:()Lct;
        //  2703: astore          8
        //  2705: aload           8
        //  2707: aload_0        
        //  2708: getfield        hun.n:Lzgu;
        //  2711: invokevirtual   ct.o:(Lbr;)V
        //  2714: aload           8
        //  2716: invokevirtual   ct.d:()V
        //  2719: aload_0        
        //  2720: invokevirtual   hun.t:()Z
        //  2723: ifeq            3259
        //  2726: aload_0        
        //  2727: invokevirtual   hun.n:()V
        //  2730: aload_0        
        //  2731: monitorexit    
        //  2732: return         
        //  2733: aload_0        
        //  2734: getfield        hun.P:Z
        //  2737: ifeq            2863
        //  2740: aload_0        
        //  2741: getfield        hun.B:Ljava/util/List;
        //  2744: invokeinterface java/util/List.isEmpty:()Z
        //  2749: ifeq            2755
        //  2752: goto            2863
        //  2755: aload_0        
        //  2756: bipush          6
        //  2758: invokevirtual   hun.w:(I)V
        //  2761: aload_0        
        //  2762: getfield        hun.B:Ljava/util/List;
        //  2765: iconst_0       
        //  2766: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2771: checkcast       Ladop;
        //  2774: astore          8
        //  2776: aload_0        
        //  2777: getfield        hun.M:Lcom/google/common/util/concurrent/ListenableFuture;
        //  2780: invokestatic    hun.A:(Lcom/google/common/util/concurrent/ListenableFuture;)V
        //  2783: new             Lfdx;
        //  2786: astore          9
        //  2788: aload           9
        //  2790: aload_0        
        //  2791: aload           8
        //  2793: bipush          6
        //  2795: invokespecial   fdx.<init>:(Lhun;Ladop;I)V
        //  2798: aload           9
        //  2800: aload_0        
        //  2801: getfield        hun.ae:Lafvs;
        //  2804: invokestatic    afwm.r:(Lafty;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  2807: astore          9
        //  2809: aload_0        
        //  2810: aload           9
        //  2812: putfield        hun.M:Lcom/google/common/util/concurrent/ListenableFuture;
        //  2815: aload_0        
        //  2816: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2819: astore          12
        //  2821: new             Lhlo;
        //  2824: astore          10
        //  2826: aload           10
        //  2828: aload_0        
        //  2829: bipush          20
        //  2831: invokespecial   hlo.<init>:(Lhun;I)V
        //  2834: new             Lfdc;
        //  2837: astore          11
        //  2839: aload           11
        //  2841: aload_0        
        //  2842: aload           8
        //  2844: bipush          19
        //  2846: invokespecial   fdc.<init>:(Lhun;Ladop;I)V
        //  2849: aload           12
        //  2851: aload           9
        //  2853: aload           10
        //  2855: aload           11
        //  2857: invokestatic    teu.n:(Laun;Lcom/google/common/util/concurrent/ListenableFuture;Lttg;Lttg;)V
        //  2860: aload_0        
        //  2861: monitorexit    
        //  2862: return         
        //  2863: aload_0        
        //  2864: invokevirtual   hun.e:()V
        //  2867: aload_0        
        //  2868: monitorexit    
        //  2869: return         
        //  2870: aload_0        
        //  2871: getfield        hun.B:Ljava/util/List;
        //  2874: invokeinterface java/util/List.isEmpty:()Z
        //  2879: ifne            3259
        //  2882: aload_0        
        //  2883: bipush          6
        //  2885: invokevirtual   hun.w:(I)V
        //  2888: aload_0        
        //  2889: iconst_1       
        //  2890: invokespecial   hun.B:(Z)V
        //  2893: aload_0        
        //  2894: getfield        hun.B:Ljava/util/List;
        //  2897: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2902: astore          8
        //  2904: aload           8
        //  2906: invokeinterface java/util/Iterator.hasNext:()Z
        //  2911: ifeq            2950
        //  2914: aload           8
        //  2916: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2921: checkcast       Ladop;
        //  2924: astore          9
        //  2926: aload_0        
        //  2927: getfield        hun.D:Ladlp;
        //  2930: aload           9
        //  2932: invokevirtual   adop.c:()Ljava/lang/String;
        //  2935: aconst_null    
        //  2936: getstatic       apht.aJ:Lapht;
        //  2939: aload           9
        //  2941: invokevirtual   adop.b:()Laphs;
        //  2944: invokevirtual   adlp.d:(Ljava/lang/String;Ljava/lang/String;Lapht;Laphs;)V
        //  2947: goto            2904
        //  2950: aload_0        
        //  2951: getfield        hun.L:Lcom/google/common/util/concurrent/ListenableFuture;
        //  2954: invokestatic    hun.A:(Lcom/google/common/util/concurrent/ListenableFuture;)V
        //  2957: aload_0        
        //  2958: getfield        hun.E:Ladjx;
        //  2961: aload_0        
        //  2962: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2965: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //  2968: invokevirtual   adjx.i:(Landroid/content/Intent;)Z
        //  2971: ifeq            2982
        //  2974: aload_0        
        //  2975: iconst_5       
        //  2976: invokevirtual   hun.w:(I)V
        //  2979: aload_0        
        //  2980: monitorexit    
        //  2981: return         
        //  2982: new             Lhul;
        //  2985: astore          8
        //  2987: aload           8
        //  2989: aload_0        
        //  2990: iconst_0       
        //  2991: invokespecial   hul.<init>:(Lhun;I)V
        //  2994: aload           8
        //  2996: aload_0        
        //  2997: getfield        hun.ae:Lafvs;
        //  3000: invokestatic    afwm.r:(Lafty;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  3003: astore          8
        //  3005: aload_0        
        //  3006: aload           8
        //  3008: putfield        hun.L:Lcom/google/common/util/concurrent/ListenableFuture;
        //  3011: aload_0        
        //  3012: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  3015: astore          9
        //  3017: new             Lhui;
        //  3020: astore          11
        //  3022: aload           11
        //  3024: aload_0        
        //  3025: iconst_4       
        //  3026: invokespecial   hui.<init>:(Lhun;I)V
        //  3029: new             Lhui;
        //  3032: astore          10
        //  3034: aload           10
        //  3036: aload_0        
        //  3037: iconst_5       
        //  3038: invokespecial   hui.<init>:(Lhun;I)V
        //  3041: aload           9
        //  3043: aload           8
        //  3045: aload           11
        //  3047: aload           10
        //  3049: invokestatic    teu.n:(Laun;Lcom/google/common/util/concurrent/ListenableFuture;Lttg;Lttg;)V
        //  3052: aload_0        
        //  3053: monitorexit    
        //  3054: return         
        //  3055: aload_0        
        //  3056: bipush          6
        //  3058: invokevirtual   hun.w:(I)V
        //  3061: aload_0        
        //  3062: getfield        hun.B:Ljava/util/List;
        //  3065: invokeinterface java/util/List.clear:()V
        //  3070: aload_0        
        //  3071: getfield        hun.K:Lcom/google/common/util/concurrent/ListenableFuture;
        //  3074: invokestatic    hun.A:(Lcom/google/common/util/concurrent/ListenableFuture;)V
        //  3077: new             Lhuj;
        //  3080: astore          8
        //  3082: aload           8
        //  3084: aload_0        
        //  3085: invokespecial   huj.<init>:(Lhun;)V
        //  3088: aload           8
        //  3090: aload_0        
        //  3091: getfield        hun.ae:Lafvs;
        //  3094: invokestatic    afwm.r:(Lafty;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  3097: astore          11
        //  3099: aload_0        
        //  3100: aload           11
        //  3102: putfield        hun.K:Lcom/google/common/util/concurrent/ListenableFuture;
        //  3105: aload_0        
        //  3106: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  3109: astore          10
        //  3111: new             Lhui;
        //  3114: astore          8
        //  3116: aload           8
        //  3118: aload_0        
        //  3119: iconst_3       
        //  3120: invokespecial   hui.<init>:(Lhun;I)V
        //  3123: new             Lhuk;
        //  3126: astore          9
        //  3128: aload           9
        //  3130: aload_0        
        //  3131: invokespecial   huk.<init>:(Lhun;)V
        //  3134: aload           10
        //  3136: aload           11
        //  3138: aload           8
        //  3140: aload           9
        //  3142: invokestatic    teu.n:(Laun;Lcom/google/common/util/concurrent/ListenableFuture;Lttg;Lttg;)V
        //  3145: aload_0        
        //  3146: monitorexit    
        //  3147: return         
        //  3148: aload_0        
        //  3149: getfield        hun.J:Z
        //  3152: ifeq            3259
        //  3155: aload_0        
        //  3156: getfield        hun.U:Laphs;
        //  3159: invokestatic    adjx.g:(Laphs;)Z
        //  3162: ifne            3168
        //  3165: goto            3251
        //  3168: aload_0        
        //  3169: aload_0        
        //  3170: invokevirtual   hun.r:()Z
        //  3173: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3176: putfield        hun.W:Ljava/lang/Boolean;
        //  3179: new             Lcom/google/android/libraries/youtube/rendering/ui/permissions/PermissionDescriptor;
        //  3182: astore          8
        //  3184: aload           8
        //  3186: iconst_0       
        //  3187: sipush          18642
        //  3190: invokestatic    xaa.c:(I)Lxab;
        //  3193: sipush          18643
        //  3196: invokestatic    xaa.c:(I)Lxab;
        //  3199: invokespecial   com/google/android/libraries/youtube/rendering/ui/permissions/PermissionDescriptor.<init>:(ILxab;Lxab;)V
        //  3202: aload_0        
        //  3203: getfield        hun.ah:Lacuq;
        //  3206: aload_0        
        //  3207: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  3210: iconst_1       
        //  3211: anewarray       Lcom/google/android/libraries/youtube/rendering/ui/permissions/PermissionDescriptor;
        //  3214: dup            
        //  3215: iconst_0       
        //  3216: aload           8
        //  3218: aastore        
        //  3219: invokevirtual   acuq.m:(Landroid/app/Activity;[Lcom/google/android/libraries/youtube/rendering/ui/permissions/PermissionDescriptor;)Z
        //  3222: istore          5
        //  3224: aload_0        
        //  3225: getfield        hun.W:Ljava/lang/Boolean;
        //  3228: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3231: ifne            3165
        //  3234: iload           5
        //  3236: ifne            3165
        //  3239: aload_0        
        //  3240: iconst_1       
        //  3241: putfield        hun.V:Z
        //  3244: aload_0        
        //  3245: invokevirtual   hun.p:()V
        //  3248: goto            3165
        //  3251: aload_0        
        //  3252: iconst_3       
        //  3253: invokevirtual   hun.w:(I)V
        //  3256: aload_0        
        //  3257: monitorexit    
        //  3258: return         
        //  3259: aload_0        
        //  3260: monitorexit    
        //  3261: return         
        //  3262: aload_0        
        //  3263: getfield        hun.ab:Ladlp;
        //  3266: astore          8
        //  3268: aload           8
        //  3270: getfield        adlp.a:Ljava/lang/Object;
        //  3273: ldc_w           "cellular_upload_dialog_do_not_show_again"
        //  3276: iconst_0       
        //  3277: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //  3282: istore          5
        //  3284: aload           8
        //  3286: invokevirtual   adlp.I:()Z
        //  3289: ifeq            3343
        //  3292: aload           8
        //  3294: getfield        adlp.e:Ljava/lang/Object;
        //  3297: invokeinterface tjm.n:()Z
        //  3302: ifeq            3343
        //  3305: aload           8
        //  3307: getfield        adlp.e:Ljava/lang/Object;
        //  3310: invokeinterface tjm.r:()Z
        //  3315: ifne            3343
        //  3318: iload           5
        //  3320: ifne            3343
        //  3323: aload_0        
        //  3324: getfield        hun.h:Z
        //  3327: ifne            3343
        //  3330: aload_0        
        //  3331: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  3334: sipush          1021
        //  3337: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.showDialog:(I)V
        //  3340: aload_0        
        //  3341: monitorexit    
        //  3342: return         
        //  3343: aload_0        
        //  3344: iconst_2       
        //  3345: invokevirtual   hun.w:(I)V
        //  3348: aload_0        
        //  3349: monitorexit    
        //  3350: return         
        //  3351: aconst_null    
        //  3352: athrow         
        //  3353: astore          8
        //  3355: aload_0        
        //  3356: monitorexit    
        //  3357: goto            3363
        //  3360: aload           8
        //  3362: athrow         
        //  3363: goto            3360
        //  3366: astore          8
        //  3368: goto            2123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      12     3353   3366   Any
        //  59     74     3353   3366   Any
        //  79     86     3353   3366   Any
        //  92     129    3353   3366   Any
        //  134    190    3353   3366   Any
        //  198    213    3353   3366   Any
        //  218    235    3353   3366   Any
        //  235    242    3353   3366   Any
        //  251    256    3353   3366   Any
        //  256    292    3353   3366   Any
        //  299    306    3353   3366   Any
        //  311    316    3353   3366   Any
        //  327    337    3353   3366   Any
        //  346    351    3353   3366   Any
        //  355    373    3353   3366   Any
        //  382    387    3353   3366   Any
        //  387    394    3353   3366   Any
        //  398    463    3353   3366   Any
        //  469    585    3353   3366   Any
        //  592    615    3353   3366   Any
        //  620    625    3353   3366   Any
        //  632    639    3353   3366   Any
        //  644    649    3353   3366   Any
        //  660    670    3353   3366   Any
        //  679    684    3353   3366   Any
        //  688    706    3353   3366   Any
        //  715    720    3353   3366   Any
        //  720    727    3353   3366   Any
        //  727    734    3353   3366   Any
        //  743    748    3353   3366   Any
        //  748    758    3353   3366   Any
        //  781    786    3353   3366   Any
        //  789    794    3353   3366   Any
        //  797    802    3353   3366   Any
        //  802    850    3353   3366   Any
        //  855    892    3353   3366   Any
        //  892    918    3353   3366   Any
        //  927    937    3353   3366   Any
        //  946    951    3353   3366   Any
        //  951    957    3353   3366   Any
        //  978    983    3353   3366   Any
        //  986    991    3353   3366   Any
        //  994    999    3353   3366   Any
        //  999    1098   3353   3366   Any
        //  1101   1127   3353   3366   Any
        //  1143   1162   3353   3366   Any
        //  1162   1184   3353   3366   Any
        //  1184   1213   1370   1387   Ljava/lang/RuntimeException;
        //  1184   1213   3353   3366   Any
        //  1220   1242   1370   1387   Ljava/lang/RuntimeException;
        //  1220   1242   3353   3366   Any
        //  1248   1258   1370   1387   Ljava/lang/RuntimeException;
        //  1248   1258   3353   3366   Any
        //  1263   1304   1370   1387   Ljava/lang/RuntimeException;
        //  1263   1304   3353   3366   Any
        //  1315   1325   1370   1387   Ljava/lang/RuntimeException;
        //  1315   1325   3353   3366   Any
        //  1325   1367   1370   1387   Ljava/lang/RuntimeException;
        //  1325   1367   3353   3366   Any
        //  1372   1384   3353   3366   Any
        //  1387   1448   3353   3366   Any
        //  1460   1472   3353   3366   Any
        //  1477   1488   3353   3366   Any
        //  1488   1506   3353   3366   Any
        //  1511   1618   3353   3366   Any
        //  1618   1775   3353   3366   Any
        //  1775   1826   3353   3366   Any
        //  1829   1888   3353   3366   Any
        //  1899   1906   3353   3366   Any
        //  1906   1950   3353   3366   Any
        //  1961   1968   3353   3366   Any
        //  1968   2003   3353   3366   Any
        //  2003   2050   3353   3366   Any
        //  2063   2073   3353   3366   Any
        //  2073   2118   3353   3366   Any
        //  2129   2136   3366   3371   Ljava/lang/NumberFormatException;
        //  2129   2136   3353   3366   Any
        //  2136   2211   3353   3366   Any
        //  2211   2271   3353   3366   Any
        //  2271   2331   3353   3366   Any
        //  2331   2391   3353   3366   Any
        //  2391   2531   3353   3366   Any
        //  2531   2549   3353   3366   Any
        //  2554   2581   3353   3366   Any
        //  2581   2587   3353   3366   Any
        //  2592   2601   3353   3366   Any
        //  2604   2633   3353   3366   Any
        //  2633   2676   3353   3366   Any
        //  2676   2719   3353   3366   Any
        //  2719   2730   3353   3366   Any
        //  2733   2752   3353   3366   Any
        //  2755   2860   3353   3366   Any
        //  2863   2867   3353   3366   Any
        //  2870   2904   3353   3366   Any
        //  2904   2947   3353   3366   Any
        //  2950   2979   3353   3366   Any
        //  2982   3052   3353   3366   Any
        //  3055   3145   3353   3366   Any
        //  3148   3165   3353   3366   Any
        //  3168   3234   3353   3366   Any
        //  3239   3248   3353   3366   Any
        //  3251   3256   3353   3366   Any
        //  3262   3318   3353   3366   Any
        //  3323   3340   3353   3366   Any
        //  3343   3348   3353   3366   Any
        //  3351   3353   3353   3366   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_2129:
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
    
    public final boolean r() {
        return !acuq.f((Context)this.a, new PermissionDescriptor[] { new PermissionDescriptor(0, xaa.c(18642), xaa.c(18643)) });
    }
    
    public final boolean s() {
        final zgu n = this.n;
        return n != null && n.ar();
    }
    
    public final boolean t() {
        final zgm m = this.m;
        return m != null && m.ar();
    }
    
    public final boolean u() {
        final rob i = this.i;
        return i != null && ((br)i).ar();
    }
    
    public final boolean v(final adop adop) {
        if (!this.o) {
            return false;
        }
        final double floor = Math.floor(Math.random() * 10.0);
        try {
            final usu y = this.y;
            final alhi b = adkp.b(adop.c(), (String)adop.h);
            ((uss)y).aT = b;
            final zis av = ((uss)y).aV;
            if (av != null && b != null) {
                av.b = b;
            }
            final usu y2 = this.y;
            final Uri a = adop.a();
            final uta ah = ((uss)y2).aH;
            if (ah == null) {
                ((uss)y2).aG = a;
            }
            else if (!((uss)y2).aF && !adkp.ae((Object)ah.c, (Object)a)) {
                ((uss)y2).bu(a, (EditableVideoEdits)null, (VideoMetaData)null);
            }
            return true;
        }
        catch (final Error error) {
            ttr.d("Failed to parse the video file", (Throwable)error);
            if (floor == 0.0) {
                zlm.c(zll.a, zlk.f, "youtubeUploadEditParse::".concat(String.valueOf(vdh.am((Throwable)error))), (Throwable)error);
            }
        }
        catch (final RuntimeException ex) {
            ttr.d("Failed to start the edit mode", (Throwable)ex);
            if (floor == 0.0) {
                zlm.c(zll.a, zlk.f, "youtubeUploadEditParse::".concat(String.valueOf(vdh.am((Throwable)ex))), (Throwable)ex);
            }
        }
        catch (final IOException ex2) {
            ttr.d("Failed to read the video file", (Throwable)ex2);
            if (floor == 0.0) {
                zlm.c(zll.a, zlk.f, "youtubeUploadEditParse::".concat(String.valueOf(vdh.am((Throwable)ex2))), (Throwable)ex2);
            }
        }
        return false;
    }
    
    public final void w(final int ak) {
        synchronized (this) {
            if (this.ak != ak) {
                this.ak = ak;
            }
            this.l();
        }
    }
    
    public final void x(final ListenableFuture listenableFuture, final int n, final Throwable t) {
        synchronized (this) {
            final boolean b = t instanceof CancellationException;
            if (!b) {
                this.aa.i("Activity helper error", t, adjx.j(adjx.k(this.a.getIntent())));
            }
            if (listenableFuture != null && !listenableFuture.isCancelled() && !b) {
                this.w(n);
                return;
            }
            this.e();
        }
    }
    
    public final void y() {
        this.d.b(xaa.b(9729), (aiqj)null, adkp.c(this.B, this.T));
        this.w(8);
    }
    
    public final void z(final ajli ajli) {
        if (ajli != null) {
            this.m = this.G.b(ajli);
        }
        this.n = this.G.f;
    }
}
