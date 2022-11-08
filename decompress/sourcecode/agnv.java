import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnv extends agzi implements ahax
{
    public static final agnv a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance(agnv.class, a = new agnv());
    }
    
    private agnv() {
        this.b = "";
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((c = agnv.c) == null) {
                    synchronized (agnv.class) {
                        if (agnv.c == null) {
                            agnv.c = (ahbe)new agzb((agzi)agnv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agnv.a;
            }
            case 4: {
                return new agza((agzi)agnv.a);
            }
            case 3: {
                return new agnv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnv.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
