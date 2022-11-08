import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuk extends agzi implements ahax
{
    public static final ahuk a;
    private static volatile ahbe b;
    private int c;
    private apgl d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahuk.class, a = new ahuk());
    }
    
    private ahuk() {
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
                if ((b2 = ahuk.b) == null) {
                    synchronized (ahuk.class) {
                        if (ahuk.b == null) {
                            ahuk.b = (ahbe)new agzb((agzi)ahuk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahuk.a;
            }
            case 4: {
                return new agza((agzi)ahuk.a);
            }
            case 3: {
                return new ahuk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuk.a, "\u0001\u0001\u0000\u0001\ue607\u2a05\ue607\u2a05\u0001\u0000\u0000\u0001\ue607\u2a05\u1409\u0000", new Object[] { "c", "d" });
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
