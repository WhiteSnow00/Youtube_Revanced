import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdw extends agzi implements ahax
{
    public static final ahdw a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public agzp e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(ahdw.class, a = new ahdw());
    }
    
    private ahdw() {
        this.e = agzi.emptyFloatList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahdw.g) == null) {
                    synchronized (ahdw.class) {
                        if (ahdw.g == null) {
                            ahdw.g = (ahbe)new agzb((agzi)ahdw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahdw.a;
            }
            case 4: {
                return new agza((int[])null, (byte[][][])null);
            }
            case 3: {
                return new ahdw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003$\u0004\u100c\u0002", new Object[] { "b", "c", "d", "e", "f", agvo.s });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
