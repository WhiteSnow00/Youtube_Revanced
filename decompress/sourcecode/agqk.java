import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqk extends agzi implements ahax
{
    public static final agqk a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public agqg d;
    
    static {
        final agqk a2 = new agqk();
        agzi.registerDefaultInstance(agqk.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)afoh.a, a2, (MessageLite)a2, null, 549, ahcm.k, agqk.class);
    }
    
    private agqk() {
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
                if ((e = agqk.e) == null) {
                    synchronized (agqk.class) {
                        if (agqk.e == null) {
                            agqk.e = (ahbe)new agzb((agzi)agqk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqk.a;
            }
            case 4: {
                return new agza((agzi)agqk.a);
            }
            case 3: {
                return new agqk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
