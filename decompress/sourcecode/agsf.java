import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsf extends agzi implements ahax
{
    public static final agsf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agsf.class, a = new agsf());
    }
    
    private agsf() {
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
                if ((b = agsf.b) == null) {
                    synchronized (agsf.class) {
                        if (agsf.b == null) {
                            agsf.b = (ahbe)new agzb((agzi)agsf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agsf.a;
            }
            case 4: {
                return new agza((agzi)agsf.a);
            }
            case 3: {
                return new agsf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsf.a, "\u0000\u0000", null);
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
