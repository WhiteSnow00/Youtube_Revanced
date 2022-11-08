import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbq extends agzi implements ahax
{
    public static final apbq a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apbq.class, a = new apbq());
    }
    
    private apbq() {
        this.e = 2;
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
                if ((b2 = apbq.b) == null) {
                    synchronized (apbq.class) {
                        if (apbq.b == null) {
                            apbq.b = (ahbe)new agzb((agzi)apbq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbq.a;
            }
            case 4: {
                return new agza((agzi)apbq.a);
            }
            case 3: {
                return new apbq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
