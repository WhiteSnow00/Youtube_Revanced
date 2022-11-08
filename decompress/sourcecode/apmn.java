import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmn extends agzi implements ahax
{
    public static final apmn a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance((Class)apmn.class, (agzi)(a = new apmn()));
    }
    
    private apmn() {
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    public final void a() {
        final agzy b = this.b;
        if (!b.c()) {
            this.b = agzi.mutableCopy(b);
        }
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apmn.d) == null) {
                    synchronized (apmn.class) {
                        if (apmn.d == null) {
                            apmn.d = (ahbe)new agzb((agzi)apmn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apmn.a;
            }
            case 4: {
                return new agza((int[][])null);
            }
            case 3: {
                return new apmn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmn.a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[] { "b", apmk.class, "c", apmm.class });
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
