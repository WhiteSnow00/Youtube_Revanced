import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoo extends agzi implements ahax
{
    public static final apoo a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apoo.class, (agzi)(a = new apoo()));
    }
    
    private apoo() {
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
                if ((d = apoo.d) == null) {
                    synchronized (apoo.class) {
                        if (apoo.d == null) {
                            apoo.d = (ahbe)new agzb((agzi)apoo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoo.a;
            }
            case 4: {
                return new agza((agzi)apoo.a);
            }
            case 3: {
                return new apoo();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoo.a, "\u0001\u0003\u0001\u0000\ufeaf\u4a23\ufa32\u53af\u0003\u0000\u0000\u0003\ufeaf\u4a23\u143c\u0000\ue14e\u4a25\u143c\u0000\ufa32\u53af\u143c\u0000", new Object[] { "c", "b", apoq.class, apon.class, apok.class });
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
