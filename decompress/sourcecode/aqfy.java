import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfy extends agzi implements ahax
{
    public static final aqfy a;
    private static volatile ahbe b;
    private ahas c;
    
    static {
        agzi.registerDefaultInstance((Class)aqfy.class, (agzi)(a = new aqfy()));
    }
    
    private aqfy() {
        this.c = ahas.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqfy.b) == null) {
                    synchronized (aqfy.class) {
                        if (aqfy.b == null) {
                            aqfy.b = (ahbe)new agzb((agzi)aqfy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqfy.a;
            }
            case 4: {
                return new agza((agzi)aqfy.a);
            }
            case 3: {
                return new aqfy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfy.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[] { "c", aqfx.a });
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
