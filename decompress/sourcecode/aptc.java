import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptc extends agzi implements ahax
{
    public static final aptc a;
    private static volatile ahbe d;
    public String b;
    public agzy c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aptc.class, (agzi)(a = new aptc()));
    }
    
    private aptc() {
        this.b = "";
        this.c = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aptc.d) == null) {
                    synchronized (aptc.class) {
                        if (aptc.d == null) {
                            aptc.d = (ahbe)new agzb((agzi)aptc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptc.a;
            }
            case 4: {
                return new agza((agzi)aptc.a);
            }
            case 3: {
                return new aptc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "e", "b", "c" });
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
