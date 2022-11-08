import android.content.pm.ProviderInfo;
import android.database.Cursor;
import java.lang.reflect.InvocationTargetException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.SystemClock;
import java.lang.reflect.Field;
import android.util.Log;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwb
{
    public static final mwa a;
    public static final mwa b;
    public static final mwa c;
    public static final mwa d;
    private static Boolean f;
    private static String g;
    private static boolean h = false;
    private static int i = -1;
    private static Boolean j;
    private static final ThreadLocal k;
    private static final ThreadLocal l;
    private static final mvy m;
    private static mwc n;
    private static mwd o;
    public final Context e;
    
    static {
        k = new ThreadLocal();
        l = new mvt();
        m = (mvy)new mvu();
        a = (mwa)new mvv(1);
        b = (mwa)new mvv(0);
        c = (mwa)new mvv(2);
        d = (mwa)new mvv(3);
    }
    
    private mwb(final Context e) {
        kgk.aL(e);
        this.e = e;
    }
    
    public static int a(final Context context, final String s) {
        try {
            final ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            final StringBuilder sb = new StringBuilder("com.google.android.gms.dynamite.descriptors.");
            sb.append(s);
            sb.append(".ModuleDescriptor");
            final Class<?> loadClass = classLoader.loadClass(sb.toString());
            final Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            final Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!kgk.ba(declaredField.get(null), s)) {
                final String value = String.valueOf(declaredField.get(null));
                final StringBuilder sb2 = new StringBuilder("Module descriptor id '");
                sb2.append(value);
                sb2.append("' didn't match expected id '");
                sb2.append(s);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        }
        catch (final Exception ex) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(ex.getMessage())));
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb3 = new StringBuilder("Local module descriptor class for ");
            sb3.append(s);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
        }
        return 0;
    }
    
    public static int b(final Context context, final String s) {
        return c(context, s, false);
    }
    
    public static int c(final Context context, final String s, final boolean b) {
        return 0;
    }
    
    public static mwb e(Context context, mwa a, final String s) {
        final ThreadLocal k = mwb.k;
        final elw elw = k.get();
        final elw elw2 = new elw();
        k.set(elw2);
        final ThreadLocal l = mwb.l;
        final long longValue = l.get();
        try {
            l.set(SystemClock.elapsedRealtime());
            final mvz a2 = a.a(context, s, mwb.m);
            final int c = a2.c;
            Label_1471: {
                if (c == 0 || (c == -1 && a2.a == 0) || (c == 1 && a2.b == 0)) {
                    break Label_1471;
                }
                if (c == -1) {
                    final mwb j = j(context);
                    if (longValue == 0L) {
                        l.remove();
                    }
                    else {
                        l.set(longValue);
                    }
                    final Object a3 = elw2.a;
                    if (a3 != null) {
                        ((Cursor)a3).close();
                    }
                    k.set(elw);
                    return j;
                }
                Label_1458: {
                    if (c != 1) {
                        break Label_1458;
                    }
                    try {
                        final int b = a2.b;
                        try {
                            synchronized (mwb.class) {
                                if (!i(context)) {
                                    throw new mvx("Remote loading disabled");
                                }
                                final Boolean f = mwb.f;
                                monitorexit(mwb.class);
                                if (f != null) {
                                    final boolean booleanValue = f;
                                    final mvn mvn = null;
                                    final mvn mvn2 = null;
                                    final mvn mvn3 = null;
                                    final mvn mvn4 = null;
                                    Object o = null;
                                    Label_1127: {
                                        if (booleanValue) {
                                            synchronized (mwb.class) {
                                                final mwd o2 = mwb.o;
                                                monitorexit(mwb.class);
                                                if (o2 != null) {
                                                    final elw elw3 = k.get();
                                                    if (elw3 != null && elw3.a != null) {
                                                        final Context applicationContext = context.getApplicationContext();
                                                        final Object a4 = elw3.a;
                                                        mvm.a((Object)null);
                                                        synchronized (mwb.class) {
                                                            final boolean b2 = mwb.i >= 2;
                                                            monitorexit(mwb.class);
                                                            if ((boolean)b2) {
                                                                final mvn a5 = mvm.a((Object)applicationContext);
                                                                final mvn a6 = mvm.a(a4);
                                                                final Parcel qq = o2.qQ();
                                                                eoa.j(qq, (IInterface)a5);
                                                                qq.writeString(s);
                                                                qq.writeInt(b);
                                                                eoa.j(qq, (IInterface)a6);
                                                                final Parcel qr = o2.qR(3, qq);
                                                                final IBinder strongBinder = qr.readStrongBinder();
                                                                if (strongBinder != null) {
                                                                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                    if (queryLocalInterface instanceof mvn) {
                                                                        o = queryLocalInterface;
                                                                    }
                                                                    else {
                                                                        o = new mvl(strongBinder);
                                                                    }
                                                                }
                                                                qr.recycle();
                                                            }
                                                            else {
                                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                final mvn a7 = mvm.a((Object)applicationContext);
                                                                final mvn a8 = mvm.a(a4);
                                                                final Parcel qq2 = o2.qQ();
                                                                eoa.j(qq2, (IInterface)a7);
                                                                qq2.writeString(s);
                                                                qq2.writeInt(b);
                                                                eoa.j(qq2, (IInterface)a8);
                                                                final Parcel qr2 = o2.qR(2, qq2);
                                                                final IBinder strongBinder2 = qr2.readStrongBinder();
                                                                if (strongBinder2 == null) {
                                                                    o = mvn;
                                                                }
                                                                else {
                                                                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                    if (queryLocalInterface2 instanceof mvn) {
                                                                        o = queryLocalInterface2;
                                                                    }
                                                                    else {
                                                                        o = new mvl(strongBinder2);
                                                                    }
                                                                }
                                                                qr2.recycle();
                                                            }
                                                            final Context context2 = (Context)mvm.b((mvn)o);
                                                            if (context2 != null) {
                                                                context = (Context)new mwb(context2);
                                                                break Label_1127;
                                                            }
                                                            throw new mvx("Failed to get module context");
                                                        }
                                                    }
                                                    throw new mvx("No result cursor");
                                                }
                                                throw new mvx("DynamiteLoaderV2 was not cached.");
                                            }
                                        }
                                        final mwc i = k(context);
                                        if (i == null) {
                                            throw new mvx("Failed to create IDynamiteLoader.");
                                        }
                                        final int a9 = i.a();
                                        Object o3;
                                        if (a9 >= 3) {
                                            final elw elw4 = k.get();
                                            if (elw4 == null) {
                                                throw new mvx("No cached result cursor holder");
                                            }
                                            final mvn a10 = mvm.a((Object)context);
                                            final mvn a11 = mvm.a(elw4.a);
                                            final Parcel qq3 = i.qQ();
                                            eoa.j(qq3, (IInterface)a10);
                                            qq3.writeString(s);
                                            qq3.writeInt(b);
                                            eoa.j(qq3, (IInterface)a11);
                                            final Parcel qr3 = i.qR(8, qq3);
                                            final IBinder strongBinder3 = qr3.readStrongBinder();
                                            if (strongBinder3 == null) {
                                                o3 = mvn2;
                                            }
                                            else {
                                                final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                if (queryLocalInterface3 instanceof mvn) {
                                                    o3 = queryLocalInterface3;
                                                }
                                                else {
                                                    o3 = new mvl(strongBinder3);
                                                }
                                            }
                                            qr3.recycle();
                                        }
                                        else if (a9 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            final mvn a12 = mvm.a((Object)context);
                                            final Parcel qq4 = i.qQ();
                                            eoa.j(qq4, (IInterface)a12);
                                            qq4.writeString(s);
                                            qq4.writeInt(b);
                                            final Parcel qr4 = i.qR(4, qq4);
                                            final IBinder strongBinder4 = qr4.readStrongBinder();
                                            if (strongBinder4 == null) {
                                                o3 = mvn3;
                                            }
                                            else {
                                                final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                if (queryLocalInterface4 instanceof mvn) {
                                                    o3 = queryLocalInterface4;
                                                }
                                                else {
                                                    o3 = new mvl(strongBinder4);
                                                }
                                            }
                                            qr4.recycle();
                                        }
                                        else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            final mvn a13 = mvm.a((Object)context);
                                            final Parcel qq5 = i.qQ();
                                            eoa.j(qq5, (IInterface)a13);
                                            qq5.writeString(s);
                                            qq5.writeInt(b);
                                            final Parcel qr5 = i.qR(2, qq5);
                                            final IBinder strongBinder5 = qr5.readStrongBinder();
                                            if (strongBinder5 == null) {
                                                o3 = mvn4;
                                            }
                                            else {
                                                final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                if (queryLocalInterface5 instanceof mvn) {
                                                    o3 = queryLocalInterface5;
                                                }
                                                else {
                                                    o3 = new mvl(strongBinder5);
                                                }
                                            }
                                            qr5.recycle();
                                        }
                                        final Object b3 = mvm.b((mvn)o3);
                                        if (b3 == null) {
                                            throw new mvx("Failed to load remote module.");
                                        }
                                        context = (Context)new mwb((Context)b3);
                                    }
                                    if (longValue == 0L) {
                                        l.remove();
                                    }
                                    else {
                                        l.set(longValue);
                                    }
                                    a = (mwa)elw2.a;
                                    if (a != null) {
                                        ((Cursor)a).close();
                                    }
                                    k.set(elw);
                                    return (mwb)context;
                                }
                                throw new mvx("Failed to determine which loading route to use.");
                            }
                        }
                        catch (final mvx mvx) {
                            throw mvx;
                        }
                        catch (final RemoteException ex) {
                            try {
                                throw new mvx("Failed to load remote module.", (Throwable)ex);
                            }
                            catch (final mvx mvx3) {
                                final String message = mvx3.getMessage();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Failed to load remote module: ");
                                sb.append(message);
                                Log.w("DynamiteModule", sb.toString());
                                final int a14 = a2.a;
                                if (a14 != 0 && a.a(context, s, (mvy)new mvw(a14)).c == -1) {
                                    return j(context);
                                }
                                throw new mvx("Remote load failed. No local fallback found.", mvx3);
                                throw new mvx("VersionPolicy returned invalid code:0");
                                final int a15 = a2.a;
                                final int b4 = a2.b;
                                final StringBuilder sb2 = new StringBuilder("No acceptable module ");
                                sb2.append(s);
                                sb2.append(" found. Local version is ");
                                sb2.append(a15);
                                sb2.append(" and remote version is ");
                                sb2.append(b4);
                                sb2.append(".");
                                throw new mvx(sb2.toString());
                            }
                        }
                        finally {
                            meo.K(context);
                            final Throwable t;
                            throw new mvx("Failed to load remote module.", t);
                        }
                        try {
                            final mvx mvx;
                            throw mvx;
                        }
                        catch (final mvx mvx4) {}
                        finally {
                            if (longValue == 0L) {
                                mwb.l.remove();
                            }
                            else {
                                mwb.l.set(longValue);
                            }
                            final Object a16 = elw2.a;
                            if (a16 != null) {
                                ((Cursor)a16).close();
                            }
                            mwb.k.set(elw);
                        }
                    }
                    catch (final mvx mvx5) {}
                }
            }
        }
        finally {}
    }
    
    private static int f(final Context p0, final String p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aconst_null    
        //     4: astore          5
        //     6: aconst_null    
        //     7: astore          6
        //     9: aload           4
        //    11: astore          7
        //    13: aload           5
        //    15: astore          8
        //    17: getstatic       mwb.l:Ljava/lang/ThreadLocal;
        //    20: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    23: checkcast       Ljava/lang/Long;
        //    26: invokevirtual   java/lang/Long.longValue:()J
        //    29: lstore          9
        //    31: aload           4
        //    33: astore          7
        //    35: aload           5
        //    37: astore          8
        //    39: aload_0        
        //    40: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    43: astore          11
        //    45: ldc_w           "api_force_staging"
        //    48: astore_0       
        //    49: iconst_1       
        //    50: istore          12
        //    52: iconst_1       
        //    53: iload_2        
        //    54: if_icmpeq       61
        //    57: ldc_w           "api"
        //    60: astore_0       
        //    61: aload           4
        //    63: astore          7
        //    65: aload           5
        //    67: astore          8
        //    69: new             Landroid/net/Uri$Builder;
        //    72: astore          13
        //    74: aload           4
        //    76: astore          7
        //    78: aload           5
        //    80: astore          8
        //    82: aload           13
        //    84: invokespecial   android/net/Uri$Builder.<init>:()V
        //    87: aload           4
        //    89: astore          7
        //    91: aload           5
        //    93: astore          8
        //    95: aload           11
        //    97: aload           13
        //    99: ldc_w           "content"
        //   102: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   105: ldc_w           "com.mgoogle.android.gms.chimera"
        //   108: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   111: aload_0        
        //   112: invokevirtual   android/net/Uri$Builder.path:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   115: aload_1        
        //   116: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   119: ldc_w           "requestStartTime"
        //   122: lload           9
        //   124: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   127: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   130: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   133: aconst_null    
        //   134: aconst_null    
        //   135: aconst_null    
        //   136: aconst_null    
        //   137: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   140: astore_0       
        //   141: aload_0        
        //   142: ifnull          347
        //   145: aload_0        
        //   146: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   151: ifeq            347
        //   154: iconst_0       
        //   155: istore          14
        //   157: iconst_0       
        //   158: istore_2       
        //   159: aload_0        
        //   160: iconst_0       
        //   161: invokeinterface android/database/Cursor.getInt:(I)I
        //   166: istore          15
        //   168: iload           15
        //   170: ifle            281
        //   173: ldc             Lmwb;.class
        //   175: monitorenter   
        //   176: aload_0        
        //   177: iconst_2       
        //   178: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   183: putstatic       mwb.g:Ljava/lang/String;
        //   186: aload_0        
        //   187: ldc_w           "loaderVersion"
        //   190: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   195: istore          16
        //   197: iload           16
        //   199: iflt            213
        //   202: aload_0        
        //   203: iload           16
        //   205: invokeinterface android/database/Cursor.getInt:(I)I
        //   210: putstatic       mwb.i:I
        //   213: aload_0        
        //   214: ldc_w           "disableStandaloneDynamiteLoader2"
        //   217: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   222: istore          16
        //   224: iload           16
        //   226: iflt            252
        //   229: aload_0        
        //   230: iload           16
        //   232: invokeinterface android/database/Cursor.getInt:(I)I
        //   237: ifeq            246
        //   240: iload           12
        //   242: istore_2       
        //   243: goto            248
        //   246: iconst_0       
        //   247: istore_2       
        //   248: iload_2        
        //   249: putstatic       mwb.h:Z
        //   252: ldc             Lmwb;.class
        //   254: monitorexit    
        //   255: aload_0        
        //   256: invokestatic    mwb.h:(Landroid/database/Cursor;)Z
        //   259: istore          12
        //   261: iload_2        
        //   262: istore          14
        //   264: iload           12
        //   266: ifeq            281
        //   269: aload           6
        //   271: astore_0       
        //   272: goto            284
        //   275: astore_1       
        //   276: ldc             Lmwb;.class
        //   278: monitorexit    
        //   279: aload_1        
        //   280: athrow         
        //   281: iload           14
        //   283: istore_2       
        //   284: iload_3        
        //   285: ifeq            334
        //   288: iload_2        
        //   289: ifne            295
        //   292: goto            334
        //   295: aload_0        
        //   296: astore          7
        //   298: aload_0        
        //   299: astore          8
        //   301: new             Lmvx;
        //   304: astore_1       
        //   305: aload_0        
        //   306: astore          7
        //   308: aload_0        
        //   309: astore          8
        //   311: aload_1        
        //   312: ldc_w           "forcing fallback to container DynamiteLoader impl"
        //   315: invokespecial   mvx.<init>:(Ljava/lang/String;)V
        //   318: aload_0        
        //   319: astore          7
        //   321: aload_0        
        //   322: astore          8
        //   324: aload_1        
        //   325: athrow         
        //   326: astore_0       
        //   327: goto            483
        //   330: astore_0       
        //   331: goto            384
        //   334: aload_0        
        //   335: ifnull          344
        //   338: aload_0        
        //   339: invokeinterface android/database/Cursor.close:()V
        //   344: iload           15
        //   346: ireturn        
        //   347: ldc             "DynamiteModule"
        //   349: ldc_w           "Failed to retrieve remote module version."
        //   352: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   355: pop            
        //   356: new             Lmvx;
        //   359: astore_1       
        //   360: aload_1        
        //   361: ldc_w           "Failed to connect to dynamite module ContentResolver."
        //   364: invokespecial   mvx.<init>:(Ljava/lang/String;)V
        //   367: aload_1        
        //   368: athrow         
        //   369: astore_1       
        //   370: aload_0        
        //   371: astore          7
        //   373: aload_1        
        //   374: astore_0       
        //   375: goto            483
        //   378: astore_1       
        //   379: aload_0        
        //   380: astore          8
        //   382: aload_1        
        //   383: astore_0       
        //   384: aload           8
        //   386: astore          7
        //   388: aload_0        
        //   389: instanceof      Lmvx;
        //   392: ifeq            401
        //   395: aload           8
        //   397: astore          7
        //   399: aload_0        
        //   400: athrow         
        //   401: aload           8
        //   403: astore          7
        //   405: new             Lmvx;
        //   408: astore          6
        //   410: aload           8
        //   412: astore          7
        //   414: aload_0        
        //   415: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   418: astore_1       
        //   419: aload           8
        //   421: astore          7
        //   423: new             Ljava/lang/StringBuilder;
        //   426: astore          4
        //   428: aload           8
        //   430: astore          7
        //   432: aload           4
        //   434: invokespecial   java/lang/StringBuilder.<init>:()V
        //   437: aload           8
        //   439: astore          7
        //   441: aload           4
        //   443: ldc_w           "V2 version check failed: "
        //   446: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   449: pop            
        //   450: aload           8
        //   452: astore          7
        //   454: aload           4
        //   456: aload_1        
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: pop            
        //   461: aload           8
        //   463: astore          7
        //   465: aload           6
        //   467: aload           4
        //   469: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   472: aload_0        
        //   473: invokespecial   mvx.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   476: aload           8
        //   478: astore          7
        //   480: aload           6
        //   482: athrow         
        //   483: aload           7
        //   485: ifnull          495
        //   488: aload           7
        //   490: invokeinterface android/database/Cursor.close:()V
        //   495: aload_0        
        //   496: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     31     330    334    Ljava/lang/Exception;
        //  17     31     326    330    Any
        //  39     45     330    334    Ljava/lang/Exception;
        //  39     45     326    330    Any
        //  69     74     330    334    Ljava/lang/Exception;
        //  69     74     326    330    Any
        //  82     87     330    334    Ljava/lang/Exception;
        //  82     87     326    330    Any
        //  95     141    330    334    Ljava/lang/Exception;
        //  95     141    326    330    Any
        //  145    154    378    384    Ljava/lang/Exception;
        //  145    154    369    378    Any
        //  159    168    378    384    Ljava/lang/Exception;
        //  159    168    369    378    Any
        //  173    176    378    384    Ljava/lang/Exception;
        //  173    176    369    378    Any
        //  176    197    275    281    Any
        //  202    213    275    281    Any
        //  213    224    275    281    Any
        //  229    240    275    281    Any
        //  248    252    275    281    Any
        //  252    255    275    281    Any
        //  255    261    378    384    Ljava/lang/Exception;
        //  255    261    369    378    Any
        //  276    279    275    281    Any
        //  279    281    378    384    Ljava/lang/Exception;
        //  279    281    369    378    Any
        //  301    305    330    334    Ljava/lang/Exception;
        //  301    305    326    330    Any
        //  311    318    330    334    Ljava/lang/Exception;
        //  311    318    326    330    Any
        //  324    326    330    334    Ljava/lang/Exception;
        //  324    326    326    330    Any
        //  347    369    378    384    Ljava/lang/Exception;
        //  347    369    369    378    Any
        //  388    395    326    330    Any
        //  399    401    326    330    Any
        //  405    410    326    330    Any
        //  414    419    326    330    Any
        //  423    428    326    330    Any
        //  432    437    326    330    Any
        //  441    450    326    330    Any
        //  454    461    326    330    Any
        //  465    476    326    330    Any
        //  480    483    326    330    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0213:
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
    
    private static void g(ClassLoader o) {
        try {
            o = (NoSuchMethodException)((ClassLoader)o).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (o == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = ((IBinder)o).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof mwd) {
                    o = (NoSuchMethodException)queryLocalInterface;
                }
                else {
                    o = (NoSuchMethodException)new mwd((IBinder)o);
                }
            }
            mwb.o = (mwd)o;
            return;
        }
        catch (final NoSuchMethodException o) {}
        catch (final InvocationTargetException o) {}
        catch (final InstantiationException o) {}
        catch (final IllegalAccessException o) {}
        catch (final ClassNotFoundException ex) {}
        throw new mvx("Failed to instantiate dynamite loader", o);
    }
    
    private static boolean h(final Cursor a) {
        final elw elw = mwb.k.get();
        if (elw != null && elw.a == null) {
            elw.a = a;
            return true;
        }
        return false;
    }
    
    private static boolean i(final Context context) {
        if (Boolean.TRUE.equals(null)) {
            return true;
        }
        if (Boolean.TRUE.equals(mwb.j)) {
            return true;
        }
        final Boolean j = mwb.j;
        boolean b = false;
        final boolean b2 = false;
        if (j == null) {
            final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.mgoogle.android.gms.chimera", 0);
            boolean b3 = b2;
            if (mor.d.h(context, 10000000) == 0) {
                b3 = b2;
                if (resolveContentProvider != null) {
                    b3 = b2;
                    if ("com.mgoogle.android.gms".equals(resolveContentProvider.packageName)) {
                        b3 = true;
                    }
                }
            }
            final boolean booleanValue = mwb.j = b3;
            if (b = booleanValue) {
                b = booleanValue;
                if (resolveContentProvider != null) {
                    b = booleanValue;
                    if (resolveContentProvider.applicationInfo != null) {
                        b = booleanValue;
                        if ((resolveContentProvider.applicationInfo.flags & 0x81) == 0x0) {
                            mwb.h = true;
                            b = booleanValue;
                        }
                    }
                }
            }
        }
        if (!b) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return b;
    }
    
    private static mwb j(final Context context) {
        return new mwb(context.getApplicationContext());
    }
    
    private static mwc k(final Context context) {
        synchronized (mwb.class) {
            final mwc n = mwb.n;
            if (n != null) {
                return n;
            }
            try {
                final IBinder binder = (IBinder)context.createPackageContext("com.mgoogle.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                mwc n2;
                if (binder == null) {
                    n2 = null;
                }
                else {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof mwc) {
                        n2 = (mwc)queryLocalInterface;
                    }
                    else {
                        n2 = new mwc(binder);
                    }
                }
                if (n2 != null) {
                    return mwb.n = n2;
                }
            }
            catch (final Exception ex) {
                final String message = ex.getMessage();
                final StringBuilder sb = new StringBuilder("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }
    
    public final IBinder d(final String s) {
        IBinder binder = null;
        try {
            binder = (IBinder)this.e.getClassLoader().loadClass(s).newInstance();
            return binder;
        }
        catch (final IllegalAccessException binder) {}
        catch (final InstantiationException binder) {}
        catch (final ClassNotFoundException ex) {}
        throw new mvx("Failed to instantiate module class: ".concat(s), (Throwable)binder);
    }
}
