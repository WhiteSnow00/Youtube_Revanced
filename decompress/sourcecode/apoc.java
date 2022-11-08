import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoc extends agzi implements ahax
{
    private static final apoc a;
    private static volatile ahbe b;
    private int c;
    private boolean d;
    
    static {
        agzi.registerDefaultInstance((Class)apoc.class, (agzi)(a = new apoc()));
    }
    
    private apoc() {
    }
    
    public static apob a() {
        return (apob)apoc.a.createBuilder();
    }
    
    private void d(final boolean d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apoc.b) == null) {
                    synchronized (apoc.class) {
                        if (apoc.b == null) {
                            apoc.b = (ahbe)new agzb((agzi)apoc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoc.a;
            }
            case 4: {
                return new apob();
            }
            case 3: {
                return new apoc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
