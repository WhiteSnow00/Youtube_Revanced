import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokk extends ahbh implements ahcw
{
    public static final aokk a;
    private static volatile ahdd d;
    public anuv b;
    public ahab c;
    private int e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aokk.class, (ahbh)(a = new aokk()));
    }
    
    private aokk() {
        this.g = 2;
        this.c = ahab.b;
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
                final ahdd d;
                if ((d = aokk.d) == null) {
                    synchronized (aokk.class) {
                        if (aokk.d == null) {
                            aokk.d = (ahdd)new ahba((ahbh)aokk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aokk.a;
            }
            case 4: {
                return new ahaz((ahbh)aokk.a);
            }
            case 3: {
                return new aokk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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