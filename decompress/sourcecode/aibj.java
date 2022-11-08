import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibj extends agzi implements ahax
{
    public static final aibj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibj.class, (agzi)(a = new aibj()));
    }
    
    private aibj() {
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
                if ((d = aibj.d) == null) {
                    synchronized (aibj.class) {
                        if (aibj.d == null) {
                            aibj.d = (ahbe)new agzb((agzi)aibj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibj.a;
            }
            case 4: {
                return new agza((agzi)aibj.a);
            }
            case 3: {
                return new aibj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibj.a, "\u0001\u0002\u0001\u0000\uf5b1\u2f1e\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf5b1\u2f1e\u143c\u0000\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", aixw.class, ajzl.class });
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
