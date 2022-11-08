import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidw extends agzi implements ahax
{
    public static final aidw a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aidw.class, (agzi)(a = new aidw()));
    }
    
    private aidw() {
        this.f = 2;
        emptyProtobufList();
    }
    
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
                if ((b2 = aidw.b) == null) {
                    synchronized (aidw.class) {
                        if (aidw.b == null) {
                            aidw.b = (ahbe)new agzb((agzi)aidw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidw.a;
            }
            case 4: {
                return new agza((agzi)aidw.a);
            }
            case 3: {
                return new aidw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
