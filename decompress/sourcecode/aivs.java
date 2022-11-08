import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivs extends agzi implements ahax
{
    public static final aivs a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aivs.class, a = new aivs());
    }
    
    private aivs() {
        this.e = 2;
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
                if ((b2 = aivs.b) == null) {
                    synchronized (aivs.class) {
                        if (aivs.b == null) {
                            aivs.b = (ahbe)new agzb((agzi)aivs.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivs.a;
            }
            case 4: {
                return new agza((agzi)aivs.a);
            }
            case 3: {
                return new aivs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivs.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
