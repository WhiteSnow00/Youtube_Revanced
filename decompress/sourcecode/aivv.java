import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivv extends agzi implements ahax
{
    public static final aivv a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aivv.class, a = new aivv());
    }
    
    private aivv() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aivv.b) == null) {
                    synchronized (aivv.class) {
                        if (aivv.b == null) {
                            aivv.b = (ahbe)new agzb((agzi)aivv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aivv.a;
            }
            case 4: {
                return new agza((agzi)aivv.a);
            }
            case 3: {
                return new aivv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivv.a, "\u0001\u0000", null);
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
