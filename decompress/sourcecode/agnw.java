import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnw extends agzi implements ahax
{
    public static final agnw a;
    private static volatile ahbe e;
    public agnh b;
    public String c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(agnw.class, a = new agnw());
    }
    
    private agnw() {
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
                if ((e = agnw.e) == null) {
                    synchronized (agnw.class) {
                        if (agnw.e == null) {
                            agnw.e = (ahbe)new agzb((agzi)agnw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agnw.a;
            }
            case 4: {
                return new agza((agzi)agnw.a);
            }
            case 3: {
                return new agnw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnw.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u021a\u0003\u0208", new Object[] { "b", "d", "c" });
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
