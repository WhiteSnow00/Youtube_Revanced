import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgr extends ahbh implements ahcw
{
    public static final akgr a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public aklg e;
    public int f;
    public ahbx g;
    public akgq h;
    private aiqj j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akgr.class, (ahbh)(a = new akgr()));
    }
    
    private akgr() {
        this.c = 0;
        this.k = 2;
        final ahab b = ahab.b;
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akgr.i) == null) {
                    synchronized (akgr.class) {
                        if (akgr.i == null) {
                            akgr.i = (ahdd)new ahba((ahbh)akgr.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akgr.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (byte[][][])null);
            }
            case 3: {
                return new akgr();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgr.a, "\u0001\b\u0001\u0001\u0001\u0012\b\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u100c\u0001\u0004\u041b\u0005\u1409\u0004\f\u103c\u0000\r\u103b\u0000\u000e\u103b\u0000\u0012\u1009\r", new Object[] { "d", "c", "b", "e", "f", akeh.n, "g", ahkh.class, "j", ajdq.class, "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
