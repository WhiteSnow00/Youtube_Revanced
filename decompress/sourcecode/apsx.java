import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsx extends agzi implements ahax
{
    public static final apsx a;
    private static volatile ahbe c;
    public agyc b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apsx.class, (agzi)(a = new apsx()));
    }
    
    private apsx() {
        this.b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apsx.c) == null) {
                    synchronized (apsx.class) {
                        if (apsx.c == null) {
                            apsx.c = (ahbe)new agzb((agzi)apsx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsx.a;
            }
            case 4: {
                return new agza((agzi)apsx.a);
            }
            case 3: {
                return new apsx();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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
