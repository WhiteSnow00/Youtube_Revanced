import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmw extends agzi implements ahax
{
    public static final ahmw a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahmw.class, (agzi)(a = new ahmw()));
    }
    
    private ahmw() {
        this.b = 0;
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
                if ((d = ahmw.d) == null) {
                    synchronized (ahmw.class) {
                        if (ahmw.d == null) {
                            ahmw.d = (ahbe)new agzb((agzi)ahmw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmw.a;
            }
            case 4: {
                return new agza((agzi)ahmw.a);
            }
            case 3: {
                return new ahmw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmw.a, "\u0001\u0002\u0001\u0000\ufeca\u2352\uf28e\u5712\u0002\u0000\u0000\u0002\ufeca\u2352\u143c\u0000\uf28e\u5712\u143c\u0000", new Object[] { "c", "b", anfq.class, amml.class });
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
