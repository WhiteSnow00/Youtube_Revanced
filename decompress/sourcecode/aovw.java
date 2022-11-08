import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovw extends agzi implements ahax
{
    public static final aovw a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aovw.class, a = new aovw());
    }
    
    private aovw() {
        this.f = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aovw.b) == null) {
                    synchronized (aovw.class) {
                        if (aovw.b == null) {
                            aovw.b = (ahbe)new agzb((agzi)aovw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovw.a;
            }
            case 4: {
                return new agza((agzi)aovw.a);
            }
            case 3: {
                return new aovw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
