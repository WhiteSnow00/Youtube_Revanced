import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcy extends ahbh implements ahcw
{
    public static final aqcy a;
    private static volatile ahdd e;
    public int b;
    public ahdy c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcy.class, (ahbh)(a = new aqcy()));
    }
    
    private aqcy() {
        this.d = emptyProtobufList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqcy.e) == null) {
                    synchronized (aqcy.class) {
                        if (aqcy.e == null) {
                            aqcy.e = (ahdd)new ahba((ahbh)aqcy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqcy.a;
            }
            case 4: {
                return new ahaz((float[][])null);
            }
            case 3: {
                return new aqcy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcy.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u1009\u0000", new Object[] { "b", "d", aobx.class, "c" });
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
