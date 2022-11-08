import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhe extends agzi implements ahax
{
    public static final amhe a;
    private static volatile ahbe c;
    public aldq b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amhe.class, (agzi)(a = new amhe()));
    }
    
    private amhe() {
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
                final ahbe c;
                if ((c = amhe.c) == null) {
                    synchronized (amhe.class) {
                        if (amhe.c == null) {
                            amhe.c = (ahbe)new agzb((agzi)amhe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amhe.a;
            }
            case 4: {
                return new agza((agzi)amhe.a);
            }
            case 3: {
                return new amhe();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhe.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "d", "b" });
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
