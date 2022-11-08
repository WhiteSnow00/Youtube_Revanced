import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfc extends agzi implements ahax
{
    public static final ahfc a;
    private static volatile ahbe b;
    private int c;
    private afpe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahfc.class, a = new ahfc());
    }
    
    private ahfc() {
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
                if ((b2 = ahfc.b) == null) {
                    synchronized (ahfc.class) {
                        if (ahfc.b == null) {
                            ahfc.b = (ahbe)new agzb((agzi)ahfc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahfc.a;
            }
            case 4: {
                return new agza((agzi)ahfc.a);
            }
            case 3: {
                return new ahfc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfc.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
