import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuh extends ahbh implements ahcw
{
    public static final ajuh a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public String d;
    public int e;
    private aiqj g;
    private ajut h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuh.class, (ahbh)(a = new ajuh()));
    }
    
    private ajuh() {
        this.i = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajuh.f) == null) {
                    synchronized (ajuh.class) {
                        if (ajuh.f == null) {
                            ajuh.f = (ahdd)new ahba((ahbh)ajuh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajuh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuh.a);
            }
            case 3: {
                return new ajuh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuh.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u100b\u0003\u0007\u1409\u0006\t\u1409\b", new Object[] { "b", "c", "d", "e", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
