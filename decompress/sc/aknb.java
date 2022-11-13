import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknb extends ahbh implements ahcw
{
    public static final aknb a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public ahbx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aknb.class, (ahbh)(a = new aknb()));
    }
    
    private aknb() {
        this.f = 2;
        this.d = ahbh.emptyProtobufList();
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
                final ahdd e;
                if ((e = aknb.e) == null) {
                    synchronized (aknb.class) {
                        if (aknb.e == null) {
                            aknb.e = (ahdd)new ahba((ahbh)aknb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknb.a;
            }
            case 4: {
                return new ahaz((char[][])null, (char[][][])null);
            }
            case 3: {
                return new aknb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknb.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0003\u001a", new Object[] { "b", "c", "d" });
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
