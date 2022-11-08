import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpb extends agzi implements ahax
{
    public static final afpb a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(afpb.class, a = new afpb());
    }
    
    private afpb() {
        this.e = 2;
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
                if ((b2 = afpb.b) == null) {
                    synchronized (afpb.class) {
                        if (afpb.b == null) {
                            afpb.b = (ahbe)new agzb((agzi)afpb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return afpb.a;
            }
            case 4: {
                return new agza((agzi)afpb.a);
            }
            case 3: {
                return new afpb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u150c\u0000", new Object[] { "c", "d", aeih.l });
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
