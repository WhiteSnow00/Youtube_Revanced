import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopq extends agzi implements ahax
{
    public static final aopq a;
    private static volatile ahbe h;
    public int b;
    public Object c;
    public String d;
    public aovl e;
    public aicd f;
    public aioe g;
    private int i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aopq.class, (agzi)(a = new aopq()));
    }
    
    private aopq() {
        this.b = 0;
        this.j = 2;
        this.d = "";
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
                final ahbe h;
                if ((h = aopq.h) == null) {
                    synchronized (aopq.class) {
                        if (aopq.h == null) {
                            aopq.h = (ahbe)new agzb((agzi)aopq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aopq.a;
            }
            case 4: {
                return new agza((agzi)aopq.a);
            }
            case 3: {
                return new aopq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopq.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0005\u1409\u0004\u0006\u103c\u0000", new Object[] { "c", "b", "i", "d", "e", "f", "g", anko.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
