import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgg extends agzi implements ahax
{
    public static final amgg a;
    private static volatile ahbe d;
    public int b;
    public aldl c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgg.class, (agzi)(a = new amgg()));
    }
    
    private amgg() {
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
                final ahbe d;
                if ((d = amgg.d) == null) {
                    synchronized (amgg.class) {
                        if (amgg.d == null) {
                            amgg.d = (ahbe)new agzb((agzi)amgg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amgg.a;
            }
            case 4: {
                return new agza((agzi)amgg.a);
            }
            case 3: {
                return new amgg();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgg.a, "\u0001\u0001\u0000\u0001\ue6c8\u3b15\ue6c8\u3b15\u0001\u0000\u0000\u0001\ue6c8\u3b15\u1409\u0000", new Object[] { "b", "c" });
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
