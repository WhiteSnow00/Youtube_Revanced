import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqb
{
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;
    
    static {
        final String a2 = atvk.a("kotlinx.coroutines.debug");
        final boolean b2 = true;
        boolean a3 = false;
        Label_0131: {
            Label_0129: {
                if (a2 != null) {
                    final int hashCode = a2.hashCode();
                    Label_0090: {
                        if (hashCode != 0) {
                            if (hashCode != 3551) {
                                if (hashCode != 109935) {
                                    if (hashCode == 3005871 && a2.equals("auto")) {
                                        break Label_0129;
                                    }
                                    break Label_0090;
                                }
                                else {
                                    if (a2.equals("off")) {
                                        break Label_0129;
                                    }
                                    break Label_0090;
                                }
                            }
                            else if (!a2.equals("on")) {
                                break Label_0090;
                            }
                        }
                        else if (!a2.equals("")) {
                            break Label_0090;
                        }
                        a3 = true;
                        break Label_0131;
                    }
                    final StringBuilder sb = new StringBuilder("System property 'kotlinx.coroutines.debug' has unrecognized value '");
                    sb.append(a2);
                    sb.append("'");
                    throw new IllegalStateException(sb.toString());
                }
            }
            a3 = false;
        }
        a = a3;
        b = (a3 && atvl.c("kotlinx.coroutines.stacktrace.recovery", true) && b2);
        c = new AtomicLong(0L);
    }
}
