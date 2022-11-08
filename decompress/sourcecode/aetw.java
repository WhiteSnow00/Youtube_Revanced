import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetw extends agzi implements ahax
{
    public static final aetw a;
    private static volatile ahbe e;
    public aeto b;
    public String c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(aetw.class, a = new aetw());
    }
    
    private aetw() {
        final agyc b = agyc.b;
        this.c = "";
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
                final ahbe e;
                if ((e = aetw.e) == null) {
                    synchronized (aetw.class) {
                        if (aetw.e == null) {
                            aetw.e = (ahbe)new agzb((agzi)aetw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aetw.a;
            }
            case 4: {
                return new agza((agzi)aetw.a);
            }
            case 3: {
                return new aetw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetw.a, "\u0000\u0003\u0000\u0000\u0002\b\u0003\u0000\u0000\u0000\u0002\u0208\u0003\t\b\u0007", new Object[] { "c", "b", "d" });
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
