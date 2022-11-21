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

public final class aefl implements aefk
{
    public final aefj a;
    private final aefq b;
    private final aefi c;
    private final aefs d;
    private final Handler e;
    
    public aefl(final aefq b, final aefj a, final aefi c, final aefs d) {
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
    
    @Override
    public final nnt a(final aefn p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: new             Laefs;
        //     6: dup            
        //     7: aconst_null    
        //     8: aconst_null    
        //     9: aconst_null    
        //    10: invokespecial   aefs.<init>:([B[B[B)V
        //    13: astore          5
        //    15: aload           5
        //    17: iconst_1       
        //    18: invokevirtual   aefs.l:(I)V
        //    21: aload_1        
        //    22: getfield        aefn.b:Ljava/util/List;
        //    25: invokeinterface java/util/List.isEmpty:()Z
        //    30: pop            
        //    31: aload_1        
        //    32: getfield        aefn.b:Ljava/util/List;
        //    35: astore          6
        //    37: aload           6
        //    39: invokeinterface java/util/List.isEmpty:()Z
        //    44: ifeq            50
        //    47: goto            304
        //    50: aload_0        
        //    51: getfield        aefl.c:Laefi;
        //    54: astore          9
        //    56: aload           9
        //    58: invokevirtual   aefi.a:()Landroid/content/pm/PackageInfo;
        //    61: astore          8
        //    63: aload           4
        //    65: astore_3       
        //    66: aload           8
        //    68: ifnull          237
        //    71: aload           8
        //    73: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //    76: ifnonnull       85
        //    79: aload           4
        //    81: astore_3       
        //    82: goto            237
        //    85: aload           9
        //    87: aload           8
        //    89: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //    92: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    95: invokevirtual   aefi.e:(Landroid/os/Bundle;)Laefs;
        //    98: astore_3       
        //    99: aload_3        
        //   100: ifnonnull       109
        //   103: aload           4
        //   105: astore_3       
        //   106: goto            237
        //   109: new             Ljava/util/HashSet;
        //   112: dup            
        //   113: invokespecial   java/util/HashSet.<init>:()V
        //   116: astore          4
        //   118: aload           9
        //   120: aload           8
        //   122: invokevirtual   aefi.d:(Landroid/content/pm/PackageInfo;)Ljava/util/Set;
        //   125: astore          7
        //   127: aload           7
        //   129: ldc             ""
        //   131: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   136: pop            
        //   137: aload           9
        //   139: aload           8
        //   141: invokevirtual   aefi.c:(Landroid/content/pm/PackageInfo;)Ljava/util/Set;
        //   144: astore          8
        //   146: aload           8
        //   148: ldc             ""
        //   150: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   155: pop            
        //   156: aload_3        
        //   157: aload           8
        //   159: invokevirtual   aefs.g:(Ljava/util/Collection;)Ljava/util/Map;
        //   162: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   167: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   172: astore          8
        //   174: aload           4
        //   176: astore_3       
        //   177: aload           8
        //   179: invokeinterface java/util/Iterator.hasNext:()Z
        //   184: ifeq            237
        //   187: aload           8
        //   189: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   194: checkcast       Ljava/util/Map$Entry;
        //   197: astore_3       
        //   198: aload           7
        //   200: aload_3        
        //   201: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   206: checkcast       Ljava/util/Collection;
        //   209: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   214: ifeq            174
        //   217: aload           4
        //   219: aload_3        
        //   220: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   225: checkcast       Ljava/lang/String;
        //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   233: pop            
        //   234: goto            174
        //   237: aload_3        
        //   238: ifnull          304
        //   241: new             Ljava/util/HashSet;
        //   244: dup            
        //   245: invokespecial   java/util/HashSet.<init>:()V
        //   248: astore          4
        //   250: aload           6
        //   252: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   257: astore          6
        //   259: aload           6
        //   261: invokeinterface java/util/Iterator.hasNext:()Z
        //   266: ifeq            293
        //   269: aload           4
        //   271: aload           6
        //   273: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   278: checkcast       Ljava/util/Locale;
        //   281: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //   284: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   289: pop            
        //   290: goto            259
        //   293: aload_3        
        //   294: aload           4
        //   296: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   301: ifeq            369
        //   304: aload_1        
        //   305: getfield        aefn.a:Ljava/util/List;
        //   308: astore_3       
        //   309: aload_0        
        //   310: invokevirtual   aefl.b:()Ljava/util/Set;
        //   313: aload_3        
        //   314: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   319: ifeq            369
        //   322: aload_1        
        //   323: getfield        aefn.a:Ljava/util/List;
        //   326: aload_0        
        //   327: getfield        aefl.d:Laefs;
        //   330: invokevirtual   aefs.b:()Ljava/util/Set;
        //   333: invokestatic    java/util/Collections.disjoint:(Ljava/util/Collection;Ljava/util/Collection;)Z
        //   336: ifne            342
        //   339: goto            369
        //   342: aload_0        
        //   343: getfield        aefl.e:Landroid/os/Handler;
        //   346: new             Ladra;
        //   349: dup            
        //   350: aload_0        
        //   351: aload_1        
        //   352: bipush          9
        //   354: invokespecial   adra.<init>:(Laefl;Laefn;I)V
        //   357: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   360: pop            
        //   361: iconst_0       
        //   362: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   365: invokestatic    nom.e:(Ljava/lang/Object;)Lnnt;
        //   368: areturn        
        //   369: aload_0        
        //   370: getfield        aefl.d:Laefs;
        //   373: astore          4
        //   375: aload_1        
        //   376: getfield        aefn.a:Ljava/util/List;
        //   379: astore          6
        //   381: ldc             Laefs;.class
        //   383: monitorenter   
        //   384: aload           4
        //   386: invokevirtual   aefs.b:()Ljava/util/Set;
        //   389: astore          7
        //   391: new             Ljava/util/HashSet;
        //   394: astore_3       
        //   395: aload_3        
        //   396: invokespecial   java/util/HashSet.<init>:()V
        //   399: aload           7
        //   401: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   406: astore          7
        //   408: iconst_0       
        //   409: istore_2       
        //   410: aload           7
        //   412: invokeinterface java/util/Iterator.hasNext:()Z
        //   417: ifeq            461
        //   420: aload           7
        //   422: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   427: checkcast       Ljava/lang/String;
        //   430: astore          8
        //   432: aload           6
        //   434: aload           8
        //   436: invokeinterface java/util/Collection.contains:(Ljava/lang/Object;)Z
        //   441: ifeq            449
        //   444: iconst_1       
        //   445: istore_2       
        //   446: goto            410
        //   449: aload_3        
        //   450: aload           8
        //   452: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   457: pop            
        //   458: goto            410
        //   461: iload_2        
        //   462: ifeq            488
        //   465: aload           4
        //   467: invokevirtual   aefs.a:()Landroid/content/SharedPreferences;
        //   470: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   475: ldc             "modules_to_uninstall_if_emulated"
        //   477: aload_3        
        //   478: invokeinterface android/content/SharedPreferences$Editor.putStringSet:(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
        //   483: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   488: ldc             Laefs;.class
        //   490: monitorexit    
        //   491: aload_0        
        //   492: getfield        aefl.b:Laefq;
        //   495: astore          4
        //   497: aload_1        
        //   498: getfield        aefn.a:Ljava/util/List;
        //   501: astore_3       
        //   502: aload_1        
        //   503: getfield        aefn.b:Ljava/util/List;
        //   506: invokestatic    aefl.c:(Ljava/util/List;)Ljava/util/List;
        //   509: astore_1       
        //   510: aload           4
        //   512: getfield        aefq.b:Laeex;
        //   515: ifnonnull       554
        //   518: getstatic       aefq.c:Laefs;
        //   521: ldc             "onError(%d)"
        //   523: iconst_1       
        //   524: anewarray       Ljava/lang/Object;
        //   527: dup            
        //   528: iconst_0       
        //   529: bipush          -14
        //   531: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   534: aastore        
        //   535: invokevirtual   aefs.h:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   538: new             Laefh;
        //   541: dup            
        //   542: bipush          -14
        //   544: invokespecial   aefh.<init>:(I)V
        //   547: invokestatic    nom.d:(Ljava/lang/Exception;)Lnnt;
        //   550: astore_1       
        //   551: goto            599
        //   554: new             Lnoj;
        //   557: dup            
        //   558: invokespecial   noj.<init>:()V
        //   561: astore          6
        //   563: aload           4
        //   565: getfield        aefq.b:Laeex;
        //   568: new             Laefo;
        //   571: dup            
        //   572: aload           4
        //   574: aload           6
        //   576: aload_3        
        //   577: aload_1        
        //   578: aload           5
        //   580: aload           6
        //   582: aconst_null    
        //   583: aconst_null    
        //   584: aconst_null    
        //   585: invokespecial   aefo.<init>:(Laefq;Lnoj;Ljava/util/Collection;Ljava/util/Collection;Laefs;Lnoj;[B[B[B)V
        //   588: aload           6
        //   590: invokevirtual   aeex.f:(Laeeo;Lnoj;)V
        //   593: aload           6
        //   595: getfield        noj.a:Ljava/lang/Object;
        //   598: astore_1       
        //   599: aload_1        
        //   600: checkcast       Lnnt;
        //   603: areturn        
        //   604: astore_1       
        //   605: ldc             Laefs;.class
        //   607: monitorexit    
        //   608: goto            613
        //   611: aload_1        
        //   612: athrow         
        //   613: goto            611
        //   616: astore_3       
        //   617: goto            488
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  384    408    604    616    Any
        //  410    444    604    616    Any
        //  449    458    604    616    Any
        //  465    488    616    620    Ljava/lang/Exception;
        //  465    488    604    616    Any
        //  488    491    604    616    Any
        //  605    608    604    616    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0488:
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
    public final Set b() {
        return this.c.b();
    }
}
