import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atye extends ahbh implements ahcw
{
    public static final atye a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public long d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)atye.class, (ahbh)(a = new atye()));
    }
    
    private atye() {
        this.g = 2;
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = atye.f) == null) {
                    synchronized (atye.class) {
                        if (atye.f == null) {
                            atye.f = (ahdd)new ahba((ahbh)atye.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atye.a;
            }
            case 4: {
                return new ahaz((ahbh)atye.a);
            }
            case 3: {
                return new atye();
            }
            case 2: {
                return newMessageInfo((MessageLite)atye.a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001\u1008\u0000\b\u1005\u0001\t\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
