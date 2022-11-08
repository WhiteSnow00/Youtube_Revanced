import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnm extends agzi implements ahax
{
    public static final agnm a;
    private static volatile ahbe f;
    public agoj b;
    public agnu c;
    public agnl d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(agnm.class, a = new agnm());
    }
    
    private agnm() {
        emptyProtobufList();
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
                if ((f = agnm.f) == null) {
                    synchronized (agnm.class) {
                        if (agnm.f == null) {
                            agnm.f = (ahbe)new agzb((agzi)agnm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agnm.a;
            }
            case 4: {
                return new agza((agzi)agnm.a);
            }
            case 3: {
                return new agnm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnm.a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006\u0208", new Object[] { "b", "c", "d", "e" });
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
