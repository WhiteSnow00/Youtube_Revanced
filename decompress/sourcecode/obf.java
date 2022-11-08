import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obf extends agzi implements ahax
{
    public static final obf a;
    private static volatile ahbe d;
    public oba b;
    public obi c;
    
    static {
        agzi.registerDefaultInstance((Class)obf.class, (agzi)(a = new obf()));
    }
    
    private obf() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = obf.d) == null) {
                    synchronized (obf.class) {
                        if (obf.d == null) {
                            obf.d = (ahbe)new agzb((agzi)obf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return obf.a;
            }
            case 4: {
                return new agza((agzi)obf.a);
            }
            case 3: {
                return new obf();
            }
            case 2: {
                return newMessageInfo((MessageLite)obf.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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
