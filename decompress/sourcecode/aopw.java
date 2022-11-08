import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopw extends agzi implements ahax
{
    public static final aopw a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public int d;
    public Object e;
    public String f;
    public long g;
    public agzy h;
    
    static {
        final aopw a2 = new aopw();
        agzi.registerDefaultInstance((Class)aopw.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajku.a, (Object)a2, (MessageLite)a2, (agzn)null, 196886555, ahcm.k, (Class)aopw.class);
    }
    
    private aopw() {
        this.d = 0;
        this.f = "";
        this.h = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = aopw.i) == null) {
                    synchronized (aopw.class) {
                        if (aopw.i == null) {
                            aopw.i = (ahbe)new agzb((agzi)aopw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aopw.a;
            }
            case 4: {
                return new agza((agzi)aopw.a);
            }
            case 3: {
                return new aopw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopw.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u103d\u0000\u0003\u103a\u0000\u0004\u1002\u0003\u0005\u001a", new Object[] { "e", "d", "c", "f", "g", "h" });
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
