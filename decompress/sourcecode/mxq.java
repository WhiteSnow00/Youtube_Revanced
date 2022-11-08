import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxq
{
    public static final Object a;
    public final Context b;
    public final SharedPreferences c;
    public final String d;
    private final mxm e;
    private boolean f;
    
    static {
        a = new Object();
    }
    
    public mxq(final Context b, final int n, final mxm e, final boolean f) {
        this.f = false;
        this.b = b;
        this.d = Integer.toString(n - 1);
        this.c = b.getSharedPreferences("pcvmspf", 0);
        this.e = e;
        this.f = f;
    }
    
    public static String b(final enw enw) {
        final agza builder = ((agzi)enx.a).createBuilder();
        enx enx;
        if ((enx = enw.b) == null) {
            enx = enx.a;
        }
        final String c = enx.c;
        builder.copyOnWrite();
        final enx enx2 = (enx)builder.instance;
        c.getClass();
        enx2.b |= 0x1;
        enx2.c = c;
        enx enx3;
        if ((enx3 = enw.b) == null) {
            enx3 = enx.a;
        }
        final String d = enx3.d;
        builder.copyOnWrite();
        final enx enx4 = (enx)builder.instance;
        d.getClass();
        enx4.b |= 0x2;
        enx4.d = d;
        enx enx5;
        if ((enx5 = enw.b) == null) {
            enx5 = enx.a;
        }
        final long f = enx5.f;
        builder.copyOnWrite();
        final enx enx6 = (enx)builder.instance;
        enx6.b |= 0x8;
        enx6.f = f;
        enx enx7;
        if ((enx7 = enw.b) == null) {
            enx7 = enx.a;
        }
        final long g = enx7.g;
        builder.copyOnWrite();
        final enx enx8 = (enx)builder.instance;
        enx8.b |= 0x10;
        enx8.g = g;
        enx enx9;
        if ((enx9 = enw.b) == null) {
            enx9 = enx.a;
        }
        final long e = enx9.e;
        builder.copyOnWrite();
        final enx enx10 = (enx)builder.instance;
        enx10.b |= 0x4;
        enx10.e = e;
        return muh.a(((agxl)builder.build()).toByteArray());
    }
    
    public final File a(final String s) {
        return new File(new File(this.b.getDir("pccache", 0), this.d), s);
    }
    
    public final String c() {
        return "FBAMTD".concat(String.valueOf(this.d));
    }
    
    public final String d() {
        return "LATMTD".concat(String.valueOf(this.d));
    }
    
    public final void e(final int n, final long n2) {
        final mxm e = this.e;
        if (e != null) {
            e.a(n, n2);
        }
    }
    
    public final void f(final int n, final long n2, final String s) {
        final mxm e = this.e;
        if (e != null) {
            e.b(n, n2, s);
        }
    }
    
    public final enx g(final int n) {
        String s;
        if (n == 1) {
            s = this.c.getString(this.d(), (String)null);
        }
        else {
            s = this.c.getString(this.c(), (String)null);
        }
        if (s == null) {
            return null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            final agyc x = agyc.x(muh.b(s));
            ExtensionRegistryLite extensionRegistryLite;
            if (this.f) {
                extensionRegistryLite = ExtensionRegistryLite.a;
            }
            else {
                extensionRegistryLite = ExtensionRegistryLite.getGeneratedRegistry();
            }
            return (enx)agzi.parseFrom((agzi)enx.a, x, extensionRegistryLite);
        }
        catch (final RuntimeException ex) {
            this.e(2032, currentTimeMillis);
            goto Label_0111;
        }
        catch (final NullPointerException ex2) {
            this.e(2029, currentTimeMillis);
        }
        catch (final ahab ahab) {
            goto Label_0111;
        }
    }
}
