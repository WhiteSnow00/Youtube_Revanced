import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcd extends agzi implements ahax
{
    public static final ajcd a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(ajcd.class, a = new ajcd());
    }
    
    private ajcd() {
        this.c = agyc.b;
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
                if ((d = ajcd.d) == null) {
                    synchronized (ajcd.class) {
                        if (ajcd.d == null) {
                            ajcd.d = (ahbe)new agzb((agzi)ajcd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajcd.a;
            }
            case 4: {
                return new agza((agzi)ajcd.a);
            }
            case 3: {
                return new ajcd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcd.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100a\u0000", new Object[] { "b", "c" });
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
