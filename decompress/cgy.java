import android.database.Cursor;
import java.io.Closeable;
import java.util.Map;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.UUID;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgy extends SQLiteOpenHelper
{
    private final Context a;
    private final cgn b;
    private final boolean c;
    private boolean d;
    private final chd e;
    private boolean f;
    private final elx g;
    
    public cgy(final Context a, final String s, final elx g, final cgn b, final boolean c, final byte[] array, final byte[] array2, final byte[] array3) {
        super(a, s, (SQLiteDatabase$CursorFactory)null, b.a, (DatabaseErrorHandler)new cgw(g, null, null, null));
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        String string = s;
        if (s == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        }
        final File cacheDir = a.getCacheDir();
        cacheDir.getClass();
        this.e = new chd(string, cacheDir);
    }
    
    private final SQLiteDatabase c() {
        final SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }
    
    public final cgv a(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.getClass();
        return ceq.c(this.g, sqLiteDatabase);
    }
    
    public final cgm b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        cgy.e:Lchd;
        //     4: astore          4
        //     6: aload_0        
        //     7: getfield        cgy.f:Z
        //    10: ifne            25
        //    13: aload_0        
        //    14: invokevirtual   cgy.getDatabaseName:()Ljava/lang/String;
        //    17: ifnull          25
        //    20: iconst_1       
        //    21: istore_3       
        //    22: goto            27
        //    25: iconst_0       
        //    26: istore_3       
        //    27: aload           4
        //    29: iload_3        
        //    30: invokevirtual   chd.a:(Z)V
        //    33: aload_0        
        //    34: iconst_0       
        //    35: putfield        cgy.d:Z
        //    38: aload_0        
        //    39: invokevirtual   cgy.getDatabaseName:()Ljava/lang/String;
        //    42: astore          5
        //    44: aload           5
        //    46: ifnull          118
        //    49: aload_0        
        //    50: getfield        cgy.a:Landroid/content/Context;
        //    53: aload           5
        //    55: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //    58: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    61: astore          4
        //    63: aload           4
        //    65: ifnull          118
        //    68: aload           4
        //    70: invokevirtual   java/io/File.mkdirs:()Z
        //    73: pop            
        //    74: aload           4
        //    76: invokevirtual   java/io/File.isDirectory:()Z
        //    79: ifne            118
        //    82: new             Ljava/lang/StringBuilder;
        //    85: astore          6
        //    87: aload           6
        //    89: ldc             "Invalid database parent file, not a directory: "
        //    91: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    94: aload           6
        //    96: aload           4
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   101: pop            
        //   102: ldc             "SupportSQLite"
        //   104: ldc             "Invalid database parent file, not a directory: "
        //   106: aload           4
        //   108: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   111: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   114: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   117: pop            
        //   118: aload_0        
        //   119: invokespecial   cgy.c:()Landroid/database/sqlite/SQLiteDatabase;
        //   122: astore          4
        //   124: goto            264
        //   127: astore          4
        //   129: aload_0        
        //   130: invokespecial   android/database/sqlite/SQLiteOpenHelper.close:()V
        //   133: ldc2_w          500
        //   136: invokestatic    java/lang/Thread.sleep:(J)V
        //   139: aload_0        
        //   140: invokespecial   cgy.c:()Landroid/database/sqlite/SQLiteDatabase;
        //   143: astore          4
        //   145: goto            264
        //   148: astore          4
        //   150: aload_0        
        //   151: invokespecial   android/database/sqlite/SQLiteOpenHelper.close:()V
        //   154: aload           4
        //   156: instanceof      Lcgx;
        //   159: ifeq            228
        //   162: aload           4
        //   164: checkcast       Lcgx;
        //   167: astore          6
        //   169: aload           6
        //   171: getfield        cgx.a:Ljava/lang/Throwable;
        //   174: astore          4
        //   176: aload           6
        //   178: getfield        cgx.b:I
        //   181: istore_1       
        //   182: iload_1        
        //   183: iconst_1       
        //   184: isub           
        //   185: istore_2       
        //   186: iload_1        
        //   187: ifeq            226
        //   190: iload_2        
        //   191: ifeq            223
        //   194: iload_2        
        //   195: iconst_1       
        //   196: if_icmpeq       223
        //   199: iload_2        
        //   200: iconst_2       
        //   201: if_icmpeq       223
        //   204: iload_2        
        //   205: iconst_3       
        //   206: if_icmpeq       223
        //   209: aload           4
        //   211: instanceof      Landroid/database/sqlite/SQLiteException;
        //   214: ifeq            220
        //   217: goto            248
        //   220: aload           4
        //   222: athrow         
        //   223: aload           4
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //   228: aload           4
        //   230: instanceof      Landroid/database/sqlite/SQLiteException;
        //   233: ifeq            323
        //   236: aload           5
        //   238: ifnull          320
        //   241: aload_0        
        //   242: getfield        cgy.c:Z
        //   245: ifeq            320
        //   248: aload_0        
        //   249: getfield        cgy.a:Landroid/content/Context;
        //   252: aload           5
        //   254: invokevirtual   android/content/Context.deleteDatabase:(Ljava/lang/String;)Z
        //   257: pop            
        //   258: aload_0        
        //   259: invokespecial   cgy.c:()Landroid/database/sqlite/SQLiteDatabase;
        //   262: astore          4
        //   264: aload_0        
        //   265: getfield        cgy.d:Z
        //   268: ifeq            295
        //   271: aload_0        
        //   272: invokevirtual   cgy.close:()V
        //   275: aload_0        
        //   276: invokevirtual   cgy.b:()Lcgm;
        //   279: astore          4
        //   281: aload_0        
        //   282: getfield        cgy.e:Lchd;
        //   285: astore          5
        //   287: aload           5
        //   289: invokevirtual   chd.b:()V
        //   292: aload           4
        //   294: areturn        
        //   295: aload_0        
        //   296: aload           4
        //   298: invokevirtual   cgy.a:(Landroid/database/sqlite/SQLiteDatabase;)Lcgv;
        //   301: astore          4
        //   303: aload_0        
        //   304: getfield        cgy.e:Lchd;
        //   307: astore          5
        //   309: goto            287
        //   312: astore          4
        //   314: aload           4
        //   316: getfield        cgx.a:Ljava/lang/Throwable;
        //   319: athrow         
        //   320: aload           4
        //   322: athrow         
        //   323: aload           4
        //   325: athrow         
        //   326: astore          4
        //   328: aload_0        
        //   329: getfield        cgy.e:Lchd;
        //   332: invokevirtual   chd.b:()V
        //   335: goto            341
        //   338: aload           4
        //   340: athrow         
        //   341: goto            338
        //   344: astore          4
        //   346: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      20     326    344    Any
        //  27     44     326    344    Any
        //  49     63     326    344    Any
        //  68     118    326    344    Any
        //  118    124    127    326    Any
        //  129    133    326    344    Any
        //  133    139    344    349    Ljava/lang/InterruptedException;
        //  133    139    326    344    Any
        //  139    145    148    326    Any
        //  150    182    326    344    Any
        //  209    217    326    344    Any
        //  220    223    326    344    Any
        //  223    226    326    344    Any
        //  226    228    326    344    Any
        //  228    236    326    344    Any
        //  241    248    326    344    Any
        //  248    258    326    344    Any
        //  258    264    312    320    Lcgx;
        //  258    264    326    344    Any
        //  264    281    326    344    Any
        //  295    303    326    344    Any
        //  314    320    326    344    Any
        //  320    323    326    344    Any
        //  323    326    326    344    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0139:
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
    
    public final void close() {
        try {
            final chd e = this.e;
            final Map a = chd.a;
            final boolean b = e.b;
            e.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        }
        finally {
            this.e.b();
        }
    }
    
    public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.getClass();
        try {
            this.a(sqLiteDatabase);
        }
        finally {
            final Throwable t;
            throw new cgx(1, t);
        }
    }
    
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.getClass();
        try {
            final cgn b = this.b;
            final cgv a = this.a(sqLiteDatabase);
            sqLiteDatabase = (SQLiteDatabase)((cgm)a).b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                final boolean moveToFirst = ((Cursor)sqLiteDatabase).moveToFirst();
                int n = 0;
                if (moveToFirst) {
                    final int int1 = ((Cursor)sqLiteDatabase).getInt(0);
                    n = n;
                    if (int1 == 0) {
                        n = 1;
                    }
                }
                aubn.c((Closeable)sqLiteDatabase, null);
                b.c.a((cgm)a);
                if (n == 0) {
                    sqLiteDatabase = (SQLiteDatabase)b.c.f((cgm)a);
                    if (!((fwv)sqLiteDatabase).a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(((fwv)sqLiteDatabase).b)));
                    }
                }
                b.c((cgm)a);
                b.c.e();
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    aubn.c((Closeable)sqLiteDatabase, t);
                }
            }
        }
        finally {
            final Throwable t2;
            throw new cgx(2, t2);
        }
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        sqLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b((cgm)this.a(sqLiteDatabase), n, n2);
        }
        finally {
            final Throwable t;
            throw new cgx(4, t);
        }
    }
    
    public final void onOpen(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.getClass();
        if (!this.d) {
            try {
                final cgn b = this.b;
                Object a = this.a(sqLiteDatabase);
                sqLiteDatabase = (SQLiteDatabase)((cgm)a).b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                try {
                    final boolean b2 = ((Cursor)sqLiteDatabase).moveToFirst() && ((Cursor)sqLiteDatabase).getInt(0) != 0;
                    aubn.c((Closeable)sqLiteDatabase, null);
                    Label_0238: {
                        if (b2) {
                            sqLiteDatabase = (SQLiteDatabase)new cgl("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                            Object a2 = ((cgm)a).a((cgs)sqLiteDatabase);
                            try {
                                if (((Cursor)a2).moveToFirst()) {
                                    sqLiteDatabase = (SQLiteDatabase)((Cursor)a2).getString(0);
                                }
                                else {
                                    sqLiteDatabase = null;
                                }
                                aubn.c((Closeable)a2, null);
                                if (atoc.c((Object)b.d, (Object)sqLiteDatabase)) {
                                    break Label_0238;
                                }
                                if (atoc.c((Object)b.e, (Object)sqLiteDatabase)) {
                                    break Label_0238;
                                }
                                a2 = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                                ((StringBuilder)a2).append(b.d);
                                ((StringBuilder)a2).append(", found: ");
                                ((StringBuilder)a2).append((String)sqLiteDatabase);
                                a = new IllegalStateException(((StringBuilder)a2).toString());
                                throw a;
                            }
                            finally {
                                try {}
                                finally {
                                    aubn.c((Closeable)a2, (Throwable)b);
                                }
                            }
                        }
                        sqLiteDatabase = (SQLiteDatabase)b.c.f((cgm)a);
                        if (!((fwv)sqLiteDatabase).a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(((fwv)sqLiteDatabase).b)));
                        }
                        b.c((cgm)a);
                    }
                    b.c.c((cgm)a);
                    b.b = null;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        aubn.c((Closeable)sqLiteDatabase, t);
                    }
                }
            }
            finally {
                final Throwable t2;
                throw new cgx(5, t2);
            }
        }
        this.f = true;
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        sqLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b((cgm)this.a(sqLiteDatabase), n, n2);
        }
        finally {
            final Throwable t;
            throw new cgx(3, t);
        }
    }
}
