import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnr extends agzi implements ahax
{
    public static final agnr a;
    private static volatile ahbe f;
    public agoj b;
    public String c;
    public String d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(agnr.class, a = new agnr());
    }
    
    private agnr() {
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = agnr.f) == null) {
                    synchronized (agnr.class) {
                        if (agnr.f == null) {
                            agnr.f = (ahbe)new agzb((agzi)agnr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agnr.a;
            }
            case 4: {
                return new agza((agzi)agnr.a);
            }
            case 3: {
                return new agnr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnr.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002\u0208\u0004\u0208\u0005\u0208", new Object[] { "b", "c", "d", "e" });
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
