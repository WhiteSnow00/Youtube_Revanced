import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyj extends agzi implements ahax
{
    private static final apyj a;
    private static volatile ahbe b;
    private int c;
    private apzl d;
    
    static {
        agzi.registerDefaultInstance(apyj.class, a = new apyj());
    }
    
    private apyj() {
    }
    
    public static apyi a() {
        return (apyi)apyj.a.createBuilder();
    }
    
    public static apyj c() {
        return apyj.a;
    }
    
    private void e(final apzl d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
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
                if ((b = apyj.b) == null) {
                    synchronized (apyj.class) {
                        if (apyj.b == null) {
                            apyj.b = (ahbe)new agzb((agzi)apyj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyj.a;
            }
            case 4: {
                return new apyi();
            }
            case 3: {
                return new apyj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
