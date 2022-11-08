import android.os.RemoteException;
import android.content.ContentValues;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.util.Base64;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import android.util.Log;
import com.google.protobuf.MessageLite;
import android.net.Uri;
import android.content.ContentProviderClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzk implements aral
{
    private static final String a = "aqzk";
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;
    private final Uri g;
    
    public aqzk(final ContentProviderClient b, final String s) {
        if (s != null && !s.isEmpty()) {
            this.b = b;
            this.c = aqql.n(s, "device_params");
            this.d = aqql.n(s, "user_prefs");
            this.e = aqql.n(s, "phone_params");
            this.f = aqql.n(s, "sdk_configuration_params");
            this.g = aqql.n(s, "recent_headsets");
            return;
        }
        throw new IllegalArgumentException("Authority key must be non-null and non-empty");
    }
    
    private final MessageLite h(final ahaw ahaw, final Uri uri, final String s) {
        final byte[] i = this.i(uri, s);
        if (i == null) {
            return null;
        }
        try {
            return ahaw.mergeFrom(i).build();
        }
        catch (final ahab ahab) {
            Log.e(aqzk.a, "Error reading params from ContentProvider", (Throwable)ahab);
            return null;
        }
    }
    
    private final byte[] i(final Uri p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aload_0        
        //     3: getfield        aqzk.b:Landroid/content/ContentProviderClient;
        //     6: aload_1        
        //     7: aconst_null    
        //     8: aload_2        
        //     9: aconst_null    
        //    10: aconst_null    
        //    11: invokevirtual   android/content/ContentProviderClient.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    14: astore          4
        //    16: aload           4
        //    18: ifnull          68
        //    21: aload           4
        //    23: astore_2       
        //    24: aload           4
        //    26: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    31: ifeq            68
        //    34: aload           4
        //    36: astore_2       
        //    37: aload           4
        //    39: iconst_0       
        //    40: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    45: astore_1       
        //    46: aload_1        
        //    47: ifnonnull       59
        //    50: aload           4
        //    52: invokeinterface android/database/Cursor.close:()V
        //    57: aconst_null    
        //    58: areturn        
        //    59: aload           4
        //    61: invokeinterface android/database/Cursor.close:()V
        //    66: aload_1        
        //    67: areturn        
        //    68: aload           4
        //    70: astore_2       
        //    71: getstatic       aqzk.a:Ljava/lang/String;
        //    74: astore_3       
        //    75: aload           4
        //    77: astore_2       
        //    78: aload_1        
        //    79: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    82: astore          5
        //    84: aload           4
        //    86: astore_2       
        //    87: new             Ljava/lang/StringBuilder;
        //    90: astore_1       
        //    91: aload           4
        //    93: astore_2       
        //    94: aload_1        
        //    95: ldc             "Invalid params result from ContentProvider query: "
        //    97: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   100: aload           4
        //   102: astore_2       
        //   103: aload_1        
        //   104: aload           5
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: pop            
        //   110: aload           4
        //   112: astore_2       
        //   113: aload_3        
        //   114: aload_1        
        //   115: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   118: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   121: pop            
        //   122: aload           4
        //   124: ifnull          134
        //   127: aload           4
        //   129: invokeinterface android/database/Cursor.close:()V
        //   134: aconst_null    
        //   135: areturn        
        //   136: astore_1       
        //   137: goto            166
        //   140: astore_1       
        //   141: goto            166
        //   144: astore_1       
        //   145: goto            166
        //   148: astore_1       
        //   149: aload_3        
        //   150: astore_2       
        //   151: goto            194
        //   154: astore_1       
        //   155: goto            163
        //   158: astore_1       
        //   159: goto            163
        //   162: astore_1       
        //   163: aconst_null    
        //   164: astore          4
        //   166: aload           4
        //   168: astore_2       
        //   169: getstatic       aqzk.a:Ljava/lang/String;
        //   172: ldc             "Error reading params from ContentProvider"
        //   174: aload_1        
        //   175: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   178: pop            
        //   179: aload           4
        //   181: ifnull          191
        //   184: aload           4
        //   186: invokeinterface android/database/Cursor.close:()V
        //   191: aconst_null    
        //   192: areturn        
        //   193: astore_1       
        //   194: aload_2        
        //   195: ifnull          204
        //   198: aload_2        
        //   199: invokeinterface android/database/Cursor.close:()V
        //   204: aload_1        
        //   205: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  2      16     162    163    Landroid/database/CursorIndexOutOfBoundsException;
        //  2      16     158    162    Ljava/lang/IllegalArgumentException;
        //  2      16     154    158    Landroid/os/RemoteException;
        //  2      16     148    154    Any
        //  24     34     144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  24     34     140    144    Ljava/lang/IllegalArgumentException;
        //  24     34     136    140    Landroid/os/RemoteException;
        //  24     34     193    194    Any
        //  37     46     144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  37     46     140    144    Ljava/lang/IllegalArgumentException;
        //  37     46     136    140    Landroid/os/RemoteException;
        //  37     46     193    194    Any
        //  71     75     144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  71     75     140    144    Ljava/lang/IllegalArgumentException;
        //  71     75     136    140    Landroid/os/RemoteException;
        //  71     75     193    194    Any
        //  78     84     144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  78     84     140    144    Ljava/lang/IllegalArgumentException;
        //  78     84     136    140    Landroid/os/RemoteException;
        //  78     84     193    194    Any
        //  87     91     144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  87     91     140    144    Ljava/lang/IllegalArgumentException;
        //  87     91     136    140    Landroid/os/RemoteException;
        //  87     91     193    194    Any
        //  94     100    144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  94     100    140    144    Ljava/lang/IllegalArgumentException;
        //  94     100    136    140    Landroid/os/RemoteException;
        //  94     100    193    194    Any
        //  103    110    144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  103    110    140    144    Ljava/lang/IllegalArgumentException;
        //  103    110    136    140    Landroid/os/RemoteException;
        //  103    110    193    194    Any
        //  113    122    144    148    Landroid/database/CursorIndexOutOfBoundsException;
        //  113    122    140    144    Ljava/lang/IllegalArgumentException;
        //  113    122    136    140    Landroid/os/RemoteException;
        //  113    122    193    194    Any
        //  169    179    193    194    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public final afor a(final SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return (afor)this.h((ahaw)SdkConfigurationReader.DEFAULT_PARAMS.toBuilder(), this.f, Base64.encodeToString(sdkConfiguration$SdkConfigurationRequest.toByteArray(), 0));
    }
    
    public final CardboardDevice$DeviceParams b() {
        return (CardboardDevice$DeviceParams)this.h((ahaw)CardboardDevice$DeviceParams.newBuilder(), this.c, null);
    }
    
    public final CardboardDevice$DeviceParamsList c() {
        return (CardboardDevice$DeviceParamsList)this.h((ahaw)CardboardDevice$DeviceParamsList.newBuilder(), this.g, null);
    }
    
    public final Display$DisplayParams d() {
        return (Display$DisplayParams)this.h((ahaw)Display$DisplayParams.newBuilder(), this.e, null);
    }
    
    public final Preferences$UserPrefs e() {
        return (Preferences$UserPrefs)this.h((ahaw)Preferences$UserPrefs.newBuilder(), this.d, null);
    }
    
    public final void f() {
        this.b.close();
    }
    
    public final boolean g(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        final Uri c = this.c;
        while (true) {
            if (cardboardDevice$DeviceParams == null) {
                try {
                    int n = this.b.delete(c, (String)null, (String[])null);
                    while (true) {
                        if (n > 0) {
                            return true;
                        }
                        return false;
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("value", ((MessageLite)cardboardDevice$DeviceParams).toByteArray());
                        n = this.b.update(c, contentValues, (String)null, (String[])null);
                        continue;
                    }
                }
                catch (final SecurityException ex) {
                    Log.e(aqzk.a, "Insufficient permissions to write params to ContentProvider", (Throwable)ex);
                }
                catch (final RemoteException ex2) {
                    Log.e(aqzk.a, "Failed to write params to ContentProvider", (Throwable)ex2);
                }
                return false;
            }
            continue;
        }
    }
}
