import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aege extends agzi implements ahax
{
    public static final agzr a;
    public static final aege b;
    private static volatile ahbe e;
    public String c;
    public agzq d;
    private int f;
    
    static {
        a = (agzr)new prz(5);
        agzi.registerDefaultInstance(aege.class, b = new aege());
    }
    
    private aege() {
        this.c = "";
        this.d = agzi.emptyIntList();
        emptyIntList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aege.e) == null) {
                    synchronized (aege.class) {
                        if (aege.e == null) {
                            aege.e = (ahbe)new agzb((agzi)aege.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aege.b;
            }
            case 4: {
                return new agza((agzi)aege.b);
            }
            case 3: {
                return new aege();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aege.b, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u1008\u0001\u0003\u001e", new Object[] { "f", "c", "d", aegc.b() });
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
