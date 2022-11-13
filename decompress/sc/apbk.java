import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbk extends ahbh implements ahcw
{
    public static final apbk a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apbk.class, (ahbh)(a = new apbk()));
    }
    
    private apbk() {
        this.f = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apbk.b) == null) {
                    synchronized (apbk.class) {
                        if (apbk.b == null) {
                            apbk.b = (ahdd)new ahba((ahbh)apbk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbk.a;
            }
            case 4: {
                return new ahaz((ahbh)apbk.a);
            }
            case 3: {
                return new apbk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbk.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
