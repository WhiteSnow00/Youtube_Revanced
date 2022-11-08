import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxf extends agzi implements ahax
{
    public static final aoxf a;
    private static volatile ahbe c;
    public aiva b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aoxf.class, a = new aoxf());
    }
    
    private aoxf() {
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
                final ahbe c;
                if ((c = aoxf.c) == null) {
                    synchronized (aoxf.class) {
                        if (aoxf.c == null) {
                            aoxf.c = (ahbe)new agzb((agzi)aoxf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoxf.a;
            }
            case 4: {
                return new agza((agzi)aoxf.a);
            }
            case 3: {
                return new aoxf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoxf.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "d", "b" });
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
