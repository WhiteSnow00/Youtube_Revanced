import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtc extends agzi implements ahax
{
    public static final ahtc a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public ahtb d;
    public ahtb e;
    
    static {
        agzi.registerDefaultInstance(ahtc.class, a = new ahtc());
    }
    
    private ahtc() {
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
                if ((f = ahtc.f) == null) {
                    synchronized (ahtc.class) {
                        if (ahtc.f == null) {
                            ahtc.f = (ahbe)new agzb((agzi)ahtc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahtc.a;
            }
            case 4: {
                return new agza((agzi)ahtc.a);
            }
            case 3: {
                return new ahtc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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