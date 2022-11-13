import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptg extends ahbh implements ahcw
{
    public static final aptg a;
    private static volatile ahdd e;
    public int b;
    public float c;
    public aptt d;
    
    static {
        ahbh.registerDefaultInstance((Class)aptg.class, (ahbh)(a = new aptg()));
    }
    
    private aptg() {
        this.c = 1.0f;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aptg.e) == null) {
                    synchronized (aptg.class) {
                        if (aptg.e == null) {
                            aptg.e = (ahdd)new ahba((ahbh)aptg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aptg.a;
            }
            case 4: {
                return new ahaz((ahbh)aptg.a);
            }
            case 3: {
                return new aptg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptg.a, "\u0001\u0002\u0000\u0001\u0003\b\u0002\u0000\u0000\u0000\u0003\u1001\u0001\b\u1009\u0002", new Object[] { "b", "c", "d" });
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
