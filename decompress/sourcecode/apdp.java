import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdp extends agzi implements ahax
{
    public static final apdp a;
    public static final agzg b;
    private static volatile ahbe e;
    public anss c;
    public anss d;
    private int f;
    private byte g;
    
    static {
        final apdp a2 = new apdp();
        agzi.registerDefaultInstance(apdp.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 328479972, ahcm.k, apdp.class);
    }
    
    private apdp() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apdp.e) == null) {
                    synchronized (apdp.class) {
                        if (apdp.e == null) {
                            apdp.e = (ahbe)new agzb((agzi)apdp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apdp.a;
            }
            case 4: {
                return new agza((agzi)apdp.a);
            }
            case 3: {
                return new apdp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "f", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
