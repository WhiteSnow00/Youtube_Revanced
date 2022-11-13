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

public final class arby implements arda
{
    private static final String a = "arby";
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;
    private final Uri g;
    
    public arby(final ContentProviderClient b, final String s) {
        if (s != null && !s.isEmpty()) {
            this.b = b;
            this.c = aqsx.o(s, "device_params");
            this.d = aqsx.o(s, "user_prefs");
            this.e = aqsx.o(s, "phone_params");
            this.f = aqsx.o(s, "sdk_configuration_params");
            this.g = aqsx.o(s, "recent_headsets");
            return;
        }
        throw new IllegalArgumentException("Authority key must be non-null and non-empty");
    }
    
    private final MessageLite h(final ahcv ahcv, final Uri uri, final String s) {
        final byte[] i = this.i(uri, s);
        if (i == null) {
            return null;
        }
        try {
            return ahcv.mergeFrom(i).build();
        }
        catch (final ahca ahca) {
            Log.e(arby.a, "Error reading params from ContentProvider", (Throwable)ahca);
            return null;
        }
    }
    
    private final byte[] i(final Uri p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aload_0        
        //     4: getfield        arby.b:Landroid/content/ContentProviderClient;
        //     7: aload_1        
        //     8: aconst_null    
        //     9: aload_2        
        //    10: aconst_null    
        //    11: aconst_null    
        //    12: invokevirtual   android/content/ContentProviderClient.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnull          61
        //    20: aload_3        
        //    21: astore_2       
        //    22: aload_3        
        //    23: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    28: ifeq            61
        //    31: aload_3        
        //    32: astore_2       
        //    33: aload_3        
        //    34: iconst_0       
        //    35: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    40: astore_1       
        //    41: aload_1        
        //    42: ifnonnull       53
        //    45: aload_3        
        //    46: invokeinterface android/database/Cursor.close:()V
        //    51: aconst_null    
        //    52: areturn        
        //    53: aload_3        
        //    54: invokeinterface android/database/Cursor.close:()V
        //    59: aload_1        
        //    60: areturn        
        //    61: aload_3        
        //    62: astore_2       
        //    63: getstatic       arby.a:Ljava/lang/String;
        //    66: astore          4
        //    68: aload_3        
        //    69: astore_2       
        //    70: aload_1        
        //    71: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    74: astore_1       
        //    75: aload_3        
        //    76: astore_2       
        //    77: new             Ljava/lang/StringBuilder;
        //    80: astore          5
        //    82: aload_3        
        //    83: astore_2       
        //    84: aload           5
        //    86: ldc             "Invalid params result from ContentProvider query: "
        //    88: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    91: aload_3        
        //    92: astore_2       
        //    93: aload           5
        //    95: aload_1        
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: pop            
        //   100: aload_3        
        //   101: astore_2       
        //   102: aload           4
        //   104: aload           5
        //   106: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   109: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   112: pop            
        //   113: aload_3        
        //   114: ifnull          123
        //   117: aload_3        
        //   118: invokeinterface android/database/Cursor.close:()V
        //   123: aconst_null    
        //   124: areturn        
        //   125: astore_1       
        //   126: goto            155
        //   129: astore_1       
        //   130: goto            155
        //   133: astore_1       
        //   134: goto            155
        //   137: astore_1       
        //   138: aload           4
        //   140: astore_2       
        //   141: goto            180
        //   144: astore_1       
        //   145: goto            153
        //   148: astore_1       
        //   149: goto            153
        //   152: astore_1       
        //   153: aconst_null    
        //   154: astore_3       
        //   155: aload_3        
        //   156: astore_2       
        //   157: getstatic       arby.a:Ljava/lang/String;
        //   160: ldc             "Error reading params from ContentProvider"
        //   162: aload_1        
        //   163: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   166: pop            
        //   167: aload_3        
        //   168: ifnull          177
        //   171: aload_3        
        //   172: invokeinterface android/database/Cursor.close:()V
        //   177: aconst_null    
        //   178: areturn        
        //   179: astore_1       
        //   180: aload_2        
        //   181: ifnull          190
        //   184: aload_2        
        //   185: invokeinterface android/database/Cursor.close:()V
        //   190: aload_1        
        //   191: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  3      16     152    153    Landroid/database/CursorIndexOutOfBoundsException;
        //  3      16     148    152    Ljava/lang/IllegalArgumentException;
        //  3      16     144    148    Landroid/os/RemoteException;
        //  3      16     137    144    Any
        //  22     31     133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  22     31     129    133    Ljava/lang/IllegalArgumentException;
        //  22     31     125    129    Landroid/os/RemoteException;
        //  22     31     179    180    Any
        //  33     41     133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  33     41     129    133    Ljava/lang/IllegalArgumentException;
        //  33     41     125    129    Landroid/os/RemoteException;
        //  33     41     179    180    Any
        //  63     68     133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  63     68     129    133    Ljava/lang/IllegalArgumentException;
        //  63     68     125    129    Landroid/os/RemoteException;
        //  63     68     179    180    Any
        //  70     75     133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  70     75     129    133    Ljava/lang/IllegalArgumentException;
        //  70     75     125    129    Landroid/os/RemoteException;
        //  70     75     179    180    Any
        //  77     82     133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  77     82     129    133    Ljava/lang/IllegalArgumentException;
        //  77     82     125    129    Landroid/os/RemoteException;
        //  77     82     179    180    Any
        //  84     91     133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  84     91     129    133    Ljava/lang/IllegalArgumentException;
        //  84     91     125    129    Landroid/os/RemoteException;
        //  84     91     179    180    Any
        //  93     100    133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  93     100    129    133    Ljava/lang/IllegalArgumentException;
        //  93     100    125    129    Landroid/os/RemoteException;
        //  93     100    179    180    Any
        //  102    113    133    137    Landroid/database/CursorIndexOutOfBoundsException;
        //  102    113    129    133    Ljava/lang/IllegalArgumentException;
        //  102    113    125    129    Landroid/os/RemoteException;
        //  102    113    179    180    Any
        //  157    167    179    180    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    @Override
    public final afqs a(final SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return (afqs)this.h((ahcv)SdkConfigurationReader.DEFAULT_PARAMS.toBuilder(), this.f, Base64.encodeToString(((agzk)sdkConfiguration$SdkConfigurationRequest).toByteArray(), 0));
    }
    
    @Override
    public final CardboardDevice$DeviceParams b() {
        return (CardboardDevice$DeviceParams)this.h((ahcv)CardboardDevice$DeviceParams.newBuilder(), this.c, null);
    }
    
    @Override
    public final CardboardDevice$DeviceParamsList c() {
        return (CardboardDevice$DeviceParamsList)this.h((ahcv)CardboardDevice$DeviceParamsList.newBuilder(), this.g, null);
    }
    
    @Override
    public final Display$DisplayParams d() {
        return (Display$DisplayParams)this.h((ahcv)Display$DisplayParams.newBuilder(), this.e, null);
    }
    
    @Override
    public final Preferences$UserPrefs e() {
        return (Preferences$UserPrefs)this.h((ahcv)Preferences$UserPrefs.newBuilder(), this.d, null);
    }
    
    @Override
    public final void f() {
        this.b.close();
    }
    
    @Override
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
                    Log.e(arby.a, "Insufficient permissions to write params to ContentProvider", (Throwable)ex);
                }
                catch (final RemoteException ex2) {
                    Log.e(arby.a, "Failed to write params to ContentProvider", (Throwable)ex2);
                }
                return false;
            }
            continue;
        }
    }
}
