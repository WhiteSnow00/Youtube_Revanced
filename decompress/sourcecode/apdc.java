import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdc extends agzi implements ahax
{
    public static final apdc a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apdc.class, a = new apdc());
    }
    
    private apdc() {
        this.f = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apdc.b) == null) {
                    synchronized (apdc.class) {
                        if (apdc.b == null) {
                            apdc.b = (ahbe)new agzb((agzi)apdc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apdc.a;
            }
            case 4: {
                return new agza((agzi)apdc.a);
            }
            case 3: {
                return new apdc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdc.a, "\u0001\u0002\u0000\u0001\u0007\t\u0002\u0000\u0000\u0002\u0007\u1409\u0001\t\u1409\u0003", new Object[] { "c", "d", "e" });
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
