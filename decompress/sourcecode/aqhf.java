import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhf extends agzi implements ahax
{
    public static final aqhf a;
    private static volatile ahbe e;
    public int b;
    public aqhg c;
    public aqhe d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aqhf.class, (agzi)(a = new aqhf()));
    }
    
    private aqhf() {
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
                final ahbe e;
                if ((e = aqhf.e) == null) {
                    synchronized (aqhf.class) {
                        if (aqhf.e == null) {
                            aqhf.e = (ahbe)new agzb((agzi)aqhf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqhf.a;
            }
            case 4: {
                return new agza((agzi)aqhf.a);
            }
            case 3: {
                return new aqhf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhf.a, "\u0001\u0002\u0000\u0001\u0003\u0007\u0002\u0000\u0000\u0001\u0003\u1409\u0002\u0007\u1009\u0005", new Object[] { "b", "c", "d" });
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
