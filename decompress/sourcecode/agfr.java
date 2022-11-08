import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfr extends agzi implements ahax
{
    public static final agfr a;
    private static volatile ahbe b;
    private int c;
    private aqrl d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(agfr.class, a = new agfr());
    }
    
    private agfr() {
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
                if ((b2 = agfr.b) == null) {
                    synchronized (agfr.class) {
                        if (agfr.b == null) {
                            agfr.b = (ahbe)new agzb((agzi)agfr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return agfr.a;
            }
            case 4: {
                return new agza((agzi)agfr.a);
            }
            case 3: {
                return new agfr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
