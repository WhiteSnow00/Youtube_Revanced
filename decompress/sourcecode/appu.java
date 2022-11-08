import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appu extends agzi implements ahax
{
    public static final appu a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)appu.class, (agzi)(a = new appu()));
    }
    
    private appu() {
        this.e = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((b2 = appu.b) == null) {
                    synchronized (appu.class) {
                        if (appu.b == null) {
                            appu.b = (ahbe)new agzb((agzi)appu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return appu.a;
            }
            case 4: {
                return new agza((agzi)appu.a);
            }
            case 3: {
                return new appu();
            }
            case 2: {
                return newMessageInfo((MessageLite)appu.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
