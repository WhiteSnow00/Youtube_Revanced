import android.support.v7.widget.Toolbar;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.MenuInflater;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.app.Dialog;
import android.view.Window;
import android.app.Activity;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fe
{
    static final gc a;
    public static final int b;
    public static ajo c;
    public static ajo d;
    public static boolean e;
    public static Context f;
    public static final abi g;
    public static final Object h;
    private static Boolean i;
    private static Object j;
    private static final Object k;
    
    static {
        a = new gc((Executor)new rr(1));
        b = -100;
        fe.c = null;
        fe.d = null;
        fe.i = null;
        fe.e = false;
        fe.j = null;
        fe.f = null;
        g = new abi();
        h = new Object();
        k = new Object();
    }
    
    public static void A(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    fe.B:(Landroid/content/Context;)Z
        //     4: ifne            8
        //     7: return         
        //     8: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    11: bipush          33
        //    13: if_icmplt       38
        //    16: getstatic       fe.e:Z
        //    19: ifne            37
        //    22: getstatic       fe.a:Lgc;
        //    25: new             Lbe;
        //    28: dup            
        //    29: aload_0        
        //    30: iconst_4       
        //    31: invokespecial   be.<init>:(Landroid/content/Context;I)V
        //    34: invokevirtual   gc.execute:(Ljava/lang/Runnable;)V
        //    37: return         
        //    38: getstatic       fe.k:Ljava/lang/Object;
        //    41: astore_1       
        //    42: aload_1        
        //    43: monitorenter   
        //    44: getstatic       fe.c:Lajo;
        //    47: astore_2       
        //    48: aload_2        
        //    49: ifnonnull       89
        //    52: getstatic       fe.d:Lajo;
        //    55: ifnonnull       68
        //    58: aload_0        
        //    59: invokestatic    ei.c:(Landroid/content/Context;)Ljava/lang/String;
        //    62: invokestatic    ajo.c:(Ljava/lang/String;)Lajo;
        //    65: putstatic       fe.d:Lajo;
        //    68: getstatic       fe.d:Lajo;
        //    71: invokevirtual   ajo.h:()Z
        //    74: ifeq            80
        //    77: aload_1        
        //    78: monitorexit    
        //    79: return         
        //    80: getstatic       fe.d:Lajo;
        //    83: putstatic       fe.c:Lajo;
        //    86: goto            263
        //    89: aload_2        
        //    90: getstatic       fe.d:Lajo;
        //    93: invokevirtual   ajo.equals:(Ljava/lang/Object;)Z
        //    96: ifne            263
        //    99: getstatic       fe.c:Lajo;
        //   102: astore_2       
        //   103: aload_2        
        //   104: putstatic       fe.d:Lajo;
        //   107: aload_2        
        //   108: invokevirtual   ajo.f:()Ljava/lang/String;
        //   111: astore_2       
        //   112: aload_2        
        //   113: ldc             ""
        //   115: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   118: ifeq            131
        //   121: aload_0        
        //   122: ldc             "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
        //   124: invokevirtual   android/content/Context.deleteFile:(Ljava/lang/String;)Z
        //   127: pop            
        //   128: goto            263
        //   131: aload_0        
        //   132: ldc             "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
        //   134: iconst_0       
        //   135: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //   138: astore_0       
        //   139: invokestatic    android/util/Xml.newSerializer:()Lorg/xmlpull/v1/XmlSerializer;
        //   142: astore_3       
        //   143: aload_3        
        //   144: aload_0        
        //   145: aconst_null    
        //   146: invokeinterface org/xmlpull/v1/XmlSerializer.setOutput:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //   151: aload_3        
        //   152: ldc             "UTF-8"
        //   154: iconst_1       
        //   155: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   158: invokeinterface org/xmlpull/v1/XmlSerializer.startDocument:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   163: aload_3        
        //   164: aconst_null    
        //   165: ldc             "locales"
        //   167: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   172: pop            
        //   173: aload_3        
        //   174: aconst_null    
        //   175: ldc             "application_locales"
        //   177: aload_2        
        //   178: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   183: pop            
        //   184: aload_3        
        //   185: aconst_null    
        //   186: ldc             "locales"
        //   188: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   193: pop            
        //   194: aload_3        
        //   195: invokeinterface org/xmlpull/v1/XmlSerializer.endDocument:()V
        //   200: aload_0        
        //   201: ifnull          263
        //   204: aload_0        
        //   205: invokevirtual   java/io/FileOutputStream.close:()V
        //   208: goto            263
        //   211: astore_2       
        //   212: goto            232
        //   215: astore_2       
        //   216: ldc             "AppLocalesStorageHelper"
        //   218: ldc             "Storing App Locales : Failed to persist app-locales in storage "
        //   220: aload_2        
        //   221: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   224: pop            
        //   225: aload_0        
        //   226: ifnull          263
        //   229: goto            204
        //   232: aload_0        
        //   233: ifnull          240
        //   236: aload_0        
        //   237: invokevirtual   java/io/FileOutputStream.close:()V
        //   240: aload_2        
        //   241: athrow         
        //   242: astore_0       
        //   243: ldc             "AppLocalesStorageHelper"
        //   245: ldc             "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
        //   247: iconst_1       
        //   248: anewarray       Ljava/lang/Object;
        //   251: dup            
        //   252: iconst_0       
        //   253: ldc             "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
        //   255: aastore        
        //   256: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   259: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   262: pop            
        //   263: aload_1        
        //   264: monitorexit    
        //   265: return         
        //   266: astore_0       
        //   267: aload_1        
        //   268: monitorexit    
        //   269: goto            274
        //   272: aload_0        
        //   273: athrow         
        //   274: goto            272
        //   277: astore_0       
        //   278: goto            263
        //   281: astore_0       
        //   282: goto            240
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  44     48     266    277    Any
        //  52     68     266    277    Any
        //  68     79     266    277    Any
        //  80     86     266    277    Any
        //  89     128    266    277    Any
        //  131    139    242    263    Ljava/io/FileNotFoundException;
        //  131    139    266    277    Any
        //  139    143    266    277    Any
        //  143    200    215    232    Ljava/lang/Exception;
        //  143    200    211    242    Any
        //  204    208    277    281    Ljava/io/IOException;
        //  204    208    266    277    Any
        //  216    225    211    242    Any
        //  236    240    281    285    Ljava/io/IOException;
        //  236    240    266    277    Any
        //  240    242    266    277    Any
        //  243    263    266    277    Any
        //  263    265    266    277    Any
        //  267    269    266    277    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 142, Size: 142
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    static boolean B(final Context context) {
        if (fe.i == null) {
            try {
                final ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class)gb.class), 640);
                if (serviceInfo.metaData != null) {
                    fe.i = serviceInfo.metaData.getBoolean("autoStoreLocales");
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                fe.i = false;
            }
        }
        return fe.i;
    }
    
    public static fe f(final Activity activity, final fb fb) {
        return (fe)new fw((Context)activity, (Window)null, fb, (Object)activity);
    }
    
    public static fe g(final Dialog dialog, final fb fb) {
        return (fe)new fw(dialog.getContext(), dialog.getWindow(), fb, (Object)dialog);
    }
    
    public static Object k() {
        final Object j = fe.j;
        if (j != null) {
            return j;
        }
        if (fe.f == null) {
            final Iterator iterator = fe.g.iterator();
            while (iterator.hasNext()) {
                final fe fe = iterator.next().get();
                if (fe != null) {
                    final Context c = fe.c();
                    if (c != null) {
                        fe.f = c;
                        break;
                    }
                    continue;
                }
            }
        }
        final Context f = fe.f;
        if (f != null) {
            fe.j = f.getSystemService("locale");
        }
        return fe.j;
    }
    
    public static void s(final fe fe) {
        final Object h = fe.h;
        monitorenter(h);
        try {
            final Iterator iterator = fe.g.iterator();
            while (iterator.hasNext()) {
                final fe fe2 = iterator.next().get();
                if (fe2 == fe || fe2 == null) {
                    iterator.remove();
                }
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    public abstract boolean C(final int p0);
    
    public void D() {
        throw null;
    }
    
    public abstract void E();
    
    public abstract void F();
    
    public abstract void G();
    
    public abstract void H();
    
    public abstract void I();
    
    public int a() {
        throw null;
    }
    
    public Context b(final Context context) {
        throw null;
    }
    
    public Context c() {
        throw null;
    }
    
    public abstract ep d();
    
    public abstract eq e();
    
    public abstract hm h(final hl p0);
    
    public abstract MenuInflater i();
    
    public abstract View j(final int p0);
    
    public abstract void l(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void m();
    
    public abstract void n();
    
    public abstract void o();
    
    public abstract void p();
    
    public abstract void q();
    
    public abstract void r();
    
    public abstract void t(final int p0);
    
    public abstract void u(final View p0);
    
    public abstract void v(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void w(final int p0);
    
    public abstract void x(final Toolbar p0);
    
    public void y(final int n) {
        throw null;
    }
    
    public abstract void z(final CharSequence p0);
}
