import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrs extends ahbh implements ahcw
{
    public static final agrs a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public agrp d;
    private agrt f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)agrs.class, (ahbh)(a = new agrs()));
    }
    
    private agrs() {
        this.g = 2;
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahdd e;
                if ((e = agrs.e) == null) {
                    synchronized (agrs.class) {
                        if (agrs.e == null) {
                            agrs.e = (ahdd)new ahba((ahbh)agrs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agrs.a;
            }
            case 4: {
                return new ahaz((ahbh)agrs.a);
            }
            case 3: {
                return new agrs();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrs.a, "\u0001\u0003\u0000\u0001\u0003\u001e\u0003\u0000\u0000\u0001\u0003\u1007\u0002\u001c\u1009\u0013\u001e\u1409\u0015", new Object[] { "b", "c", "d", "f" });
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
