import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetv extends agzi implements ahax
{
    public static final aetv a;
    private static volatile ahbe d;
    public String b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aetv.class, a = new aetv());
    }
    
    private aetv() {
        this.b = "";
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aetv.d) == null) {
                    synchronized (aetv.class) {
                        if (aetv.d == null) {
                            aetv.d = (ahbe)new agzb((agzi)aetv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aetv.a;
            }
            case 4: {
                return new agza((agzi)aetv.a);
            }
            case 3: {
                return new aetv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetv.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "b", "c" });
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
