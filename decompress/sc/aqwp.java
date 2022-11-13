import java.util.Map;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.net.ProtocolException;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwp implements aqxa
{
    public final HttpURLConnection a;
    public final aqwl b;
    public final byte[] c;
    public long d;
    public int e;
    public int f;
    public aqsy g;
    private int h;
    
    public aqwp(final HttpURLConnection a, final String requestMethod, final aqwo aqwo, final aqwl b) {
        this.e = -1;
        this.f = 0;
        this.a = a;
        try {
            a.setRequestMethod(requestMethod);
            a.setReadTimeout(300000);
            a.setConnectTimeout(300000);
            a.setDoInput(true);
            this.b = b;
            if (b != null) {
                a.setDoOutput(true);
                if (b.a() >= 0L) {
                    final long fixedLengthStreamingMode = b.a() - b.e();
                    if (fixedLengthStreamingMode < 2147483647L) {
                        a.setFixedLengthStreamingMode((int)fixedLengthStreamingMode);
                    }
                    else {
                        a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
                    }
                }
                else {
                    a.setChunkedStreamingMode(0);
                }
            }
            for (final String s : aqwo.c()) {
                final Iterator iterator2 = aqwo.b(s).iterator();
                while (iterator2.hasNext()) {
                    a.addRequestProperty(s, (String)iterator2.next());
                }
            }
            this.h = 1;
            this.c = new byte[65536];
        }
        catch (final ProtocolException ex) {
            throw new IllegalArgumentException("Invalid http method.", ex);
        }
    }
    
    public final ListenableFuture a() {
        final afvq a = afvq.a((Callable)new aerg(this, 4));
        final aruy aruy = new aruy((byte[])null);
        aruy.k("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(aruy.o(aruy));
        singleThreadExecutor.execute((Runnable)a);
        singleThreadExecutor.shutdown();
        return (ListenableFuture)a;
    }
    
    public final ListenableFuture b() {
        return aqsy.h();
    }
    
    public final aqwl c() {
        return this.b;
    }
    
    public final String d() {
        return null;
    }
    
    public final void e() {
        synchronized (this) {
            this.h = 3;
            this.notifyAll();
        }
    }
    
    public final void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        aqwp.h:I
        //     6: istore_1       
        //     7: iload_1        
        //     8: iconst_2       
        //     9: if_icmpne       19
        //    12: aload_0        
        //    13: invokevirtual   java/lang/Object.wait:()V
        //    16: goto            2
        //    19: iload_1        
        //    20: iconst_3       
        //    21: if_icmpeq       43
        //    24: iconst_1       
        //    25: istore_2       
        //    26: iload_1        
        //    27: iconst_1       
        //    28: if_icmpne       34
        //    31: goto            36
        //    34: iconst_0       
        //    35: istore_2       
        //    36: iload_2        
        //    37: invokestatic    aefb.L:(Z)V
        //    40: aload_0        
        //    41: monitorexit    
        //    42: return         
        //    43: new             Laqxc;
        //    46: astore_3       
        //    47: aload_3        
        //    48: getstatic       aqxb.b:Laqxb;
        //    51: ldc             ""
        //    53: invokespecial   aqxc.<init>:(Laqxb;Ljava/lang/String;)V
        //    56: aload_3        
        //    57: athrow         
        //    58: astore_3       
        //    59: aload_0        
        //    60: monitorexit    
        //    61: goto            66
        //    64: aload_3        
        //    65: athrow         
        //    66: goto            64
        //    69: astore_3       
        //    70: goto            2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      7      58     69     Any
        //  12     16     69     73     Ljava/lang/InterruptedException;
        //  12     16     58     69     Any
        //  36     40     58     69     Any
        //  43     58     58     69     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    public final boolean g() {
        try {
            return this.b.i();
        }
        catch (final IOException ex) {
            throw new aqxc(aqxb.c, (Throwable)ex);
        }
    }
    
    public final boolean h() {
        return false;
    }
    
    public final aetv i() {
        this.f();
        try {
            final int responseCode = this.a.getResponseCode();
            InputStream inputStream;
            try {
                inputStream = this.a.getInputStream();
            }
            catch (final IOException ex) {
                inputStream = this.a.getErrorStream();
            }
            final Map<String, List<String>> headerFields = this.a.getHeaderFields();
            aqwo aqwo2;
            if (headerFields != null) {
                final aqwo aqwo = new aqwo();
                final Iterator<String> iterator = headerFields.keySet().iterator();
                while (true) {
                    aqwo2 = aqwo;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final String s = iterator.next();
                    if (s == null) {
                        continue;
                    }
                    final Iterator iterator2 = headerFields.get(s).iterator();
                    while (iterator2.hasNext()) {
                        aqwo.d(s, (String)iterator2.next());
                    }
                }
            }
            else {
                aqwo2 = null;
            }
            return new aetv(responseCode, aqwo2, inputStream);
        }
        catch (final IOException ex2) {
            throw new aqxc(aqxb.d, "Error while reading response code.", (Throwable)ex2);
        }
    }
    
    public final void j(final aqsy g, final int e, final int f) {
        synchronized (this) {
            this.g = g;
            if (e > 0) {
                this.e = e;
            }
            this.f = f;
        }
    }
}
