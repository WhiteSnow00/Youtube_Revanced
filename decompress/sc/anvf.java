import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvf extends ahbh implements ahcw
{
    public static final anvf a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public anuv d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anvf.class, (ahbh)(a = new anvf()));
    }
    
    private anvf() {
        this.f = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anvf.e) == null) {
                    synchronized (anvf.class) {
                        if (anvf.e == null) {
                            anvf.e = (ahdd)new ahba((ahbh)anvf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anvf.a;
            }
            case 4: {
                return new ahaz((ahbh)anvf.a);
            }
            case 3: {
                return new anvf();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
