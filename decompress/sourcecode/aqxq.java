import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxq extends agzi implements ahax
{
    public static final aqxq a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(aqxq.class, a = new aqxq());
    }
    
    private aqxq() {
        this.c = "";
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
                if ((e = aqxq.e) == null) {
                    synchronized (aqxq.class) {
                        if (aqxq.e == null) {
                            aqxq.e = (ahbe)new agzb((agzi)aqxq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqxq.a;
            }
            case 4: {
                return new agza((short[][])null, (char[][])null);
            }
            case 3: {
                return new aqxq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
