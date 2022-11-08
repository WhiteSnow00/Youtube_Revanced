import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afny extends agzi implements ahax
{
    public static final afny a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(afny.class, a = new afny());
    }
    
    private afny() {
        this.c = 2;
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
                if ((b = afny.b) == null) {
                    synchronized (afny.class) {
                        if (afny.b == null) {
                            afny.b = (ahbe)new agzb((agzi)afny.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return afny.a;
            }
            case 4: {
                return new agza((agzi)afny.a);
            }
            case 3: {
                return new afny();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afny.a, "\u0001\u0000", null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
