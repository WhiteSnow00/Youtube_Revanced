import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpn extends agzi implements ahax
{
    public static final akpn a;
    private static volatile ahbe d;
    public int b;
    public akjd c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpn.class, a = new akpn());
    }
    
    private akpn() {
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
                final ahbe d;
                if ((d = akpn.d) == null) {
                    synchronized (akpn.class) {
                        if (akpn.d == null) {
                            akpn.d = (ahbe)new agzb((agzi)akpn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpn.a;
            }
            case 4: {
                return new agza((agzi)akpn.a);
            }
            case 3: {
                return new akpn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
