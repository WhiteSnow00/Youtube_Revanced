import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amic extends agzi implements ahax
{
    public static final amic a;
    private static volatile ahbe c;
    public amib b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amic.class, (agzi)(a = new amic()));
    }
    
    private amic() {
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
                if ((c = amic.c) == null) {
                    synchronized (amic.class) {
                        if (amic.c == null) {
                            amic.c = (ahbe)new agzb((agzi)amic.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amic.a;
            }
            case 4: {
                return new agza((agzi)amic.a);
            }
            case 3: {
                return new amic();
            }
            case 2: {
                return newMessageInfo((MessageLite)amic.a, "\u0001\u0001\u0000\u0001\uf7cc\u43ad\uf7cc\u43ad\u0001\u0000\u0000\u0001\uf7cc\u43ad\u1409\u0000", new Object[] { "d", "b" });
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
