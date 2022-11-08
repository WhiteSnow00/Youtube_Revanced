import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apze extends agzi implements ahax
{
    public static final apze a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(apze.class, a = new apze());
    }
    
    private apze() {
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
                if ((d = apze.d) == null) {
                    synchronized (apze.class) {
                        if (apze.d == null) {
                            apze.d = (ahbe)new agzb((agzi)apze.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apze.a;
            }
            case 4: {
                return new agza((agzi)apze.a);
            }
            case 3: {
                return new apze();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apze.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
