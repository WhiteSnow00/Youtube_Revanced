import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afql extends ahbh implements ahcw
{
    public static final afql a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public afqt d;
    public float e;
    
    static {
        ahbh.registerDefaultInstance((Class)afql.class, (ahbh)(a = new afql()));
    }
    
    private afql() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = afql.f) == null) {
                    synchronized (afql.class) {
                        if (afql.f == null) {
                            afql.f = (ahdd)new ahba((ahbh)afql.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afql.a;
            }
            case 4: {
                return new ahaz((ahbh)afql.a);
            }
            case 3: {
                return new afql();
            }
            case 2: {
                return newMessageInfo((MessageLite)afql.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1001\u0001", new Object[] { "b", "c", afqt.class, "d", "e" });
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
