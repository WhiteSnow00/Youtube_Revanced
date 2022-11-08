import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajei extends agzi implements ahax
{
    private static final ajei a;
    private static volatile ahbe b;
    private int c;
    private boolean d;
    
    static {
        agzi.registerDefaultInstance(ajei.class, a = new ajei());
    }
    
    private ajei() {
    }
    
    public static ajeh a() {
        return (ajeh)ajei.a.createBuilder();
    }
    
    private void d(final boolean d) {
        this.c |= 0x1;
        this.d = d;
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
                if ((b = ajei.b) == null) {
                    synchronized (ajei.class) {
                        if (ajei.b == null) {
                            ajei.b = (ahbe)new agzb((agzi)ajei.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajei.a;
            }
            case 4: {
                return new ajeh();
            }
            case 3: {
                return new ajei();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajei.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
