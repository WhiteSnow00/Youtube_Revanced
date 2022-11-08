import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewb extends agzi implements ahax
{
    public static final aewb a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aewb.class, a = new aewb());
    }
    
    private aewb() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aewb.c) == null) {
                    synchronized (aewb.class) {
                        if (aewb.c == null) {
                            aewb.c = (ahbe)new agzb((agzi)aewb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aewb.a;
            }
            case 4: {
                return new agza((agzi)aewb.a);
            }
            case 3: {
                return new aewb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aewb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agms.class });
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
