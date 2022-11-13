import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlk extends ahbh implements ahcw
{
    public static final ahlk a;
    private static volatile ahdd d;
    public int b;
    public ahla c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlk.class, (ahbh)(a = new ahlk()));
    }
    
    private ahlk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahlk.d) == null) {
                    synchronized (ahlk.class) {
                        if (ahlk.d == null) {
                            ahlk.d = (ahdd)new ahba((ahbh)ahlk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlk.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlk.a);
            }
            case 3: {
                return new ahlk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlk.a, "\u0001\u0001\u0000\u0001\uea6f\u32ff\uea6f\u32ff\u0001\u0000\u0000\u0000\uea6f\u32ff\u1009\u0000", new Object[] { "b", "c" });
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
