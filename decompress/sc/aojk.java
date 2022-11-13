import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojk extends ahbh implements ahcw
{
    public static final aojk a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public anuv d;
    public anuv e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aojk.class, (ahbh)(a = new aojk()));
    }
    
    private aojk() {
        this.g = 2;
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
                if ((f = aojk.f) == null) {
                    synchronized (aojk.class) {
                        if (aojk.f == null) {
                            aojk.f = (ahdd)new ahba((ahbh)aojk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojk.a;
            }
            case 4: {
                return new ahaz((ahbh)aojk.a);
            }
            case 3: {
                return new aojk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
