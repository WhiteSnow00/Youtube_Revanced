import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgi extends agzi implements ahax
{
    public static final amgi a;
    private static volatile ahbe b;
    private int c;
    private aldq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgi.class, (agzi)(a = new amgi()));
    }
    
    private amgi() {
        this.e = 2;
    }
    
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
                if ((b2 = amgi.b) == null) {
                    synchronized (amgi.class) {
                        if (amgi.b == null) {
                            amgi.b = (ahbe)new agzb((agzi)amgi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amgi.a;
            }
            case 4: {
                return new agza((agzi)amgi.a);
            }
            case 3: {
                return new amgi();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgi.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "c", "d" });
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
