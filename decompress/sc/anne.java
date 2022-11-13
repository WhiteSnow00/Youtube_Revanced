import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anne extends ahbh implements ahcw
{
    public static final anne a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public String d;
    public annf e;
    
    static {
        ahbh.registerDefaultInstance((Class)anne.class, (ahbh)(a = new anne()));
    }
    
    private anne() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anne.f) == null) {
                    synchronized (anne.class) {
                        if (anne.f == null) {
                            anne.f = (ahdd)new ahba((ahbh)anne.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anne.a;
            }
            case 4: {
                return new ahaz((ahbh)anne.a);
            }
            case 3: {
                return new anne();
            }
            case 2: {
                return newMessageInfo((MessageLite)anne.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0005\u1009\u0005", new Object[] { "b", "c", anic.l, "d", "e" });
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
