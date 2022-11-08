import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhf extends agzi implements ahax
{
    public static final ahhf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahhf.class, a = new ahhf());
    }
    
    private ahhf() {
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
                if ((b = ahhf.b) == null) {
                    synchronized (ahhf.class) {
                        if (ahhf.b == null) {
                            ahhf.b = (ahbe)new agzb((agzi)ahhf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhf.a;
            }
            case 4: {
                return new agza((agzi)ahhf.a);
            }
            case 3: {
                return new ahhf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhf.a, "\u0001\u0000", null);
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
