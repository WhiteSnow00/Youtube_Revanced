import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejc extends agzi implements ahax
{
    public static final aejc a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance(aejc.class, a = new aejc());
    }
    
    private aejc() {
        this.b = ahas.a;
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
                if ((c = aejc.c) == null) {
                    synchronized (aejc.class) {
                        if (aejc.c == null) {
                            aejc.c = (ahbe)new agzb((agzi)aejc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aejc.a;
            }
            case 4: {
                return new agza((agzi)aejc.a);
            }
            case 3: {
                return new aejc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aejc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", aejb.a });
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
