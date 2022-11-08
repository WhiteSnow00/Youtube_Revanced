import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjb extends agzi implements ahax
{
    public static final anjb a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(anjb.class, a = new anjb());
    }
    
    private anjb() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = anjb.c) == null) {
                    synchronized (anjb.class) {
                        if (anjb.c == null) {
                            anjb.c = (ahbe)new agzb((agzi)anjb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anjb.a;
            }
            case 4: {
                return new agza((agzi)anjb.a);
            }
            case 3: {
                return new anjb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjb.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[] { "b", anjc.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
