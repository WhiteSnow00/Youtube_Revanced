import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcx extends agzi implements ahax
{
    public static final arcx a;
    private static volatile ahbe e;
    public boolean b;
    public int c;
    public String d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)arcx.class, (agzi)(a = new arcx()));
    }
    
    private arcx() {
        this.d = "";
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = arcx.e) == null) {
                    synchronized (arcx.class) {
                        if (arcx.e == null) {
                            arcx.e = (ahbe)new agzb((agzi)arcx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arcx.a;
            }
            case 4: {
                return new agza((agzi)arcx.a);
            }
            case 3: {
                return new arcx();
            }
            case 2: {
                return newMessageInfo((MessageLite)arcx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1008\u0002", new Object[] { "f", "b", "c", "d" });
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
