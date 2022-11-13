import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxp extends ahbh implements ahcw
{
    public static final ajxp a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public ajut d;
    public aotp e;
    public ajxn f;
    public ahbx g;
    private ajut i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxp.class, (ahbh)(a = new ajxp()));
    }
    
    private ajxp() {
        this.j = 2;
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ajxp.h) == null) {
                    synchronized (ajxp.class) {
                        if (ajxp.h == null) {
                            ajxp.h = (ahdd)new ahba((ahbh)ajxp.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajxp.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxp.a);
            }
            case 3: {
                return new ajxp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxp.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1009\u0004\u0005\u001b\u0006\u1409\u0003", new Object[] { "b", "c", "d", "e", "f", "g", ajxo.class, "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
