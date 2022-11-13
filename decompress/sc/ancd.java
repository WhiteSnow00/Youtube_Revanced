import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancd extends ahbh implements ahcw
{
    public static final ancd a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public ahbx d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)ancd.class, (ahbh)(a = new ancd()));
    }
    
    private ancd() {
        this.c = "";
        this.d = ahbh.emptyProtobufList();
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ancd.f) == null) {
                    synchronized (ancd.class) {
                        if (ancd.f == null) {
                            ancd.f = (ahdd)new ahba((ahbh)ancd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ancd.a;
            }
            case 4: {
                return new ahaz((ahbh)ancd.a);
            }
            case 3: {
                return new ancd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a\u0003\u1008\u0001", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
