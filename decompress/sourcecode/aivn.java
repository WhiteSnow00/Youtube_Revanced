import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivn extends agzi implements ahax
{
    public static final aivn a;
    private static volatile ahbe b;
    private int c;
    private ajhz d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aivn.class, a = new aivn());
    }
    
    private aivn() {
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
                if ((b2 = aivn.b) == null) {
                    synchronized (aivn.class) {
                        if (aivn.b == null) {
                            aivn.b = (ahbe)new agzb((agzi)aivn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivn.a;
            }
            case 4: {
                return new agza((agzi)aivn.a);
            }
            case 3: {
                return new aivn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivn.a, "\u0001\u0001\u0000\u0001\uee5d\u21e7\uee5d\u21e7\u0001\u0000\u0000\u0001\uee5d\u21e7\u1409\u0000", new Object[] { "c", "d" });
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
