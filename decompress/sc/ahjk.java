import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjk extends ahbh implements ahcw
{
    public static final ahjk a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public ahwd e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjk.class, (ahbh)(a = new ahjk()));
    }
    
    private ahjk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ahjk.f) == null) {
                    synchronized (ahjk.class) {
                        if (ahjk.f == null) {
                            ahjk.f = (ahdd)new ahba((ahbh)ahjk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahjk.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjk.a);
            }
            case 3: {
                return new ahjk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjk.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u1009\u0003", new Object[] { "b", "c", ahga.u, "d", ahga.t, "e" });
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
