import java.util.Set;
import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebr implements aebq
{
    public final aebp a;
    private final aebw b;
    private final aebo c;
    private final aeby d;
    private final Handler e;
    
    public aebr(final aebw b, final aebp a, final aebo c, final aeby d) {
        this.e = new Handler(Looper.getMainLooper());
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public static List c(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((Locale)iterator.next()).toLanguageTag());
        }
        return list2;
    }
    
    public final nly a(final aebt p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: new             Ladcr;
        //     5: dup            
        //     6: aconst_null    
        //     7: invokespecial   adcr.<init>:([I)V
        //    10: astore_3       
        //    11: aload_3        
        //    12: iconst_1       
        //    13: invokevirtual   adcr.o:(I)V
        //    16: aload_1        
        //    17: getfield        aebt.b:Ljava/util/List;
        //    20: invokeinterface java/util/List.isEmpty:()Z
        //    25: pop            
        //    26: aload_1        
        //    27: getfield        aebt.b:Ljava/util/List;
        //    30: astore          4
        //    32: aload           4
        //    34: invokeinterface java/util/List.isEmpty:()Z
        //    39: ifeq            45
        //    42: goto            302
        //    45: aload_0        
        //    46: getfield        aebr.c:Laebo;
        //    49: astore          5
        //    51: aload           5
        //    53: invokevirtual   aebo.a:()Landroid/content/pm/PackageInfo;
        //    56: astore          6
        //    58: aload_2        
        //    59: astore          7
        //    61: aload           6
        //    63: ifnull          236
        //    66: aload           6
        //    68: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //    71: ifnonnull       80
        //    74: aload_2        
        //    75: astore          7
        //    77: goto            236
        //    80: aload           5
        //    82: aload           6
        //    84: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //    87: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    90: invokevirtual   aebo.e:(Landroid/os/Bundle;)Laeby;
        //    93: astore          7
        //    95: aload           7
        //    97: ifnonnull       106
        //   100: aload_2        
        //   101: astore          7
        //   103: goto            236
        //   106: new             Ljava/util/HashSet;
        //   109: dup            
        //   110: invokespecial   java/util/HashSet.<init>:()V
        //   113: astore_2       
        //   114: aload           5
        //   116: aload           6
        //   118: invokevirtual   aebo.d:(Landroid/content/pm/PackageInfo;)Ljava/util/Set;
        //   121: astore          8
        //   123: aload           8
        //   125: ldc             ""
        //   127: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   132: pop            
        //   133: aload           5
        //   135: aload           6
        //   137: invokevirtual   aebo.c:(Landroid/content/pm/PackageInfo;)Ljava/util/Set;
        //   140: astore          5
        //   142: aload           5
        //   144: ldc             ""
        //   146: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   151: pop            
        //   152: aload           7
        //   154: aload           5
        //   156: invokevirtual   aeby.j:(Ljava/util/Collection;)Ljava/util/Map;
        //   159: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   164: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   169: astore          5
        //   171: aload_2        
        //   172: astore          7
        //   174: aload           5
        //   176: invokeinterface java/util/Iterator.hasNext:()Z
        //   181: ifeq            236
        //   184: aload           5
        //   186: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   191: checkcast       Ljava/util/Map$Entry;
        //   194: astore          7
        //   196: aload           8
        //   198: aload           7
        //   200: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   205: checkcast       Ljava/util/Collection;
        //   208: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   213: ifeq            171
        //   216: aload_2        
        //   217: aload           7
        //   219: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   224: checkcast       Ljava/lang/String;
        //   227: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   232: pop            
        //   233: goto            171
        //   236: aload           7
        //   238: ifnull          302
        //   241: new             Ljava/util/HashSet;
        //   244: dup            
        //   245: invokespecial   java/util/HashSet.<init>:()V
        //   248: astore_2       
        //   249: aload           4
        //   251: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   256: astore          4
        //   258: aload           4
        //   260: invokeinterface java/util/Iterator.hasNext:()Z
        //   265: ifeq            291
        //   268: aload_2        
        //   269: aload           4
        //   271: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   276: checkcast       Ljava/util/Locale;
        //   279: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //   282: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   287: pop            
        //   288: goto            258
        //   291: aload           7
        //   293: aload_2        
        //   294: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   299: ifeq            368
        //   302: aload_1        
        //   303: getfield        aebt.a:Ljava/util/List;
        //   306: astore          7
        //   308: aload_0        
        //   309: invokevirtual   aebr.b:()Ljava/util/Set;
        //   312: aload           7
        //   314: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   319: ifeq            368
        //   322: aload_1        
        //   323: getfield        aebt.a:Ljava/util/List;
        //   326: aload_0        
        //   327: getfield        aebr.d:Laeby;
        //   330: invokevirtual   aeby.b:()Ljava/util/Set;
        //   333: invokestatic    java/util/Collections.disjoint:(Ljava/util/Collection;Ljava/util/Collection;)Z
        //   336: ifne            342
        //   339: goto            368
        //   342: aload_0        
        //   343: getfield        aebr.e:Landroid/os/Handler;
        //   346: new             Ladpd;
        //   349: dup            
        //   350: aload_0        
        //   351: aload_1        
        //   352: iconst_5       
        //   353: invokespecial   adpd.<init>:(Laebr;Laebt;I)V
        //   356: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   359: pop            
        //   360: iconst_0       
        //   361: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   364: invokestatic    nmr.c:(Ljava/lang/Object;)Lnly;
        //   367: areturn        
        //   368: aload_0        
        //   369: getfield        aebr.d:Laeby;
        //   372: astore          4
        //   374: aload_1        
        //   375: getfield        aebt.a:Ljava/util/List;
        //   378: astore          7
        //   380: ldc             Laeby;.class
        //   382: monitorenter   
        //   383: aload           4
        //   385: invokevirtual   aeby.b:()Ljava/util/Set;
        //   388: astore          8
        //   390: new             Ljava/util/HashSet;
        //   393: astore_2       
        //   394: aload_2        
        //   395: invokespecial   java/util/HashSet.<init>:()V
        //   398: aload           8
        //   400: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   405: astore          5
        //   407: iconst_0       
        //   408: istore          9
        //   410: aload           5
        //   412: invokeinterface java/util/Iterator.hasNext:()Z
        //   417: ifeq            462
        //   420: aload           5
        //   422: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   427: checkcast       Ljava/lang/String;
        //   430: astore          8
        //   432: aload           7
        //   434: aload           8
        //   436: invokeinterface java/util/Collection.contains:(Ljava/lang/Object;)Z
        //   441: ifeq            450
        //   444: iconst_1       
        //   445: istore          9
        //   447: goto            410
        //   450: aload_2        
        //   451: aload           8
        //   453: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   458: pop            
        //   459: goto            410
        //   462: iload           9
        //   464: ifeq            490
        //   467: aload           4
        //   469: invokevirtual   aeby.a:()Landroid/content/SharedPreferences;
        //   472: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   477: ldc             "modules_to_uninstall_if_emulated"
        //   479: aload_2        
        //   480: invokeinterface android/content/SharedPreferences$Editor.putStringSet:(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
        //   485: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   490: ldc             Laeby;.class
        //   492: monitorexit    
        //   493: aload_0        
        //   494: getfield        aebr.b:Laebw;
        //   497: astore          7
        //   499: aload_1        
        //   500: getfield        aebt.a:Ljava/util/List;
        //   503: astore_2       
        //   504: aload_1        
        //   505: getfield        aebt.b:Ljava/util/List;
        //   508: invokestatic    aebr.c:(Ljava/util/List;)Ljava/util/List;
        //   511: astore_1       
        //   512: aload           7
        //   514: getfield        aebw.b:Laebd;
        //   517: ifnonnull       556
        //   520: getstatic       aebw.c:Laeby;
        //   523: ldc             "onError(%d)"
        //   525: iconst_1       
        //   526: anewarray       Ljava/lang/Object;
        //   529: dup            
        //   530: iconst_0       
        //   531: bipush          -14
        //   533: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   536: aastore        
        //   537: invokevirtual   aeby.k:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   540: new             Laebn;
        //   543: dup            
        //   544: bipush          -14
        //   546: invokespecial   aebn.<init>:(I)V
        //   549: invokestatic    nmr.b:(Ljava/lang/Exception;)Lnly;
        //   552: astore_1       
        //   553: goto            599
        //   556: new             Lnmo;
        //   559: dup            
        //   560: invokespecial   nmo.<init>:()V
        //   563: astore          4
        //   565: aload           7
        //   567: getfield        aebw.b:Laebd;
        //   570: new             Laebu;
        //   573: dup            
        //   574: aload           7
        //   576: aload           4
        //   578: aload_2        
        //   579: aload_1        
        //   580: aload_3        
        //   581: aload           4
        //   583: aconst_null    
        //   584: aconst_null    
        //   585: invokespecial   aebu.<init>:(Laebw;Lnmo;Ljava/util/Collection;Ljava/util/Collection;Ladcr;Lnmo;[B[B)V
        //   588: aload           4
        //   590: invokevirtual   aebd.f:(Laeau;Lnmo;)V
        //   593: aload           4
        //   595: getfield        nmo.a:Ljava/lang/Object;
        //   598: astore_1       
        //   599: aload_1        
        //   600: checkcast       Lnly;
        //   603: areturn        
        //   604: astore_1       
        //   605: ldc             Laeby;.class
        //   607: monitorexit    
        //   608: goto            613
        //   611: aload_1        
        //   612: athrow         
        //   613: goto            611
        //   616: astore          7
        //   618: goto            490
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  383    407    604    616    Any
        //  410    444    604    616    Any
        //  450    459    604    616    Any
        //  467    490    616    621    Ljava/lang/Exception;
        //  467    490    604    616    Any
        //  490    493    604    616    Any
        //  605    608    604    616    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0490:
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
    
    public final Set b() {
        return this.c.b();
    }
}
