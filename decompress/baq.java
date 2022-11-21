import java.net.UnknownHostException;
import android.text.TextUtils;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baq
{
    private static final Object a;
    
    static {
        a = new Object();
    }
    
    public static void a(final String s, final String s2) {
        synchronized (baq.a) {
            Log.e(s, s2);
        }
    }
    
    public static void b(final String s, final String s2, final Throwable t) {
        a(s, g(s2, t));
    }
    
    public static void c(final String s, final String s2) {
        synchronized (baq.a) {
            Log.w(s, s2);
        }
    }
    
    public static void d(final String s, final String s2, final Throwable t) {
        c(s, g(s2, t));
    }
    
    public static void e() {
        synchronized (baq.a) {
            monitorexit(baq.a);
        }
    }
    
    public static void f() {
        synchronized (baq.a) {
            monitorexit(baq.a);
        }
    }
    
    private static String g(final String s, final Throwable t) {
        final Object a = baq.a;
        monitorenter(a);
        Label_0021: {
            if (t != null) {
                break Label_0021;
            }
        Label_0023_Outer:
            while (true) {
                try {
                    monitorexit(a);
                    final String replace = null;
                    break Label_0067;
                }
                finally {
                    monitorexit(a);
                    while (true) {}
                Block_5_Outer:
                    while (true) {
                        Throwable cause = null;
                        iftrue(Label_0050:)(cause == null);
                        String string;
                        while (true) {
                            Block_4: {
                                break Block_4;
                                string = s;
                                String replace = null;
                                iftrue(Label_0124:)(TextUtils.isEmpty((CharSequence)replace));
                                Block_6: {
                                    break Block_6;
                                    replace = "UnknownHostException (no network)";
                                    monitorexit(a);
                                    continue Label_0023_Outer;
                                    cause = t;
                                    continue Block_5_Outer;
                                    Label_0050: {
                                        replace = Log.getStackTraceString(t).trim().replace("\t", "    ");
                                    }
                                    monitorexit(a);
                                    continue Label_0023_Outer;
                                }
                                final String replace2 = replace.replace("\n", "\n  ");
                                final StringBuilder sb = new StringBuilder();
                                sb.append(s);
                                sb.append("\n  ");
                                sb.append(replace2);
                                sb.append("\n");
                                string = sb.toString();
                                return string;
                            }
                            iftrue(Label_0042:)(!(cause instanceof UnknownHostException));
                            continue;
                        }
                        Label_0124: {
                            return string;
                        }
                        Label_0042:
                        cause = cause.getCause();
                        continue Block_5_Outer;
                    }
                }
                break;
            }
        }
    }
}
