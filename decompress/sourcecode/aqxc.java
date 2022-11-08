import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxc extends agzi implements ahax
{
    public static final aqxc a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aqxc.class, a = new aqxc());
    }
    
    private aqxc() {
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
                if ((c = aqxc.c) == null) {
                    synchronized (aqxc.class) {
                        if (aqxc.c == null) {
                            aqxc.c = (ahbe)new agzb((agzi)aqxc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqxc.a;
            }
            case 4: {
                return new agza((agzi)aqxc.a);
            }
            case 3: {
                return new aqxc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqwx.class });
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
