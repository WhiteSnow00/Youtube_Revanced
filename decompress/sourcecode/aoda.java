import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoda extends agzi implements ahax
{
    public static final aoda a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    
    static {
        final aoda a2 = new aoda();
        agzi.registerDefaultInstance(aoda.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 453651355, ahcm.k, aoda.class);
    }
    
    private aoda() {
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
                if ((d = aoda.d) == null) {
                    synchronized (aoda.class) {
                        if (aoda.d == null) {
                            aoda.d = (ahbe)new agzb((agzi)aoda.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoda.a;
            }
            case 4: {
                return new agza((agzi)aoda.a);
            }
            case 3: {
                return new aoda();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoda.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
