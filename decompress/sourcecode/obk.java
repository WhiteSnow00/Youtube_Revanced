import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obk extends agzi implements ahax
{
    public static final obk a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance((Class)obk.class, (agzi)(a = new obk()));
    }
    
    private obk() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = obk.c) == null) {
                    synchronized (obk.class) {
                        if (obk.c == null) {
                            obk.c = (ahbe)new agzb((agzi)obk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return obk.a;
            }
            case 4: {
                return new agza((agzi)obk.a);
            }
            case 3: {
                return new obk();
            }
            case 2: {
                return newMessageInfo((MessageLite)obk.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
