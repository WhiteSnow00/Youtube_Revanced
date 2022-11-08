import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitz extends agzi implements ahax
{
    public static final aitz a;
    private static volatile ahbe e;
    public int b;
    public aiua c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(aitz.class, a = new aitz());
    }
    
    private aitz() {
        emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                if ((e = aitz.e) == null) {
                    synchronized (aitz.class) {
                        if (aitz.e == null) {
                            aitz.e = (ahbe)new agzb((agzi)aitz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aitz.a;
            }
            case 4: {
                return new agza((float[][])null, (short[][])null);
            }
            case 3: {
                return new aitz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitz.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0003\u001b", new Object[] { "b", "c", "d", aity.class });
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
