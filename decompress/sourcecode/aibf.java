import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibf extends agzi implements ahax
{
    public static final aibf a;
    private static volatile ahbe d;
    public int b;
    public aibk c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibf.class, (agzi)(a = new aibf()));
    }
    
    private aibf() {
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
                if ((d = aibf.d) == null) {
                    synchronized (aibf.class) {
                        if (aibf.d == null) {
                            aibf.d = (ahbe)new agzb((agzi)aibf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibf.a;
            }
            case 4: {
                return new agza((agzi)aibf.a);
            }
            case 3: {
                return new aibf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibf.a, "\u0001\u0001\u0000\u0001\ue5d8\u2622\ue5d8\u2622\u0001\u0000\u0000\u0001\ue5d8\u2622\u1409\u0000", new Object[] { "b", "c" });
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
